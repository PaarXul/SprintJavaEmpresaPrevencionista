package empresa.ViewConsole;

import java.util.Date;
import java.util.Scanner;

import empresa.Entidades.Profesional;
import empresa.Validadores.Fecha;
import empresa.Validadores.TamanioCadena;
import empresa.Validadores.ValidarRUT;

public class ViewProfesional {

  public static Profesional agregarProfesional() {

    Scanner scanner = new Scanner(System.in);
    boolean tituloValido = false;

    String Titulo = "";
    while (!tituloValido) {
      System.out.print("Titulo: ");
      String titulo = scanner.nextLine();
      tituloValido = TamanioCadena.validar(titulo, 10, 50);

      Titulo = titulo;
      if (!tituloValido) {
        System.out.println("Titulo debe tener entre 10 y 50 caracteres.");
      }
    }
    boolean fechaIngresoValida = false;
    String fechaIngreso = "";

    // validar fecha de nacimiento
    while (!fechaIngresoValida) {
      System.out.print("Fecha Ingreso: ");

      fechaIngreso = scanner.nextLine();

      fechaIngresoValida = Fecha.validarFechaIngreso(fechaIngreso);

      if (!fechaIngresoValida) {
        System.out.println("Fecha de nacimiento inválida.");

      }
    }

    boolean nombresValido = false;
    String Name = "";
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

    boolean fechaNacimientoValida = false;
    String fechaNacimiento = "";

    // validar fecha de nacimiento
    while (!fechaNacimientoValida) {
      System.out.print("Fecha de nacimiento: ");
      fechaNacimiento = scanner.nextLine();

      fechaNacimientoValida = Fecha.validarFechaIngreso(fechaNacimiento);

      if (!fechaNacimientoValida) {
        System.out.println("Fecha de nacimiento inválida.");

      }
    }

    boolean runValido = false;
    int run = 0;

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

    Date fecha = Fecha.ObtenerFecha(fechaNacimiento);
    Date fechaIngresoDate = Fecha.ObtenerFecha(fechaIngreso);

    Profesional profesional = new Profesional(Name, fecha, run);

    profesional.setTitulo(Titulo);
    profesional.setFechaIngreso(fechaIngresoDate);

    System.out.println("Profesional agregado exitosamente.");
    profesional.toString();
    return profesional;
  }

  /*
   * 
   * Profesional:
   * 
   * - Título: obligatorio, mínimo 10 caracteres, máximo 50
   * - Fecha de ingreso: independiente si lo declara como una fecha o un String,
   * debe
   * ser desplegado con el formato DD/MM/AAAA
   */

}
