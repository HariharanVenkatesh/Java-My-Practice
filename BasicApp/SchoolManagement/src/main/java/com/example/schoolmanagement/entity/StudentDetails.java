package com.example.schoolmanagement.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@Table(name = "Student_Details")
@NoArgsConstructor
public class StudentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column ()
    private long Id;

    @Column(name = "student_name", nullable = false)
    private String studentName;

    @Column(name = "Age")
    private int studentAge;

    @Column(name = "Class")
    private String studentStandard;

    @Column(name = "Grade")
    private String studentGrade;

}