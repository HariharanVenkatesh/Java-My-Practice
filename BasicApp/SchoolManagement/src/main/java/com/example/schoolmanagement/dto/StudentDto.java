package com.example.schoolmanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDto {
    long Id;
    String studentName;
    int studentAge;
    String studentStandard;
    String studentGrade;
    String schoolName;

}
