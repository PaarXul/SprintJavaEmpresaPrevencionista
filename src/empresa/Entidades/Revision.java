package empresa.Entidades;

public class Revision {
  Integer idRevision;
  Integer idVisita;
  String nombre;
  String Detalle;

  public Revision(Integer idRevision, Integer idVisita, String nombre, String detalle) {
    super();
    this.idRevision = idRevision;
    this.idVisita = idVisita;
    this.nombre = nombre;
    Detalle = detalle;
  }

  public Revision() {
  }

  public Integer getIdRevision() {
    return idRevision;
  }

  public void setIdRevision(Integer idRevision) {
    this.idRevision = idRevision;
  }

  public Integer getIdVisita() {
    return idVisita;
  }

  public void setIdVisita(Integer idVisita) {
    this.idVisita = idVisita;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDetalle() {
    return Detalle;
  }

  public void setDetalle(String detalle) {
    Detalle = detalle;
  }

  @Override
  public String toString() {
    return "Revision [idRevision=" + idRevision + ", idVisita=" + idVisita + ", nombre=" + nombre + ", Detalle="
        + Detalle + "]";
  }
  

  /*
   * Revisión
   * - Identificador de la revisión: obligatorio, número interno manejado por la
   * compañía.
   * - Identificador de la visita en terreno: obligatorio, número de la vista a la
   * que se
   * asóciala revisión.
   * 
   * - Nombre alusivo a la revisión: obligatorio, mínimo 10 caracteres, máximo 50
   * - Detalle para revisar: máximo 100 caracteres
   * - Estado: 1 (sin problemas), 2 (con observaciones), 3 (no aprueba), solo se
   * pueden ingresar los valores antes indicados.
   */

}