package com.mongodb.notes.core.repository;

import com.mongodb.notes.core.model.NotesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepository extends JpaRepository<NotesModel, String> {
}
