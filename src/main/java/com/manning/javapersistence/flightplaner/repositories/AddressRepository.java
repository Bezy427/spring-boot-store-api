package com.manning.javapersistence.flightplaner.repositories;

import com.manning.javapersistence.flightplaner.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
  }