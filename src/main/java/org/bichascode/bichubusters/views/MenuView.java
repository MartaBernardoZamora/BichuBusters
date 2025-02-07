package org.bichascode.bichubusters.views;


public class MenuView {
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
    }

}
