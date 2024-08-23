package com.mongodb.notes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.PrintStream;

@SpringBootApplication
public class NotesApplication {
    public static void main(String[] args) {
        System.setOut(new PrintStream(new JFrameWindow()));
        SpringApplication.run(NotesApplication.class, args);
    }
}