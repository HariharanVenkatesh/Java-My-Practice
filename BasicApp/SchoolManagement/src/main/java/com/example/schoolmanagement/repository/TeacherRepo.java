package com.example.schoolmanagement.repository;

import com.example.schoolmanagement.entity.TeacherDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepo extends JpaRepository<TeacherDetails, Long> {
    List<TeacherDetails> findByTeacherName(String teacherName);
    List<TeacherDetails> findBySubjectHandled(String subjectHandled);

}
