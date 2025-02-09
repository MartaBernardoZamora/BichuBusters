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
        }else{
            System.out.println("==================================================================");
            System.out.printf("%-5s %-20s %-10s %-10s %-20s%n", "ID","Nombre", "Nivel", "Peligro", "Habilidad");
            System.out.println("------------------------------------------------------------------");
            for(BichuModel bichu : bichuList) {
                System.out.printf("%-5s %-20s %-10s %-10s %-20s%n",
                    bichuList.indexOf(bichu)+1,
                    bichu.getName(),
                    bichu.getBichuClass(),
                    bichu.getDanger(),
                    bichu.getAbility()
                );            
            }
        }       
        hunterController.printMenuView();
    }

}
