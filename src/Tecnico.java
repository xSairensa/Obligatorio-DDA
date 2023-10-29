public class Tecnico extends Persona{
    private int idTecnico = 1;
    private Equipo equipo;
    public Equipo getEquipo() {
        return equipo;
    }
    public void setEquipo (Equipo equipo){
        this.equipo = equipo;
    }
    @Override
    public int precalentar(){
        System.out.println("El técnico no debe precalentar");
        return 0;
    }
    @Override
    public int getBonificacion(){
        return 0;
    }
    @Override
    public String toString() {
        return  "Nombre: " + this.getNombre() +
                ", Apellido: " + this.getApellido() +
                ", CI: " + this.getCi() +
                ", Sueldo: " + this.getSueldo() +
                ", Equipo: " + nombreEquipo();
    }

    public Tecnico(String pNombre, String pApellido, String pCi, int pSueldo, Equipo pEquipo) {
        this.id = idTecnico;
        this.setNombre(pNombre);
        this.setApellido(pApellido);
        this.setCi(pCi);
        this.setSueldo(pSueldo);
        this.equipo = pEquipo;
        idTecnico++;
    }

    private String nombreEquipo(){
        return (equipo != null ) ? this.equipo.getNombre() : "Ninguno";
    }
}
