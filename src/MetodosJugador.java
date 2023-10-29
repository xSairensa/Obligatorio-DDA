import java.util.ArrayList;
import java.util.Scanner;

public class MetodosJugador {
    static ArrayList<Jugador> pListaJugadores = new ArrayList<Jugador>();
    //FUNCIONA
    public static void gestionJugadores(Scanner keyboard){
        keyboard.nextLine();
        limpiarConsola();
        boolean salir = false;
        while(salir == false){
            System.out.println("Ingrese la opcion deseada\n" +
                    "1- Alta Jugador \n" +
                    "2- Actualizar Jugador \n" +
                    "3- Eliminar Jugador \n" +
                    "4- Listar Jugadores \n" +
                    "0- Volver");
            short opcion2 = keyboard.nextShort();
            switch (opcion2) {
                case 1:
                    altaJugador(keyboard);
                    break;
                case 2:
                    actualizarJugadores(keyboard);
                    break;
                case 3:
                    eliminarJugador(keyboard);
                    break;
                case 4:
                    listarJugadores();
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
    //FUNCIONA después: revisar que pasa cuando hay más de 7 jugadores
    public static void altaJugador(Scanner keyboard){
        keyboard.nextLine();
        MetodosEquipo pMetodosE = new MetodosEquipo();
        System.out.println("Ingrese los datos del jugador:");

        System.out.print("Nombre: ");
        String pNombre = keyboard.nextLine();

        System.out.print("Apellido: ");
        String pApellido = keyboard.nextLine();

        System.out.print("Cédula: ");
        String pCi = keyboard.nextLine();

        System.out.print("Sueldo: ");
        int pSueldo = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Posicion: ");
        String pPosicion = keyboard.nextLine();

        System.out.println("Equipos disponibles:");
        pMetodosE.listarEquipos();
        System.out.print("Seleccione el nombre de su equipo: ");
        String nombreEquipo = keyboard.nextLine();

        Equipo equipoSeleccionado = pMetodosE.buscarEquipo(nombreEquipo);
        if(equipoSeleccionado != null) {
            boolean equipoDisponible = false;
            while (!equipoDisponible) {
                int jugadoresPorEquipo = pMetodosE.cantidadJugadores(equipoSeleccionado);
                if (jugadoresPorEquipo < 8) {
                    equipoDisponible = true;
                } else {
                    System.out.println("El equipo esta lleno, seleccione otro");
                    System.out.println("Equipos disponibles:");
                    pMetodosE.listarEquipos();
                    System.out.print("Seleccione el nombre de su equipo: ");
                    nombreEquipo = keyboard.nextLine();
                    equipoSeleccionado = pMetodosE.buscarEquipo(nombreEquipo);
                }
            }
        }
        System.out.print("Minutos jugados: ");
        int pMinutosJugados = keyboard.nextInt();
        keyboard.nextLine();

        Jugador pJugador = new Jugador(pNombre, pApellido, pCi, pSueldo, pPosicion, equipoSeleccionado, pMinutosJugados);
        boolean isExiste = jugadorExistente(pCi, pListaJugadores);
        if (!isExiste) {
            pListaJugadores.add(pJugador);
            if(equipoSeleccionado != null) {
                pMetodosE.agregarJugador(equipoSeleccionado, pJugador);
            }
            System.out.println("Jugador agregado correctamente");
        }
        else{
            System.out.println("El jugador ya existe");
        }
    }
    public static void actualizarJugadores(Scanner keyboard){
        keyboard.nextLine();
        listarJugadores();
        System.out.println("Ingrese CI del jugador que desee modificar:");
        String pCi = keyboard.nextLine();
        Jugador pJugador = buscarJugador(pCi);
        MetodosEquipo pMetodosE = new MetodosEquipo();
        boolean salir = false;
        while(salir == false) {
            if (pJugador != null) {
                System.out.println("Seleccione lo que desea modificar: \n" +
                        "1 - Nombre: \n" +
                        "2 - Apellido: \n" +
                        "3 - CI: \n" +
                        "4 - Sueldo: \n" +
                        "5 - Posición: \n" +
                        "6 - Equipo: \n" +
                        "7 - Minutos jugados: \n" +
                        "0 - Volver");
                int opcion = keyboard.nextInt();
                keyboard.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nuevo nombre:");
                        String nuevoNombre = keyboard.nextLine();
                        pJugador.setNombre(nuevoNombre);
                        System.out.println("Nombre modificado correctamente");
                        break;
                    case 2:
                        System.out.println("Ingrese el nuevo apellido:");
                        String nuevoApellido = keyboard.nextLine();
                        pJugador.setApellido(nuevoApellido);
                        System.out.println("Apellido modificado correctamente");
                        break;
                    case 3:
                        System.out.println("Ingrese la nueva CI:");
                        String nuevaCI = keyboard.nextLine();
                        pJugador.setCi(nuevaCI);
                        System.out.println("CI modificada correctamente");
                        break;
                    case 4:
                        System.out.println("Ingrese el nuevo sueldo:");
                        int nuevoSueldo = keyboard.nextInt();
                        pJugador.setSueldo(nuevoSueldo);
                        System.out.println("Sueldo modificado correctamente");
                        break;
                    case 5:
                        System.out.println("Ingrese la nueva posición:");
                        String nuevaPosicion = keyboard.nextLine();
                        pJugador.setPosicion(nuevaPosicion);
                        System.out.println("Posición modificada correctamente");
                        break;
                    case 6:
                        Equipo pEquipoActual = pJugador.getEquipo();
                        System.out.println("Equipos disponibles:");
                        pMetodosE.listarEquipos();
                        System.out.print("Seleccione el nombre de su equipo nuevo: ");
                        String pNombreEquipo = keyboard.nextLine();
                        Equipo pNuevoEquipo = pMetodosE.buscarEquipo(pNombreEquipo);
                        boolean equipoDisponible = false;
                        while(!equipoDisponible){
                            int jugadoresPorEquipo = pMetodosE.cantidadJugadores(pNuevoEquipo);
                            if(jugadoresPorEquipo < 8){
                                equipoDisponible = true;
                                pJugador.setEquipo(pNuevoEquipo);
                                //Agrego el jugador al equipo nuevo
                                pMetodosE.agregarJugador(pNuevoEquipo, pJugador);
                                //Elimino el jugador del viejo equipo
                                pMetodosE.eliminarJugador(pEquipoActual, pJugador);
                            }
                            else{
                                System.out.println("El equipo esta lleno, seleccione otro");
                                System.out.println("Equipos disponibles:");
                                pMetodosE.listarEquipos();
                                System.out.print("Seleccione el nombre de su equipo: ");
                                pNombreEquipo = keyboard.nextLine();
                                pNuevoEquipo = pMetodosE.buscarEquipo(pNombreEquipo);
                            }
                        }
                        break;
                    case 7:
                        System.out.println("Ingrese la cantidad de minutos jugados:");
                        int nuevosMin = keyboard.nextInt();
                        pJugador.setMinutosJugados(nuevosMin);
                        System.out.println("Mins jugados modificados correctamente");
                        break;
                    case 0:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción Incorrecta");
                        break;
                }
            }
            else{
                System.out.println("El equipo no existe");
            }
        }
    }
    //FUNCIONA
    public static void eliminarJugador(Scanner keyboard){
        System.out.println("Ingrese CI del jugador que quiere eliminar:");
        String CIeliminar = keyboard.nextLine();

        Jugador jugadorE = buscarJugador(CIeliminar);
        if(jugadorE != null) {
            pListaJugadores.remove(jugadorE);
        }
        else{
            System.out.println("El jugador no existe");
        }
    }
    //FUNCIONA
    public static void listarJugadores(){
        System.out.println("Lista de Jugadores:");
        for (Jugador jugador : pListaJugadores) {
            System.out.println(jugador.toString());
        }
    }
    //FUNCIONA
    public static Jugador buscarJugador(String pCI){
        Jugador elJugador = null;
        for (Jugador pJugador : pListaJugadores){
            if(pJugador.getCi().equalsIgnoreCase(pCI)){
                elJugador = pJugador;
                break;
            }
        }
        return elJugador;
    }
    public static boolean jugadorExistente(String pCI, ArrayList<Jugador> pLista){
        boolean existe = false;
        for (Jugador pJugador : pLista){
            if(pJugador.getCi().equalsIgnoreCase(pCI)){
                existe = true;
            }
        }
        return existe;
    }
    private static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
