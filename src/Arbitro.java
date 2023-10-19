public class Arbitro extends Persona{
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
}
