package org.bichascode.bichubusters.views;

import java.util.Scanner;

import org.bichascode.bichubusters.controllers.HunterController;

public class ExitView {

    private Scanner scanner;
    private HunterController hunterController;


    public ExitView(Scanner scanner, HunterController hunterController) {
        this.scanner = scanner;
        this.hunterController = hunterController;
    }

    public void showExitView() {
        System.out.println("Si abandonas el juego tu progreso se perderá! \n ¿Estás seguro de que quieres abandonar? Y / N");
        String userOption = scanner.next();
        if(userOption.equals("Y")) {
            System.out.println("Gracias por ayudarnos a cazar todos estos bichus! Te esperamos pronto!");
            System.exit(0);
        }
        else if(userOption.equals("N")) {
            System.out.println("¡Genial! ¡Vamos a seguir cazando bichus! \n");
            hunterController.printMenuView();
        }
        else {
            System.out.println("Por favor, introduce una opción válida \n");
            showExitView();
        }

    }

}
