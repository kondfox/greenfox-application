package com.greenfoxacademy.collections;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Courses {

  private List<String> courseTypes;

  public Courses() {
    courseTypes = Arrays.asList("Software", "Hardware");
  }

  public List<String> getCourseTypes() {
    return courseTypes;
  }
}
