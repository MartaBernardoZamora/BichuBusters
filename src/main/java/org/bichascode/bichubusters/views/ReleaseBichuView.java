package org.bichascode.bichubusters.views;

import java.util.Scanner;

import org.bichascode.bichubusters.controllers.HunterController;

public class ReleaseBichuView {

    private Scanner Scanner;
    private HunterController hunterController;

    public ReleaseBichuView(Scanner scanner, HunterController hunterController) {
        this.Scanner = scanner;
        this.hunterController = hunterController;
    }

    public void showReleaseBichuListView() {
        System.out.println("Selecciona el bichu que deseas liberar: ");
        int bichuIndex = Scanner.nextInt();
        hunterController.releaseBichu(bichuIndex);
    }

}
