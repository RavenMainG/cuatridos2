package Pilas;

import java.util.Scanner;

public class GestorPilas {
  Scanner sc = new Scanner(System.in);

  int dato;
  Pilas pilaDatos = new Pilas();

  public GestorPilas() {

  }

  public void agregarNodo() {
    System.out.println("Ingresa el dato: ");
    dato = sc.nextInt();

    pilaDatos.insersionDato(dato);

    System.out.println("El dato ( " + dato + " ) fue agregado correctamente!!");
  }

  public void extraerDato() {
    int datoExtraido = pilaDatos.extraer();
    if (datoExtraido == -1) {
      System.out.println("Debes de ingresar datos para poder extraer");
      return;
    }

    System.out.println("Se extrajo correctamente el dato ( " + datoExtraido + " )!!");

  }

  public void imprimirPila() {
    pilaDatos.imprimirPila();
  }

}
