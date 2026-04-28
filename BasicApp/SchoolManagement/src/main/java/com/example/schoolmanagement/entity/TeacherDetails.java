package com.example.schoolmanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@Table(name = "Teacher_Details")
@NoArgsConstructor
public class TeacherDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "teacher_name")
    private String teacherName;

    @Column(name = "Subject")
    private String subjectHandled;
}
