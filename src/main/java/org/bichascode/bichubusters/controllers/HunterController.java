package org.bichascode.bichubusters.controllers;

import java.util.ArrayList;

import org.bichascode.bichubusters.models.BichuModel;
import org.bichascode.bichubusters.models.HunterModel;

public class HunterController {

    public HunterModel createHunter() {
        ArrayList<BichuModel> bichus = new ArrayList<>();
        return new HunterModel(bichus);
    }

}
