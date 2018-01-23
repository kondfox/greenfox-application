package com.greenfoxacademy.services;

import com.greenfoxacademy.models.Applicant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ApplicantService {

  List<Applicant> getAllApplicants();
  Applicant getApplicantById(int id);
  void modifyApplicant(Applicant applicant);
  void deleteApplicant(int id);
  boolean addApplicant(Applicant applicant);

}
