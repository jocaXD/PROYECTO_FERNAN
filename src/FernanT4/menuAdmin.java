package FernanT4;

import java.util.Scanner;
import static FernanT4.menuAsistentes.*;


public class menuAdmin {
    static Scanner s = new Scanner(System.in);

    // COLORES
    public static final String RESET = "\u001B[0m";
    public static final String GRIS = "\u001B[90m";
    public static final String NARANJA = "\u001B[38;5;208m";


    // ======== SALDO DEL USUARIO (CARTERA DIGITAL) ========
    static double saldo = 0.0;

    // ======== LISTA DE AMIGOS REFERIDOS ========
    static String amigosReferidos = "";  // Ejemplo: "correo1\ncorreo2\ncorreo3\n"

    // ======== DATOS DE CONFIGURACIÓN ========
    static String username = "Usuario";
    static String password = "1234";

    // ========================== MENÚ PRINCIPAL ==========================
    /**
     * Muestra el menu de acciones que puede efectuar el usuario "admin" y devuelve al código principal el número de la opción elegida.
     *
     * @return Numero de la acción seleccionada por el usuario.
     *
     */
    public static int menuPrincipalAdmin() {

        System.out.println(GRIS + "---Introduce un número para seleccionar una opción---" + RESET);
        System.out.println(GRIS + "              Panel de control ---- " + NARANJA + "1" + RESET);
        System.out.println(GRIS + "              Eventos ------------- " + NARANJA + "2" + RESET);
        System.out.println(GRIS + "              Cartera digital ----- " + NARANJA + "3" + RESET);
        System.out.println(GRIS + "              Configuración ------- " + NARANJA + "4" + RESET);
        System.out.println(GRIS + "              Cerrar sesión ------- " + NARANJA + "5" + RESET);

        String opcion = s.nextLine();
        return Integer.parseInt(opcion);
    }

    /**
     * Añade el saldo que le indiquemos y devuelve al código principal el dinero total que el usuario "admin" tiene en cartera.
     *
     * @param dinero que el usuario ya tiene.
     * @return el total de dinero que el usuario tiene.
     *
     */
    public static double anadirSaldoAdmin(double dinero) {
        Scanner s = new Scanner(System.in);
        System.out.println(GRIS + "¿Cuánto saldo quieres añadir?" + RESET);
        double dineroAniadir = Double.parseDouble(s.nextLine());
        dinero = dinero + dineroAniadir;

        if (dinero <= 0) {
            System.out.println(GRIS + "Cantidad no válida." + RESET);
        }


        System.out.println(GRIS + "Nuevo saldo: " + NARANJA + dinero + " €" + RESET);
        return dinero;

    }

    /**
     * Retira el saldo que le indiquemos y devuelve al código principal el dinero total que el usuario "admin" tiene en cartera.
     *
     * @param dinero que el usuario ya tiene.
     * @return el total de dinero que el usuario tiene.
     *
     */
    public static double retirarSaldoAdmin(double dinero) {
        Scanner s = new Scanner(System.in);
        System.out.println(GRIS + "¿Cuánto saldo quieres retirar?" + RESET);
        double dineroRetirar = Double.parseDouble(s.nextLine());


        if (dinero <= 0) {
            System.out.println(GRIS + "Cantidad no válida." + RESET);
        }

        if (dinero > dineroRetirar){
            dinero = dinero - dineroRetirar;
            System.out.println(GRIS + "Nuevo saldo: " + NARANJA + dinero + " €" + RESET);

        }else System.out.println(GRIS + "No puedes retirar más dinero que el que tienes" + RESET);
        return dinero;
    }


    // ========================== CARTERA DIGITAL ==========================

    /**
     * Muestra las diferentes acciones con las que el usuario "admin" puede seleccionar.
     *
     * @param dinero que el usuario ya tiene.
     * @return la opcion seleccionada por el usuario.
     *
     */
    public static int menuCarteraDigitalAdmin(double dinero) {
        Scanner s = new Scanner(System.in);
        int opcion;

        System.out.println(GRIS + "===== CARTERA DIGITAL =====" + RESET);
        System.out.println(GRIS + "Saldo actual: " + NARANJA + dinero + " €" + RESET);
        System.out.println(GRIS + "---------------------------" + RESET);
        System.out.println(GRIS + "1. Añadir saldo" + RESET);
        System.out.println(GRIS + "2. Retirar saldo" + RESET);
        System.out.println(GRIS + "3. Volver" + RESET);

        opcion = Integer.parseInt(s.nextLine());
        return opcion;
    }



    // ========================== MENÚ EVENTOS ==========================
    /**
     * Muestra el menú de las acciones que el usuario "admin" puede hacer con los eventos.
     * Las variables introducidas en la funcion son booleanos que marcan si un evento está activo o no.
     *
     * @return la opcion seleccionada por el usuario.
     *
     */
    public static int[] menuEventosAdmin(int numEvCreados, String[] nombreEv, String[] descrEventos, String[][] descripcionEntradas, String[] categoriaEv,String[]fechaEv,String[] horaEv,int[] aforoMax, int[] numIncritos, int[][] preciosEntradas) {
        Scanner s = new Scanner(System.in);
        int[] opcion =  new int[2];
        System.out.println(GRIS + "Selecciona el evento que quieres administrar" + RESET);
        for (int i = 0; i < numEvCreados; i++) {
            System.out.println(i + " - " + nombreEv[i]);
        }
        opcion[0] = s.nextInt();

        if (opcion[0] < numEvCreados){
            mostrarInformacionEventos(nombreEv,descrEventos,descripcionEntradas,categoriaEv[opcion[0]],fechaEv[opcion[0]],horaEv[opcion[0]],opcion[0],aforoMax,numIncritos,preciosEntradas);
            System.out.println("¿Qué quieres hacer con el evento?");
            System.out.println("1-Borrarlo");
            System.out.println("2-Modificarlo");
            opcion[1] = s.nextInt();
        }

        if (opcion[1] == 1 | opcion[1] == 2){
            return opcion;
        }else{
            opcion[0] = -1;
            opcion[1] = -1;
            return opcion;
        }
    }

    // ========================== MAIN ==========================
    /**
     * Muestra el menú de de las acciones que puede elegir el usuario para cambiar los datos de su cuenta.
     *
     *
     * @return la opcion seleccionada por el usuario.
     *
     */
    public static int configuracionAdmin(){
        Scanner s = new Scanner(System.in);
        System.out.println(GRIS + "¿Que quieres cambiar?" + RESET);
        System.out.println(GRIS + "1. Nombre usuario" + RESET);
        System.out.println(GRIS + "2. Contraseña" + RESET);

        int opcion = s.nextInt();
        return opcion;
    }

    /**
     * Muestra el menú de las opciones para bloquear o desbloquear los usuarios que haya.
     *
     */
    public static void cambiarEstadoUsuariosTexto(){
        System.out.println(GRIS + "Que quieres hacer" + RESET);
        System.out.println(GRIS + "1.Bloquear" + RESET);
        System.out.println(GRIS + "2.Desbloquear" + RESET);

    }

    /**
     * Muestra el estado de los usuarios. Además permite cambiar el estado de este.
     *
     *
     * @return la opcion seleccionada por el usuario.
     *
     */
    public static int panelDeControl(boolean[] usersBlock, String[] nomUsers, int numUsersCreados) {
        Scanner s = new Scanner(System.in);
        System.out.println(GRIS + "=== PANEL DE CONTROL ===" + RESET);

        for (int i = 0; i < numUsersCreados; i++) {
            System.out.println(i + " - " + nomUsers[i]);
            if (usersBlock[i]) System.out.print(NARANJA + "   BLOQUEADO \n" + RESET);
            else System.out.print(NARANJA + "   NO BLOQUEADO \n" + RESET);
        }

        System.out.println(GRIS + numUsersCreados +" - " + "Salir" + RESET);

        int opcionPanel = s.nextInt();
        return opcionPanel;
    }
}
