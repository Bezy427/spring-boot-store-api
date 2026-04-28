package com.manning.javapersistence.flightplaner.repositories;

import com.manning.javapersistence.flightplaner.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
  }