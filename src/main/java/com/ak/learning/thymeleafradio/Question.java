package com.ak.learning.thymeleafradio;

import java.util.List;

public class Question {
    private String description;
    private String answer;
    private String chosenAnswer;
    private List<QuestionOption> options;

    public Question() {
    }

    public Question(String description, String answer, List<QuestionOption> options) {
        this.description = description;
        this.answer = answer;
        this.options = options;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getChosenAnswer() {
        return chosenAnswer;
    }

    public void setChosenAnswer(String chosenAnswer) {
        this.chosenAnswer = chosenAnswer;
    }

    public List<QuestionOption> getOptions() {
        return options;
    }

    public void setOptions(List<QuestionOption> options) {
        this.options = options;
    }
}
