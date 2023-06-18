package empresa.Validadores;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Fecha {

  public static Date ObtenerFecha(String fecha) {
    Date dt = null;

    try {
      return dt = new SimpleDateFormat("DD/MM/yyyy")
          .parse(fecha);
    } catch (ParseException ex) {
      return dt;
    }
  }

  public static boolean validarFechaIngreso(String Fecha) {
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    dateFormat.setLenient(false);

    try {
      Date fecha = dateFormat.parse(Fecha);
      return true; // La fecha es válida
    } catch (ParseException e) {
      return false; // La fecha no es válida
    }
  }

  public static boolean validarDiaSemana(String Fecha) {

    if (Fecha.equals("lunes") || Fecha.equals("martes") || Fecha.equals("miercoles") || Fecha.equals("jueves")
        || Fecha.equals("viernes")
        || Fecha.equals("sabado") || Fecha.equals("domingo")) {
      return true;
    } else {
      return false;
    }

  }

  public static boolean validarHora(String hora) {

    try {
      boolean horaValida = false;
      Date dt = new SimpleDateFormat("HH:MM").parse(hora);
      if (dt.compareTo(dt) == 0) {
        horaValida = true;
      }
      return horaValida;

    } catch (ParseException ex) {
      return false;
    }
  }

}
