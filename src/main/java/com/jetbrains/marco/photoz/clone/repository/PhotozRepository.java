package com.jetbrains.marco.photoz.clone.repository;

import com.jetbrains.marco.photoz.clone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {
}
