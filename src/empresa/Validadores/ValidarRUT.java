package empresa.Validadores;

public class ValidarRUT {

  // Método de validación de RUN
  public static boolean validarRUN(int run) {
    if (run <= 0 || run >= 99999999) {
      return false;
    }
    return true;
  }

}
