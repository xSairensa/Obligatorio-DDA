import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> listaJugadores;
    private Tecnico tecnico;
    public Equipo(String nombre, ArrayList<Jugador> pListaJugadores, Tecnico pTecnico) {
        this.nombre = nombre;
        this.listaJugadores = pListaJugadores;
        this.tecnico = pTecnico;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public String toString() {
        return "Equipo: " + this.nombre;
    }

    public String detallesEquipo(){
        return "Equipo: " + this.nombre + "\n" +
                "Tecnico: " + nombreTecnico() + "\n" +
                "Jugadores: " + listarJugadores();
    }

    private String nombreTecnico(){
        return (tecnico != null ) ? this.tecnico.getNombre() + " " + this.tecnico.getApellido(): "Ninguno";
    }

    private String listarJugadores(){
        String pListadoJugadores = new String();
        if(this.listaJugadores.size() > 0) {
            for (Jugador pJugador : this.listaJugadores) {
                pListadoJugadores += pJugador.toString() + "\n";
            }
        }
        else{
            pListadoJugadores = "Ninguno";
        }
        return pListadoJugadores;
    }
}
