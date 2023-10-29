import java.util.ArrayList;

public class Jugador extends Persona{
    static int idJugador = 1;
    private String posicion;
    private Equipo equipo;
    private int minutosJugados;

    public String getPosicion() {
        return posicion;
    }
    public void setPosicion (String posicion){
        this.posicion = posicion;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
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

    @Override
    public String toString() {
        return  "Nombre: " + this.nombre +
                ", Apellido: " + this.apellido +
                ", CI: " + this.ci +
                ", Sueldo: " + this.sueldo +
                ", Posición: " + this.posicion +
                ", Equipo: " + nombreEquipo() +
                ", Minutos Jugados: " + this.minutosJugados;
    }

    public Jugador(String pNombre, String pApellido, String pCi, int pSueldo, String pPosicion, Equipo pEquipo, int pMinutosJugados) {
        this.id = idJugador;
        this.nombre = pNombre;
        this.apellido = pApellido;
        this.ci = pCi;
        this.sueldo = pSueldo;
        this.posicion = pPosicion;
        this.equipo = pEquipo;
        this.minutosJugados = pMinutosJugados;
        idJugador++;
    }

    private String nombreEquipo(){
        return (equipo != null ) ? this.equipo.getNombre() : "Ninguno";
    }
}
