package empresa.ViewConsole;

import java.util.Date;
import java.util.Scanner;

import empresa.Entidades.Cliente;
import empresa.Validadores.Fecha;
import empresa.Validadores.ValidarRUT;
import empresa.Validadores.ValidarVacios;
import empresa.Validadores.TamanioCadena;
import empresa.Validadores.ValidarSalud;

public class ViewCliente {

  public static Cliente agregarCliente() {
    Scanner scanner = new Scanner(System.in);

    // ValidarRUT validar = new ValidarRUT();
    boolean runValido = false;
    boolean nomValido = false;
    boolean apelliValido = false;
    boolean telValido = false;
    boolean afpValido = false;
    boolean saludValido = false;
    boolean dirValido = false;
    boolean comValido = false;

    boolean nombresValido = false;
    boolean fechaNacimientoValida = false;
    String Name = "";
    String fechaNacimiento = "";
    int run = 0;

    System.out.println("Ingresar datos del cliente:");

    // RUT
    int Rut = 0;
    while (!runValido) {
      System.out.print("RUT: ");
      int rut = scanner.nextInt();
      scanner.nextLine(); // Consumir el salto de línea
      runValido = ValidarRUT.validarRUN(rut);

      Rut = rut;
      if (!runValido) {
        System.out.println("El RUN debe ser un número menor a 99.999.999.");
      }
    }

    // NOMBRES
    String Nombres = "";
    while (!nomValido) {
      System.out.print("Nombres: ");
      String nombres = scanner.nextLine();
      nomValido = TamanioCadena.validar(nombres, 5, 30);

      Nombres = nombres;
      if (!nomValido) {
        System.out.println("Nombre debe tener entre 5 y 30 caracteres.");
      }
    }

    // APELLIDOS
    String Apellidos = "";
    while (!apelliValido) {
      System.out.print("Apellidos: ");
      String apellidos = scanner.nextLine();
      apelliValido = TamanioCadena.validar(apellidos, 5, 30);

      Apellidos = apellidos;
      if (!apelliValido) {
        System.out.println("Nombre debe tener entre 5 y 30 caracteres.");
      }
    }

    // TELEFONO
    String Telefono = "";
    while (!telValido) {
      System.out.print("Teléfono: ");
      String telefono = scanner.nextLine();
      telValido = ValidarVacios.validarVacio(telefono);

      Telefono = telefono;
      if (!telValido) {
        System.out.println("El RUN debe ser un número menor a 99.999.999.");
      }
    }

    // AFP
    String Afp = "";
    while (!afpValido) {
      System.out.print("Afp: ");
      String afp = scanner.nextLine();
      afpValido = TamanioCadena.validar(afp, 4, 30);

      Afp = afp;
      if (!afpValido) {
        System.out.println("Afp debe tener entre 4 y 30 caracteres.");
      }
    }

    // SALUD
    int Salud = 0;
    while (!saludValido) {
      System.out.print("Sistema de salud (1: Fonasa, 2: Isapre): ");
      int salud = scanner.nextInt();
      scanner.nextLine(); // Consumir el salto de línea
      saludValido = ValidarSalud.validarSalud(salud);

      Salud = salud;
      if (!saludValido) {
        System.out.println("Debe indicar una de las opciones mencionadas.");
      }
    }

    // DIRECCION
    String Direccion = "";
    while (!dirValido) {
      System.out.print("Dirección: ");
      String direccion = scanner.nextLine();
      dirValido = TamanioCadena.validar(direccion, 0, 70);

      Direccion = direccion;
      if (!dirValido) {
        System.out.println("Direccion debe tener 70 caracteres max.");
      }
    }

    // COMUNA
    String Comuna = "";
    while (!comValido) {
      System.out.print("Comuna: ");
      String comuna = scanner.nextLine();
      comValido = TamanioCadena.validar(comuna, 0, 50);

      Comuna = comuna;
      if (!comValido) {
        System.out.println("Comuna debe tener 50 caracteres max.");
      }
    }

    // Usuario user = new Usuario("nombreUsuario", null, 0);

    // Crear instancia de Cliente y agregarla a la lista de asesorías

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

    run = Rut;

    Cliente cliente = new Cliente(Name, fecha, run);

    cliente.setRut(Rut);
    cliente.setNombres(Nombres);
    cliente.setApellidos(Apellidos);
    cliente.setTelefono(Telefono);
    cliente.setAfp(Afp);
    cliente.setSistemaSalud(Salud);
    cliente.setDireccion(Direccion);
    cliente.setComuna(Comuna);

    System.out.println("Cliente agregado exitosamente.");
    cliente.toString();
    return cliente;

  }

}
