package org.bichascode.bichubusters.models;

import java.time.LocalDate;

public class BichuModel {

    private String name;
    private int level;
    @SuppressWarnings("unused")
    private String danger;
    @SuppressWarnings("unused")
    private String ability;
    @SuppressWarnings("unused")
    private LocalDate localDate;


    public BichuModel(
        String name,
        int level,
        String danger,
        String ability,
        LocalDate localDate) {
            this.name = name;
            this.level = level;
            this.danger = danger;
            this.ability = ability;
            this.localDate = localDate;

    }

    public String getName() {
        return name;
    }

    public int getBichuClass() {
        return level;
    }

    public String getDanger() {
        return danger;
    }

    public String getAbility() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAbility'");
    }

}
