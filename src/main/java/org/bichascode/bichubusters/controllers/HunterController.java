package org.bichascode.bichubusters.controllers;

import org.bichascode.bichubusters.models.BichuModel;
import org.bichascode.bichubusters.models.HunterModel;

public class HunterController {

    private HunterModel hunterModel;
    

    public HunterController() {
        this.hunterModel = new HunterModel();
    }

    public HunterModel getHunter() {
        return hunterModel;
    }
    
    public void catchBichu(String name, int level, String type, String ability) {
        BichuModel bichuModel = new BichuModel(name, level, type, ability);
        hunterModel.getBichuList().add(bichuModel);
    }

}
