package com.greenfoxacademy.factories;

import com.greenfoxacademy.models.Applicant;
import org.springframework.stereotype.Component;

@Component
public class ApplicantFactory {

  public Applicant getEmptyApplicant() {
    return new Applicant();
  }

}
