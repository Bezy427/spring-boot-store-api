package com.manning.javapersistence.flightplaner.repositories;

import com.manning.javapersistence.flightplaner.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
  }