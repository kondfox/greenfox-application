package com.greenfoxacademy.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Applicant {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;
  private boolean isApplied;

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
}
