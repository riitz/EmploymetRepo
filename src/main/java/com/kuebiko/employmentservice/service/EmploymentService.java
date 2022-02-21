package com.kuebiko.employmentservice.service;

import com.kuebiko.employmentservice.dao.EmploymentDao;
import com.kuebiko.employmentservice.models.Employment;
import com.kuebiko.employmentservice.utility.EmploymentValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmploymentService implements EmploymentServiceIf{

    @Autowired
    EmploymentDao dao;

    @Override
    public Employment save(Employment payload) throws Exception {
        EmploymentValidation.validateEmployment(payload);
        return dao.save(payload);
    }

    @Override
    public Employment find(Long id) {
        return dao.find(id);
    }

    @Override
    public void delete(Long id) {

    }
}
