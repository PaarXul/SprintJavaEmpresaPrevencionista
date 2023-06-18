package empresa.Validadores;

public class ValidarVacios {

  /*
   * 
   * Identificador del accidente: obligatorio, número interno manejado por la
   * compañía.
   * -RUT Cliente: obligatorio
   * -Día: fecha del accidente, independiente si lo declara como una fecha o un
   * String, debe ser desplegado con el formato DD/MM/AAAA
   * - Hora: debe ser una hora válida del día, en formato HH:MM (hora desde 0 a
   * 23, minutos entre 0 y 59)
   * - Lugar: obligatorio, mínimo 10 caracteres, máximo 50
   * - Origen: máximo 100 caracteres
   * - Consecuencias: máximo 100 caracteres
   * 
   */

  // validar las entradas de los datos de accidente
  public static boolean validarVacio(String cadena) {
    if (cadena.length() > 0) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean validarVacioNumeros(int cadena) {
    if (cadena > 0) {
      return true;
    } else {
      return false;
    }
  }

}
