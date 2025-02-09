package org.bichascode.bichubusters.views;

import java.util.ArrayList;

import org.bichascode.bichubusters.controllers.HunterController;
import org.bichascode.bichubusters.models.BichuModel;

public class BichuListView {
    private HunterController hunterController;
    private ArrayList<BichuModel> bichuList;

    public BichuListView(HunterController hunterController, ArrayList<BichuModel> bichuList) {;
        this.hunterController = hunterController;
        this.bichuList = bichuList;
    }
    public void showBichuListView() {
        System.out.println("Tu lista de bichus capturados es: ");
        if(bichuList.size()==0) {
            System.out.println("No hay capturas");
        }
        for(BichuModel bichu : bichuList) {
            System.out.println(bichu.getName() + " con nivel " + bichu.getBichuClass() + " y peligro " + bichu.getDanger() + " y habilidad " + bichu.getAbility());
        }
        hunterController.printMenuView();
    }

}
