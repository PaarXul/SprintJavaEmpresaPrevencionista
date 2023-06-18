package empresa.ViewConsole;

import java.util.Scanner;

import empresa.Entidades.Capacitacion;

public class ViewUsuario {

  public static int eliminarUsuario() {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese RUT para eliminar usuario : ");
    int rut = scanner.nextInt();

    return rut;

  }

}
