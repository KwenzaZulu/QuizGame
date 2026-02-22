JavaFX desktop quiz application with dynamic JSON-based question loading using Gson and multi-scene navigation.JavaFX Quiz Application

Overview

This project is a desktop quiz application developed using Java and JavaFX. The application dynamically loads multiple-choice questions from a JSON file using the Gson library and displays them through a multi-scene user interface.
The project demonstrates object-oriented design, MVC-style separation, external library integration, and runtime configuration management.

Features

-Dynamic question loading from JSON

-Multiple-choice question interface using RadioButtons

-Score tracking system

-Multi-scene navigation (Menu, Quiz, Settings, Score)

-Fullscreen and window state preservation across scenes

-External library integration (Gson)

-Clean separation between UI (FXML) and logic (Controllers)

Technologies Used

-Java

-JavaFX

-FXML Scene Builder

-Gson (for JSON parsing)

-Eclipse IDE

Architecture

-The application follows a simplified MVC structure:

-Model → Questions.java

-View → FXML layout files

-Controller → MenuController, QuizController, SettingsController, ScoreController

-Questions are stored in a JSON file and parsed into Java objects at runtime.

What I Learned

-Managing multi-scene JavaFX applications

-Injecting FXML components using @FXML

-Handling runtime classpath configuration for external libraries

-Parsing JSON into Java objects using Gson

-Preserving window state during scene transitions

-Debugging runtime and reflection-related errors

Future Improvements

-Music and Sound effects inclusion

-High score persistence using file storage

-Question randomization

-UI animations and styling improvements

-Text to voice inclusion

-Volume control for both sound effects and music

-Using Spinner for number of questions per quiz

