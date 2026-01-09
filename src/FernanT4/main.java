package FernanT4;

import java.util.Scanner;

import static FernanT4.menuAdmin.*;
import static FernanT4.menuOrganizador.*;
import static FernanT4.logins.*;
import static FernanT4.menuAsistentes.*;


public class main {


    static void main(String[] args) {
        //PRUEBA PARA ESTAR CONECTADOS

        final String RESET = "\u001B[0m";
        final String ROJO = "\u001B[31m";
        final String AZUL = "\u001B[34m";
        final String NEGRITA = "\u001B[1m";
        final String VERDE = "\u001B[32m";
        final String AMARILLO = "\u001B[33m";
        final String MORADO = "\u001B[35m";
        final String CIAN = "\u001B[36m";
        final String BLANCO = "\u001B[37m";
//aaaaaaaaaaaa

        // barrita de carga
        String[] circulo = {
                "◔",
                "◑",
                "◕",
                "●"
        };

        System.out.print(NEGRITA + VERDE + "Cargando ");

        for (int i = 0; i <= 20; i++) {
            System.out.print("\r" + NEGRITA + VERDE +
                    "Cargando " + circulo[(i * circulo.length) / 21] + " " + (i * 5) + "%");
            try {
                Thread.sleep(120);
            } catch (InterruptedException e) {
            }
        }

        System.out.println("\rCargando ● 100%" + RESET);
        System.out.println();

        // portada
        System.out.println(
                NEGRITA + AZUL +
                        "═══════════════════════════════════════════════════════\n" +
                        "★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★  \n\n" +

                        "███████╗███████╗██████╗ ███╗   ██╗ █████╗ ███╗   ██╗\n" +
                        "██╔════╝██╔════╝██╔══██╗████╗  ██║██╔══██╗████╗  ██║\n" +
                        "█████╗  █████╗  ██████╔╝██╔██╗ ██║███████║██╔██╗ ██║\n" +
                        "██╔══╝  ██╔══╝  ██╔══██╗██║╚██╗██║██╔══██║██║╚██╗██║\n" +
                        "██║     ███████╗██║  ██║██║ ╚████║██║  ██║██║ ╚████║\n" +
                        "╚═╝     ╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝╚═╝  ╚═══╝\n" +

                        ROJO +
                        "\n                ◆◆◆  FERNAN EVENTS  ◆◆◆\n\n" +

                        AZUL +
                        "★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ \n" +
                        "═══════════════════════════════════════════════════════\n" +
                        RESET
        );



        //CONTADOR DE EVENTOS ACTIVOS
        int contadorEventosCreados = 8-1;

        Scanner s = new Scanner(System.in);
        int valorUsuario = 0;

        //INICIALIZAR EL ESTADO DE LOS USUARIOS
        boolean[] bloqueoUsers = {false, false, false, false, false, false, false, false, false, false};
        boolean[] existeUsers = {true, true, true, true, false, false, false, false, false, false};
        int numeroDeUsersCreados = 4 - 1;
        byte[] tiposDeUsers = {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0};

        //NOMBRE DE LOS USUARIOS
        String[] nombreUsers = {"admin", "organizador", "usuario1", "usuario2", "", "", "", "", "", ""};


        //CONTRASEÑA INICIAL DE LOS USUARIOS
        String[] passwUsers = {"admin", "org", "1234", "4321", "", "", "", "", "", ""};

        // =====Variables para guardar los eventos=====

//                              10 usuarios, 20 eventos
        boolean[][] evUsers = new boolean[10][20];

        //Rellena todos los usuarios y eventos que tiene cada usuario con false, indicando que no se han unido a ninguno.
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                evUsers[i][j] = false;
            }
        }

        //========EVENTOS CREADOS POR EL ORGANIZADOR=========
        String[][] descripcionesEntradasEventos = {{"Acceso a la bolera en horario general y participación en una partida grupal", "Incluye acceso prioritario, una consumición y participación en una partida con presencia de un famoso invitado", "Acceso VIP, partida exclusiva con los famosos, foto y firma, consumiciones incluidas y recuerdo del evento."},
                {"Acceso a la charla y turno de preguntas al finalizar", "Incluye asiento reservado en primeras filas y acceso al café networking posterior", "Acceso preferente, encuentro privado con el alcalde y ponentes, foto oficial y acreditación VIP"},
                {"Entrada a grada general", "Asiento en zona preferente y bebida incluida", "Acceso a palco VIP, catering, camiseta oficial y posibilidad de saludar a los jugadores tras el partido"},
                {"Viaje organizado con alojamiento, visitas guiadas estándar y transporte incluido", "Incluye hotel de mayor categoría, excursiones adicionales y guía especializado", "Experiencia completa de lujo: hoteles 5★, crucero por el Nilo, acceso prioritario a monumentos y actividades exclusivas"},
                {"Acceso al acto inaugural", "Asiento reservado y visita guiada a las instalaciones", "Acceso VIP, visita privada con autoridades y obsequio conmemorativo"},
                {"Acceso al encuentro y participación libre en las actividades", "Consumición incluida y dinámicas organizadas para romper el hielo", "Zona reservada, varias consumiciones, actividades guiadas y regalo sorpresa"},
                {"Ración de paella y acceso al evento", "Ración abundante, bebida incluida y asiento reservado", "Menú completo, bebidas ilimitadas, zona VIP y participación en el cocinado"},
                {"Acceso al recinto y degustaciones básicas", "Degustación ampliada con quesos artesanos y bebida incluida", "Cata guiada con experto, productos exclusivos, zona VIP y bolsa gourmet"},
                {"","",""}, {"","",""}, {"","",""}, {"","",""}, {"","",""}, {"","",""}, {"","",""}, {"","",""}, {"","",""}, {"","",""}, {"","",""}, {"","",""}
        };

        //EVENTOS ACTIVOS
        boolean[] eventosActivos = {true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false,};

        //EVENTOS CREADOS POR ORGANIZADORES
        byte[] idEventosPorOrganizadores = {0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        //=======DATOS EVENTOS========
        //NOMBRE

        String[] evNombre = {"¡Bolos con famosos!", "Charla empresarial con alcalde de Jaén", "Partido Fútblo sala Jaén", "Viaje a Egipto solo para habitantes de la provincia de Jaén", "Ceremonia de la nueva biblioteca en Alcalá", "Quedada en cafetería para hacer nuevos amigos", "Paella gigante en VidaPark Martos", "Fiesta del queso en Alcaudete", "", "", ""};


        //DESCIPCION
        String[] evDescripcion = {"¡Conoce a los autores de los libros más vendidos de este año! La reunión será el doble de entretenida haciendo una competición de bolos con tus autores favoritos", "El alcalde de Jaén nos mostrará cómo ha llegado a su cargo y estará disponible a preguntas de los invitados", "¡El partido que estabas esperando, ven y anima a tu equipo con más aficionados!", "La agencia de viajes más famosa de Jaén está organizando un viaje bastante económico a Egipto. ¡Unete junto a tus amigos!", "Alcalá quiere celebrar la apertura de su nueva biblioteca por todo lo alto. ¡El ayuntamiento te invita a unirte a una gran comilona!", "¿Te gustaría hacer nuevos amigos? ¡Ven con nosotros a esta quedada en la que podrás conocer a gente!", "¡VidaPark está de aniversario! Ven a pasarlo en grande con la primera consumición gratis y con una buena paella", "¿Te gusta el queso? Entonces ven a Alcaudete, ¡donde se te pondrá cara de ratón!", "", "", ""};


        //CATEGORIA
        String[] evCategoria = {"Arte, Ocio", "Empresarial, Ocio, Arte, Charla", "Deporte, Ocio", "Viaje, Ocio", "Arte, Ocio", "Ocio, Quedada", "Comida, Ocio", "Comida, Ocio, Arte", "", "", ""};


        //FECHA

        String[] evFecha = {"12/12/25", "13/5/26", "1/12/25", "10/12/25", "1/2/26", "5/1/26", "1/6/26", "5/12/25", "", "", ""};


        //HORA

        String[] evHora = {"13:00", "15:30", "14:00", "14:30", "13:00", "18:00", "13:00", "18:00", "", "", ""};


        //AFORO
        int[] evAforo = {20, 20, 20, 30, 30, 30, 40, 40,0,0,0,0,0,0,0,0,0,0,0,0};

        //INSCRITOS

        int[] evInscritos = {inscritosAleatorios(evAforo[0]), inscritosAleatorios(evAforo[1]), inscritosAleatorios(evAforo[2]), inscritosAleatorios(evAforo[3]), inscritosAleatorios(evAforo[4]), inscritosAleatorios(evAforo[5]), inscritosAleatorios(evAforo[6]), inscritosAleatorios(evAforo[7])};


        int[][] evEntradasTodas = {{(evAforo[0] * 20) / 100, (evAforo[0] * 40) / 100, (evAforo[0] * 40) / 100, (evInscritos[0] * 20) / 100, (evInscritos[0] * 40) / 100, (evInscritos[0] * 40) / 100}
                , {(evAforo[1] * 20) / 100, (evAforo[1] * 40) / 100, (evAforo[1] * 40) / 100, (evInscritos[1] * 20) / 100, (evInscritos[1] * 40) / 100, (evInscritos[1] * 40) / 100}
                , {(evAforo[2] * 20) / 100, (evAforo[2] * 40) / 100, (evAforo[2] * 40) / 100, (evInscritos[2] * 20) / 100, (evInscritos[2] * 40) / 100, (evInscritos[2] * 40) / 100}
                , {(evAforo[3] * 20) / 10, (evAforo[3] * 40) / 100, (evAforo[3] * 40) / 100, (evInscritos[3] * 20) / 100, (evInscritos[3] * 40) / 100, (evInscritos[3] * 40) / 100}
                , {(evAforo[4] * 20) / 100, (evAforo[4] * 40) / 100, (evAforo[4] * 40) / 100, (evInscritos[4] * 20) / 100, (evInscritos[4] * 40) / 100, (evInscritos[4] * 40) / 100}
                , {(evAforo[5] * 20) / 100, (evAforo[5] * 40) / 100, (evAforo[5] * 40) / 100, (evInscritos[5] * 20) / 100, (evInscritos[5] * 40) / 100, (evInscritos[5] * 40) / 100}
                , {(evAforo[6] * 20) / 100, (evAforo[6] * 40) / 100, (evAforo[6] * 40) / 100, (evInscritos[6] * 20) / 100, (evInscritos[6] * 40) / 100, (evInscritos[6] * 40) / 100}
                , {(evAforo[7] * 20) / 100, (evAforo[7] * 40) / 100, (evAforo[7] * 40) / 100, (evInscritos[7] * 20) / 100, (evInscritos[7] * 40) / 100, (evInscritos[7] * 40) / 100}
                , {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}
        };

        int[][] evEntradasTodosLosPrecios = {{10, 10, 10}, {10, 10, 10}, {10, 10, 10}, {10, 10, 10}, {10, 10, 10}, {10, 10, 10}, {10, 10, 10}, {10, 10, 10}, {0,0,0}, {0,0,0}, {0,0,0}, {0,0,0}, {0,0,0}, {0,0,0}, {0,0,0}, {0,0,0}, {0,0,0}, {0,0,0}, {0,0,0}, {0,0,0}};


        //dinero en la cuenta de los usuarios
        double[] dineroUsers = {50, 50, 30, 50, 0, 0, 0, 0, 0, 0};


        while (1 == 1) {
            boolean usuarioActiv = false;
            //RECONOCER EL USUARIO
            do {
                System.out.println(NEGRITA + AZUL + "Escribe el usuario:" + RESET);
                valorUsuario = reconocerUsuario(nombreUsers);

                if (valorUsuario > 0) {
                    usuarioActiv = true;
                    System.out.println(NEGRITA + "Bienvenido " + AMARILLO + nombreUsers[valorUsuario] + RESET);
                } else {
                    if (valorUsuario == -1) {
                        existeUsers[numeroDeUsersCreados + 1] = true;
                        System.out.println("¿Como se llamará el nuevo usuario?");
                        nombreUsers[numeroDeUsersCreados + 1] = s.nextLine();
                        if (definirTipoDeUsuario() == 1) {
                            tiposDeUsers[numeroDeUsersCreados + 1] = 1;
                        } else {
                            tiposDeUsers[numeroDeUsersCreados + 1] = 0;
                        }
                    } else {
                        System.out.println("No se ha añadido el usuario");
                    }
                }
            } while (!usuarioActiv);

            //BLOQUEO DE CUENTAS
            int valorClave = pedirClave(passwUsers, valorUsuario);
            if (valorClave == 5) {
                bloqueoUsers[valorUsuario] = true;
                System.out.println("La cuenta " + nombreUsers[valorUsuario] + " se ha bloqueado, contacta con un administrador para desbloquearla");
            }


            //MENU DE LOS DIFERENTES USUARIOS
            switch (tiposDeUsers[valorUsuario]) {
                case -1: {
                    int opcionCarteraDigitalAdmin = 0;

                    int opcionMenuAdmin;
                    String opcionMenuEventoAdmin = "";
                    do {
                        //COMPROBANTE DE QUE LOS ARRAYS NO TIENEN NINGUN VALOR NULO EN MITAD


                        int opcionCambioAdmin = 0;
                        int opcionPanelAdmin = 0;
                        opcionMenuAdmin = menuPrincipalAdmin();
                        switch (opcionMenuAdmin) {
                            case 1:
                                opcionPanelAdmin = panelDeControl(bloqueoUsers, nombreUsers, numeroDeUsersCreados);
                                if (opcionPanelAdmin != numeroDeUsersCreados + 1) {
                                    System.out.println("¿Que quiere hacer?");
                                    System.out.println("1- Bloquear");
                                    System.out.println("2- Desbloquear");
                                    if (Integer.parseInt(s.nextLine()) == 1) {
                                        bloqueoUsers[opcionCambioAdmin] = false;
                                    } else bloqueoUsers[opcionCambioAdmin] = true;
                                }
                                break;
                            case 2:
                                opcionMenuEventoAdmin = menuEventosAdmin(contadorEventosCreados, evNombre);
                                break;
                            case 3:
                                opcionCarteraDigitalAdmin = menuCarteraDigitalAdmin(dineroUsers[valorUsuario]);
                                break;
                            case 4:
                                opcionCambioAdmin = configuracionAdmin();
                                break;
                            case 5:
                                System.out.println("Cerrando sesión...");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                        for (int i = 0; i < contadorEventosCreados; i++) {
                            if (idEventosPorOrganizadores[i] != 0) {
                                System.out.println(i + " - " + evNombre[i] + "  --- Creado por " + nombreUsers[idEventosPorOrganizadores[i]]);
                            }
                        }
                    } while (opcionMenuAdmin != 5);
                    break;
                }
                case 1: {
                    //MENU ORGANIZADOR
                    int opcionMenuOrg;
                    int opcionCarteraDigitalOrg = 0;
                    do {

                        int opcionCambioOrg = 0;
                        int opcionPanelOrg = 0;
                        opcionMenuOrg = menuPrincipalOrg();
                        switch (opcionMenuOrg) {
                            case 1:

                                for (int i = 0; i < contadorEventosCreados; i++) {
                                    if (idEventosPorOrganizadores[i] == valorUsuario) {
                                        System.out.println(i + " - " + evNombre[i]);
                                    }
                                }

                                //ELECCIÓN DE BORRAR, EDITAR O CREAR EVENTOS
                                int opcion = 0;
                                System.out.println( NEGRITA + AZUL + "¿Que quieres hacer?" + RESET);
                                System.out.println(VERDE + "1-- Crear eventos");
                                System.out.println("2-- Borrar eventos");
                                System.out.println("3-- Modificar eventos" + RESET);
                                opcion = Integer.parseInt(s.nextLine());

                                switch (opcion) {
                                    case 1:
                                        //APARTADO DE CREAR EVENTOS
                                        if (!eventosActivos[contadorEventosCreados + 1]) {
                                            eventosActivos[contadorEventosCreados + 1] = true;
                                            System.out.println("Escribe el nombre que tendrá el evento:");
                                            evNombre[contadorEventosCreados + 1] = s.nextLine();
                                            System.out.println("Escribe la descipción que tendrá el evento:");
                                            evDescripcion[contadorEventosCreados + 1] = s.nextLine();
                                            System.out.println("Escribe las categorías que tendrá el evento:");
                                            evDescripcion[contadorEventosCreados + 1] = s.nextLine();
                                            System.out.println("Escribe la fecha que tendrá el evento:");
                                            evFecha[contadorEventosCreados + 1] = s.nextLine();
                                            System.out.println("Escribe la hora en la que empezará:");
                                            evHora[contadorEventosCreados + 1] = s.nextLine();
                                            System.out.println("Escribe el aforo máximo que tendrá el evento:");
                                            evAforo[contadorEventosCreados + 1] = Integer.parseInt(s.nextLine());
                                            System.out.println("Escribe la descripción de la entrada premium");
                                            descripcionesEntradasEventos[contadorEventosCreados + 1][0] = s.nextLine();
                                            System.out.println("Escribe la descripción de la entrada semipremium");
                                            descripcionesEntradasEventos[contadorEventosCreados + 1][1] = s.nextLine();
                                            System.out.println("Escribe la descripción de la entrada normal");
                                            descripcionesEntradasEventos[contadorEventosCreados + 1][2] = s.nextLine();
                                            System.out.println("Escribe el precio de la entrada premium");
                                            evEntradasTodosLosPrecios[contadorEventosCreados + 1][0] = Integer.parseInt(s.nextLine());
                                            System.out.println("Escribe el precio de la entrada semipremium");
                                            evEntradasTodosLosPrecios[contadorEventosCreados + 1][1] = Integer.parseInt(s.nextLine());
                                            System.out.println("Escribe el precio de la entrada normal");
                                            evEntradasTodosLosPrecios[contadorEventosCreados + 1][2] = Integer.parseInt(s.nextLine());
                                            contadorEventosCreados++;
                                        } else {
                                            System.out.println("No se puede crear el evento");
                                        }
                                        break;
                                    case 2:
                                        //MENU BORRAR EVENTOS
                                        int opcionBorrar = 0;

                                        for (int i = 0; i < contadorEventosCreados; i++) {
                                            if (idEventosPorOrganizadores[i] == valorUsuario) {
                                                System.out.println(i + " - " + evNombre[i]);
                                            }
                                        }

                                        System.out.println("Teclea el número del evento que quieras borrar");
                                        opcionBorrar = Integer.parseInt(s.nextLine());
                                        if (idEventosPorOrganizadores[opcionBorrar] == valorUsuario) {
                                            eventosActivos[opcionBorrar] = false;
                                        } else System.out.println("No se puede borrar el evento");
                                        break;
                                    case 3:

                                        for (int i = 0; i < contadorEventosCreados; i++) {
                                            if (idEventosPorOrganizadores[i] == valorUsuario) {
                                                System.out.println(i + " - " + evNombre[i]);
                                            }
                                        }

                                        System.out.println("Escribe el número del evento que vas a modificar");
                                        //MENU EDITAR EVENTOS
                                        int opcionEditarEvento = Integer.parseInt(s.nextLine());

                                        if (idEventosPorOrganizadores[opcionEditarEvento] == valorUsuario) {
                                            System.out.println("Escribe el nombre que tendrá el evento:");
                                            evNombre[opcionEditarEvento] = s.nextLine();
                                            System.out.println("Escribe la descipción que tendrá el evento:");
                                            evDescripcion[opcionEditarEvento] = s.nextLine();
                                            System.out.println("Escribe las categorías que tendrá el evento:");
                                            evDescripcion[opcionEditarEvento] = s.nextLine();
                                            System.out.println("Escribe la fecha que tendrá el evento:");
                                            evFecha[opcionEditarEvento] = s.nextLine();
                                            System.out.println("Escribe la hora en la que empezará:");
                                            evHora[opcionEditarEvento] = s.nextLine();
                                            System.out.println("Escribe el aforo máximo que tendrá el evento:");
                                            evAforo[opcionEditarEvento] = Integer.parseInt(s.nextLine());
                                            System.out.println("Escribe la descripción de la entrada premium");
                                            descripcionesEntradasEventos[opcionEditarEvento][0] = s.nextLine();
                                            System.out.println("Escribe la descripción de la entrada semipremium");
                                            descripcionesEntradasEventos[opcionEditarEvento][1] = s.nextLine();
                                            System.out.println("Escribe la descripción de la entrada normal");
                                            descripcionesEntradasEventos[opcionEditarEvento][2] = s.nextLine();
                                            System.out.println("Escribe el precio de la entrada premium");
                                            evEntradasTodosLosPrecios[opcionEditarEvento][0] = Integer.parseInt(s.nextLine());
                                            System.out.println("Escribe el precio de la entrada semipremium");
                                            evEntradasTodosLosPrecios[opcionEditarEvento][1] = Integer.parseInt(s.nextLine());
                                            System.out.println("Escribe el precio de la entrada normal");
                                            evEntradasTodosLosPrecios[opcionEditarEvento][2] = Integer.parseInt(s.nextLine());

                                        }
                                        break;
                                }
                                break;
                            case 2:
                                opcionCarteraDigitalOrg = menuCarteraDigitalOrg(dineroUsers[valorUsuario]);
                                break;
                            case 3:
                                opcionCambioOrg = configuracionOrg();
                                break;
                            case 4:
                                System.out.println("Cerrando sesión...");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }

                        switch (opcionCarteraDigitalOrg) {
                            case 0:
                                break;
                            case 1:
                                dineroUsers[valorUsuario] = anadirSaldoOrg(dineroUsers[valorUsuario]);
                                opcionCarteraDigitalOrg = 0;
                                break;
                            case 2:
                                dineroUsers[valorUsuario] = retirarSaldoOrg(dineroUsers[valorUsuario]);
                                opcionCarteraDigitalOrg = 0;
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }

                        if (opcionPanelOrg == 1) {
                            cambiarEstadoUsuariosTexto();
                            int opcion2 = s.nextInt();
                            if (opcion2 == 1) {
                                bloqueoUsers[1] = true;
                            }
                            if (opcion2 == 2) {
                                bloqueoUsers[1] = false;
                            }
                        }

                        if (opcionCambioOrg == 1) {
                            System.out.println("Escribe como quieres que se llame este usuario");
                            nombreUsers[1] = s.nextLine();
                        } else if (opcionCambioOrg == 2) {
                            System.out.println("Escribe la contraseña que desees");
                            passwUsers[1] = s.nextLine();
                        } else if (opcionCambioOrg == 0) {
                        } else System.out.println("IRRECONOCIBLE");

                        System.out.println();
                    } while (opcionMenuOrg != 4);
                    break;
                }
                case 0: {
                    //MENU ASISTENTES
                    int opcionMenuUsers;
                    int opcionCarteraDigitalUsers = 0;

                    //Este array tiene en primer lugar el tipo de entrada, y el evento seleccionado
                    int[] opcionDeEventoUnirse;


                    String[] opcionCambioUsers;
                    do {
                        opcionMenuUsers = menuPrincipalUsers();
                        switch (opcionMenuUsers) {
                            case 1:
                                mostrarMisEventosUsers(evUsers, evNombre, contadorEventosCreados, valorUsuario);
                                break;
                            case 2:
                                opcionDeEventoUnirse = mostrarEventosUsers(eventosActivos, evNombre, evDescripcion, descripcionesEntradasEventos, evCategoria, evFecha, evHora, contadorEventosCreados, evEntradasTodas, evEntradasTodas);
                                if (opcionDeEventoUnirse[0] != -1 && opcionDeEventoUnirse[1] != -1) {
                                    evUsers[valorUsuario][opcionDeEventoUnirse[0]] = true;
                                    evEntradasTodas[opcionDeEventoUnirse[0]][opcionDeEventoUnirse[1] - 1 + 3]++;
                                }
                                break;
                            case 3:
                                opcionCarteraDigitalUsers = menuCarteraDigitalUsers(dineroUsers[valorUsuario]);
                                break;
                            case 4:
                                menuInvitarAmigoUsers();
                                break;
                            case 5:
                                opcionCambioUsers = configuracionUsers();
                                if (opcionCambioUsers[0].equals("1")) {
                                    nombreUsers[valorUsuario] = opcionCambioUsers[1];
                                } else if (opcionCambioUsers[0].equals("2")) {
                                    passwUsers[valorUsuario] = opcionCambioUsers[1];
                                }
                                break;
                            case 6:
                                System.out.println("Cerrando sesión...");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }

                        switch (opcionCarteraDigitalUsers) {
                            case 0:
                                break;
                            case 1:
                                dineroUsers[valorUsuario] = anadirSaldoUsers(dineroUsers[valorUsuario]);
                                opcionCarteraDigitalUsers = 0;
                                break;
                            case 2:
                                dineroUsers[valorUsuario] = retirarSaldoUsers(dineroUsers[valorUsuario]);
                                opcionCarteraDigitalUsers = 0;
                                break;
                            default:
                                System.out.println("Opción no válida...");
                        }

                    } while (opcionMenuUsers != 6);


                    break;

                }

            }
        }
    }


    public static int inscritosAleatorios(int aforo) {
        int a = (int) (Math.random() * (aforo - 4) + 1);
        return a;
    }


    public static void mostrarGraficoAforo(String nombreEvento, int aforoMaximo, int inscritos) {

        if (inscritos > aforoMaximo) {
            inscritos = aforoMaximo;
        }

        int porcentaje = (int) ((inscritos * 100.0) / aforoMaximo);

        System.out.println("AFORO DEL EVENTO");
        System.out.println("Inscritos: " + inscritos + " de " + aforoMaximo);

        System.out.print("Progreso: ");

        int bloques = porcentaje / 5; // 20 bloques = 100%

        for (int i = 0; i < bloques; i++) {
            System.out.print("█");
        }
        for (int i = bloques; i < 20; i++) {
            System.out.print("░");
        }

        System.out.println(" " + porcentaje + "%");
    }
}


