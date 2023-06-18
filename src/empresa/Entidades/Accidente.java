package empresa.Entidades;


public class Accidente{

  /**
   * Accidente
   * - Identificador del accidente: obligatorio, número interno manejado por la
   * compañía.
   * - RUT Cliente: obligatorio
   * - Día: fecha del accidente, independiente si lo declara como una fecha o un
   * String,
   * debe ser desplegado con el formato DD/MM/AAAA
   * - Hora: debe ser una hora válida del día, en formato HH:MM (hora desde 0 a
   * 23, minutos entre 0 y 59)
   * - Lugar: obligatorio, mínimo 10 caracteres, máximo 50
   * - Origen: máximo 100 caracteres
   * - Consecuencias: máximo 100 caracteres
   */

  private int idAccidente;
  private String rutCliente;
  private String dia;
  private String hora;
  private String lugar;
  private String origen;
  private String consecuencias;

  public Accidente(int idAccidente, String rutCliente, String dia, String hora, String lugar, String origen,
      String consecuencias) {


  }

  public Accidente() {
  }

  public int getIdAccidente() {
    return idAccidente;
  }

  public void setIdAccidente(int idAccidente) {
    this.idAccidente = idAccidente;
  }

  public String getRutCliente() {
    return rutCliente;
  }

  public void setRutCliente(String rutCliente) {
    this.rutCliente = rutCliente;
  }

  public String getDia() {
    return dia;
  }

  public void setDia(String dia) {
    this.dia = dia;
  }

  public String getHora() {
    return hora;
  }

  public void setHora(String hora) {
    this.hora = hora;
  }

  public String getLugar() {
    return lugar;
  }

  public void setLugar(String lugar) {
    this.lugar = lugar;
  }

  public String getOrigen() {
    return origen;
  }

  public void setOrigen(String origen) {
    this.origen = origen;
  }

  public String getConsecuencias() {
    return consecuencias;
  }

  public void setConsecuencias(String consecuencias) {
    this.consecuencias = consecuencias;
  }

  @Override
  public String toString() {
    return "Accidente [idAccidente=" + idAccidente + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora=" + hora
        + ", lugar=" + lugar + ", origen=" + origen + ", consecuencias=" + consecuencias + "]";
  }

}
