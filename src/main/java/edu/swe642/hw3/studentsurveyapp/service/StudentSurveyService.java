package edu.swe642.hw3.studentsurveyapp.service;

import edu.swe642.hw3.studentsurveyapp.model.StudentSurvey;
import edu.swe642.hw3.studentsurveyapp.repo.StudentSurveyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;

@Service
public class StudentSurveyService {
    private final StudentSurveyRepo studentSurveyRepo;
    @Autowired
    public StudentSurveyService(StudentSurveyRepo studentSurveyRepo) {
        this.studentSurveyRepo = studentSurveyRepo;
    }

    public List<StudentSurvey> getAllStudentSurvey(){
        return studentSurveyRepo.findAll();
    }

    public StudentSurvey addStudentSurvey(StudentSurvey studentSurvey){
        return studentSurveyRepo.save(studentSurvey);
    }

    public StudentSurvey updateStudentSurvey(StudentSurvey studentSurvey){
        return studentSurveyRepo.save(studentSurvey);
    }

    public void deleteStudentSurvey(Long id){
        studentSurveyRepo.deleteStudentSurveyById(id);
    }


}
