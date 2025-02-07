package org.bichascode.bichubusters.controllers;

import java.util.ArrayList;

import org.bichascode.bichubusters.models.BichuModel;
import org.bichascode.bichubusters.models.HunterModel;

public class HunterController {


    private HunterModel hunterModel;
    
    
    public HunterController() {
        this.hunterModel = createHunter();
    }

    public void createHunter() {
        ArrayList<BichuModel> bichus = new ArrayList<>();
        hunterModel=new HunterModel(bichus);
        //MenuView
    }
    
    public void catchBichu(String name, int level, String type, String ability) {
        BichuModel bichuModel = new BichuModel(name, level, type, ability);
        hunterModel.getBichuList().add(bichuModel);
    }

}
