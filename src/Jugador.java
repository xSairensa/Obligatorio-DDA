public class Jugador extends Persona{
    private String posicion;
    private String equipo;
    private int minutosJugados;

    public String getPosicion() {
        return posicion;
    }
    public void setPosicion (String posicion){
        this.posicion = posicion;
    }
    public String getEquipo() {
        return equipo;
    }
    public void setEquipo (String equipo){
        this.equipo = equipo;
    }
    public int getMinutosJugados() {
        return minutosJugados;
    }
    public void setMinutosJugados (int minutosJugados){
        this.minutosJugados = minutosJugados;
    }
    @Override
    public int precalentar(){
        System.out.println("El jugador debe precalentar 15 min");
        return 15;
    }
    @Override
    public int getBonificacion(){
        return (int) (super.getSueldo()*1.2);
    }
}
