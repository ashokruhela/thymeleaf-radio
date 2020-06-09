package com.ak.learning.thymeleafradio;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class ContestService {

    Contest contest;

    public Contest getContest() {
        return contest;
    }

    public void setContest(Contest contest) {
        this.contest = contest;
    }

    @PostConstruct
    public void loadInitialData(){
        List<Question> questions = new ArrayList<>(Arrays.asList(new Question[]{
                new Question("question1", "option2",
                        Arrays.asList(new QuestionOption[]{
                                new QuestionOption("option1"),
                                new QuestionOption("option2"),
                                new QuestionOption("option3"),
                                new QuestionOption("option4")
                        })),
                new Question("question2", "myoption3",
                        Arrays.asList(new QuestionOption[]{
                                new QuestionOption("myoption1"),
                                new QuestionOption("myoption2"),
                                new QuestionOption("myoption3"),
                                new QuestionOption("myoption4")
                        }))
        }));
        this.contest = new Contest("Hibernate", questions);
    }
}
