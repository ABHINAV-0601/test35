package com.michaels.designhub.repository;

import com.michaels.designhub.entity.TrainingLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilRepository extends JpaRepository<TrainingLog, Integer> {

}
