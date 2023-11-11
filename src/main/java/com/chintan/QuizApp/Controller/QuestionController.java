package com.chintan.QuizApp.Controller;

import com.chintan.QuizApp.Model.Question;
import com.chintan.QuizApp.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;
    @GetMapping("allquestions")
    public List<Question> getAllQuestion(){
        return questionService.getAllQuestion();
    }
}
