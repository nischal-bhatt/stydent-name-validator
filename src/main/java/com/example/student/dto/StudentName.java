package com.example.student.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class StudentName {

    @JsonProperty("nishuz")
    @NotNull
    private String studentName;
}
