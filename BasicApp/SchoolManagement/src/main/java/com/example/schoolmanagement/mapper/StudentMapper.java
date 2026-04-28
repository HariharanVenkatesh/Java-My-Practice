package com.example.schoolmanagement.mapper;

import com.example.schoolmanagement.dto.StudentDto;
import com.example.schoolmanagement.entity.StudentDetails;

public class StudentMapper {

    public StudentDetails toEntity(StudentDto studentDto) {

        StudentDetails a = new StudentDetails();
        a.setStudentName(studentDto.getStudentName());
        a.setStudentAge(studentDto.getStudentAge());
        a.setStudentStandard(studentDto.getStudentStandard());
        a.setStudentGrade(studentDto.getStudentGrade());
        return a;
    }
    public StudentDto toDto(StudentDetails studentDetails) {
        return new StudentDto(
                studentDetails.getId(),
                studentDetails.getStudentName(),
                studentDetails.getStudentAge(),
                studentDetails.getStudentStandard(),
                studentDetails.getStudentGrade(),
                "SRVS School"
        );
    }
}
