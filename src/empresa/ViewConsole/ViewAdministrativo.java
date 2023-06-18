package empresa.ViewConsole;

import java.util.Date;
import java.util.Scanner;

import empresa.Entidades.Administrativo;
import empresa.Validadores.Fecha;
import empresa.Validadores.TamanioCadena;
import empresa.Validadores.ValidarRUT;

public class ViewAdministrativo {

  public static Administrativo agregarAdministrativo() {

    Scanner scanner = new Scanner(System.in);

    boolean AreaValida = false;
    boolean ExperienciaPreviaValida = false;
    String area = "";
    String experienciaPrevia = "";

    boolean nombresValido = false;
    boolean fechaNacimientoValida = false;
    boolean runValido = false;
    String Name = "";
    String fechaNacimiento = "";
    int run = 0;

    // validar Area
    System.out.println("Ingresar datos del administrativo:");
    while (!AreaValida) {
      System.out.print("Experiencia previa: ");
      area = scanner.nextLine();
      AreaValida = TamanioCadena.validar(area, 5, 30);
      if (!AreaValida) {
        System.out.println("El área debe tener entre 5 y 30 caracteres.");
      }
    }

    // validar experiencia previa

    while (!ExperienciaPreviaValida) {
      System.out.print("Área: ");
      experienciaPrevia = scanner.nextLine();
      ;// Consumir el salto de línea
      ExperienciaPreviaValida = TamanioCadena.validar(area, 1, 100);

      if (!ExperienciaPreviaValida) {
        System.out.println("la experiencia previa debe tener entre 1 y 100 caracter");
      }
    }

    // validar nombre
    while (!nombresValido) {
      System.out.print("Nombre Usuario: ");
      Name = scanner.nextLine();
      ;// Consumir el salto de línea
      nombresValido = TamanioCadena.validar(Name, 10, 50);

      if (!nombresValido) {
        System.out.println("El nombre de usuario debe tener entre 10 y 50 caracteres.");
      }

    }

    // validar fecha de nacimiento
    while (!fechaNacimientoValida) {
      System.out.print("Fecha de nacimiento: ");
      fechaNacimiento = scanner.nextLine();

      fechaNacimientoValida = Fecha.validarFechaIngreso(fechaNacimiento);

      if (!fechaNacimientoValida) {
        System.out.println("Fecha de nacimiento inválida.");

      }
    }

    Date fecha = Fecha.ObtenerFecha(fechaNacimiento);

    // validar run
    while (!runValido) {
      System.out.print("RUT: ");
      int rut = scanner.nextInt();
      scanner.nextLine(); // Consumir el salto de línea
      runValido = ValidarRUT.validarRUN(rut);

      run = rut;
      if (!runValido) {
        System.out.println("El RUN debe ser un número menor a 99.999.999.");
      }
    }

    Administrativo administrativo = new Administrativo(Name, fecha, run);

    administrativo.setArea(area);
    administrativo.setExperienciaPrevia(experienciaPrevia);

    System.out.println("Administrativo agregado exitosamente.");
    administrativo.toString();
    return administrativo;
  }

}
