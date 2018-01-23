package com.greenfoxacademy.models;

import org.springframework.beans.factory.annotation.Required;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Applicant {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  @NotNull
  private String name;
  private boolean isApplied;
  private String courseType;

  public Applicant() {
  }

  public Applicant(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean getIsApplied() {
    return isApplied;
  }

  public void setIsApplied(boolean applied) {
    isApplied = applied;
  }

  public String getCourseType() {
    return courseType;
  }

  public void setCourseType(String courseType) {
    this.courseType = courseType;
  }
}
