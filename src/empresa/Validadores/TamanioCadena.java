package empresa.Validadores;

public class TamanioCadena {

  public static boolean validar(String cadena, int min, int max) {
    if (cadena.length() > min && cadena.length() < max) {
      return true;
    } else {
      return false;
    }
  }

}
