package empresa.Entidades;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalTime;

public class VisitaTerreno {
  Integer  id;
  Integer rut;
  LocalDate fechaAccidente;
  LocalTime hora;
  String lugar;
  String comentario;

  public VisitaTerreno(Integer id, Integer rut, LocalDate fechaAccidente, LocalTime hora, String lugar, String comentario) {
    this.id = id;
    this.rut = rut;
    this.fechaAccidente = fechaAccidente;
    this.hora = hora;
    this.lugar = lugar;
    this.comentario = comentario;
  }

  public Integer  getId() {
    return id;
  }

  public void setId(Integer  id) {
    this.id = id;
  }

  public Integer getRut() {
    return rut;
  }

  public void setRut(Integer rut) {
    this.rut = rut;
  }

  public LocalDate getFechaAccidente() {
    return fechaAccidente;
  }

  public void setFechaAccidente(LocalDate fechaAccidente) {
    this.fechaAccidente = fechaAccidente;
  }

  public LocalTime getHora() {
    return hora;
  }

  public void stHora(LocalTime hora) {
    this.hora = hora;
  }

  public String getLugar() {
    return lugar;
  }

  public void setId(String lugar) {
    this.lugar = lugar;
  }

  public String getComentario() {
    return comentario;
  }

  public void setComentario(String comentario) {
    this.comentario = comentario;
  }



  public boolean validarId() {
    return (id != null)? true : false;
  }

  public boolean validarRut() {
    return (rut != null)? true : false;
  }

  public boolean validarFechaAccidente() {
      String patronRegex = "\\d{2}/\\d{2}/\\d{4}";
      DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      String fechaFormateada = formatoFecha.format(fechaAccidente);
      return fechaFormateada.matches(patronRegex);
  }

  public boolean ValidarHora() {
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        String horaFormateada = hora.format(formatoHora);
        String patronRegex = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
        return horaFormateada.matches(patronRegex);
  }

  public boolean ValidarLugar(){
    return (lugar.length() > 9 && lugar.length() < 51)? true:false;
  }
  public boolean ValidarComentario(){
    return (comentario.length() < 101)? true:false;
  }

   /*
   * Visita en terreno:
   * 
   * - Identificador de la visita en terreno: obligatorio, número interno manejado por la compañía.
   * - RUT cliente: obligatorio
   * - Día: fecha del accidente, independiente si lo declara como una fecha o un String,
   * debe ser desplegado con el formato DD/MM/AAAA
   * - Hora: debe ser una hora válida del día, en formato HH:MM (hora desde 0 a 23, minutos entre 0 y 59)
   * - Lugar: obligatorio, mínimo 10 caracteres, máximo 50
   * - Comentarios: máximo 100 caracteres
   * 
   * 
   */
}
