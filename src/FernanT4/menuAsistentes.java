package FernanT4;

import java.util.Scanner;
import static FernanT4.main.*;

public class menuAsistentes {
    static Scanner s = new Scanner(System.in);

    // COLORES
    public static final String RESET = "\u001B[0m";
    public static final String GRIS = "\u001B[90m";
    public static final String AZUL = "\u001B[34m";
    public static final String NEGRITA = "\u001B[1m";

    // ======== LISTA DE AMIGOS REFERIDOS ========
    static String amigosReferidos = "";  // Ejemplo: "correo1\ncorreo2\ncorreo3\n"


    // ========================== MENÚ PRINCIPAL ==========================

    /**
     * Muestra el menu de acciones que puede efectuar el usuario "usuario1" y devuelve al código principal el número de la opción elegida.
     *
     * @return Numero de la acción seleccionada por el usuario.
     *
     */
    public static int menuPrincipalUsers() {
        System.out.println(GRIS + "---Introduce un número para seleccionar una opción---" + RESET);
        System.out.println(GRIS + "              Mis eventos --------- " + AZUL + "1" + RESET);
        System.out.println(GRIS + "              Eventos ------------- " + AZUL + "2" + RESET);
        System.out.println(GRIS + "              Cartera digital ----- " + AZUL + "3" + RESET);
        System.out.println(GRIS + "              Invita a un amigo --- " + AZUL + "4" + RESET);
        System.out.println(GRIS + "              Configuración ------- " + AZUL + "5" + RESET);
        System.out.println(GRIS + "              Cerrar sesión ------- " + AZUL + "6" + RESET);

        String opcion = s.nextLine();
        return Integer.parseInt(opcion);
    }

    // ========================== CARTERA DIGITAL ==========================

    /**
     * Muestra las diferentes acciones con las que el usuario "usuario1" puede seleccionar.
     *
     * @param dinero que el usuario ya tiene.
     * @return la opcion seleccionada por el usuario
     *
     */
    public static int menuCarteraDigitalUsers(double dinero) {
        Scanner s = new Scanner(System.in);
        int opcion;

        System.out.println(GRIS + "===== CARTERA DIGITAL =====" + RESET);
        System.out.println(GRIS + "Saldo actual: " + dinero + " €" + RESET);
        System.out.println(GRIS + "---------------------------" + RESET);
        System.out.println(GRIS + AZUL + "1" + GRIS + ". Añadir saldo" + RESET);
        System.out.println(GRIS + AZUL + "2" + GRIS + ". Retirar saldo" + RESET);
        System.out.println(GRIS + AZUL + "3" + GRIS + ". Volver" + RESET);

        opcion = Integer.parseInt(s.nextLine());
        if (opcion>3 | opcion<1) opcion = -1;
        return opcion;
    }

    /**
     * Añade el saldo que le indiquemos y devuelve al código principal el dinero total que el usuario "usuario1" tiene en cartera.
     *
     * @param dinero que el usuario ya tiene.
     * @return el total de dinero que el usuario tiene.
     *
     */
    public static double anadirSaldoUsers(double dinero) {
        Scanner s = new Scanner(System.in);
        System.out.println(GRIS + "¿Cuánto saldo quieres añadir?" + RESET);
        double dineroAniadir = Double.parseDouble(s.nextLine());
        dinero = dinero + dineroAniadir;

        if (dinero <= 0) {
            System.out.println(GRIS + "Cantidad no válida." + RESET);
        }

        System.out.println(GRIS + "Nuevo saldo: " + dinero + " €" + RESET);
        return dinero;
    }

    /**
     * Retira el saldo que le indiquemos y devuelve al código principal el dinero total que el usuario "usuario1" tiene en cartera.
     *
     * @param dinero que el usuario ya tiene.
     * @return el total de dinero que el usuario tiene.
     *
     */
    public static double retirarSaldoUsers(double dinero) {
        Scanner s = new Scanner(System.in);
        System.out.println(GRIS + "¿Cuánto saldo quieres retirar?" + RESET);
        double dineroRetirar = Double.parseDouble(s.nextLine());

        if (dinero <= 0) {
            System.out.println(GRIS + "Cantidad no válida." + RESET);
        }

        if (dinero > dineroRetirar) {
            dinero = dinero - dineroRetirar;
            System.out.println(GRIS + "Nuevo saldo: " + dinero + " €" + RESET);

        } else System.out.println(GRIS + "No puedes retirar más dinero que el que tienes" + RESET);
        return dinero;
    }

    // ========================== INVITA A UN AMIGO ==========================

    /**
     * Muestra el menú de las acciones que el usuario puede seleccionar para añadir amigos a su lista de amigos
     */
    public static void menuInvitarAmigoUsers() {
        int opcion;

        do {
            System.out.println(GRIS + "===== INVITA A UN AMIGO =====" + RESET);
            if (amigosReferidos.equals("")) {
                System.out.println(GRIS + "No has invitado a nadie." + RESET);
            } else {
                mostrarListaAmigos();
            }

            System.out.println(GRIS + "---------------------------" + RESET);
            System.out.println(GRIS + AZUL + "1" + GRIS + ". Añadir amigo por correo" + RESET);
            System.out.println(GRIS + AZUL + "2" + GRIS + ". Borrar amigo" + RESET);
            System.out.println(GRIS + AZUL + "3" + GRIS + ". Volver" + RESET);

            opcion = Integer.parseInt(s.nextLine());

            switch (opcion) {
                case 1:
                    anadirAmigo();
                    break;
                case 2:
                    borrarAmigo();
                    break;
                case 3:
                    break;
                default:
                    System.out.println(GRIS + "Opción no válida." + RESET);
            }

        } while (opcion != 3);
    }

    /**
     * Añade al amigo escrito en la lista de amigos.
     */
    public static void anadirAmigo() {
        System.out.println(GRIS + "Introduce el correo del amigo: (Utiliza un @ y un .)" + RESET);

        String correo = s.nextLine();

        if (!correo.contains("@") || !correo.contains(".")) {
            System.out.println(GRIS + "Correo no válido." + RESET);
            return;
        }

        amigosReferidos += correo + "\n";
        System.out.println(GRIS + "Amigo añadido." + RESET);
    }

    /**
     * Muestra la lista de amigos que tiene el usuario.
     */
    public static void mostrarListaAmigos() {
        String[] lista = amigosReferidos.split("\n");

        for (int i = 0; i < lista.length; i++) {
            System.out.println(GRIS + AZUL + (i + 1) + RESET + GRIS + ". " + lista[i] + RESET);
        }
    }

    /**
     * Borra el amigo de la lista de amigos del usuario
     *
     */
    public static void borrarAmigo() {
        if (amigosReferidos.equals("")) {
            System.out.println(GRIS + "No hay amigos para borrar." + RESET);
            return;
        }

        mostrarListaAmigos();
        System.out.println(GRIS + "¿Qué amigo quieres borrar? Número:" + RESET);

        int num = Integer.parseInt(s.nextLine());

        String[] lista = amigosReferidos.split("\n");

        if (num < 1 || num > lista.length) {
            System.out.println(GRIS + "Número no válido." + RESET);
            return;
        }

        String correoAEliminar = lista[num - 1];

        amigosReferidos = amigosReferidos.replaceFirst(correoAEliminar + "\n", "");

        System.out.println(GRIS + "Eliminado: " + correoAEliminar + RESET);
    }


    // ========================== MOSTRAR MIS EVENTOS ==========================
    //Muestra los eventos activos
    public static int[] mostrarEventosUsers(boolean[] eventosActivos, String[] nombresEv,String[] descEv, String[][] descripcionEntradas,String[] categoria, String[] fecha, String[] hora, int eventosCreados, int[][] aforoMaximo, int[][] inscritos, int[][] preciosEntradas) {
        System.out.println(GRIS + "=== MIS EVENTOS ===" + RESET);
        for (int i = 0; i <= eventosCreados; i++) {
            if (eventosActivos[i]){
                System.out.println(i+ "- " + nombresEv[i]);
            }
            else System.out.println("No hay evento");
            if (i == eventosCreados) System.out.println(i+1 + " - Salir");
        }

        int opcion;
        int[] opcionesARetornar = new int[2];
        opcionesARetornar[0] = -1;
        opcionesARetornar[1] = -1;

        do {
            System.out.println("Escribe el numero con el que quieres ver los datos:");
            opcion = Integer.parseInt(s.nextLine());
            if (opcion <= eventosCreados){
                mostrarInformacionEventos(nombresEv,descEv,descripcionEntradas,categoria[opcion],fecha[opcion],hora[opcion],opcion,aforoMaximo[opcion],inscritos[opcion],preciosEntradas);
                int opcionDeEntrada = comprarEntrada();
                if (opcionDeEntrada==1 | opcionDeEntrada==2 | opcionDeEntrada==3){
                    opcionesARetornar[0] = opcion;
                    opcionesARetornar[1] = opcionDeEntrada;
                    return opcionesARetornar;
                }else{
                    return opcionesARetornar;
                }
            }else return opcionesARetornar;
        }while(opcion<eventosCreados);
    }

    public static void mostrarMisEventosUsers(boolean[][] eventosDeUsuario ,String[] nombresEventos,int  eventosCreados, int valorUsuario) {
        System.out.println(GRIS + "=== MIS EVENTOS ===" + RESET);
        boolean elUsuarioNoTieneEvento = false;
        int contador = 0;

        for (int i = 0; i < eventosDeUsuario.length; i++) {
            if (eventosDeUsuario[valorUsuario][i]){
                System.out.println(i + " - " + nombresEventos[i]);
            }else contador++;
        }
        if (contador==0) System.out.println("--No te has unido a ningún evento--");
        else {

        }
    }

    public static int comprarEntrada(){
        System.out.println(AZUL + NEGRITA + "--Selecciona el tipo de entrada que quieres comprar--" + RESET);
        System.out.println(AZUL + "1- Entrada premium");
        System.out.println("2- Entrada semipremium");
        System.out.println("3- Entrada normal" + RESET);
        System.out.println(GRIS + "4- Salir" + RESET);
        return Integer.parseInt(s.nextLine());
    }

    // ========================== MENÚ EVENTOS ==========================

    /**
     * Muestra el menú de las acciones que puede elegir el usuario para cambiar los datos de su cuenta.
     *
     * @return la opcion seleccionada por el usuario.
     *
     */
    public static String[] configuracionUsers() {
        Scanner s = new Scanner(System.in);
        String[] variableADevolver = {"",""};
        System.out.println(GRIS + "¿Que quieres cambiar?" + RESET);
        System.out.println(GRIS + AZUL + "1" + GRIS + ". Nombre usuario" + RESET);
        System.out.println(GRIS + AZUL + "2" + GRIS + ". Contraseña" + RESET);

        String opcion = s.nextLine();
        if (opcion.equals("1")){
            variableADevolver[1] = s.nextLine();
            System.out.println("El nombre del usuario se ha cambiado");
        } else if (opcion.equals("2")) {
            variableADevolver[1] = s.nextLine();
            System.out.println("La contraseña del usuario se ha cambiado");
        }
        variableADevolver[0] = opcion;

        return variableADevolver;
    }


    public static void mostrarInformacionEventos(String[] nombreEventos,String[] descrEventos,String[][] descripcionEntradas,String categoria, String fecha, String hora,int valor,int[] aforoMaximo, int[] inscritos,int[][] preciosEntradas){
        System.out.println(nombreEventos[valor]);
        System.out.println(descrEventos[valor]);
        System.out.println("Categoría: " + categoria);
        System.out.println("Fecha: " + fecha + "  Hora: " + hora);

        System.out.println("--Descripcion de la entrada premium--");
        System.out.println(descripcionEntradas[valor][0]+ "\n");
        System.out.println(aforoMaximo[0] +"/" + inscritos[3]);
        System.out.println(preciosEntradas[valor][0] + "€");

        System.out.println("--Descripcion de la entrada semipremium--");
        System.out.println(descripcionEntradas[valor][1]);
        System.out.println(aforoMaximo[1] +"/" + inscritos[4]);
        System.out.println(preciosEntradas[valor][1] + "€");

        System.out.println("--Descripcion de la entrada normal--");
        System.out.println(descripcionEntradas[valor][2]);
        System.out.println(aforoMaximo[2] +"/" + inscritos[5]);
        System.out.println(preciosEntradas[valor][2] + "€");
    }
}