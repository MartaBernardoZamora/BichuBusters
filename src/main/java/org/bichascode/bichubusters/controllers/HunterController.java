package org.bichascode.bichubusters.controllers;

import java.util.Scanner;

import org.bichascode.bichubusters.models.BichuModel;
import org.bichascode.bichubusters.models.HunterModel;

public class HunterController {

    private HunterModel hunterModel;
        private Scanner scanner;


    public HunterController() {
        this.hunterModel = new HunterModel();
        this.scanner = new Scanner(System.in);
    }

    public HunterModel getHunter() {
        return hunterModel;
    }

    public void catchBichu(String name, int level, String type, String ability) {
        BichuModel bichuModel = new BichuModel(name, level, type, ability);
        hunterModel.getBichuList().add(bichuModel);
    }

}
