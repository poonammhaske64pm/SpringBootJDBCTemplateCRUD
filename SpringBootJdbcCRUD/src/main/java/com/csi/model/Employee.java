package com.csi.model;

import jdk.jshell.Snippet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

    private int id;

    private String name;

    private double salary;

}
