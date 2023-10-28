import java.awt.*;
import java.util.ArrayList;
import java.util.Formattable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static ArrayList<Jugador> pListaJugadores = new ArrayList<Jugador>();
    static ArrayList<Tecnico> pListaTecnicos = new ArrayList<Tecnico>();
    static ArrayList<Equipo> pListaEquipos = new ArrayList<Equipo>();
    static ArrayList<Arbitro> pListaArbitros = new ArrayList<Arbitro>();
    static ArrayList<Partido> pListaPartidos = new ArrayList<Partido>();

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
                    "5- Gestionar Partido \n" +
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

    //region Metodos de Gestion - FUNCIONAN TODOS
    //FUNCIONA
    public static void gestionJugadores(Scanner keyboard){
        limpiarConsola();
        boolean salir = false;
        while(salir == false){
            System.out.println("Ingrese la opcion deseada\n" +
                    "1- Alta Jugador \n" +
                    "2- Actualizar Jugador \n" +
                    "3- Eliminar Jugador \n" +
                    "4- Listar Jugadores \n" +
                    "0- Volver");
            //     try {
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
    //FUNCIONA
    public static void gestionTecnicos(Scanner keyboard){
        limpiarConsola();
        //   Scanner keyboardT = new Scanner(System.in);
        boolean salir = false;
        while(salir == false){
            System.out.println("Ingrese la opcion deseada\n" +
                    "1- Alta Técnico \n" +
                    "2- Actualizar Técnico \n" +
                    "3- Eliminar Técnico \n" +
                    "4- Listar Técnicos \n" +
                    "0- Volver");
            //     try {
            short opcion3 = keyboard.nextShort();
            switch (opcion3) {
                case 1:
                    altaTecnico(keyboard);
                    break;
                case 2:
                    actualizarTecnicos(keyboard);
                    break;
                case 3:
                    eliminarTecnico(keyboard);
                    break;
                case 4:
                    listarTecnicos();
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
    //FUNCIONA
    public static void gestionarEquipos(Scanner keyboard){
        limpiarConsola();
        //   Scanner keyboardT = new Scanner(System.in);
        boolean salir = false;
        while(salir == false){
            System.out.println("Ingrese la opcion deseada\n" +
                    "1- Alta Equipo \n" +
                    "2- Actualizar Equipo \n" +
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
    //FUNCIONA
    public static void gestionArbitros(Scanner keyboard){
        limpiarConsola();
        //   Scanner keyboardT = new Scanner(System.in);
        boolean salir = false;
        while(salir == false){
            System.out.println("Ingrese la opcion deseada\n" +
                    "1- Alta Árbitro \n" +
                    "2- Actualizar Árbitro \n" +
                    "3- Eliminar Árbitro \n" +
                    "4- Listar Árbitros \n" +
                    "0- Volver");
            //     try {
            short opcion4 = keyboard.nextShort();
            switch (opcion4) {
                case 1:
                    altaArbitro(keyboard);
                    break;
                case 2:
                    actualizarArbitros(keyboard);
                    break;
                case 3:
                    eliminarArbitro(keyboard);
                    break;
                case 4:
                    listarArbitros();
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
    //FUNCIONA
    public static void gestionarPartidos(Scanner keyboard){
        limpiarConsola();
        //   Scanner keyboardT = new Scanner(System.in);
        boolean salir = false;
        while(salir == false){
            System.out.println("Ingrese la opcion deseada\n" +
                    "1- Ingresar Partido \n" +
                    "2- Listar Partidos \n" +
                    "0- Volver");
            //     try {
            short opcion5 = keyboard.nextShort();
            switch (opcion5) {
                case 1:
                    ingresarPartido(keyboard);
                        break;
                case 2:
                    listarPartidos();
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
    //endregion

    //region Metodos Jugador
    //FUNCIONA después: revisar que pasa cuando hay más de 7 jugadores
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
        int pMinutosJugados = scanner.nextInt();
        scanner.nextLine();

        int jugadoresPorEquipo = 0;
        for (Jugador jugador : pListaJugadores) {
            if (jugador.getEquipo().equals(equipoSeleccionado)) {
                jugadoresPorEquipo++;
            }
        }
        Jugador pJugador = new Jugador(pNombre, pApellido, pCi, pSueldo, pPosicion, nombreEquipo, pMinutosJugados);
        long cantidad = pListaJugadores.size();
        pListaJugadores.add(pJugador);
        if (pListaJugadores.size() > cantidad) {
            System.out.println("Jugador agregado correctamente");
        }
        else{
            System.out.println("El jugador ya existe");
        }
    }
    //FUNCIONA
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
    }
    //FUNCIONA
    public static void listarJugadores(){
        System.out.println("Lista de Jugadores:");
        for (Jugador jugador : pListaJugadores) {
            System.out.println(jugador);
        }
    }
    //FUNCIONA
    public static void actualizarJugadores(Scanner keyboard){
        keyboard.nextLine();
        listarJugadores();
        System.out.println("Ingrese CI del jugador que desee modificar:");
        String pCi = keyboard.nextLine();
        Jugador pJugador = buscarJugador(pCi);
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
                        System.out.println("Equipos disponibles:");
                        for (Equipo equipo : pListaEquipos) {
                            System.out.println(equipo.getNombre());
                        }
                        System.out.print("Seleccione el nombre de su equipo nuevo: ");
                        String nuevoEquipo = keyboard.nextLine();
                        pJugador.setEquipo(nuevoEquipo);

                        Equipo equipoSeleccionado = null;
                        for (Equipo equipo : pListaEquipos) {
                            if (equipo.getNombre().equalsIgnoreCase(nuevoEquipo)) {
                                equipoSeleccionado = equipo;
                                break;
                            }
                        }

                        int jugadoresPorEquipo = 0;
                        for (Jugador jugador : pListaJugadores) {
                            if (jugador.getEquipo().equals(equipoSeleccionado)) {
                                jugadoresPorEquipo++;
                                System.out.println("Equipo modificado correctamente");
                                break;
                            }
                        }
                        if (jugadoresPorEquipo > 7){
                            System.out.print("No se pueden agregar más de 7 jugadores. Debe seleccionar otro equipo");

                            System.out.print("Seleccione el nombre de su equipo nuevo: ");
                            String nuevoEquipo2 = keyboard.nextLine();
                            pJugador.setEquipo(nuevoEquipo2);

                            Equipo equipoSeleccionado2 = null;
                            for (Equipo equipo : pListaEquipos) {
                                if (equipo.getNombre().equalsIgnoreCase(nuevoEquipo2)) {
                                    equipoSeleccionado2 = equipo;
                                    System.out.println("Equipo modificado correctamente");
                                    jugadoresPorEquipo = 7;
                                    break;
                                }
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
    //FUNCIONA
    public static void altaTecnico(Scanner keyboard){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos del técnico:");

        System.out.print("Nombre: ");
        String pNombre = scanner.nextLine();

        System.out.print("Apellido: ");
        String pApellido = scanner.nextLine();

        System.out.print("Cédula: ");
        String pCi = scanner.nextLine();

        System.out.print("Sueldo: ");
        int pSueldo = scanner.nextInt();
        scanner.nextLine();

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

        Tecnico pTecnico = new Tecnico(pNombre, pApellido, pCi, pSueldo, nombreEquipo);
        long cantidad = pListaTecnicos.size();
        pListaTecnicos.add(pTecnico);
        if(pListaTecnicos.size() > cantidad){
            System.out.println("Técnico agregado correctamente");
        }
        else{
            System.out.println("Error al guardar el técnico");
        }
    }
    //FUNCIONA
    public static void eliminarTecnico(Scanner keyboard){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la CI del técnico que quiere eliminar:");
        String ciT = scanner.nextLine();

        Tecnico tecnicoE = null;
        for (Tecnico tecnico : pListaTecnicos) {
            if (tecnico.getCi().equals(ciT)) {
                tecnicoE = tecnico;
                pListaTecnicos.remove(tecnicoE);
                System.out.println("El técnico se eliminó correctamente.");
                listarTecnicos();
                break;
            }
        }
    }
    //FUNCIONA
    public static void listarTecnicos(){
        System.out.println("Lista de Tecnicos:");
        for (Tecnico tecnico : pListaTecnicos) {
            System.out.println(tecnico);
        }
    }
    //FUNCIONA
    public static void actualizarTecnicos(Scanner keyboard){
        keyboard.nextLine();
        listarTecnicos();
        System.out.println("Ingrese CI del técnico que desee modificar:");
        String pCi = keyboard.nextLine();
        Tecnico pTecnico = buscarTecnico(pCi);
        boolean salir = false;
        while(salir == false) {
            if (pTecnico != null) {
                System.out.println("Seleccione lo que desea modificar: \n" +
                        "1 - Nombre: \n" +
                        "2 - Apellido: \n" +
                        "3 - CI: \n" +
                        "4 - Sueldo: \n" +
                        "5 - Equipo: \n" +
                        "0 - Volver");
                int opcion = keyboard.nextInt();
                keyboard.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nuevo nombre:");
                        String nuevoNombre = keyboard.nextLine();
                        pTecnico.setNombre(nuevoNombre);
                        System.out.println("Nombre modificado correctamente");
                        break;
                    case 2:
                        System.out.println("Ingrese el nuevo apellido:");
                        String nuevoApellido = keyboard.nextLine();
                        pTecnico.setApellido(nuevoApellido);
                        System.out.println("Apellido modificado correctamente");
                        break;
                    case 3:
                        System.out.println("Ingrese la nueva CI:");
                        String nuevaCI = keyboard.nextLine();
                        pTecnico.setCi(nuevaCI);
                        System.out.println("CI modificada correctamente");
                        break;
                    case 4:
                        System.out.println("Ingrese el nuevo sueldo:");
                        int nuevoSueldo = keyboard.nextInt();
                        pTecnico.setSueldo(nuevoSueldo);
                        System.out.println("Sueldo modificado correctamente");
                        break;
                    case 5:
                        System.out.println("Equipos disponibles:");
                        for (Equipo equipo : pListaEquipos) {
                            System.out.println(equipo.getNombre());
                        }
                        System.out.print("Seleccione el nombre de su equipo nuevo: ");
                        String nuevoEquipo = keyboard.nextLine();
                        pTecnico.setEquipo(nuevoEquipo);
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
    }
    public static Tecnico buscarTecnico(String pCI){
        Tecnico elTecnico = null;
        for (Tecnico pTecnico : pListaTecnicos){
            if(pTecnico.getCi().equalsIgnoreCase(pCI)){
                elTecnico = pTecnico;
                break;
            }
        }
        return elTecnico;
    }
    //endregion
    //region Metodos Equipo
    //FUNCIONA
    public static void altaEquipo(Scanner keyboard){
        keyboard.nextLine();
        System.out.println("Ingrese el nombre del equipo:");
        String pNombre = keyboard.nextLine();
        Equipo pEquipo = new Equipo(pNombre);
        pListaEquipos.add(pEquipo);
        System.out.println("El equipo se agregó correctamente");
    }
    //FUNCIONA
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
    //FUNCIONA
    public static void altaArbitro(Scanner keyboard){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos del técnico:");

        System.out.print("Nombre: ");
        String pNombre = scanner.nextLine();

        System.out.print("Apellido: ");
        String pApellido = scanner.nextLine();

        System.out.print("Cédula: ");
        String pCi = scanner.nextLine();

        System.out.print("Sueldo: ");
        int pSueldo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Cantidad de partidos: ");
        int pCantPartidos = scanner.nextInt();
        scanner.nextLine();

        Arbitro pArbitro = new Arbitro(pNombre, pApellido, pCi, pSueldo, pCantPartidos);
        long cantidad = pListaArbitros.size();
        pListaArbitros.add(pArbitro);
        if(pListaArbitros.size() > cantidad){
            System.out.println("Árbitro agregado correctamente");
        }
        else{
            System.out.println("Error al guardar el árbitro");
        }
    }
    //FUNCIONA
    public static void eliminarArbitro(Scanner keyboard){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la CI del árbitro que quiere eliminar:");
        String ciA = scanner.nextLine();

        Arbitro arbitroE = null;
        for (Arbitro arbitro : pListaArbitros) {
            if (arbitro.getCi().equals(ciA)) {
                arbitroE = arbitro;
                pListaArbitros.remove(arbitroE);
                System.out.println("El árbitro se eliminó correctamente.");
                listarArbitros();
                break;
            }
        }
    }
    //FUNCIONA
    public static void listarArbitros(){
        System.out.println("Lista de Árbitros:");
        for (Arbitro arbitro : pListaArbitros) {
            System.out.println(arbitro);
        }
    }
    public static void actualizarArbitros(Scanner keyboard){
        keyboard.nextLine();
        listarArbitros();
        System.out.println("Ingrese CI del árbitro que desee modificar:");
        String pCi = keyboard.nextLine();
        Arbitro pArbitro = buscarArbitro(pCi);
        boolean salir = false;
        while(salir == false) {
            if (pArbitro != null) {
                System.out.println("Seleccione lo que desea modificar: \n" +
                        "1 - Nombre: \n" +
                        "2 - Apellido: \n" +
                        "3 - CI: \n" +
                        "4 - Sueldo: \n" +
                        "5 - Minutos jugados: \n" +
                        "0 - Volver");
                int opcion = keyboard.nextInt();
                keyboard.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nuevo nombre:");
                        String nuevoNombre = keyboard.nextLine();
                        pArbitro.setNombre(nuevoNombre);
                        System.out.println("Nombre modificado correctamente");
                        break;
                    case 2:
                        System.out.println("Ingrese el nuevo apellido:");
                        String nuevoApellido = keyboard.nextLine();
                        pArbitro.setApellido(nuevoApellido);
                        System.out.println("Apellido modificado correctamente");
                        break;
                    case 3:
                        System.out.println("Ingrese la nueva CI:");
                        String nuevaCI = keyboard.nextLine();
                        pArbitro.setCi(nuevaCI);
                        System.out.println("CI modificada correctamente");
                        break;
                    case 4:
                        System.out.println("Ingrese el nuevo sueldo:");
                        int nuevoSueldo = keyboard.nextInt();
                        pArbitro.setSueldo(nuevoSueldo);
                        System.out.println("Sueldo modificado correctamente");
                        break;
                    case 5:
                        System.out.println("Ingrese la cantidad de partidos:");
                        int nuevosPartidos = keyboard.nextInt();
                        pArbitro.setCantPartidos(nuevosPartidos);
                        System.out.println("Partidos dirigidos modificados correctamente");
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
    public static Arbitro buscarArbitro(String pCI){
        Arbitro elArbitro = null;
        for (Arbitro pArbitro : pListaArbitros){
            if(pArbitro.getCi().equalsIgnoreCase(pCI)){
                elArbitro = pArbitro;
                break;
            }
        }
        return elArbitro;
    }
    //endregion
    //region Metodos Partido - COMPLETA
    //FUNCIONA
    public static void ingresarPartido(Scanner keyboard) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos del partido:");

        System.out.print("Fecha y hora: ");
        String pFyH = scanner.nextLine();

        System.out.println("Equipos disponibles:");
        for (Equipo equipo : pListaEquipos) {
            System.out.println(equipo.getNombre());
        }
        System.out.print("Seleccione el nombre del equipo local: ");
        String nombreLocal = scanner.nextLine();
        Equipo equipoSeleccionadoL = null;
        for (Equipo equipo : pListaEquipos) {
            if (equipo.getNombre().equalsIgnoreCase(nombreLocal)) {
                equipoSeleccionadoL = equipo;
                break;
            }
        }

        System.out.print("Seleccione el nombre del equipo visitante: ");
        String nombreVisitante = scanner.nextLine();
        Equipo equipoSeleccionadoV = null;
        for (Equipo equipo : pListaEquipos) {
            if (equipo.getNombre().equalsIgnoreCase(nombreVisitante)) {
                equipoSeleccionadoV = equipo;
                break;
            }
        }

        System.out.println("Árbitros disponibles:");
        for (Arbitro arbitro : pListaArbitros) {
            System.out.println(arbitro.getNombre() + " " + arbitro.getApellido() + " CI: " + arbitro.getCi());
        }
        System.out.print("Seleccione CI del árbitro: ");
        String CIArbitro = scanner.nextLine();
        Arbitro arbitroSeleccionado = null;
        for (Arbitro arbitro : pListaArbitros) {
            if (arbitro.getCi().equalsIgnoreCase(CIArbitro)) {
                arbitroSeleccionado = arbitro;
                break;
            }
        }

        Partido pPartido = new Partido(pFyH, equipoSeleccionadoL, equipoSeleccionadoV, arbitroSeleccionado);
        long cantidad = pListaPartidos.size();
        pListaPartidos.add(pPartido);
        if (pListaPartidos.size() > cantidad) {
            System.out.println("Partido agregado correctamente");
        } else {
            System.out.println("Error al guardar el partido");
        }
    }
    //FUNCIONA
    public static void listarPartidos() {
        System.out.println("Lista de Partidos:");
        for (Partido partido : pListaPartidos) {
            System.out.println(partido);
        }
    }
    //end region
}

//endregion
