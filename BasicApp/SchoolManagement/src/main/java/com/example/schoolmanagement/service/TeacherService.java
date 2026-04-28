package com.example.schoolmanagement.service;

import com.example.schoolmanagement.mapper.TeacherMapper;
import com.example.schoolmanagement.repository.TeacherRepo;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    private final TeacherRepo teacherRepo;
    private final TeacherMapper tacherMapper;

    public TeacherService(TeacherRepo teacherRepo, TeacherMapper teacherMapper) {
        this.teacherRepo = teacherRepo;
        this.tacherMapper = teacherMapper;
    }

}