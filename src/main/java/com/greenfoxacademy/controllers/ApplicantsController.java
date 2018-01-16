package com.greenfoxacademy.controllers;

import com.greenfoxacademy.factories.ApplicantFactory;
import com.greenfoxacademy.models.Applicant;
import com.greenfoxacademy.services.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.applet.Applet;
import java.util.List;

@Controller
public class ApplicantsController {

  @Autowired
  ApplicantService applicantService;
  @Autowired
  ApplicantFactory applicantFactory;

  @GetMapping("")
  public String showIndexPage(Model model) {
    List<Applicant> applicants = applicantService.getAllApplicants();
    model.addAttribute("applicants", applicants);
    model.addAttribute("newApplicant", applicantFactory.getEmptyApplicant());
    return "index";
  }

  @PostMapping("/add")
  public String addApplicant(@ModelAttribute Applicant applicant) {
    applicantService.addApplicant(applicant);
    return "redirect:";
  }
}
