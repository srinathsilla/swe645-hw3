package edu.swe642.hw3.studentsurveyapp.controller;

import edu.swe642.hw3.studentsurveyapp.model.StudentSurvey;
import edu.swe642.hw3.studentsurveyapp.service.StudentSurveyService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student-survey")
public class StudentSurveyController {
    private final StudentSurveyService studentSurveyService;
    @Autowired
    public StudentSurveyController(StudentSurveyService studentSurveyService) {
        this.studentSurveyService = studentSurveyService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<StudentSurvey>>  getAllStudentSurvey(){
        List<StudentSurvey> studentSurveys = studentSurveyService.getAllStudentSurvey();
        return new ResponseEntity<>(studentSurveys, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<StudentSurvey> addStudentSurvey(@RequestBody StudentSurvey studentSurvey){
        StudentSurvey newStudentSurvey = studentSurveyService.addStudentSurvey(studentSurvey);
        return new ResponseEntity<>(newStudentSurvey, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<StudentSurvey> updateStudentSurvey(@RequestBody StudentSurvey studentSurvey){
        StudentSurvey updatedStudentSurvey = studentSurveyService.updateStudentSurvey(studentSurvey);
        return new ResponseEntity<>(updatedStudentSurvey, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    @Transactional
    public ResponseEntity<?> deleteStudentSurveyById(@PathVariable("id") Long id){
        studentSurveyService.deleteStudentSurvey(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
