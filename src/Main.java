import java.awt.*;
import java.util.ArrayList;
import java.util.Formattable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static ArrayList<Jugador> pListaJugadores = new ArrayList<Jugador>();
    static ArrayList<Equipo> pListaEquipos = new ArrayList<Equipo>();
    static ArrayList<Arbitro> pListaArbitros = new ArrayList<Arbitro>();

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean salir = false;
        while(salir == false) {

            System.out.println("Bienvenido!\n" +
                    "Ingrese la opcion deseada\n" +
                    "1- Gestionar Jugador \n" +
                    "2- Gestionar Técnico \n" +
                    "3- Gestionar Equipo \n" +
                    "4- Gestionar Árbitro \n" +
                    "5- Gestionar Cuadro \n" +
                    "6- Gestionar Partido \n" +
                    "0- Salir");
            try {
                short opcion = keyboard.nextShort();
                switch (opcion) {
                    case 1:
                        gestionJugadores(keyboard);
                        break;
                    case 2:
                        gestionTecnicos(keyboard);
                        break;
                    case 3:
                        gestionarEquipos(keyboard);
                        break;
                    case 4:
                        gestionArbitros(keyboard);
                        break;
                    case 5:
                        gestionarCuadros(keyboard);
                        break;
                    case 6:
                        gestionarPartidos(keyboard);
                    case 0:
                        salir = true;
                        break;
                    default:
                        System.out.println("La opción ingresada no es correcta");
                        break;
                }
            } catch (InputMismatchException e) {
                String ingreso = keyboard.nextLine();
                System.err.println("Debe ingresar un numero, no '" + ingreso + "'");
            }
        }
        keyboard.close();
    }
    private static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    //region Metodos de Gestion
    public static void gestionJugadores(Scanner keyboard){
        limpiarConsola();
        boolean salir = false;
        while(salir == false){
            System.out.println("Ingrese la opcion deseada\n" +
                    "1- Alta Jugador \n" +
                    "2- Modificar Jugador \n" +
                    "3- Eliminar Jugador \n" +
                    "4- Listar Jugadores \n" +
                    "5- Actualizar Jugadores \n" +
                    "0- Volver");
            //     try {
            short opcion2 = keyboard.nextShort();
            switch (opcion2) {
                case 1:
                    altaJugador(keyboard);
                    break;
                case 2:
                    modificarJugador(keyboard);
                    break;
                case 3:
                    eliminarJugador(keyboard);
                    break;
                case 4:
                    listarJugadores();
                    break;
                case 5:
                    actualizarJugadores();
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
    public static void gestionTecnicos(Scanner keyboard){
        limpiarConsola();
     //   Scanner keyboardT = new Scanner(System.in);
        boolean salir = false;
        while(salir == false){
            System.out.println("Ingrese la opcion deseada\n" +
                    "1- Alta Técnico \n" +
                    "2- Modificar Técnico \n" +
                    "3- Eliminar Técnico \n" +
                    "4- Listar Técnicos \n" +
                    "5- Actualizar Técnicos \n" +
                    "0- Volver");
            //     try {
            short opcion3 = keyboard.nextShort();
            switch (opcion3) {
                case 1:
                    altaTecnico(keyboard);
                    break;
                case 2:
                    modificarTecnico(keyboard);
                    break;
                case 3:
                    eliminarTecnico(keyboard);
                    break;
                case 4:
                    listarTecnicos();
                    break;
                case 5:
                    actualizarTecnicos();
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
    public static void gestionarEquipos(Scanner keyboard){
        limpiarConsola();
        //   Scanner keyboardT = new Scanner(System.in);
        boolean salir = false;
        while(salir == false){
            System.out.println("Ingrese la opcion deseada\n" +
                    "1- Alta Equipo \n" +
                    "2- Modificar Equipo \n" +
                    "3- Eliminar Equipo \n" +
                    "4- Listar Equipos \n" +
                    "0- Volver");
            //     try {
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
    public static void gestionArbitros(Scanner keyboard){
        limpiarConsola();
        //   Scanner keyboardT = new Scanner(System.in);
        boolean salir = false;
        while(salir == false){
            System.out.println("Ingrese la opcion deseada\n" +
                    "1- Alta Árbitro \n" +
                    "2- Modificar Árbitro \n" +
                    "3- Eliminar Árbitro \n" +
                    "4- Listar Árbitros \n" +
                    "5- Actualizar Árbitros \n" +
                    "0- Volver");
            //     try {
            short opcion4 = keyboard.nextShort();
            switch (opcion4) {
                case 1:
                    altaArbitro(keyboard);
                    break;
                case 2:
                    modificarArbitro(keyboard);
                    break;
                case 3:
                    eliminarArbitro(keyboard);
                    break;
                case 4:
                    listarArbitros();
                    break;
                case 5:
                    actualizarArbitros();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta");
                    break;
            }
        }
        keyboard.close();
    }
    public static void gestionarCuadros(Scanner keyboard){
        limpiarConsola();
        System.out.println("Ingresar Datos:");
        new Scanner(System.in).nextLine();
    }
    public static void gestionarPartidos(Scanner keyboard){
        limpiarConsola();
        System.out.println("Ingresar Datos:");
        new Scanner(System.in).nextLine();
    }
    //endregion

    //region Metodos Jugador
    public static void altaJugador(Scanner keyboard){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos del jugador:");

        System.out.print("Nombre: ");
        String pNombre = scanner.nextLine();

        System.out.print("Apellido: ");
        String pApellido = scanner.nextLine();

        System.out.print("Cédula: ");
        String pCi = scanner.nextLine();

        System.out.print("Sueldo: ");
        int pSueldo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Posicion: ");
        String pPosicion = scanner.nextLine();

        System.out.println("Equipos disponibles:");
        for (Equipo equipo : pListaEquipos) {
            System.out.println(equipo.getNombre());
        }
        System.out.print("Seleccione el nombre de su equipo: ");
        String nombreEquipo = scanner.nextLine();

        Equipo equipoSeleccionado = null;
        for (Equipo equipo : pListaEquipos) {
            if (equipo.getNombre().equalsIgnoreCase(nombreEquipo)) {
                equipoSeleccionado = equipo;
                break;
            }
        }

        System.out.print("Minutos jugados: ");
        int minutosJugados = scanner.nextInt();
        scanner.nextLine();

        int jugadoresPorEquipo = 0;
        for (Jugador jugador : pListaJugadores) {
            if (jugador.getEquipo().equals(equipoSeleccionado)) {
                jugadoresPorEquipo++;
            }
        }
        Jugador pJugador = new Jugador(pNombre, pApellido, pCi, pSueldo, pPosicion, equipoSeleccionado, minutosJugados);
        long cantidad = pListaJugadores.size();
        if(!jugadorExistente(pJugador.getCi(), pListaJugadores)) {
            pListaJugadores.add(pJugador);
            if (pListaJugadores.size() > cantidad) {
                System.out.println("Jugador agregado correctamente");
            }
        }
        else{
            System.out.println("El jugador ya existe");
        }

    }
    public static void modificarJugador(Scanner keyboard){
    }
    public static void eliminarJugador(Scanner keyboard){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese CI del jugador que quiere eliminar:");
        String CIeliminar = scanner.nextLine();

        Jugador jugadorE = null;
        for (Jugador jugador : pListaJugadores) {
            if (jugador.getCi().equals(CIeliminar)) {
                jugadorE = jugador;
                pListaJugadores.remove(jugadorE);
                listarJugadores();
                break;
            }
        }

       /* if (jugadorE != null) {
            pListaJugadores.remove(jugadorE);
            listarJugadores();
        } else {
            System.out.println("Nombre no encontrado. \n");
        } */
    }
    public static void listarJugadores(){
        System.out.println("Lista de Jugadores:");
        for (Jugador jugador : pListaJugadores) {
            System.out.println(jugador);
        }
    }
    public static void actualizarJugadores(){
    }

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
    //endregion
    //region Metodos Tecnico
    public static void altaTecnico(Scanner keyboard){
    }
    public static void modificarTecnico(Scanner keyboard){
    }
    public static void eliminarTecnico(Scanner keyboard){
    }
    public static void listarTecnicos(){
    }
    public static void actualizarTecnicos(){
    }
    //endregion
    //region Metodos Equipo
    public static void altaEquipo(Scanner keyboard){
        keyboard.nextLine();
        System.out.println("Ingrese el nombre del equipo:");
        String pNombre = keyboard.nextLine();
        Equipo pEquipo = new Equipo(pNombre);
        pListaEquipos.add(pEquipo);
        System.out.println("El equipo se agregó correctamente");
    }
    public static void modificarEquipo(Scanner keyboard){
        keyboard.nextLine();
        listarEquipos();
        System.out.println("Ingrese el nombre del equipo que desee modificar:");
        String pNombre = keyboard.nextLine();
        Equipo pEquipo = buscarEquipo(pNombre);
        boolean salir = false;
        while(salir == false) {
            if (pEquipo != null) {
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
                        System.out.println("Cambio de tecnico");
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
    public static void eliminarEquipo(Scanner keyboard){
    }
    public static void listarEquipos(){
        System.out.println("Lista de Equipos:");
        for (Equipo pEquipo : pListaEquipos) {
            System.out.println(pEquipo);
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
        while(salir == false) {
            System.out.println("Desea: \n" +
                    "1 - Agregar jugador: \n" +
                    "2 - Eliminar jugador \n" +
                    "0 - Volver");
            int opcion = keyboard.nextInt();
            keyboard.nextLine();
            switch (opcion) {
                case 1:
                    if (contador < 7) {
                        ArrayList<Jugador> pLista = pEquipo.getListaJugadores();
                        listarJugadores();
                        System.out.println("Ingrese la CI del jugador que desea agregar:");
                        String pCI = keyboard.nextLine();
                        Jugador pJugador = buscarJugador(pCI);
                        if (pJugador != null) {
                            if(jugadorExistente(pJugador.getCi(), pLista)) {
                                pLista.add(pJugador);
                            }
                            else{
                                System.out.println("El jugador ya esta ingresado en el equipo");
                            }
                        }
                        pEquipo.setListaJugadores(pLista);
                    } else {
                        System.out.println("El equipo ya tiene 5 jugadores");
                    }
                    break;
                case 2:
                    ArrayList<Jugador> pLista = pEquipo.getListaJugadores();
                    listarJugadores();
                    System.out.println("Ingrese la CI del jugador que desea eliminar:");
                    String pCI = keyboard.nextLine();
                    Jugador pJugador = buscarJugador(pCI);
                    if (pJugador != null) {
                        pLista.remove(pJugador);
                    }
                    pEquipo.setListaJugadores(pLista);
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

    public static Equipo buscarEquipo(String pNombreEquipo){
        Equipo elEquipo = null;
        for (Equipo pEquipo : pListaEquipos){
            if(pEquipo.getNombre().equalsIgnoreCase(pNombreEquipo)){
                elEquipo = pEquipo;
            }
        }
        return elEquipo;
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
    //endregion
    //region Metodos Arbitro
    public static void altaArbitro(Scanner keyboard){
    }
    public static void modificarArbitro(Scanner keyboard){
    }
    public static void eliminarArbitro(Scanner keyboard){
    }
    public static void listarArbitros(){
    }
    public static void actualizarArbitros(){
    }
    //endregion
}

