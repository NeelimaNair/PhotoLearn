package com.mtech.parttimeone.photolearn.bo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Leon
 * @date 14/3/18
 */

public class QuizAttemptBO {

    final static String SAVE = "SAVE";
    final static String SUBMIT = "SUBMIT";

    private String userId;
    private String saveState;
    List<QuizItemAttemptBO> attemptBOList;

    public QuizAttemptBO() {

    }

    public QuizAttemptBO(String userId, String saveState, List<QuizItemAttemptBO> attemptBOList) {
        this.userId = userId;
        this.saveState = saveState;
        this.attemptBOList = attemptBOList;
    }

    public String getUserId() {
    return userId;
}

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSaveState() {
        return saveState;
    }

    public void setSaveState(String saveState) {
        this.saveState = saveState;
    }

    public List<QuizItemAttemptBO> getAttemptBOList() {
        return attemptBOList;
    }

    public void setAttemptBOList(List<QuizItemAttemptBO> attemptBOList) {
        this.attemptBOList = attemptBOList;
    }

    public QuizItemAttemptBO getAttempBo(String quizItemId){

        QuizItemAttemptBO attemptBO = null;
        for (QuizItemAttemptBO quizItemAttemptBO:attemptBOList){
            if (quizItemAttemptBO.getItemId().equals(quizItemId)){
                attemptBO = quizItemAttemptBO;
            }
        }

        return attemptBO;

    }


    public void initAttemptBoList(List<QuizItemBO> quizItemList){
        attemptBOList.clear();
        for (int i=0;i<quizItemList.size();i++){
            QuizItemBO itemBo = quizItemList.get(i);
            if (itemBo.getQuizAttemptBO().getAnswer().size() !=0&&!attemptBOList.contains(itemBo.getQuizAttemptBO())){
                attemptBOList.add(itemBo.getQuizAttemptBO());
            }
        }
    }

}
