package com.klef.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.ms.entity.Examination;
import com.klef.ms.service.ExaminationService;

@RestController
@RequestMapping("/examination")
public class ExaminationController
{
	@Autowired
	private ExaminationService examinationService;

	@PostMapping("/add")
	public Examination addExamination(@RequestBody Examination examination)
	{
		return examinationService.addExamination(examination);
	}

	@PutMapping("/update")
	public Examination updateExamination(@RequestBody Examination examination)
	{
		return examinationService.updateExamination(examination);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteExamination(@PathVariable Long id)
	{
		return examinationService.deleteExamination(id);
	}

	@GetMapping("/viewall")
	public List<Examination> displayAllExaminations()
	{
		return examinationService.displayAllExaminations();
	}

	@GetMapping("/view/{id}")
	public Examination displayExaminationById(@PathVariable Long id)
	{
		return examinationService.displayExaminationById(id);
	}

	@GetMapping("/viewbyname/{name}")
	public List<Examination> displayExaminationByName(@PathVariable String name)
	{
		return examinationService.displayExaminationByName(name);
	}

	@GetMapping("/viewbytype/{type}")
	public List<Examination> displayExaminationByType(@PathVariable String type)
	{
		return examinationService.displayExaminationByType(type);
	}
}