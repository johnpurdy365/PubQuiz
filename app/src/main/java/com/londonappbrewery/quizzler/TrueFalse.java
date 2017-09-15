package com.londonappbrewery.quizzler;

/**
 * Created by John Purdy on 15/09/2017.
 */

public class TrueFalse {
    private int mQuestionId;
    private boolean mAnswer;

    public TrueFalse(int questionResourceId, boolean trueOrFalse){
        mQuestionId = questionResourceId;
        mAnswer = trueOrFalse;
    }

    public int getQuestionId() {
        return mQuestionId;
    }

    public void setQuestionId(int questionId) {
        mQuestionId = questionId;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
