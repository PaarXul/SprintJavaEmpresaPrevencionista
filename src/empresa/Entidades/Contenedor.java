package empresa.Entidades;

import java.util.ArrayList;
import java.util.Scanner;

import empresa.Interfaces.Asesoria;

public class Contenedor {

  // Atributos
  private ArrayList<Asesoria> asesorias;
  private ArrayList<Capacitacion> capacitaciones;

  // Constructor
  public Contenedor() {
    asesorias = new ArrayList<>();
    capacitaciones = new ArrayList<>();
  }

  // Métodos
  public void almacenarCliente(Cliente cliente) {
    asesorias.add(cliente);
  }

  public void almacenarProfesional(Profesional profesional) {
    asesorias.add(profesional);
  }

  public void almacenarAdministrativo(Administrativo administrativo) {
    asesorias.add(administrativo);
  }

  public void almacenarCapacitacion(Capacitacion capacitacion) {
    capacitaciones.add(capacitacion);
  }

  public void eliminarUsuario(int run) {
    asesorias.removeIf(u -> u instanceof Usuario && ((Usuario) u).run == run);
  }

  public void listarUsuarios() {
    for (Asesoria asesoria : asesorias) {
      if (asesoria instanceof Usuario) {
        Usuario usuario = (Usuario) asesoria;
        System.out.println(usuario.toString());
      }
    }
  }

  public void listarUsuariosPorTipo() {
    Scanner Scanner = new Scanner(System.in);
    System.out.println("Ingrese el tipo de usuario a listar (cliente, profesional, administrativo): ");
    String tipo = Scanner.nextLine();

    for (Asesoria asesoria : asesorias) {
      if (asesoria instanceof Usuario) {
        Usuario usuario = (Usuario) asesoria;
        if (tipo.equalsIgnoreCase("cliente") && usuario instanceof Cliente) {
          System.out.println(usuario.toString());
        } else if (tipo.equalsIgnoreCase("profesional") && usuario instanceof Profesional) {
          System.out.println(usuario.toString());
        } else if (tipo.equalsIgnoreCase("administrativo") && usuario instanceof Administrativo) {
          System.out.println(usuario.toString());
        }
      }
    }
  }

  public void listarCapacitaciones() {
    for (Capacitacion capacitacion : capacitaciones) {
      System.out.println(capacitacion.toString());
    }
  }

}
