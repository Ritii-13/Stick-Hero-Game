package com.example.stickheroap;

import java.util.ArrayList;

public class GameNotSavedException extends Exception {
    public GameNotSavedException(String errorMessage) {
        super(errorMessage);
    }
}

