package com.mongodb.notes.core.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@Document("notes")
public class NotesModel {

    @Id
    private String id;
    private String name;
    private String notes;
    private LocalDateTime modifiedDate;
}
