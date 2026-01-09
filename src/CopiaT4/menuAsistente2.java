package CopiaT4;

import java.util.Scanner;

public class menuAsistente2 {
    static Scanner s = new Scanner(System.in);

    // ======== COLORES ========
    public static final String GRIS = "\u001B[90m";
    public static final String AZUL = "\u001B[34m";
    public static final String MORADO = "\u001B[35m";
    public static final String RESET = "\u001B[0m";

    // ======== SALDO DEL USUARIO (CARTERA DIGITAL) ========
    static double saldo = 0.0;

    // ======== LISTA DE AMIGOS REFERIDOS ========
    static String amigosReferidos = "";  // Ejemplo: "correo1 correo2 correo3"

    // ======== DATOS DE CONFIGURACIÓN ========
    static String username = "Usuario";
    static String password = "1234";

    // ========================== MENÚ PRINCIPAL ==========================
    /**
     * Muestra el menu de acciones que puede efectuar el usuario "usuario2" y devuelve al código principal el número de la opción elegida.
     *
     * @return Numero de la acción seleccionada por el usuario.
     *
     */
    public static int menuPrincipalUser2() {
        System.out.println(GRIS + "---Introduce un número para seleccionar una opción---" + RESET);
        System.out.println(GRIS + "              Mis eventos ---------" + AZUL + "1" + RESET);
        System.out.println(GRIS + "              Eventos -------------" + AZUL + "2" + RESET);
        System.out.println(GRIS + "              Cartera digital -----" + AZUL + "3" + RESET);
        System.out.println(GRIS + "              Invita a un amigo ---" + AZUL + "4" + RESET);
        System.out.println(GRIS + "              Configuración -------" + AZUL + "5" + RESET);
        System.out.println(GRIS + "              Cerrar sesión -------" + AZUL + "6" + RESET);

        String opcion = s.nextLine();
        return Integer.parseInt(opcion);
    }

    // ========================== CARTERA DIGITAL ==========================
    /**
     * Muestra las diferentes acciones con las que el usuario "usuario2" puede seleccionar.
     *
     * @param dinero que el usuario ya tiene.
     * @return la opcion seleccionada por el usuario
     *
     */
    public static int menuCarteraDigitalUser2(double dinero) {
        Scanner s = new Scanner(System.in);
        int opcion;

        System.out.println(GRIS + "===== CARTERA DIGITAL =====" + RESET);
        System.out.println(GRIS + "Saldo actual: " + dinero + " €" + RESET);
        System.out.println(GRIS + "---------------------------" + RESET);
        System.out.println(AZUL + "1. Añadir saldo" + RESET);
        System.out.println(AZUL + "2. Retirar saldo" + RESET);
        System.out.println(AZUL + "3. Volver" + RESET);

        opcion = Integer.parseInt(s.nextLine());
        return opcion;
    }

    /**
     * Añade el saldo que le indiquemos y devuelve al código principal el dinero total que el usuario "usuario2" tiene en cartera.
     *
     * @param dinero que el usuario ya tiene.
     * @return el total de dinero que el usuario tiene.
     *
     */
    public static double anadirSaldoUser2(double dinero) {
        Scanner s = new Scanner(System.in);
        System.out.println(GRIS + "¿Cuánto saldo quieres añadir?" + RESET);
        double dineroAniadir = Double.parseDouble(s.nextLine());
        dinero = dinero + dineroAniadir;

        if (dinero <= 0) {
            System.out.println(MORADO + "Cantidad no válida." + RESET);
        }

        System.out.println(MORADO + "Nuevo saldo: " + dinero + " €" + RESET);
        return dinero;
    }

    /**
     * Retira el saldo que le indiquemos y devuelve al código principal el dinero total que el usuario "usuario2" tiene en cartera.
     *
     * @param dinero que el usuario ya tiene.
     * @return el total de dinero que el usuario tiene.
     *
     */
    public static double retirarSaldoUser2(double dinero) {
        Scanner s = new Scanner(System.in);
        System.out.println(GRIS + "¿Cuánto saldo quieres retirar?" + RESET);
        double dineroRetirar = Double.parseDouble(s.nextLine());

        if (dinero <= 0) {
            System.out.println(MORADO + "Cantidad no válida." + RESET);
        }

        if (dinero > dineroRetirar) {
            dinero = dinero - dineroRetirar;
            System.out.println(MORADO + "Nuevo saldo: " + dinero + " €" + RESET);
        } else {
            System.out.println(MORADO + "No puedes retirar más dinero que el que tienes" + RESET);
        }
        return dinero;
    }

    // ========================== INVITA A UN AMIGO ==========================
    /**
     * Muestra el menú de las acciones que el usuario puede seleccionar para añadir amigos a su lista de amigos
     */
    public static void menuInvitarAmigoUser2() {
        int opcion;

        do {
            System.out.println(GRIS + "===== INVITA A UN AMIGO =====" + RESET);
            if (amigosReferidos.equals("")) {
                System.out.println(MORADO + "No has invitado a nadie." + RESET);
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
                    System.out.println(MORADO + "Opción no válida." + RESET);
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
            System.out.println(MORADO + "Correo no válido." + RESET);
            return;
        }

        amigosReferidos += correo + " ";
        System.out.println(MORADO + "Amigo añadido." + RESET);
    }

    /**
     * Muestra la lista de amigos que tiene el usuario.
     */
    public static void mostrarListaAmigos() {
        String[] lista = amigosReferidos.split(" ");

        for (int i = 0; i < lista.length; i++) {
            System.out.println(GRIS + AZUL + (i + 1) + RESET + GRIS + ". " + lista[i] + RESET);
        }
    }

    // Borrar amigo SIN ARRAYS (solo Strings)
    /**
     * Borra el amigo de la lista de amigos del usuario
     *
     */
    public static void borrarAmigo() {
        if (amigosReferidos.equals("")) {
            System.out.println(MORADO + "No hay amigos para borrar." + RESET);
            return;
        }

        mostrarListaAmigos();
        System.out.println(GRIS + "¿Qué amigo quieres borrar? Número:" + RESET);

        int num = Integer.parseInt(s.nextLine());

        String[] lista = amigosReferidos.split(" ");

        if (num < 1 || num > lista.length) {
            System.out.println(MORADO + "Número no válido." + RESET);
            return;
        }

        String correoAEliminar = lista[num - 1];
        amigosReferidos = amigosReferidos.replaceFirst(correoAEliminar + " ", "");

        System.out.println(MORADO + "Eliminado: " + correoAEliminar + RESET);
    }

    // ========================== MOSTRAR MIS EVENTOS ==========================
    /**
     * Muestra los eventos creados por el usuario "organizador".
     * @return la opcion seleccionada por el usuario.
     */
    public static int mostrarMisEventosUser2(boolean[] event, String[] evNombre) {
        System.out.println(GRIS + "=== MIS EVENTOS ===" + RESET);

        boolean hayEventos = false;
        int opcion=0;

        if (event[0]) {
            System.out.println(GRIS + AZUL + "1" + RESET + GRIS + "-- " + evNombre[0] + RESET);
            hayEventos = true;
        }
        if (event[1]) {
            System.out.println(GRIS + AZUL + "2" + RESET + GRIS + "-- " + evNombre[1] + RESET);
            hayEventos = true;
        }
        if (event[2]) {
            System.out.println(GRIS + AZUL + "3" + RESET + GRIS + "-- " + evNombre[2] + RESET);
            hayEventos = true;
        }
        if (event[3]) {
            System.out.println(GRIS + AZUL + "4" + RESET + GRIS + "-- " + evNombre[3] + RESET);
            hayEventos = true;
        }
        if (event[4]) {
            System.out.println(GRIS + AZUL + "5" + RESET + GRIS + "-- " + evNombre[4] + RESET);
            hayEventos = true;
        }
        if (event[5]) {
            System.out.println(GRIS + AZUL + "6" + RESET + GRIS + "-- " + evNombre[5] + RESET);
            hayEventos = true;
        }
        if (event[6]) {
            System.out.println(GRIS + AZUL + "7" + RESET + GRIS + "-- " + evNombre[6] + RESET);
            hayEventos = true;
        }
        if (event[7]) {
            System.out.println(GRIS + AZUL + "8" + RESET + GRIS + "-- " + evNombre[7] + RESET);
            hayEventos = true;
        }
        if (event[8]) {
            System.out.println(GRIS + AZUL + "9" + RESET + GRIS + "-- " + evNombre[8] + RESET);
            hayEventos = true;
        }
        if (event[9]) {
            System.out.println(GRIS + AZUL + "10" + RESET + GRIS + "-- " + evNombre[9] + RESET);
            hayEventos = true;
        }
        if (event[10]) {
            System.out.println(GRIS + AZUL + "11" + RESET + GRIS + "-- " + evNombre[10] + RESET);
            hayEventos = true;
        }

        if (!hayEventos) {
            System.out.println(MORADO + "No tienes eventos." + RESET);
        }else{
            System.out.println(GRIS + "Escribe el numero de evento para saber más" + RESET);
            opcion = Integer.parseInt(s.nextLine());
        }
        return opcion;
    }

    // ========================== MENÚ EVENTOS ==========================
    /**
     * Muestra el menú de los eventos que hay activos y que al que el usuario se puede unir.
     * Las variables introducidas en la funcion son booleanos que marcan si un evento está activo o no.
     *
     * @return la opcion seleccionada por el usuario.
     *
     */
    public static int menuEventosUser2(int contadorEventos, boolean[] event, String[] nombres) {
        System.out.println(GRIS + "----Selecciona un evento----" + RESET);
        System.out.println(GRIS + AZUL + "1" + RESET + GRIS + "-- " + nombres[0] + RESET);
        System.out.println(GRIS + AZUL + "2" + RESET + GRIS + "-- " + nombres[1] + RESET);
        System.out.println(GRIS + AZUL + "3" + RESET + GRIS + "-- " + nombres[2] + RESET);
        System.out.println(GRIS + AZUL + "4" + RESET + GRIS + "-- " + nombres[3] + RESET);
        System.out.println(GRIS + AZUL + "5" + RESET + GRIS + "-- " + nombres[4] + RESET);
        System.out.println(GRIS + AZUL + "6" + RESET + GRIS + "-- " + nombres[5] + RESET);
        System.out.println(GRIS + AZUL + "7" + RESET + GRIS + "-- " + nombres[6] + RESET);
        System.out.println(GRIS + AZUL + "8" + RESET + GRIS + "-- " + nombres[7] + RESET);
        if (event[8]) System.out.println(GRIS + AZUL + "9" + RESET + GRIS + "-- " + nombres[8] + RESET);
        if (event[9]) System.out.println(GRIS + AZUL + "10" + RESET + GRIS + "-- " + nombres[9] + RESET);
        if (event[10]) System.out.println(GRIS + AZUL + "11" + RESET + GRIS + "-- " + nombres[10] + RESET);
        System.out.println(GRIS + AZUL + (contadorEventos + 1) + RESET + GRIS + "-- Salir" + RESET);

        int opcion = Integer.parseInt(s.nextLine());
        return opcion;
    }

    /**
     * Muestra el menú de las acciones que puede elegir el usuario para cambiar los datos de su cuenta.
     *
     *
     * @return la opcion seleccionada por el usuario.
     *
     */
    public static int configuracionUser2() {
        Scanner s = new Scanner(System.in);
        System.out.println(GRIS + "¿Que quieres cambiar?" + RESET);
        System.out.println(GRIS + AZUL + "1" + RESET + GRIS + ". Nombre usuario" + RESET);
        System.out.println(GRIS + AZUL + "2" + RESET + GRIS + ". Contraseña" + RESET);

        int opcion = s.nextInt();
        return opcion;
    }

    /**
     * Muestra todos los datos sobre el evento 1.
     * @return la opcion seleccionada por el usuario.
     *
     */
    public static int unirseAEvento1User2(int entradasPremiumTotales, int entradasPremiumCompradas, int entradasSemipremiumTotales, int entradasSemipremiumCompradas, int entradasNormalesTotales, int entradasNormalesCompradas) {
        Scanner s = new Scanner(System.in);
        System.out.println(GRIS + AZUL + "1" + RESET + GRIS + "- Entrada Premium" + RESET);
        System.out.println(GRIS + "Descripcion: Con esta entradas tendrás acceso a poder conocer más sobre tus personas favoritas" + RESET);
        System.out.println(GRIS + "Precio: 15€" + RESET);
        System.out.println(GRIS + "Quedan: " + (entradasPremiumTotales - entradasPremiumCompradas) + RESET);
        System.out.println();
        System.out.println(GRIS + AZUL + "2" + RESET + GRIS + "- Entrada semipremium" + RESET);
        System.out.println(GRIS + "Descripcion: ¿Quieres, además, una postal con tu artista favorito?" + RESET);
        System.out.println(GRIS + "Precio: 10€" + RESET);
        System.out.println(GRIS + "Quedan: " + (entradasSemipremiumTotales - entradasSemipremiumCompradas) + RESET);
        System.out.println();
        System.out.println(GRIS + AZUL + "3" + RESET + GRIS + "- Entrada normal" + RESET);
        System.out.println(GRIS + "Descripcion: Entrada normal, con bebida y snacks gratis" + RESET);
        System.out.println(GRIS + "Precio: 7€" + RESET);
        System.out.println(GRIS + "Quedan: " + (entradasNormalesTotales - entradasNormalesCompradas) + RESET);
        System.out.println();
        System.out.println(GRIS + "Escribe el numero de la entrada para unite" + RESET);

        int opcion = Integer.parseInt(s.nextLine());
        return opcion;
    }
    /**
     * Muestra todos los datos sobre el evento 2.
     * @return la opcion seleccionada por el usuario.
     *
     */
    public static int unirseAEvento2User2(int entradasPremiumTotales, int entradasPremiumCompradas, int entradasSemipremiumTotales, int entradasSemipremiumCompradas, int entradasNormalesTotales, int entradasNormalesCompradas) {
        Scanner s = new Scanner(System.in);
        System.out.println(GRIS + AZUL + "1" + RESET + GRIS + "- Entrada Premium" + RESET);
        System.out.println(GRIS + "Descripcion: Visita guiada por las distintas empresas que ha fundado nuestro alcalde" + RESET);
        System.out.println(GRIS + "Precio: 15€" + RESET);
        System.out.println(GRIS + "Quedan: " + (entradasPremiumTotales - entradasPremiumCompradas) + RESET);
        System.out.println();
        System.out.println(GRIS + AZUL + "2" + RESET + GRIS + "- Entrada semipremium" + RESET);
        System.out.println(GRIS + "Descripcion: ¿Te gustaría tener su número de teléfono para alguna duda?" + RESET);
        System.out.println(GRIS + "Precio: 10€" + RESET);
        System.out.println(GRIS + "Quedan: " + (entradasSemipremiumTotales - entradasSemipremiumCompradas) + RESET);
        System.out.println();
        System.out.println(GRIS + AZUL + "3" + RESET + GRIS + "- Entrada normal" + RESET);
        System.out.println(GRIS + "Descripcion: Entrada normal, con bebida gratis" + RESET);
        System.out.println(GRIS + "Precio: 7€" + RESET);
        System.out.println(GRIS + "Quedan: " + (entradasNormalesTotales - entradasNormalesCompradas) + RESET);
        System.out.println();
        System.out.println(GRIS + "Escribe el numero de la entrada para unite" + RESET);

        int opcion = Integer.parseInt(s.nextLine());
        return opcion;
    }

    /**
     * Muestra todos los datos sobre el evento 3.
     * @return la opcion seleccionada por el usuario.
     *
     */
    public static int unirseAEvento3User2(int entradasPremiumTotales, int entradasPremiumCompradas, int entradasSemipremiumTotales, int entradasSemipremiumCompradas, int entradasNormalesTotales, int entradasNormalesCompradas) {
        Scanner s = new Scanner(System.in);
        System.out.println(GRIS + AZUL + "1" + RESET + GRIS + "- Entrada Premium" + RESET);
        System.out.println(GRIS + "Descripcion: ¡Foto exclusiva con tu equipo favorito!" + RESET);
        System.out.println(GRIS + "Precio: 15€" + RESET);
        System.out.println(GRIS + "Quedan: " + (entradasPremiumTotales - entradasPremiumCompradas) + RESET);
        System.out.println();
        System.out.println(GRIS + AZUL + "2" + RESET + GRIS + "- Entrada semipremium" + RESET);
        System.out.println(GRIS + "Descripcion: Sientate en primera fila" + RESET);
        System.out.println(GRIS + "Precio: 10€" + RESET);
        System.out.println(GRIS + "Quedan: " + (entradasSemipremiumTotales - entradasSemipremiumCompradas) + RESET);
        System.out.println();
        System.out.println(GRIS + AZUL + "3" + RESET + GRIS + "- Entrada normal" + RESET);
        System.out.println(GRIS + "Descripcion: Entrada normal, con snack gratis" + RESET);
        System.out.println(GRIS + "Precio: 7€" + RESET);
        System.out.println(GRIS + "Quedan: " + (entradasNormalesTotales - entradasNormalesCompradas) + RESET);
        System.out.println();
        System.out.println(GRIS + "Escribe el numero de la entrada para unite" + RESET);
        int opcion = Integer.parseInt(s.nextLine());
        return opcion;
    }

    /**
     * Muestra todos los datos sobre el evento 4.
     * @return la opcion seleccionada por el usuario.
     *
     */
    public static int unirseAEvento4User2(int entradasPremiumTotales, int entradasPremiumCompradas, int entradasSemipremiumTotales, int entradasSemipremiumCompradas, int entradasNormalesTotales, int entradasNormalesCompradas) {
        Scanner s = new Scanner(System.in);
        System.out.println(GRIS + AZUL + "1" + RESET + GRIS + "- Entrada Premium" + RESET);
        System.out.println(GRIS + "Descripcion: Guía las 24h del día en todo el viaje" + RESET);
        System.out.println(GRIS + "Precio: 280€" + RESET);
        System.out.println(GRIS + "Quedan: " + (entradasPremiumTotales - entradasPremiumCompradas) + RESET);
        System.out.println();
        System.out.println(GRIS + AZUL + "2" + RESET + GRIS + "- Entrada semipremium" + RESET);
        System.out.println(GRIS + "Descripcion: Excursión extensa por las pirámides" + RESET);
        System.out.println(GRIS + "Precio: 170€" + RESET);
        System.out.println(GRIS + "Quedan: " + (entradasSemipremiumTotales - entradasSemipremiumCompradas) + RESET);
        System.out.println();
        System.out.println(GRIS + AZUL + "3" + RESET + GRIS + "- Entrada normal" + RESET);
        System.out.println(GRIS + "Descripcion: Hotel incluido" + RESET);
        System.out.println(GRIS + "Precio: 7€" + RESET);
        System.out.println(GRIS + "Quedan: " + (entradasNormalesTotales - entradasNormalesCompradas) + RESET);
        System.out.println();
        System.out.println(GRIS + "Escribe el numero de la entrada para unite" + RESET);
        int opcion = Integer.parseInt(s.nextLine());
        return opcion;
    }

    /**
     * Muestra todos los datos sobre el evento 5.
     * @return la opcion seleccionada por el usuario.
     *
     */
    public static int unirseAEvento5User2(int entradasPremiumTotales, int entradasPremiumCompradas, int entradasSemipremiumTotales, int entradasSemipremiumCompradas, int entradasNormalesTotales, int entradasNormalesCompradas) {
        Scanner s = new Scanner(System.in);
        System.out.println(GRIS + AZUL + "1" + RESET + GRIS + "- Entrada Premium" + RESET);
        System.out.println(GRIS + "Descripcion: Tendrás acceso directo con nuestro invitado sorpresa" + RESET);
        System.out.println(GRIS + "Precio: 15€" + RESET);
        System.out.println(GRIS + "Quedan: " + (entradasPremiumTotales - entradasPremiumCompradas) + RESET);
        System.out.println();
        System.out.println(GRIS + AZUL + "2" + RESET + GRIS + "- Entrada semipremium" + RESET);
        System.out.println(GRIS + "Descripcion: Podrás tener tu carnet VIP en primer lugar" + RESET);
        System.out.println(GRIS + "Precio: 10€" + RESET);
        System.out.println(GRIS + "Quedan: " + (entradasSemipremiumTotales - entradasSemipremiumCompradas) + RESET);
        System.out.println();
        System.out.println(GRIS + AZUL + "3" + RESET + GRIS + "- Entrada normal" + RESET);
        System.out.println(GRIS + "Descripcion: Silla incluida en el precio" + RESET);
        System.out.println(GRIS + "Precio: 7€" + RESET);
        System.out.println(GRIS + "Quedan: " + (entradasNormalesTotales - entradasNormalesCompradas) + RESET);
        System.out.println();
        System.out.println(GRIS + "Escribe el numero de la entrada para unite" + RESET);
        int opcion = Integer.parseInt(s.nextLine());
        return opcion;
    }

    /**
     * Muestra todos los datos sobre el evento 6.
     * @return la opcion seleccionada por el usuario.
     *
     */
    public static int unirseAEvento6User2(int entradasNormalesTotales, int entradasNormalesCompradas) {
        Scanner s = new Scanner(System.in);
        System.out.println(GRIS + AZUL + "1" + RESET + GRIS + "- Entrada Gratis" + RESET);
        System.out.println(GRIS + "Quedan: " + (entradasNormalesTotales - entradasNormalesCompradas) + RESET);
        System.out.println();
        System.out.println(GRIS + "Escribe el numero de la entrada para unite" + RESET);
        int opcion = Integer.parseInt(s.nextLine());
        return opcion;
    }

    /**
     * Muestra todos los datos sobre el evento 7.
     * @return la opcion seleccionada por el usuario.
     *
     */
    public static int unirseAEvento7User2(int entradasPremiumTotales, int entradasPremiumCompradas, int entradasSemipremiumTotales, int entradasSemipremiumCompradas, int entradasNormalesTotales, int entradasNormalesCompradas) {
        Scanner s = new Scanner(System.in);
        System.out.println(GRIS + AZUL + "1" + RESET + GRIS + "- Entrada Premium" + RESET);
        System.out.println(GRIS + "Descripcion: Paella ilimitada" + RESET);
        System.out.println(GRIS + "Precio: 15€" + RESET);
        System.out.println(GRIS + "Quedan: " + (entradasPremiumTotales - entradasPremiumCompradas) + RESET);
        System.out.println();
        System.out.println(GRIS + AZUL + "2" + RESET + GRIS + "- Entrada semipremium" + RESET);
        System.out.println(GRIS + "Descripcion: Bebida sin limites" + RESET);
        System.out.println(GRIS + "Precio: 10€" + RESET);
        System.out.println(GRIS + "Quedan: " + (entradasSemipremiumTotales - entradasSemipremiumCompradas) + RESET);
        System.out.println();
        System.out.println(GRIS + AZUL + "3" + RESET + GRIS + "- Entrada normal" + RESET);
        System.out.println(GRIS + "Descripcion: Primera consumición gratis" + RESET);
        System.out.println(GRIS + "Precio: 7€" + RESET);
        System.out.println(GRIS + "Quedan: " + (entradasNormalesTotales - entradasNormalesCompradas) + RESET);
        System.out.println();
        System.out.println(GRIS + "Escribe el numero de la entrada para unite" + RESET);
        int opcion = Integer.parseInt(s.nextLine());
        return opcion;
    }

    /**
     * Muestra todos los datos sobre el evento 8.
     * @return la opcion seleccionada por el usuario.
     *
     */
    public static int unirseAEvento8User2(int entradasPremiumTotales, int entradasPremiumCompradas, int entradasSemipremiumTotales, int entradasSemipremiumCompradas, int entradasNormalesTotales, int entradasNormalesCompradas) {
        Scanner s = new Scanner(System.in);
        System.out.println(GRIS + AZUL + "1" + RESET + GRIS + "- Entrada Premium" + RESET);
        System.out.println(GRIS + "Descripcion: Paella ilimitada" + RESET);
        System.out.println(GRIS + "Precio: 15€" + RESET);
        System.out.println(GRIS + "Quedan: " + (entradasPremiumTotales - entradasPremiumCompradas) + RESET);
        System.out.println();
        System.out.println(GRIS + AZUL + "2" + RESET + GRIS + "- Entrada semipremium" + RESET);
        System.out.println(GRIS + "Descripcion: Bebida sin limites" + RESET);
        System.out.println(GRIS + "Precio: 10€" + RESET);
        System.out.println(GRIS + "Quedan: " + (entradasSemipremiumTotales - entradasSemipremiumCompradas) + RESET);
        System.out.println();
        System.out.println(GRIS + AZUL + "3" + RESET + GRIS + "- Entrada normal" + RESET);
        System.out.println(GRIS + "Descripcion: Primera consumición gratis" + RESET);
        System.out.println(GRIS + "Precio: 7€" + RESET);
        System.out.println(GRIS + "Quedan: " + (entradasNormalesTotales - entradasNormalesCompradas) + RESET);
        System.out.println();
        System.out.println(GRIS + "Escribe el numero de la entrada para unite" + RESET);
        int opcion = Integer.parseInt(s.nextLine());
        return opcion;
    }

}
