package org.bichascode.bichubusters.controllers;

import java.util.Scanner;

import org.bichascode.bichubusters.models.BichuModel;
import org.bichascode.bichubusters.models.HunterModel;
import org.bichascode.bichubusters.views.CatchView;
import org.bichascode.bichubusters.views.MenuView;

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
        System.out.println("Has capturado a " + name + "! con nivel " + level + " y peligro " + type + " y habilidad " + ability);
    }

    public void printMenuView() {
        MenuView menuView = new MenuView(scanner, this);
        menuView.showMenuView();
    }

    public void handleMenuOption(int userOption) {
        if(userOption == 1) {
            CatchView catchView = new CatchView(scanner, this);
            catchView.showCatchView();
        }
    }

}
