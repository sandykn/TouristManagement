package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.TouristContact;
import com.entity.TouristMaster;
import com.repository.TouristRepository;

@Service("service")
public class TouristService {
	private TouristRepository touristRepo;

	@Autowired
	public TouristService(TouristRepository touristRepo) {
		this.touristRepo = touristRepo;

	}
	
	public void addData(TouristMaster tourist) {
		touristRepo.save(tourist);
	}
	public Optional<TouristMaster> display(int id) {
		return touristRepo.findById(id);
	}
	

}
