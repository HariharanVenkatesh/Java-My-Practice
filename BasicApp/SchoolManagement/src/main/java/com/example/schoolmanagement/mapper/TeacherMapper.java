package com.example.schoolmanagement.mapper;

import com.example.schoolmanagement.dto.TeacherDto;
import com.example.schoolmanagement.entity.TeacherDetails;

public class TeacherMapper {

    public TeacherDetails toEntity(TeacherDto teacherDto) {
        TeacherDetails b = new TeacherDetails();
        b.setTeacherName(teacherDto.getTeacherName());
        b.setSubjectHandled(teacherDto.getSubjectHandled());
        return b;
    }

    public TeacherDto toDto(TeacherDetails teacherDetails){
        return new TeacherDto(
                teacherDetails.getTeacherName(),
                teacherDetails.getSubjectHandled(),
                "SRVS School"
        );
    }
}
