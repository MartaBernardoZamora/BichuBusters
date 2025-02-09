package org.bichascode.bichubusters.views;

import java.util.Scanner;

import org.bichascode.bichubusters.controllers.HunterController;

public class CatchView {

    private Scanner scanner;
    private HunterController hunterController;
    public CatchView(Scanner scanner, HunterController hunterController) {
        this.scanner = scanner;
        this.hunterController = hunterController;
    }
    
    public void showCatchView() {
        System.out.println("¡Atrapa un Bichu!");
        System.out.println("Nombre: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Nivel: ");
        int level = scanner.nextInt();
        System.out.println("Peligro: ");
        scanner.nextLine();
        String type = scanner.nextLine();
        System.out.println("Habilidad: ");
        String ability = scanner.nextLine();
        hunterController.catchBichu(name, level, type, ability);
    }
}
