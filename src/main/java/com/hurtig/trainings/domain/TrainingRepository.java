package com.hurtig.trainings.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TrainingRepository extends CrudRepository<Training, Long> {
	
	List<Training> findByName(String name);

}
