package com.chintan.QuizApp.Service;

import com.chintan.QuizApp.Model.Question;
import com.chintan.QuizApp.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;
    public List<Question> getAllQuestion() {
        return questionRepository.findAll();
    }
}
