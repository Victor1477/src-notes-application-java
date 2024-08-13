package com.mongodb.notes.core.repository;

import com.mongodb.notes.core.model.NotesModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepository extends MongoRepository<NotesModel, String> {
}
