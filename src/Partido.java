import java.util.Date;
import java.util.List;

public class Partido {
    private String fechaHora;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private Arbitro arbitro;

    public String getFechaHora() {
        return fechaHora;
    }
    public void setFechaHora (String fechaHora){
        this.fechaHora = fechaHora;
    }
    public Equipo getEquipoLocal() {
        return equipoLocal;
    }
    public void setEquipoLocal (Equipo equipoLocal){
        this.equipoLocal = equipoLocal;
    }
    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }
    public void setEquipoVisitante (Equipo equipoVisitante){
        this.equipoVisitante = equipoVisitante;
    }
    public Arbitro getArbitro() {
        return arbitro;
    }
    public void setArbitro (Arbitro arbitro){
        this.arbitro = arbitro;
    }
    public Partido(String pFechaHora, Equipo pELocal, Equipo pEVisitante, Arbitro pArbitro) {
        this.setFechaHora(pFechaHora);
        this.setEquipoLocal(pELocal);
        this.setEquipoVisitante(pEVisitante);
        this.setArbitro(pArbitro);
    }
    public String toString() {
        return  "Fecha y hora: " + this.getFechaHora() +
                ", Equipo Local: " + this.getEquipoLocal().getNombre() +
                ", Equipo Visitante: " + this.getEquipoVisitante().getNombre() +
                ", Arbitro: " + this.getArbitro().getNombre() + " " + this.getArbitro().getApellido();
    }

}
