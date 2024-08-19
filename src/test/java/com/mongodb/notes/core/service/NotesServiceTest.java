package com.mongodb.notes.core.service;

import com.mongodb.notes.core.model.NotesModel;
import com.mongodb.notes.core.repository.NotesRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class NotesServiceTest {

    @InjectMocks
    public NotesService service;
    @Mock
    public NotesRepository repository;

    @Test
    public void shouldReturnNotesInCorrectOrder() {
        NotesModel notesModel1 = new NotesModel();
        NotesModel notesModel2 = new NotesModel();
        NotesModel notesModel3 = new NotesModel();
        notesModel1.setModifiedDate(LocalDateTime.of(2022, 5, 15, 12, 0));
        notesModel2.setModifiedDate(LocalDateTime.of(2024, 5, 15, 12, 0));
        notesModel3.setModifiedDate(LocalDateTime.of(2023, 5, 15, 12, 0));
        List<NotesModel> models = new ArrayList<>();
        models.add(notesModel1);
        models.add(notesModel2);
        models.add(notesModel3);
        when(repository.findAll()).thenReturn(models);

        List<NotesModel> expected = List.of(notesModel2, notesModel3, notesModel1);
        List<NotesModel> actual = service.getAll();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSaveAndReturnSavedModel() {
        NotesModel expected = new NotesModel();
        expected.setModifiedDate(LocalDateTime.of(2024, 5, 21, 12, 0));
        LocalDateTime now = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
        when(repository.save(expected)).thenReturn(expected);

        NotesModel actual = service.save(expected);

        assertAll(() -> {
            assertEquals(expected, actual);
        }, () -> {
            if (actual.getModifiedDate() == null || now.getHour() != actual.getModifiedDate().getHour()) {
                fail("ModifiedDate should be updated");
            }
        });
    }

    @Test
    public void shouldDeleteNotesModel() {
        service.delete(anyString());
        verify(repository, times(1)).deleteById(anyString());
    }

}