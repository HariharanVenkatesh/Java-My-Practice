package com.example.schoolmanagement.repository;

import com.example.schoolmanagement.entity.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<StudentDetails, Long> {
    List<StudentDetails> findByStudentName(String studentName);
    List<StudentDetails> findByStudentGrade(String studentGrade);
}
