import java.util.ArrayList;
import java.util.Scanner;

public class MetodosEquipo {
    static ArrayList<Equipo> pListaEquipos = new ArrayList<Equipo>();
    //FUNCIONA
    public static void gestionarEquipos(Scanner keyboard){
        limpiarConsola();
        boolean salir = false;
        while(salir == false){
            System.out.println("Ingrese la opcion deseada\n" +
                    "1- Alta Equipo \n" +
                    "2- Actualizar Equipo \n" +
                    "3- Eliminar Equipo \n" +
                    "4- Listar Equipos \n" +
                    "0- Volver");
            short opcion3 = keyboard.nextShort();
            switch (opcion3) {
                case 1:
                    altaEquipo(keyboard);
                    break;
                case 2:
                    modificarEquipo(keyboard);
                    break;
                case 3:
                    eliminarEquipo(keyboard);
                    break;
                case 4:
                    listarEquipos();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta");
                    break;
            }
        }
    }
    // PENDIENTE LISTA DE JUGADORES, TENGO QUE REVISAR
    public static void altaEquipo(Scanner keyboard){
        keyboard.nextLine();
        MetodosTecnico pMetodosT = new MetodosTecnico();
        System.out.println("Ingrese el nombre del equipo:");
        String pNombre = keyboard.nextLine();
        ArrayList<Jugador> pLista = new ArrayList<Jugador>();
        pMetodosT.listarTecnicos();
        System.out.println("Ingrese la CI del tecnico");
        String pCi = keyboard.nextLine();
        Tecnico pTecnico = pMetodosT.buscarTecnico(pCi);
//        boolean isExiste = false;
//        while(!isExiste){
//            pTecnico = pMetodosT.buscarTecnico(pCi);
//            if(pTecnico != null){
//                isExiste = true;
//            }
//            else{
//                System.out.println("El tecnico no existe, ingrese de nuevo la CI");
//                pCi = keyboard.nextLine();
//            }
//        }
        Equipo pEquipo = new Equipo(pNombre, pLista, pTecnico);
        pListaEquipos.add(pEquipo);
        try {
            pTecnico.setEquipo(pEquipo);
        }
        catch (NullPointerException e){
            System.out.println("No se pudo setear el equipo del tecnico");
        }
        System.out.println("El equipo se agregó correctamente");
    }
    public static void modificarEquipo(Scanner keyboard){
        keyboard.nextLine();
        listarEquipos();
        System.out.println("Ingrese el nombre del equipo que desee modificar:");
        String pNombre = keyboard.nextLine();
        Equipo pEquipo = buscarEquipo(pNombre);
        boolean salir = false;
        if (pEquipo != null) {
            while(salir == false) {

                System.out.println("Seleccione lo que desea modificar: \n" +
                        "1 - Nombre: \n" +
                        "2 - Jugadores: \n" +
                        "3 - Tecnico: \n" +
                        "0 - Volver");
                int opcion = keyboard.nextInt();
                keyboard.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nuevo nombre:");
                        String nuevoNombre = keyboard.nextLine();
                        pEquipo.setNombre(nuevoNombre);
                        break;
                    case 2:
                        actualizarEquipo(keyboard, pEquipo);
                        break;
                    case 3:
                        Tecnico pTecnicoActual = pEquipo.getTecnico();
                        MetodosTecnico pMetodosT = new MetodosTecnico();
                        pMetodosT.listarTecnicos();
                        System.out.println("Ingrese la CI del nuevo tecnico");
                        String pCiNueva = keyboard.nextLine();
                        Tecnico pNuevoTecnico = pMetodosT.buscarTecnico(pCiNueva);
                        if(pNuevoTecnico != null){
                            pEquipo.setTecnico(pNuevoTecnico);
                            pNuevoTecnico.setEquipo(pEquipo);
                            pTecnicoActual.setEquipo(null);
                            System.out.println("Tecnico modificado correctamente");
                        }
                        else{
                            System.out.println("El tecnico no éxiste");
                        }
                        break;
                    case 0:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción Incorrecta");
                        break;
                }
            }
        }
        else{
            System.out.println("El equipo no existe");
        }
    }
    public static void actualizarEquipo(Scanner keyboard, Equipo pEquipo){
        System.out.println("Lista actual de jugadores:");
        int contador = 0;
        try {
            for (Jugador pJugador : pEquipo.getListaJugadores()) {
                pJugador.toString();
                contador++;
            }
        }
        catch (NullPointerException e){
            System.out.println("No hay jugadores en el equipo");
        }
        boolean salir = false;
        MetodosJugador pMetodosJ = new MetodosJugador();
        while(salir == false) {
            System.out.println("Desea: \n" +
                    "1 - Agregar jugador: \n" +
                    "2 - Eliminar jugador \n" +
                    "0 - Volver");
            int opcion = keyboard.nextInt();
            keyboard.nextLine();
            switch (opcion) {
                case 1:
                    if (contador < 8) {
                        pMetodosJ.listarJugadores();
                        System.out.println("Ingrese la CI del jugador que desea agregar:");
                        String pCI = keyboard.nextLine();
                        Jugador pJugador = pMetodosJ.buscarJugador(pCI);
                        agregarJugador(pEquipo, pJugador);
                    } else {
                        System.out.println("El equipo ya tiene 7 jugadores");
                    }
                    break;
                case 2:
                    pMetodosJ.listarJugadores();
                    System.out.println("Ingrese la CI del jugador que desea eliminar:");
                    String pCI = keyboard.nextLine();
                    Jugador pJugador = pMetodosJ.buscarJugador(pCI);
                    eliminarJugador(pEquipo, pJugador);
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion inválida");
                    break;
            }
        }
    }
    //FUNCIONA
    public static void eliminarEquipo(Scanner keyboard){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del equipo que quiere eliminar:");
        String nombreE = scanner.nextLine();

        Equipo equipoE = null;
        for (Equipo equipo : pListaEquipos) {
            if (equipo.getNombre().equals(nombreE)) {
                equipoE = equipo;
                pListaEquipos.remove(equipoE);
                System.out.println("El equipo se eliminó correctamente.");
                listarEquipos();
                break;
            }
        }
    }
    //FUNCIONA
    public static void listarEquipos(){
        System.out.println("Lista de Equipos:");
        for (Equipo pEquipo : pListaEquipos) {
            System.out.println(pEquipo.detallesEquipo());
        }
    }
    public static Equipo buscarEquipo(String pNombreEquipo){
        Equipo elEquipo = null;
        for (Equipo pEquipo : pListaEquipos){
            if(pEquipo.getNombre().equalsIgnoreCase(pNombreEquipo)){
                elEquipo = pEquipo;
            }
        }
        return elEquipo;
    }
    public static int cantidadJugadores(Equipo pEquipo){
        int cantidad = 0;
        for (Jugador pJugador : pEquipo.getListaJugadores()){
            cantidad++;
        }
        return cantidad;
    }
    private static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void agregarJugador(Equipo pEquipo, Jugador pJugador){
        MetodosJugador pMetodosJ = new MetodosJugador();
        ArrayList<Jugador> pLista = pEquipo.getListaJugadores();
        if (pJugador != null) {
            if(!pMetodosJ.jugadorExistente(pJugador.getCi(), pLista)) {
                pLista.add(pJugador);
                pJugador.setEquipo(pEquipo);
                pEquipo.setListaJugadores(pLista);
            }
            else{
                System.out.println("El jugador ya esta ingresado en el equipo");
            }
        }
    }
    public static void eliminarJugador(Equipo pEquipo, Jugador pJugador){
        ArrayList<Jugador> pLista = pEquipo.getListaJugadores();
        if (pJugador != null) {
            pLista.remove(pJugador);
            pEquipo.setListaJugadores(pLista);
            pJugador.setEquipo(null);
        }
    }
}
