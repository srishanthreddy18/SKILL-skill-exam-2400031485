package com.klef.ms.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.klef.ms.entity.Examination;
import com.klef.ms.service.ExaminationService;

@RestController
@RequestMapping("/examination")
public class ExaminationController
{
	private final ExaminationService examinationService;

	public ExaminationController(ExaminationService examinationService)
	{
		this.examinationService = examinationService;
	}

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

	@GetMapping("/displayall")
	public List<Examination> displayAllExaminations()
	{
		return examinationService.displayAllExaminations();
	}

	@GetMapping("/display/{id}")
	public Examination displayExaminationById(@PathVariable Long id)
	{
		return examinationService.displayExaminationById(id);
	}

	@GetMapping("/displaybyname/{name}")
	public List<Examination> displayExaminationByName(@PathVariable String name)
	{
		return examinationService.displayExaminationByName(name);
	}

	@GetMapping("/displaybytype/{type}")
	public List<Examination> displayExaminationByType(@PathVariable String type)
	{
		return examinationService.displayExaminationByType(type);
	}
}