public abstract class Persona {
    private String nombre;
    private String apellido;
    private String ci;
    private int sueldo;
    public Persona() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido (String apellido){
        this.apellido = apellido;
    }
    public String getCi() { return ci; }
    public void setCi(String ci) {this.ci = ci;}
    public int getSueldo() { return sueldo;}
    public void setSueldo(int sueldo){this.sueldo = sueldo;}
    public abstract int precalentar();
    public abstract int getBonificacion();
}
