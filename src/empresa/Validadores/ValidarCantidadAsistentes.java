package empresa.Validadores;

public class ValidarCantidadAsistentes {

  public static boolean validarAsistentes(int cant) {
    if (cant <= 0 || cant >= 1000) {
      return false;
    }
    return true;
  }

}
