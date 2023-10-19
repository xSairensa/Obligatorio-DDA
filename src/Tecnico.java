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
}
