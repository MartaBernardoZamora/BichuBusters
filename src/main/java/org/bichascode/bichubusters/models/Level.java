package org.bichascode.bichubusters.models;

public enum Level {
    CLASS1("Bajo"),
    CLASS2("Medio"),
    CLASS3("Alto"),
    CLASS4("Muy Alto"),
    CLASS5("Extremo"),
    CLASS6("Legendario");

    private final String classLevel;

    Level(String classLevel) {
        this.classLevel = classLevel;
    }

    public String getClassLevel() {
        return classLevel;
    }
}
