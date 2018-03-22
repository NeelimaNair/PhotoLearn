package com.mtech.parttimeone.photolearn.handler;

import android.content.Context;

import com.mtech.parttimeone.photolearn.bo.LearningTitleBO;
import com.mtech.parttimeone.photolearn.bo.QuizTitleBO;
import com.mtech.parttimeone.photolearn.bo.TitleBO;
import com.mtech.parttimeone.photolearn.enumeration.TitleType;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;


/**
 * @author Leon
 * @date 17/3/18
 */

public class TitleHandler {

    private static TitleHandler handler = null;
//    private static final Logger logger = LogManager.getLogger(TitleHandler.class);

    private TitleHandler() {

    }

    public static TitleHandler getInstance() {
        if (handler == null) {
            handler = new TitleHandler();
        }
        return handler;
    }

    public TitleBO createTitle(TitleType type, Context context) {
        TitleBO title = null;

        switch (type) {
            case LEARNING:
                title = createLearningTitle(context);
                break;
            case QUIZ:
                title = createQuizTitle(context);
                break;
            default:
                break;
        }

        return title;
    }

    private QuizTitleBO createQuizTitle(Context context) {
        QuizTitleBO quizTitle = new QuizTitleBO();

        // TODO
        // Assume that all the necessary information for the quiz item is set
        // in the context and you can populate the data in quiz item from
        // context

        return quizTitle;
    }

    private LearningTitleBO createLearningTitle(Context context) {
        LearningTitleBO learningTitle = new LearningTitleBO();

        // TODO
        // Assume that all the necessary information for the quiz item is set
        // in the context and you can populate the data in quiz item from
        // context

        return null;
    }
}
