package org.bichascode.bichubusters.views;

import java.util.Scanner;

import org.bichascode.bichubusters.controllers.HunterController;

public class MenuView {
    private Scanner scanner;

    public MenuView(Scanner scanner) {
        this.scanner = scanner;
	}

	public void showMenuView() {
        System.out.println("""
           Opciones:
            1. Capturar un nuevo fantasma
            2. Ver lista de fantasmas capturados
            3. Liberar un fantasma
            4. Filtrar fantasmas por clase
            5. Ver fantasmas capturados en un mes
            6. Salir

            Por favor, selecciona una opción (1-6):
            """
        );
        int userOption = scanner.nextInt();
        HunterController.handleMenuOption(userOption);
    }

}
