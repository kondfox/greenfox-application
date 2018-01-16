package com.greenfoxacademy.controllers;

import com.greenfoxacademy.models.Applicant;
import com.greenfoxacademy.services.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ApplicantsController {

  @Autowired
  ApplicantService applicantService;

  @GetMapping("")
  public String showIndexPage(Model model) {
    List<Applicant> applicants = applicantService.getAllApplicants();
    model.addAttribute("applicants", applicants);
    return "index";
  }
}
