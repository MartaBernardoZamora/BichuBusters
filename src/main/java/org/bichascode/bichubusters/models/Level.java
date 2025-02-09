package org.bichascode.bichubusters.models;

public enum Level {
    CLASS1("Clase I - Manifestación menor"),
    CLASS2("Clase II - Aparición móvil"),
    CLASS3("Clase III - Entidad inteligente"),
    CLASS4("Clase IV - Fantasma histórico"),
    CLASS5("Clase V - Espíritu antropomorfo"),
    CLASS6("Clase VI - Espíritu demoníaco"),
    CLASS7("Clase VII - Entidad ultraterrena");

    private final String classLevel;

    Level(String classLevel) {
        this.classLevel = classLevel;
    }

    public String getClassLevel() {
        return classLevel;
    }
}
