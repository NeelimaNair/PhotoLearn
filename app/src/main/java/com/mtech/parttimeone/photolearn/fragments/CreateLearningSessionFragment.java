package com.mtech.parttimeone.photolearn.fragments;


import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;

import android.app.DatePickerDialog;
import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mtech.parttimeone.photolearn.Adapter.LearningSessionListAdapter;
import com.mtech.parttimeone.photolearn.R;
import com.mtech.parttimeone.photolearn.ViewModel.LearningSessionViewModel;
import com.mtech.parttimeone.photolearn.activity.BottomBarActivity;
import com.mtech.parttimeone.photolearn.bo.LearningSessionBO;
import com.mtech.parttimeone.photolearn.dummyModel.dummyDao;


import java.util.List;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CreateLearningSessionFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CreateLearningSessionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CreateLearningSessionFragment extends android.support.v4.app.Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1"; //SessionID
    private static final String ARG_PARAM2 = "param2"; //Update/New

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private EditText txtCourseCode;
    private EditText txtCourseModule;
    private EditText txtCourseDate;
    private TextView txtSessionID;

    Button btnSave;
    android.support.v4.app.Fragment FragmentSelf;

    private OnFragmentInteractionListener mListener;

    public CreateLearningSessionFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CreateLearningSessionFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CreateLearningSessionFragment newInstance(String param1, String param2) {
        CreateLearningSessionFragment fragment = new CreateLearningSessionFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    Calendar myCalendar = Calendar.getInstance();

    public void getDate(View view) {


        EditText edittext = (EditText) view.findViewById(R.id.editTextStartDate);
        DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel(edittext);
            }

        };


        edittext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new DatePickerDialog(getActivity(), date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
    }

    private void updateLabel(EditText edittext) {
        String myFormat = "yyyy-MM-dd"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.UK);

        edittext.setText(sdf.format(myCalendar.getTime()));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_create_learning_session, container, false);

        btnSave = view.findViewById(R.id.btnSaveLearningSession);

        FragmentSelf = this;
        getDate(view);
        txtCourseCode = (EditText) view.findViewById(R.id.editTextModuleCode);
        txtCourseModule = (EditText) view.findViewById(R.id.editTextModuleName);
        txtCourseDate = (EditText) view.findViewById(R.id.editTextStartDate);
        txtSessionID = (TextView) view.findViewById(R.id.create_SessionID);

        switch (mParam2){
            case "NEW":
                txtSessionID.setText("Create New");
                break;

            case "UPDATE":
                txtSessionID.setText("Updating "+mParam1);
                dummyDao dao = new dummyDao();
                LearningSessionViewModel vmLearningSession = ViewModelProviders.of(this).get(LearningSessionViewModel.class);
                vmLearningSession.getLearningSession(mParam1).observe(this, new Observer<LearningSessionBO>() {
                    @Override
                    public void onChanged(@Nullable LearningSessionBO learningSessionBOS) {
                        txtCourseCode.setText(learningSessionBOS.getCourseCode());
                        txtCourseModule.setText(learningSessionBOS.getCourseModule());
                        txtCourseDate.setText(learningSessionBOS.getCourseDate());

                    }
                });
                break;

            default:
                break;

        }


        btnSave.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                LearningSessionBO lsbo = new LearningSessionBO();


                lsbo.setCourseCode(txtCourseCode.getText().toString());
                lsbo.setCourseModule(txtCourseModule.getText().toString());
                lsbo.setCourseDate(txtCourseDate.getText().toString().replace("-", ""));

                dummyDao dao = new dummyDao();

                try {

                    switch (mParam2){
                        case "NEW":
                            lsbo.setSessionId(lsbo.getCourseDate() + "-" + lsbo.getCourseCode() + "-M" + lsbo.getCourseModule());
                            dao.createLearningSession(FragmentSelf,lsbo);
                            Toast.makeText(getActivity(),"Learning Session (ID:" + lsbo.getSessionId() +") created!",Toast.LENGTH_SHORT).show();
                            break;

                        case "UPDATE":
                            lsbo.setSessionId(mParam1);
                            dao.updateLearningSession(FragmentSelf,lsbo,lsbo.getSessionId());
                            Toast.makeText(getActivity(),"Learning Session (ID:" + lsbo.getSessionId() +") updated!",Toast.LENGTH_SHORT).show();
                            break;

                        default:
                            break;

                    }

                    BottomBarActivity act = (BottomBarActivity)getActivity();
                    act.setLearningSessionListFragment();

                } catch (Exception e) {
                    Toast.makeText(getActivity(), "Learning Session already exists!", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                    return;
                }

            }
        });

        return view;

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
