package org.bichascode.bichubusters.views;

import java.util.Scanner;

import org.bichascode.bichubusters.controllers.HunterController;
import org.bichascode.bichubusters.models.Level;

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
        System.out.println("Elige el número de la clase: ");
        for(Level level : Level.values()) {
            int i = level.ordinal()+1;
            System.out.println(i + ". " + level.getClassLevel());
        }
        int level = scanner.nextInt();
        System.out.println("Peligro (alto, medio, bajo): ");
        scanner.nextLine();
        String type = scanner.nextLine();
        System.out.println("Habilidad: ");
        String ability = scanner.nextLine();
        hunterController.catchBichu(name, level, type, ability);
    }
}
