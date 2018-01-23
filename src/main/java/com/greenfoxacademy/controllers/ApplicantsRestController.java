package com.greenfoxacademy.controllers;

import com.greenfoxacademy.models.Applicant;
import com.greenfoxacademy.services.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApplicantsRestController
{

  @Autowired
  ApplicantService applicantService;

  @GetMapping("/api/applicants")
  public List<Applicant> getAllApplicants() {
    return applicantService.getAllApplicants();
  }

  @PostMapping("/api/applicants")
  public ResponseEntity<String> createApplicant(@RequestBody Applicant applicant, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return ResponseEntity.badRequest().body("Binding error happened.");
    }
    if (applicantService.addApplicant(applicant)) {
      return ResponseEntity.ok().body("New applicant is created.");
    } else {
      return ResponseEntity.badRequest().body("Error: unable to save applicant.");
    }
  }

}
