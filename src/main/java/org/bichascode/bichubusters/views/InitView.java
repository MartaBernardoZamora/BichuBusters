package org.bichascode.bichubusters.views;

import org.bichascode.bichubusters.controllers.HunterController;

public class InitView {
    public void showInitView() {
        System.out.println("""
            Inicio del Programa
            ============================================
            ¡Bienvenido a la Base de cazadores de bichus de Asturias!
            Gestiona tus bichus atrapados y protege la región.
            ============================================
            """
        );
        HunterController hunterController = new HunterController();
        hunterController.printMenuView();
    }
}
