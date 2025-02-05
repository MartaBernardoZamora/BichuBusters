package org.bichascode.bichubusters.models;

import java.time.LocalDate;

public class BichuModel {

    private String name;

    public BichuModel(String name, Integer levelExpect, String string, String string2, LocalDate localDate) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
