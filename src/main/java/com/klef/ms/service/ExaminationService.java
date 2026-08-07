package com.klef.ms.service;

import java.util.List;

import com.klef.ms.entity.Examination;

public interface ExaminationService {
Examination addExamination(Examination examination);
Examination updateExamination(Examination examination);
String deleteExamination(Long id);
List<Examination> displayAllExaminations();
Examination displayExaminationById(Long id);
List<Examination> displayExaminationByName(String name);
List<Examination> displayExaminationByType(String type);

}
