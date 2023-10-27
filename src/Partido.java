import java.util.Date;
import java.util.List;

public class Partido {
    private String fechaHora;
    private String equipoLocal;
    private String equipoVisitante;


    public String getFechaHora() {
        return fechaHora;
    }
    public void setFechaHora (String fechaHora){
        this.fechaHora = fechaHora;
    }
    public String getEquipoLocal() {
        return equipoLocal;
    }
    public void setEquipoLocal (String equipoLocal){
        this.equipoLocal = equipoLocal;
    }
    public String getEquipoVisitante() {
        return equipoVisitante;
    }
    public void setEquipoVisitante (String equipoVisitante){
        this.equipoVisitante = equipoVisitante;
    }

}
