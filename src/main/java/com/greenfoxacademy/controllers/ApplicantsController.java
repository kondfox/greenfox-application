package com.greenfoxacademy.controllers;

import com.greenfoxacademy.collections.Courses;
import com.greenfoxacademy.factories.ApplicantFactory;
import com.greenfoxacademy.models.Applicant;
import com.greenfoxacademy.services.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.applet.Applet;
import java.util.List;

@Controller
public class ApplicantsController {

  @Autowired
  ApplicantService applicantService;
  @Autowired
  ApplicantFactory applicantFactory;
  @Autowired
  Courses courses;

  @GetMapping("")
  public String showIndexPage(Model model) {
    List<Applicant> applicants = applicantService.getAllApplicants();
    model.addAttribute("applicants", applicants);
    model.addAttribute("newApplicant", applicantFactory.getEmptyApplicant());
    model.addAttribute("courseTypes", courses.getCourseTypes());
    return "index";
  }

  @PostMapping("/add")
  public String addApplicant(@ModelAttribute Applicant applicant) {
    applicantService.addApplicant(applicant);
    return "redirect:";
  }

  @PostMapping("/delete/{applicantId}")
  public String deleteApplicant(@PathVariable int applicantId) {
    applicantService.deleteApplicant(applicantId);
    return "redirect:/";
  }

  @GetMapping("/edit/{applicantId}")
  public String showEditForm(@PathVariable int applicantId, Model model) {
    Applicant applicant = applicantService.getApplicantById(applicantId);
    model.addAttribute("applicant", applicant);
    model.addAttribute("courseTypes", courses.getCourseTypes());
    return "edit";
  }

  @PostMapping("/edit/{applicantId}")
  public String editApplicant(@PathVariable int applicantId, @ModelAttribute Applicant applicant) {
    applicant.setId(applicantId);
    applicantService.modifyApplicant(applicant);
    return "redirect:/";
  }
}
