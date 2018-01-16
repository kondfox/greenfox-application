package com.greenfoxacademy.repositories;


import com.greenfoxacademy.models.Applicant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepository extends CrudRepository<Applicant, Integer> {
}
