package com.klef.ms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.ms.entity.Examination;
import com.klef.ms.repository.ExaminationRepository;
@Service
public class ExaminationServiceImpl implements ExaminationService{
@Autowired
private ExaminationRepository examinationRepository;
	@Override
	public Examination addExamination(Examination examination) {
		return examinationRepository.save(examination);
	}

	@Override
	public Examination updateExamination(Examination examination)
	{
	    Optional<Examination> optional = examinationRepository.findById(examination.getExaminationId());

	    if(optional.isPresent())
	    {
	        Examination e = optional.get();

	        e.setName(examination.getName());
	        e.setType(examination.getType());
	        e.setStatus(examination.getStatus());
	        e.setLocation(examination.getLocation());

	        return examinationRepository.save(e);
	    }
	    else
	    {
	        return null;
	    }
	}

	@Override
	public String deleteExamination(Long id)
	{
		Optional<Examination> optional = examinationRepository.findById(id);

		if(optional.isPresent())
		{
			examinationRepository.deleteById(id);
			return "Examination Deleted Successfully";
		}
		else
		{
			return "Examination ID Not Found";
		}
	}
	@Override
	public List<Examination> displayAllExaminations() {
		
		return examinationRepository.findAll();
	}

	@Override
	public Examination displayExaminationById(Long id) {
		return examinationRepository.findById(id).get();
	}

	@Override
	public List<Examination> displayExaminationByName(String name) {
		
		return examinationRepository.findByName(name);
	}

	@Override
	public List<Examination> displayExaminationByType(String type) {
		return examinationRepository.findByType(type);
	}

}
