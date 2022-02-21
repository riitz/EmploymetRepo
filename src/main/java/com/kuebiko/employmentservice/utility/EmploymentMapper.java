package com.kuebiko.employmentservice.utility;

import com.kuebiko.employmentservice.entity.EmploymentEntity;
import com.kuebiko.employmentservice.models.Employment;

public class EmploymentMapper {

    //Static

    //method overloading -> runtime procedure(when running the application it will call based on parameter )
    public static void map(Employment src, EmploymentEntity target) {

        target.setId(src.getId());
        target.setCompany(src.getCompany());
        target.setEmployed(src.isEmployed());
        target.setSalary(src.getSalary());
        target.setStartDate(src.getStartDate());
        target.setEndDate(src.getEndDate());


    }

    public static void map(EmploymentEntity src, Employment target){

        target.setId(src.getId());
        target.setCompany(src.getCompany());
        target.setEmployed(src.isEmployed());
        target.setSalary(src.getSalary());
        target.setStartDate(src.getStartDate());
        target.setEndDate(src.getEndDate());
    }

}
