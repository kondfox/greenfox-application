package com.greenfoxacademy.services;

import com.greenfoxacademy.models.Applicant;
import com.greenfoxacademy.repositories.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantServiceImpl implements ApplicantService {

  @Autowired
  ApplicantRepository applicantRepository;

  @Override
  public List<Applicant> getAllApplicants() {
    return (List<Applicant>) applicantRepository.findAll();
  }

  @Override
  public Applicant getApplicantById(int id) {
    return applicantRepository.findOne(id);
  }

  @Override
  public void modifyApplicant(Applicant applicant) {
    applicantRepository.save(applicant);
  }

  @Override
  public void deleteApplicant(int id) {
    applicantRepository.delete(id);
  }

  @Override
  public void addApplicant(Applicant applicant) {
    applicantRepository.save(applicant);
  }
}
