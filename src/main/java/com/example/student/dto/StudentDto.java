package com.example.student.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class StudentDto {

    private String studentName;
    private String studentId;
    private String hobby;

}
