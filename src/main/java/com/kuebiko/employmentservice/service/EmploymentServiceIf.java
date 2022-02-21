package com.kuebiko.employmentservice.service;

import com.kuebiko.employmentservice.models.Employment;

public interface EmploymentServiceIf {

    Employment save(Employment payload) throws Exception;
    Employment find(Long id);
    void delete(Long id);

}
