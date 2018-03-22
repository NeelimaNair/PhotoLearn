package com.mtech.parttimeone.photolearn.handler;

import android.content.Context;

import com.mtech.parttimeone.photolearn.bo.ItemBO;
import com.mtech.parttimeone.photolearn.bo.LearningItemBO;
import com.mtech.parttimeone.photolearn.bo.QuizItemBO;
import com.mtech.parttimeone.photolearn.enumeration.ItemType;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

/**
 * @author Leon
 * @date 17/3/18
 */

public class ItemHandler {

    private static ItemHandler handler = null;
   // private static final Logger logger = LogManager.getLogger(ItemHandler.class);

    private ItemHandler() {

    }

    public static ItemHandler getInstance() {
        if (handler == null) {
            handler = new ItemHandler();
        }
        return handler;
    }

    public ItemBO createItem(ItemType type, Context context) {
        ItemBO item = null;
        switch (type) {
            case LEARNING:
                item = createLearningItem(context);
                break;
            case QUIZ:
                item = createQuizItem(context);
                break;
            default:
                break;
        }

        return item;
    }

    private LearningItemBO createLearningItem(Context context) {
        LearningItemBO learningItem = new LearningItemBO();

        // TODO
        // Assume that all the necessary information for the quiz item is set
        // in the context and you can populate the data in quiz item from
        // context

        return learningItem;
    }

    private QuizItemBO createQuizItem(Context context) {
        QuizItemBO quizItem = new QuizItemBO();

        // TODO
        // Assume that all the necessary information for the quiz item is set
        // in the context and you can populate the data in quiz item from
        // context

        return quizItem;
    }
}
