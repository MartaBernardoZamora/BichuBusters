package org.bichascode.bichubusters.views;

import java.util.ArrayList;

import org.bichascode.bichubusters.models.BichuModel;

public class BichuListView {
    private ArrayList<BichuModel> bichuList;

    public BichuListView(ArrayList<BichuModel> bichuList) {
        this.bichuList = bichuList;
    }
    public void showBichuListView() {
        System.out.println("Tu lista de bichus capturados es: ");
        if(bichuList.size()==0) {
            System.out.println("No hay capturas");
        }else{
            System.out.println("==================================================================================");
            System.out.printf("%-5s %-25s %-35s %-10s %-20s%n", "ID","Nombre", "Nivel", "Peligro", "Habilidad");
            System.out.println("----------------------------------------------------------------------------------");
            for(BichuModel bichu : bichuList) {
                System.out.printf("%-5s %-25s %-35s %-10s %-20s%n",
                    bichuList.indexOf(bichu)+1,
                    bichu.getName(),
                    bichu.getBichuClass().getClassLevel(),
                    bichu.getDanger(),
                    bichu.getAbility()
                );
            }
            System.out.println("==================================================================================\n");
        }
    }

}
