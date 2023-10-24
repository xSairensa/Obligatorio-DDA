public class Tecnico extends Persona{
    private String equipo;
    public String getEquipo() {
        return equipo;
    }
    public void setEquipo (String equipo){
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
                ", Equipo: " + this.equipo;
    }

    public Tecnico(int idTecnico, String pNombre, String pApellido, String pCi, int pSueldo, String pEquipo) {
        this.id = idTecnico;
        this.setNombre(pNombre);
        this.setApellido(pApellido);
        this.setCi(pCi);
        this.setSueldo(pSueldo);
        this.equipo = pEquipo;
        idTecnico++;
    }
}
