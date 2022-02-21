package com.kuebiko.employmentservice.dao;

import com.kuebiko.employmentservice.entity.EmploymentEntity;
import com.kuebiko.employmentservice.models.Employment;
import com.kuebiko.employmentservice.repo.EmploymentRepo;
import com.kuebiko.employmentservice.utility.EmploymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmploymentDao implements EmploymentDaoIF {

    @Autowired
    EmploymentRepo repo;

    @Override
    public Employment save(Employment employment) {

        EmploymentEntity toSave = new EmploymentEntity();
        EmploymentMapper.map(employment, toSave);

        EmploymentEntity saveEntity = repo.save(toSave);

        Employment response = new Employment();
        EmploymentMapper.map(saveEntity, response);
        return response;
    }

    @Override
    public Employment find(Long id) {

        EmploymentEntity data = repo.getById(id);

        Employment response = new Employment();
        EmploymentMapper.map(data, response);
        return response;
    }

    @Override
    public void delete(Long id) {

    }
}
