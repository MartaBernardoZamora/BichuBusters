package org.bichascode.bichubusters.controllers;

import java.util.ArrayList;
import java.util.Scanner;

import org.bichascode.bichubusters.models.BichuModel;
import org.bichascode.bichubusters.models.HunterModel;
import org.bichascode.bichubusters.views.BichuListView;
import org.bichascode.bichubusters.views.CatchView;
import org.bichascode.bichubusters.views.MenuView;
import org.bichascode.bichubusters.views.ReleaseBichuView;

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
        printMenuView();
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
        else if(userOption == 2) {
            ArrayList<BichuModel> bichuList = hunterModel.getBichuList();
            BichuListView bichuListView = new BichuListView(this, bichuList);
            bichuListView.showBichuListView();
            printMenuView();
        }
        else if(userOption == 3) {
            ArrayList<BichuModel> bichuList = hunterModel.getBichuList();
            BichuListView bichuListView = new BichuListView(this, bichuList);
            bichuListView.showBichuListView();
            ReleaseBichuView releaseBichuView = new ReleaseBichuView(scanner, this);
            releaseBichuView.showReleaseBichuListView();
        }
        else if(userOption == 6) {
            System.out.println("Si abandonas el juego tu progreso se perderá!");
            System.exit(0);
        }

    }

    public void releaseBichu(int bichuIndex) {
        hunterModel.getBichuList().remove(bichuIndex-1);
        System.out.println("Bichu liberado!");
        printMenuView();
    }

}
