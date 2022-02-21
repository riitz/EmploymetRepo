package com.kuebiko.employmentservice.repo;

import com.kuebiko.employmentservice.entity.EmploymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmploymentRepo extends JpaRepository<EmploymentEntity, Long> {


}
