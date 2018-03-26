package com.mtech.parttimeone.photolearn.dummyModel;

import com.mtech.parttimeone.photolearn.bo.ItemBO;
import com.mtech.parttimeone.photolearn.bo.LearningItemBO;
import com.mtech.parttimeone.photolearn.bo.LearningSessionBO;
import com.mtech.parttimeone.photolearn.bo.LearningTitleBO;
import com.mtech.parttimeone.photolearn.bo.QuizTitleBO;
import com.mtech.parttimeone.photolearn.bo.TitleBO;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by Zhikai on 17/3/2018.
 */

public class dummyDao {

    public ArrayList<TitleBO> GetTitleList(String SessionID){

        //TODO Substitute with AccountBO from Leon

        ArrayList<TitleBO> lsl = new ArrayList<TitleBO>();

        String FixedID = new String("MTECH-ORO-002");

        if (FixedID.equalsIgnoreCase(SessionID) == true) {


            //test
            TitleBO ls1 = (TitleBO) new LearningTitleBO("MTECH-ORO-002", "All about IOT");
            TitleBO ls2 = (TitleBO) new LearningTitleBO("MTECH-ORO-002", "How to retrack the items");
            TitleBO ls3 = (TitleBO) new LearningTitleBO("MTECH-ORO-002", "History of the topic");
            TitleBO ls4 = (TitleBO) new LearningTitleBO("MTECH-ORO-002", "Overview");
            TitleBO ls5 = (TitleBO) new LearningTitleBO("MTECH-ORO-002", "How to get full marks");
            TitleBO ls6 = (TitleBO) new LearningTitleBO("MTECH-ORO-002", "How to go back in time");
            TitleBO ls7 = (TitleBO) new LearningTitleBO("MTECH-ORO-002", "History of the NUS");
            TitleBO ls8 = (TitleBO) new LearningTitleBO("MTECH-ORO-002", "Background");

            lsl.add(ls1);
            lsl.add(ls2);
            lsl.add(ls3);
            lsl.add(ls4);
            lsl.add(ls5);
            lsl.add(ls6);
            lsl.add(ls7);
            lsl.add(ls8);
        }

        return lsl;

//        lsl.add(ls5);
//        lsl.add(ls6);
//        lsl.add(ls7);
//        lsl.add(ls8);
//        lsl.add(ls9);
//        lsl.add(ls10);
//        lsl.add(ls11);
//        lsl.add(ls12);
//        lsl.add(ls13);
//        lsl.add(ls14);

    }

    public ArrayList<TitleBO> GetQuizList(String SessionID){

        //TODO Substitute with AccountBO from Leon
        ArrayList<TitleBO> lsl = new ArrayList<TitleBO>();

        String FixedID = new String("MTECH-ORO-002");

        if (FixedID.equalsIgnoreCase(SessionID) == true) {


            //test
            TitleBO ls1 = (TitleBO) new QuizTitleBO("MTECH-ORO-002", "Formula Quiz");
            TitleBO ls2 = (TitleBO) new QuizTitleBO("MTECH-ORO-002", "Chapter 1 Quiz");
            TitleBO ls3 = (TitleBO) new QuizTitleBO("MTECH-ORO-002", "Final Test");
            TitleBO ls4 = (TitleBO) new QuizTitleBO("MTECH-ORO-002", "Overview Quiz");
            TitleBO ls5 = (TitleBO) new QuizTitleBO("MTECH-ORO-002", "Test Chapter 1");
            TitleBO ls6 = (TitleBO) new QuizTitleBO("MTECH-ORO-002", "Test Chapter 2");
            TitleBO ls7 = (TitleBO) new QuizTitleBO("MTECH-ORO-002", "Test Chapter 3");
            TitleBO ls8 = (TitleBO) new QuizTitleBO("MTECH-ORO-002", "Test Chapter 4");

            lsl.add(ls1);
            lsl.add(ls2);
            lsl.add(ls3);
            lsl.add(ls4);
            lsl.add(ls5);
            lsl.add(ls6);
            lsl.add(ls7);
            lsl.add(ls8);
        }

        return lsl;
    }

    public ArrayList<ItemBO> GetLearningItemList(String SessionID,String Title){

        //TODO Substitute with AccountBO from Leon
        ArrayList<ItemBO> lsl = new ArrayList<ItemBO>();

        String FixedID = new String("MTECH-ORO-002");
        String FixedTitle = new String("All about IOT");

        if ((FixedID.equalsIgnoreCase(SessionID) == true) && (FixedTitle.equalsIgnoreCase(Title) == true)) {


            //test
            //ItemBO ls1 = (ItemBO) new LearningItemBO("What is Internet of things?","Lim Zhi Kai","pic1","The Internet of things is the network of physical devices, vehicles, home appliances and other items embedded with electronics, software, sensors, actuators, and connectivity which enables these objects to connect and exchange data","Serangoon North 12345","2018/07/23");
            //ItemBO ls2 = (ItemBO) new LearningItemBO("How does IOT work","Lim Zhi Kai","pic2","IoT in transport. Having been woken by your smart alarm, you're now driving to work. On comes the engine light. You'd rather not head straight to the garage, but what if it's something urgent? In a connected car, the sensor that triggered the check engine light would communicate with others in the car. A component called the diagnostic bus collects data from these sensors and passes it to a gateway in the car, which sends the most relevant information to","Serangoon North 12345","2018/07/23");
            //ItemBO ls3 = (ItemBO) new LearningItemBO("Top countries for IOT","Lim Zhi Kai","pic3","Countries with the most IoT devices. Korea Demark Swizerland United States Netherlands Germany Sweden Spain Francce Portugal Belgium United Kingdom 37.9 32.7 29 24.9 24.7 22.4 21.9 19.9 17.6 16.2 15.6 13 Devices online per 100 ... Chart Appears In. Coming soon: The internet of clothes — Quartz(qz.com). The top-country early-adopters of the Internet of Things, ranked - Quartz(qz.com). The top-country early-adopters of the Internet of Things","Serangoon North 12345","2018/07/23");
            //ItemBO ls4 = (ItemBO) new LearningItemBO("Top skills for IOT","Lim Zhi Kai","pic4","One of the top factors slowing down IoT implementations is the talent gap: Existing market supply just cannot keep up with the demand for engineers with IoT skills. Some 68% of companies are struggling to hire developers for their IoT projects, according to research from Canonical. But the flipside to the skills shortage is that career prospects are bright for professionals with in-demand skills.","Serangoon North 12345","2018/07/23");

            ItemBO ls1 = (ItemBO) new LearningItemBO("What is Internet of things?","Lim Zhi Kai","pic1","The Internet of things is the network of physical devices, vehicles, home appliances and other items embedded with electronics, software, sensors, actuators, and connectivity which enables these objects to connect and exchange data");
            ItemBO ls2 = (ItemBO) new LearningItemBO("How does IOT work","Lim Zhi Kai","pic2","IoT in transport. Having been woken by your smart alarm, you're now driving to work. On comes the engine light. You'd rather not head straight to the garage, but what if it's something urgent? In a connected car, the sensor that triggered the check engine light would communicate with others in the car. A component called the diagnostic bus collects data from these sensors and passes it to a gateway in the car, which sends the most relevant information to");
            ItemBO ls3 = (ItemBO) new LearningItemBO("Top countries for IOT","Lim Zhi Kai","pic3","Countries with the most IoT devices. Korea Demark Swizerland United States Netherlands Germany Sweden Spain Francce Portugal Belgium United Kingdom 37.9 32.7 29 24.9 24.7 22.4 21.9 19.9 17.6 16.2 15.6 13 Devices online per 100 ... Chart Appears In. Coming soon: The internet of clothes — Quartz(qz.com). The top-country early-adopters of the Internet of Things, ranked - Quartz(qz.com). The top-country early-adopters of the Internet of Things");
            ItemBO ls4 = (ItemBO) new LearningItemBO("Top skills for IOT","Lim Zhi Kai","pic4","One of the top factors slowing down IoT implementations is the talent gap: Existing market supply just cannot keep up with the demand for engineers with IoT skills. Some 68% of companies are struggling to hire developers for their IoT projects, according to research from Canonical. But the flipside to the skills shortage is that career prospects are bright for professionals with in-demand skills.");

            lsl.add(ls1);
            lsl.add(ls2);
            lsl.add(ls3);
            lsl.add(ls4);

        }

        return lsl;
    }

    public ArrayList<LearningSessionBO> GetLearningSession(String SessionID){
        //Dummy, To replace with real filter

        ArrayList<LearningSessionBO> lsl = new ArrayList<LearningSessionBO>();

        //test
        LearningSessionBO ls1 = new LearningSessionBO("Internet of things","MTECH-ORO-002","2018/07/03");

        lsl.add(ls1);
        return lsl;
    }

    public  ArrayList<LearningSessionBO> GetLearningSessionAll(){

    //TODO Substitute with AccountBO from Leon

            ArrayList<LearningSessionBO> lsl = new ArrayList<LearningSessionBO>();

    //test
    LearningSessionBO ls1 = new LearningSessionBO("Internet of things","MTECH-ORO-002","2018/07/03");
    LearningSessionBO ls2 = new LearningSessionBO("Computing Power","MTECH-ORO-001","2018/07/03");
    LearningSessionBO ls3 = new LearningSessionBO("Digital User Interfaces","MTECH-ORO-003","2018/07/03");
    LearningSessionBO ls4 = new LearningSessionBO("Agile Project Management","MTECH-ORO-004","2018/07/03");
    LearningSessionBO ls5 = new LearningSessionBO("Business Process Re-Engineering","MTECH-ORO-005","2018/07/03");
    LearningSessionBO ls6 = new LearningSessionBO("Business Communication","MTECH-ORO-006","2018/07/03");
    LearningSessionBO ls7 = new LearningSessionBO("Java Programming","MTECH-ORO-007","2018/07/03");
    LearningSessionBO ls8 = new LearningSessionBO("Internet of things","MTECH-ORO-002","2018/07/03");
    LearningSessionBO ls9 = new LearningSessionBO("Computing Power","MTECH-ORO-001","2018/07/03");
    LearningSessionBO ls10 = new LearningSessionBO("Digital User Interfaces","MTECH-ORO-003","2018/07/03");
    LearningSessionBO ls11 = new LearningSessionBO("Agile Project Management","MTECH-ORO-004","2018/07/03");
    LearningSessionBO ls12 = new LearningSessionBO("Business Process Re-Engineering","MTECH-ORO-005","2018/07/03");
    LearningSessionBO ls13 = new LearningSessionBO("Business Communication","MTECH-ORO-006","2018/07/03");
    LearningSessionBO ls14 = new LearningSessionBO("Java Programming","MTECH-ORO-007","2018/07/03");

        lsl.add(ls1);
        lsl.add(ls2);
        lsl.add(ls3);
        lsl.add(ls4);
        lsl.add(ls5);
        lsl.add(ls6);
        lsl.add(ls7);
        lsl.add(ls8);
        lsl.add(ls9);
        lsl.add(ls10);
        lsl.add(ls11);
        lsl.add(ls12);
        lsl.add(ls13);
        lsl.add(ls14);

        return lsl;
    }
}