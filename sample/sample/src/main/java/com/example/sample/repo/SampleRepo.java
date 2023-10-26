package com.example.sample.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sample.entity.SampleEntity;
@Repository 
public interface SampleRepo extends JpaRepository<SampleEntity, Integer> {

	SampleEntity save(SampleEntity samp);

	

}
