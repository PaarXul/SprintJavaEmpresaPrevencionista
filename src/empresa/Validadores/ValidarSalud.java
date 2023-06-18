package empresa.Validadores;

public class ValidarSalud {

  // Método de validación de RUN
  public static boolean validarSalud(int sistemaSalud) {
    if (sistemaSalud != 1 && sistemaSalud != 2) {
      return false;
    }
    return true;
  }

}
