package empresa;

import java.util.Scanner;

import empresa.Entidades.Administrativo;
import empresa.Entidades.Capacitacion;
import empresa.Entidades.Cliente;
import empresa.Entidades.Contenedor;
import empresa.Entidades.Profesional;
import empresa.ViewConsole.ViewAdministrativo;
import empresa.ViewConsole.ViewCapacitacion;
import empresa.ViewConsole.ViewCliente;
import empresa.ViewConsole.ViewProfesional;
import empresa.ViewConsole.ViewUsuario;

public class Main {

  public static void main(String[] args) {
    Contenedor contenedor = new Contenedor();
    Scanner scanner = new Scanner(System.in);

    int opcion = 0;

    do {
      mostrarMenuPrincipal();
      opcion = scanner.nextInt();

      switch (opcion) {
        case 1:
          // Agregar cliente
          Cliente cl = ViewCliente.agregarCliente();
          contenedor.almacenarCliente(cl);

          break;
        case 2:
          // Agregar profesional
          Profesional pr = ViewProfesional.agregarProfesional();
          contenedor.almacenarProfesional(pr);
          // ...
          break;
        case 3:
          // Agregar administrativo3

          Administrativo ad = ViewAdministrativo.agregarAdministrativo();
          contenedor.almacenarAdministrativo(ad);

          // ...
          break;
        case 4:
          // Agregar capacitación

          Capacitacion cp = ViewCapacitacion.agregarCapacitacion();
          contenedor.almacenarCapacitacion(cp);

          // ...
          break;
        case 5:
          // Eliminar usuario
          int run = ViewUsuario.eliminarUsuario();
          contenedor.eliminarUsuario(run);

          // ...
          break;
        case 6:
          // Listar usuarios
          contenedor.listarUsuarios();
          // ...
          break;
        case 7:
          // Listar usuarios por tipo
          contenedor.listarUsuariosPorTipo();

          // ...
          break;
        case 8:
          // Listar capacitaciones
          contenedor.listarCapacitaciones();
          // ...
          break;
        case 9:
          // Salir del programa
          System.out.println("Saliendo del programa...");
          break;
        default:
          System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
      }
    } while (opcion != 9);
  }

  public static void mostrarMenuPrincipal() {
    System.out.println("==== Menú Principal ====");
    System.out.println("1. Agregar cliente");
    System.out.println("2. Agregar profesional");
    System.out.println("3. Agregar administrativo");
    System.out.println("4. Agregar capacitación");
    System.out.println("5. Eliminar usuario");
    System.out.println("6. Listar usuarios");
    System.out.println("7. Listar usuarios por tipo");
    System.out.println("8. Listar capacitaciones");
    System.out.println("9. Salir");
    System.out.println("========================");
    System.out.print("Seleccione una opción: ");
  }

  /*
   * Revisión:
   * 
   * Respecto de las clases anteriores se conoce lo siguiente:
   * - Un cliente puede tomar ninguna o muchas capacitaciones
   * - Un cliente puede registrar ninguno o muchos accidentes
   * - Un cliente debe tener una o muchas visitas en terreno
   * - Una visita en terreno debe tener una o más revisiones por cada ocasión
   */

}
