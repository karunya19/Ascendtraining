package com.example.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample.entity.SampleEntity;
import com.example.sample.repo.SampleRepo;
@Service 
public class SampleService {

	@Autowired
	SampleRepo samprepo;

	public SampleEntity createSample(SampleEntity samp) {
		// TODO Auto-generated method stub
		samp=samprepo.save(samp);
		return samp;
	}

}
