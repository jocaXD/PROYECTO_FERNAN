package CopiaT4;

import java.util.Scanner;

public class menuOrganizador {

    static Scanner s = new Scanner(System.in);

    // ========= COLORES ANSI =========
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String MORADO = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    // Formato por evento: nombre|descripcion|categoria|fecha|aforo|inscritos;
    static String eventosCreados = "";

    // ======== CARTERA DIGITAL ========
    static double saldo = 0.0;

    // ======== CONFIGURACIÓN ========
    static String username = "organizador";
    static String password = "1234";

    // ================================================================
    //                      MENÚ PRINCIPAL ORGANIZADOR
    // ================================================================
    /**
     * Muestra el menu de acciones que puede efectuar el usuario "organizador" y devuelve al código principal el número de la opción elegida.
     *
     * @return Numero de la acción seleccionada por el usuario.
     *
     */

    public static int menuPrincipalOrg() {
        int opcion;

        do {
            System.out.println(AZUL + "===== MENÚ ORGANIZADOR =====" + RESET);
            System.out.println(VERDE + "1. Mis eventos" + RESET);
            System.out.println(VERDE + "2. Cartera digital" + RESET);
            System.out.println(VERDE + "3. Configuración" + RESET);
            System.out.println(ROJO + "4. Cerrar sesión" + RESET);

            opcion = Integer.parseInt(s.nextLine());
            return opcion;
        } while (opcion != 4);
    }

    // ================================================================
    //                      MIS EVENTOS ORGANIZADOR
    // ================================================================


    /**
     * Añade el saldo que le indiquemos y devuelve al código principal el dinero total que el usuario "organizador" tiene en cartera.
     *
     * @param dinero que el usuario ya tiene.
     * @return el total de dinero que el usuario tiene.
     *
     */
    public static double anadirSaldoOrg(double dinero) {
        Scanner s = new Scanner(System.in);
        System.out.println(CYAN + "¿Cuánto saldo quieres añadir?" + RESET);
        double dineroAniadir = Double.parseDouble(s.nextLine());
        dinero = dinero + dineroAniadir;

        if (dinero <= 0) {
            System.out.println(ROJO + "Cantidad no válida." + RESET);
        }

        System.out.println(VERDE + "Nuevo saldo: " + dinero + " €" + RESET);
        return dinero;

    }

    /**
     * Retira el saldo que le indiquemos y devuelve al código principal el dinero total que el usuario "organizador" tiene en cartera.
     *
     * @param dinero que el usuario ya tiene.
     * @return el total de dinero que el usuario tiene.
     *
     */
    public static double retirarSaldoOrg(double dinero) {
        Scanner s = new Scanner(System.in);
        System.out.println(CYAN + "¿Cuánto saldo quieres retirar?" + RESET);
        double dineroRetirar = Double.parseDouble(s.nextLine());

        if (dinero <= 0) {
            System.out.println(ROJO + "Cantidad no válida." + RESET);
        }

        if (dinero > dineroRetirar){
            dinero = dinero - dineroRetirar;
            System.out.println(VERDE + "Nuevo saldo: " + dinero + " €" + RESET);

        } else {
            System.out.println(ROJO + "No puedes retirar más dinero que el que tienes" + RESET);
        }
        return dinero;
    }



    // ================================================================
    //                  CARTERA DIGITAL ORGANIZADOR
    // ================================================================
    /**
     * Muestra las diferentes acciones con las que el usuario "organizador" puede seleccionar.
     *
     * @param dinero que el usuario ya tiene.
     * @return la opcion seleccionada por el usuario
     *
     */
    public static int menuCarteraDigitalOrg(double dinero) {
        Scanner s = new Scanner(System.in);
        int opcion;

        System.out.println(AZUL + "===== CARTERA DIGITAL =====" + RESET);
        System.out.println("Saldo actual: " + VERDE + dinero + " €" + RESET);
        System.out.println(CYAN + "---------------------------" + RESET);
        System.out.println(VERDE + "1. Añadir saldo" + RESET);
        System.out.println(VERDE + "2. Retirar saldo" + RESET);
        System.out.println(VERDE + "3. Volver" + RESET);

        opcion = Integer.parseInt(s.nextLine());
        return opcion;
    }

    /**
     * Muestra el menú de las acciones que puede elegir el usuario para cambiar los datos de su cuenta.
     *
     *
     * @return la opcion seleccionada por el usuario.
     *
     */
    public static int configuracionOrg() {
        Scanner s = new Scanner(System.in);
        System.out.println(AZUL + "¿Que quieres cambiar?" + RESET);
        System.out.println("1. Nombre usuario");
        System.out.println("2. Contraseña");

        int opcion = s.nextInt();
        return opcion;
    }

}
