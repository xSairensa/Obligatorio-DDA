public class Arbitro extends Persona{
    private int idArbitro = 1;
    private int cantPartidos;
    public int getCantPartidos() {
        return cantPartidos;
    }
    public void setCantPartidos (int cantPartidos){
        this.cantPartidos = cantPartidos;
    }
    @Override
    public int precalentar(){
        System.out.println("El árbitro debe precalentar 10 min");
        return 10;
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
                ", Cant partidos: " + this.cantPartidos;
    }

    public Arbitro(String pNombre, String pApellido, String pCi, int pSueldo, int pCantPartidos) {
        this.id = idArbitro;
        this.setNombre(pNombre);
        this.setApellido(pApellido);
        this.setCi(pCi);
        this.setSueldo(pSueldo);
        this.cantPartidos = pCantPartidos;
        idArbitro++;
    }
}
