package edu.swe642.hw3.studentsurveyapp.repo;

import edu.swe642.hw3.studentsurveyapp.model.StudentSurvey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentSurveyRepo extends JpaRepository<StudentSurvey, Long> {
    void deleteStudentSurveyById(Long id);
}
