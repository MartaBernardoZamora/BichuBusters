# BichuBusters

## Descripción del Proyecto

BichuBusters es un juego basado en consola donde los jugadores pueden capturar y gestionar criaturas del más allá llamadas **bichus**. Cada bichu tiene un nombre, nivel, peligro y habilidad especial. El juego permite al usuario capturar y liberar bichus, ver su colección y gestionar la información de cada criatura.

## Tecnologías Utilizadas

- **Java**
- **JUnit**
- **Hamcrest**
- **Maven**
- **Mockito**

## Estructura del Proyecto

```cmd
BichuBusters/
├── src/
│   ├── main/
│   │   ├── java/org/bichascode/bichubusters/
│   │   │   ├── controllers/
│   │   │   │   ├── HunterController.java
│   │   │   ├── models/
│   │   │   │   ├── BichuModel.java
│   │   │   │   ├── HunterModel.java
│   │   │   │   ├── Level.java
│   │   │   ├── views/
│   │   │   │   ├── CatchView.java
│   │   │   │   ├── MenuView.java
│   │   │   │   ├── InitView.java
│   │   ├── App.java
│   ├── test/
│   │   ├── java/org/bichascode/bichubusters/
│   │   │   ├── controllers/
│   │   │   │   ├── HunterControllerTest.java
```

## MVP

- **Capturar un bichu** con nombre, nivel, peligro y habilidad.
- **Ver lista de bichus capturados** con detalles organizados en columnas.
- **Liberar bichus** eligiendo de una lista
- **Interacción mediante consola**.

## Instrucciones para jugar

Hace pocos meses y ahora estamos en condiciones de poder confirmarlo.  

¡¡¡ Algo muy extraño está sucediendo en Asturias !!!
  
Los habitantes de algunas pequeñas Aldeas, Villas Costeras e incluso grandes Núcleos Urbanos han comenzado a detectar bastantes sucesos paranormales.

1. **Iniciar el juego:** Al ejecutar la aplicación, se muestra un menú con opciones.
2. **Capturar un bichu:** Opción 1. Se solicitan los datos del Bichu (nombre, nivel, peligro, habilidad).
3. **Ver lista de bichus capturados:** Opción 2. Se muestra la información organizada en formato de tabla.
4. **Liberar bichu**: Opción 3. Se muestra la lista de bichus capturados para poder elegir el número del que se quiere liberar.
5. **Salir del juego:** Opción 6. Se permite salir con una opción en el menú principal.

## BichasCode

Somos Patricia y Marta, aprendices de juniors abriéndose paso entre bichus. Si quieres ver más:

Patricia Fernández: <https://github.com/PFBregon>

Marta Bernardo: <https://github.com/MartaBernardoZamora>

---

📌 **Autor:** BichasCode Team
