package com.klef.ms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.ms.entity.Examination;

public interface ExaminationRepository extends JpaRepository<Examination, Long>{

	List<Examination> findByName(String name);
	List<Examination> findByType(String type);
}
