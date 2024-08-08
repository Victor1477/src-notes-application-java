package com.mongodb.notes.core;

import jakarta.annotation.Resource;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Setter
@Getter
@Service
public class NotesService {

    @Resource
    private NotesRepository repository;

    private List<NotesModel> cachedNotes;

    public NotesService() {
        this.cachedNotes = new ArrayList<>();
    }

    public List<NotesModel> getAll() {
        if (cachedNotes.isEmpty()) {
            cachedNotes = repository.findAll();
            cachedNotes.sort(Comparator.comparing(NotesModel::getModifiedDate, Comparator.reverseOrder()));
        }
        return cachedNotes;
    }

    public NotesModel save(NotesModel notesModel) {
        cachedNotes.clear();
        notesModel.setModifiedDate(LocalDateTime.now(ZoneId.of("America/Sao_Paulo")));
        return repository.save(notesModel);
    }

    public void delete(String id) {
        cachedNotes.clear();
        repository.deleteById(id);
    }
}
