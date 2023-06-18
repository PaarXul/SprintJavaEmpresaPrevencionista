package empresa.ViewConsole;

import java.util.Scanner;

import empresa.Entidades.Capacitacion;
import empresa.Validadores.Fecha;
import empresa.Validadores.TamanioCadena;
import empresa.Validadores.ValidarCantidadAsistentes;
import empresa.Validadores.ValidarVacios;

public class ViewCapacitacion {

  public static Capacitacion agregarCapacitacion() {

    Scanner scanner = new Scanner(System.in);

    boolean IdentificadorValidar = false;
    int identificador = 0;
    boolean rutClienteValidar = false;
    int rutCliente = 0;
    boolean diaValidar = false;
    String dia = "";
    System.out.println("Ingresar datos de Capacitación:");

    boolean horaValidar = false;
    String hora = "";
    // validar identificador
    while (!IdentificadorValidar) {
      System.out.print("identificador: ");
      identificador = scanner.nextInt();
      IdentificadorValidar = ValidarVacios.validarVacioNumeros(identificador);
      if (!IdentificadorValidar) {
        System.out.println("El valor ingresado esta vacio.");
      }
    }

    // validar rutCliente
    while (!rutClienteValidar) {
      System.out.print("rutCliente: ");
      rutCliente = scanner.nextInt();
      scanner.nextLine();
      rutClienteValidar = ValidarVacios.validarVacioNumeros(rutCliente);
      if (!rutClienteValidar) {
        System.out.println("El RUT esta vació.");
      }
    }

    // validar dia

    while (!diaValidar) {
      System.out.print("dia (digite un dia de semana ejemplo lunes) : ");

      dia = scanner.nextLine();

      diaValidar = ValidarVacios.validarVacio(dia);
      if (!diaValidar) {
        System.out.println("El valor ingresado esta vacio.");
        continue;
      }

      diaValidar = Fecha.validarDiaSemana(dia.toLowerCase());
      if (!diaValidar) {
        System.out.println("El valor ingresado no esta dentro de la semana.");
        continue;
      }
    }

    // validar hora

    while (!horaValidar) {
      System.out.print("Ingrese hora (ejemplo: formato 24 hrs (23:59)) : ");
      hora = scanner.nextLine();
      horaValidar = ValidarVacios.validarVacio(hora);
      if (!horaValidar) {
        System.out.println("El valor ingresado esta vacio.");
      }
      horaValidar = Fecha.validarHora(hora);

      if (!horaValidar) {
        System.out.println("El valor ingresado no esta dentro de la hora.");
      }
    }
    String lugar = "";
    boolean lugarValido = false;
    while (!lugarValido) {
      System.out.print("Lugar: ");
      lugar = scanner.nextLine();
      lugarValido = TamanioCadena.validar(lugar, 10, 50);

      if (!lugarValido) {
        System.out.println("Lugar debe tener entre 10 y 50 caracteres.");
      }
    }

    String duracion = "";
    boolean duracionValido = false;
    while (!duracionValido) {
      System.out.print("duracion: ");
      duracion = scanner.nextLine();
      duracionValido = TamanioCadena.validar(duracion, 1, 70);

      if (!duracionValido) {
        System.out.println("Lugar debe tener entre 10 y 50 caracteres.");
      }
    }

    boolean cantidadAsistentesValido = false;
    int cantidadAsistentes = 0;

    while (!cantidadAsistentesValido) {

      System.out.print("Cantidad Asistentes: ");
      cantidadAsistentes = scanner.nextInt();
      scanner.nextLine(); // Consumir el salto de línea
      cantidadAsistentesValido = ValidarCantidadAsistentes.validarAsistentes(cantidadAsistentes);

      if (!cantidadAsistentesValido) {
        System.out.println("la cantidad de asistentes no pueden ser mayor a 1000.");
      }
    }

    Capacitacion capacitacion = new Capacitacion();
    capacitacion.setIdentificador(identificador);
    capacitacion.setRutCliente(rutCliente);
    capacitacion.setDia(dia);
    capacitacion.setHora(hora);
    capacitacion.setLugar(lugar);
    capacitacion.setDuracion(duracion);
    capacitacion.setCantidadAsistentes(cantidadAsistentes);

    System.out.println("Administrativo agregado exitosamente.");
    capacitacion.toString();
    return capacitacion;

  }

}
