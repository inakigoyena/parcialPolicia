public class Policia {

    private String nombre;
    private String apellido;
    private String legajo;
    private Arma[] armas;

    public Policia(String nombre, String apellido, String legajo, Arma[] armas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.armas = armas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public Arma[] getArmas() {
        return armas;
    }

    public void setArmas(Arma[] armas) {
        this.armas = armas;
    }
}