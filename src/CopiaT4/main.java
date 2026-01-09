//package CopiaT4;
//
//import java.util.Scanner;
//
//import static CopiaT4.logins.loginUsuario;
//import static CopiaT4.logins.pedirClave;
//import static CopiaT4.menuAdmin.*;
//import static CopiaT4.menuAsistente1.*;
//import static CopiaT4.menuAsistente2.*;
//import static CopiaT4.menuOrganizador.*;
//
//public class main {
//
//    static void main(String[] args) {
//
//        //CONTADOR DE EVENTOS ACTIVOS
//        int contadorEventosCreados = 8;
//
//        Scanner s = new Scanner(System.in);
//        int valorUsuario = 5;
//        String usuario = "";
//
//        //INICIALIZAR EL ESTADO DE LOS USUARIOS
//        boolean[] bloqueoUsers = {false,false,false,false};
//
//        //NOMBRE DE LOS USUARIOS
//        String[] nombreUsers = {"admin","organizador","usuario1","usuario2"};
//
//
//        //CONTRASEÑA INICIAL DE LOS USUARIOS
//        String[] passwUsers = {"admin","1234","1234","1234"};
//
//        // =====Variables para guardar los eventos=====
//        //EVENTOS USUARIO1
//        //ASI SERÁ COMO SE ORGANIZARÁ EL ARRAY:
//        //0:EV1
//        //1:EV2
//        //2:EV3
//        //3:EV4
//        //4:EV5
//        //5:EV6
//        //6:EV7
//        //7:EV8
//        //8:EV1ORG
//        //9:EV2ORG
//        //10:EV3ORG
//
//
//        boolean[] evUser1 = {false,false,false,false,false,false,false,false,false,false,false};
//
//
//        //EVENTOS USUARIO2
//
//        boolean[] evUser2 = {false,false,false,false,false,false,false,false,};
//
//
//        //========EVENTOS CREADOS POR EL ORGANIZADOR=========
//        //  EVENTO1 ORG
//        boolean eventoOrg1 = false;
//        String ev1OrgNombre = "";
//        String ev1OrgDescripcion = "";
//        String ev1OrgCategoria = "";
//        String ev1OrgFecha = "";
//        String ev1OrgHora = "";
//        int ev1OrgAforo = 0;
//        int ev1OrgInscritos = 0;
//        String descripcionev1OrgEntradaPremium = "";
//        String descripcionev1OrgEntradaSemipremium = "";
//        String descripcionev1OrgEntradaNormal = "";
//        int preciov1OrgEntradaPremium = 0;
//        int preciov1OrgEntradaSemipremium = 0;
//        int preciov1OrgEntradaNormal = 0;
//
//
//        //  EVENTO2 ORG
//        boolean eventoOrg2 = false;
//        String ev2OrgNombre = "";
//        String ev2OrgDescripcion = "";
//        String ev2OrgCategoria = "";
//        String ev2OrgFecha = "";
//        String ev2OrgHora = "";
//        int ev2OrgAforo = 0;
//        int ev2OrgInscritos = 0;
//        String descripcionev2OrgEntradaPremium = "";
//        String descripcionev2OrgEntradaSemipremium = "";
//        String descripcionev2OrgEntradaNormal = "";
//        int preciov2OrgEntradaPremium = 0;
//        int preciov2OrgEntradaSemipremium = 0;
//        int preciov2OrgEntradaNormal = 0;
//
//        //  EVENTO3 ORG
//        boolean eventoOrg3 = false;
//        String ev3OrgNombre = "";
//        String ev3OrgDescripcion = "";
//        String ev3OrgCategoria = "";
//        String ev3OrgFecha = "";
//        String ev3OrgHora = "";
//        int ev3OrgAforo = 0;
//        int ev3OrgInscritos = 0;
//        String descripcionev3OrgEntradaPremium = "";
//        String descripcionev3OrgEntradaSemipremium = "";
//        String descripcionev3OrgEntradaNormal = "";
//        int preciov3OrgEntradaPremium = 0;
//        int preciov3OrgEntradaSemipremium = 0;
//        int preciov3OrgEntradaNormal = 0;
//
//
//
//
//        //=======DATOS EVENTOS========
//        //NOMBRE
//
//        String[] evNombre = {"¡Bolos con famosos!","Charla empresarial con alcalde de Jaén","Partido Fútblo sala Jaén","Viaje a Egipto solo para habitantes de la provincia de Jaén","Ceremonia de la nueva biblioteca en Alcalá","Quedada en cafetería para hacer nuevos amigos","Quedada en cafetería para hacer nuevos amigos","Paella gigante en VidaPark Martos","Fiesta del queso en Alcaudete"};
//
//
//        //DESCIPCION
//        String[] evDescripcion = {"¡Conoce a los autores de los libros más vendidos de este año! La reunión será el doble de entretenida haciendo una competición de bolos con tus autores favoritos","El alcalde de Jaén nos mostrará cómo ha llegado a su cargo y estará disponible a preguntas de los invitados","¡El partido que estabas esperando, ven y anima a tu equipo con más aficionados!","La agencia de viajes más famosa de Jaén está organizando un viaje bastante económico a Egipto. ¡Unete junto a tus amigos!","Alcalá quiere celebrar la apertura de su nueva biblioteca por todo lo alto. ¡El ayuntamiento te invita a unirte a una gran comilona!","¿Te gustaría hacer nuevos amigos? ¡Ven con nosotros a esta quedada en la que podrás conocer a gente!","¡VidaPark está de aniversario! Ven a pasarlo en grande con la primera consumición gratis y con una buena paella","¿Te gusta el queso? Entonces ven a Alcaudete, ¡donde se te pondrá cara de ratón!"};
//
//
//        //CATEGORIA
//        String[] evCategoria = {"Arte, Ocio","Empresarial, Ocio, Arte, Charla","Deporte, Ocio","Viaje, Ocio","Arte, Ocio","Ocio, Quedada","Comida, Ocio","Comida, Ocio, Arte"};
//
//
//        //FECHA
//
//        String[] evFecha = {"12/12/25","13/5/26","1/12/25","10/12/25","1/2/26","5/1/26","1/6/26","5/12/25"};
//
//
//        //HORA
//
//        String[] evHora = {"13:00","15:30","14:00","14:30","13:00","18:00","13:00","18:00"};
//
//
//        //AFORO
//        int ev1Aforo = 20;
//        int ev2Aforo = 20;
//        int ev3Aforo = 20;
//        int ev4Aforo = 30;
//        int ev5Aforo = 30;
//        int ev6Aforo = 30;
//        int ev7Aforo = 40;
//        int ev8Aforo = 40;
//
//        //INSCRITOS
//        int ev1Inscritos = inscritosAleatorios(ev1Aforo);
//        int ev2Inscritos = inscritosAleatorios(ev2Aforo);
//        int ev3Inscritos = inscritosAleatorios(ev3Aforo);
//        int ev4Inscritos = inscritosAleatorios(ev4Aforo);
//        int ev5Inscritos = inscritosAleatorios(ev5Aforo);
//        int ev6Inscritos = inscritosAleatorios(ev6Aforo);
//        int ev7Inscritos = inscritosAleatorios(ev7Aforo);
//        int ev8Inscritos = inscritosAleatorios(ev8Aforo);
//
//        //======ENTRADAS EVENTOS=======
//        int ev1EntradasPremium = (ev1Aforo *20)/100;
//        int ev1EntradasSemipremium = (ev1Aforo *40)/100;
//        int ev1EntradasNormal = (ev1Aforo *40)/100;
//        int ev1EntradasPremiumComprada = (ev1Inscritos *20)/100;
//        int ev1EntradasSemipremiumComprada = (ev1Inscritos *40)/100;
//        int ev1EntradasNormalComprada = (ev1Inscritos *40)/100;
//        int ev2EntradasPremium = (ev1Aforo *20)/100;
//        int ev2EntradasSemipremium = (ev1Aforo *40)/100;
//        int ev2EntradasNormal = (ev1Aforo *40)/100;
//        int ev2EntradasPremiumComprada = (ev2Inscritos *20)/100;
//        int ev2EntradasSemipremiumComprada = (ev2Inscritos *40)/100;
//        int ev2EntradasNormalComprada = (ev2Inscritos *40)/100;
//        int ev3EntradasPremium = (ev1Aforo *20)/100;
//        int ev3EntradasSemipremium = (ev1Aforo *40)/100;
//        int ev3EntradasNormal = (ev1Aforo *40)/100;
//        int ev3EntradasPremiumComprada = (ev3Inscritos *20)/100;
//        int ev3EntradasSemipremiumComprada = (ev3Inscritos *40)/100;
//        int ev3EntradasNormalComprada = (ev3Inscritos *40)/100;
//        int ev4EntradasPremium = (ev4Aforo *20)/100;
//        int ev4EntradasSemipremium = (ev4Aforo *40)/100;
//        int ev4EntradasNormal = (ev4Aforo *40)/100;
//        int ev4EntradasPremiumComprada = (ev4Inscritos *20)/100;
//        int ev4EntradasSemipremiumComprada = (ev4Inscritos *40)/100;
//        int ev4EntradasNormalComprada = (ev4Inscritos *40)/100;
//        int ev5EntradasPremium = (ev5Aforo *20)/100;
//        int ev5EntradasSemipremium = (ev5Aforo *40)/100;
//        int ev5EntradasNormal = (ev5Aforo *40)/100;
//        int ev5EntradasPremiumComprada = (ev5Inscritos *20)/100;
//        int ev5EntradasSemipremiumComprada = (ev5Inscritos *40)/100;
//        int ev5EntradasNormalComprada = (ev5Inscritos *40)/100;
//        int ev6EntradasNormal = (ev1Aforo *40)/100;
//        int ev6EntradasNormalComprada = (ev6Inscritos *40)/100;
//        int ev7EntradasPremium = (ev1Aforo *20)/100;
//        int ev7EntradasSemipremium = (ev1Aforo *40)/100;
//        int ev7EntradasNormal = (ev1Aforo *40)/100;
//        int ev7EntradasPremiumComprada = (ev7Inscritos *20)/100;
//        int ev7EntradasSemipremiumComprada = (ev7Inscritos *40)/100;
//        int ev7EntradasNormalComprada = (ev7Inscritos *40)/100;
//        int ev8EntradasPremium = (ev1Aforo *20)/100;
//        int ev8EntradasSemipremium = (ev1Aforo *40)/100;
//        int ev8EntradasNormal = (ev1Aforo *40)/100;
//        int ev8EntradasPremiumComprada = (ev8Inscritos *20)/100;
//        int ev8EntradasSemipremiumComprada = (ev8Inscritos *40)/100;
//        int ev8EntradasNormalComprada = (ev8Inscritos *40)/100;
//        int ev1OrgEntradasPremium = (ev1OrgAforo *20)/100;
//        int ev1OrgEntradasSemipremium = (ev1OrgAforo *40)/100;
//        int ev1OrgEntradasNormal = (ev1OrgAforo *40)/100;
//        int ev1OrgEntradasPremiumComprada = 0;
//        int ev1OrgEntradasSemipremiumComprada = 0;
//        int ev1OrgEntradasNormalComprada = 0;
//        int ev2OrgEntradasPremium = (ev2OrgAforo *20)/100;
//        int ev2OrgEntradasSemipremium = (ev2OrgAforo *40)/100;
//        int ev2OrgEntradasNormal = (ev2OrgAforo *40)/100;
//        int ev2OrgEntradasPremiumComprada = 0;
//        int ev2OrgEntradasSemipremiumComprada = 0;
//        int ev2OrgEntradasNormalComprada = 0;
//        int ev3OrgEntradasPremium = (ev3OrgAforo *20)/100;
//        int ev3OrgEntradasSemipremium = (ev3OrgAforo *40)/100;
//        int ev3OrgEntradasNormal = (ev3OrgAforo *40)/100;
//        int ev3OrgEntradasPremiumComprada = 0;
//        int ev3OrgEntradasSemipremiumComprada = 0;
//        int ev3OrgEntradasNormalComprada = 0;
//
//        double dineroAdmin  =50;
//        double dinero = 50;
//        double dineroUser1=50;
//        double dineroUser2=50;
//
//
//        while (1 == 1) {
//            boolean usuarioActiv = false;
//            //RECONOCER EL USUARIO
//            do {
//
//                System.out.println("Escribe el usuario");
//                usuario = s.nextLine();
//                valorUsuario = loginUsuario(usuario, bloqueoUsers,nombreUsers);
//
//                switch (valorUsuario) {
//                    case 1:
//                        System.out.println("Bienvenido " + nombreUsers[0]);
//                         usuarioActiv=true;
//                        break;
//                    case 2:
//                        System.out.println("Bienvenido " + nombreUsers[1]);
//                        usuarioActiv=true;
//                        break;
//                    case 3:
//                        System.out.println("Bienvenido " + nombreUsers[2]);
//                        usuarioActiv=true;
//                        break;
//                    case 4:
//                        System.out.println("Bienvenido "+nombreUsers[3]);
//                        usuarioActiv=true;
//                        break;
//                    default:
//                        System.out.println("IRRECONOCIBLE");
//                }
//            } while (!usuarioActiv);
//
//
//            //BLOQUEO DE CUENTAS
//
//            int valorClave = pedirClave(usuario,nombreUsers,passwUsers);
//            if (valorClave==5){
//                System.out.println("La cuenta " + usuario + " se ha bloqueado, contacta con un administrador para desbloquearla");
//                if (valorUsuario==1) bloqueoUsers[0]=true;
//                else if (valorUsuario==2) bloqueoUsers[1]=true;
//                else if (valorUsuario==3) bloqueoUsers[2]=true;
//                else if (valorUsuario==4) bloqueoUsers[3]=true;
//            }
//
//
//            //MENU DE LOS DIFERENTES USUARIOS
//            switch (valorClave) {
//                case 1: //MENU ADMIN
//                    int opcionCarteraDigitalAdmin = 0;
//
//                    int opcionMenuAdmin;
//                    String opcionMenuEventoAdmin = "";
//                    do {
//
//                        int opcionCambioAdmin = 0;
//                        int opcionPanelAdmin = 0;
//                        opcionMenuAdmin = menuPrincipalAdmin();
//                        switch (opcionMenuAdmin) {
//                            case 1:
//                                opcionPanelAdmin = panelDeControl(bloqueoUsers, nombreUsers);
//                                break;
//                            case 2:
//                                opcionMenuEventoAdmin = menuEventosAdmin(contadorEventosCreados,evNombre);
//                                break;
//                            case 3:
//                                opcionCarteraDigitalAdmin = menuCarteraDigitalAdmin(dineroAdmin);
//                                break;
//                            case 4:
//                                opcionCambioAdmin = configuracionAdmin();
//                                break;
//                            case 5:
//                                System.out.println("Cerrando sesión...");
//                                break;
//                            default:
//                                System.out.println("Opción no válida.");
//                        }
//
//
//                        //====EDITAR EVENTOS DE ORGANIZADOR=====
//                        switch (opcionMenuEventoAdmin){
//                            case "1x":
//                                eventoOrg1 = false;
//                                System.out.println("Evento borrado");
//                                break;
//                            case "2x":
//                                eventoOrg2 = false;
//                                System.out.println("Evento borrado");
//                                break;
//                            case "3x":
//                                eventoOrg3 = false;
//                                System.out.println("Evento borrado");
//                                break;
//                            case "1":
//                                eventoOrg1 = true;
//                                contadorEventosCreados ++;
//                                System.out.println("Escribe el nombre que tendrá el evento:");
//                                ev1OrgNombre = s.nextLine();
//                                System.out.println("Escribe la descipción que tendrá el evento:");
//                                ev1OrgDescripcion = s.nextLine();
//                                System.out.println("Escribe las categorías que tendrá el evento:");
//                                ev1OrgCategoria = s.nextLine();
//                                System.out.println("Escribe la fecha que tendrá el evento:");
//                                ev1OrgFecha = s.nextLine();
//                                System.out.println("Escribe la hora en la que empezará:");
//                                ev1OrgHora = s.nextLine();
//                                System.out.println("Escribe el aforo máximo que tendrá el evento:");
//                                ev1OrgAforo = Integer.parseInt(s.nextLine());
//                                System.out.println("Escribe la descripción de la entrada premium");
//                                descripcionev1OrgEntradaPremium  =s.nextLine();
//                                System.out.println("Escribe la descripción de la entrada semipremium");
//                                descripcionev1OrgEntradaSemipremium  =s.nextLine();
//                                System.out.println("Escribe la descripción de la entrada normal");
//                                descripcionev1OrgEntradaNormal  =s.nextLine();
//                                System.out.println("Escribe el precio de la entrada premium");
//                                preciov1OrgEntradaPremium  =Integer.parseInt(s.nextLine());
//                                System.out.println("Escribe el precio de la entrada semipremium");
//                                preciov1OrgEntradaSemipremium  =Integer.parseInt(s.nextLine());
//                                System.out.println("Escribe el precio de la entrada normal");
//                                preciov1OrgEntradaNormal  =Integer.parseInt(s.nextLine());
//                                break;
//                            case "2":
//                                eventoOrg2 = true;
//                                contadorEventosCreados ++;
//                                System.out.println("Escribe el nombre que tendrá el evento:");
//                                ev2OrgNombre = s.nextLine();
//                                System.out.println("Escribe la descipción que tendrá el evento:");
//                                ev2OrgDescripcion = s.nextLine();
//                                System.out.println("Escribe las categorías que tendrá el evento:");
//                                ev2OrgCategoria = s.nextLine();
//                                System.out.println("Escribe la fecha que tendrá el evento:");
//                                ev2OrgFecha = s.nextLine();
//                                System.out.println("Escribe la hora en la que empezará:");
//                                ev2OrgHora = s.nextLine();
//                                System.out.println("Escribe el aforo máximo que tendrá el evento:");
//                                ev2OrgAforo = Integer.parseInt(s.nextLine());
//                                System.out.println("Escribe la descripción de la entrada premium");
//                                descripcionev2OrgEntradaPremium  =s.nextLine();
//                                System.out.println("Escribe la descripción de la entrada semipremium");
//                                descripcionev2OrgEntradaSemipremium  =s.nextLine();
//                                System.out.println("Escribe la descripción de la entrada normal");
//                                descripcionev2OrgEntradaNormal  =s.nextLine();
//                                System.out.println("Escribe el precio de la entrada premium");
//                                preciov2OrgEntradaPremium  =Integer.parseInt(s.nextLine());
//                                System.out.println("Escribe el precio de la entrada semipremium");
//                                preciov2OrgEntradaSemipremium  =Integer.parseInt(s.nextLine());
//                                System.out.println("Escribe el precio de la entrada normal");
//                                preciov2OrgEntradaNormal  =Integer.parseInt(s.nextLine());
//                                break;
//                            case "3":
//                                eventoOrg3 = true;
//                                contadorEventosCreados ++;
//                                System.out.println("Escribe el nombre que tendrá el evento:");
//                                ev3OrgNombre = s.nextLine();
//                                System.out.println("Escribe la descipción que tendrá el evento:");
//                                ev3OrgDescripcion = s.nextLine();
//                                System.out.println("Escribe las categorías que tendrá el evento:");
//                                ev3OrgCategoria = s.nextLine();
//                                System.out.println("Escribe la fecha que tendrá el evento:");
//                                ev3OrgFecha = s.nextLine();
//                                System.out.println("Escribe la hora en la que empezará:");
//                                ev3OrgHora = s.nextLine();
//                                System.out.println("Escribe el aforo máximo que tendrá el evento:");
//                                ev3OrgAforo = Integer.parseInt(s.nextLine());
//                                System.out.println("Escribe la descripción de la entrada premium");
//                                descripcionev3OrgEntradaPremium  =s.nextLine();
//                                System.out.println("Escribe la descripción de la entrada semipremium");
//                                descripcionev3OrgEntradaSemipremium  =s.nextLine();
//                                System.out.println("Escribe la descripción de la entrada normal");
//                                descripcionev3OrgEntradaNormal  =s.nextLine();
//                                System.out.println("Escribe el precio de la entrada premium");
//                                preciov3OrgEntradaPremium  =Integer.parseInt(s.nextLine());
//                                System.out.println("Escribe el precio de la entrada semipremium");
//                                preciov3OrgEntradaSemipremium  =Integer.parseInt(s.nextLine());
//                                System.out.println("Escribe el precio de la entrada normal");
//                                preciov3OrgEntradaNormal  =Integer.parseInt(s.nextLine());
//                                break;
//                        }
//
//
//                        switch (opcionCarteraDigitalAdmin) {
//                            case 0: break;
//                            case 1: dineroAdmin = anadirSaldoAdmin(dineroAdmin); opcionCarteraDigitalAdmin= 0;break;
//                            case 2: dineroAdmin = retirarSaldoAdmin(dineroAdmin);opcionCarteraDigitalAdmin= 0; break;
//                            case 3: break;
//                            default: System.out.println("Opción no válida.");
//                        }
//
//                        if (opcionPanelAdmin == 1) {
//                            cambiarEstadoUsuariosTexto();
//                            int opcion2 = Integer.parseInt(s.nextLine());
//                            if (opcion2==1)bloqueoUsers[1]=true;
//                            else if (opcion2==2)bloqueoUsers[1]=false;
//                            else System.out.println("COMANDO IRRECONOCIBLE");
//                        } else if (opcionPanelAdmin == 2){
//                            cambiarEstadoUsuariosTexto();
//                            int opcion2 = Integer.parseInt(s.nextLine());
//                            if (opcion2==1)bloqueoUsers[2]=true;
//                            else if (opcion2==2)bloqueoUsers[2]=false;
//                            else System.out.println("COMANDO IRRECONOCIBLE");
//                        } else if (opcionPanelAdmin == 3) {
//                            cambiarEstadoUsuariosTexto();
//                            int opcion2 = Integer.parseInt(s.nextLine());
//                            if (opcion2==1)bloqueoUsers[3]=true;
//                            else if (opcion2==2)bloqueoUsers[3]=false;
//                            else System.out.println("COMANDO IRRECONOCIBLE");
//                        } else if (opcionPanelAdmin==4){
//                        }
//                        else System.out.println("COMANDO IRRECONOCIBLE");
//
//                        if (opcionCambioAdmin == 1) {
//                            System.out.println("Escribe como quieres que se llame este usuario");
//                            nombreUsers[0] = s.nextLine();
//                        } else if (opcionCambioAdmin == 2) {
//                            System.out.println("Escribe la contraseña que desees");
//                            passwUsers[0] = s.nextLine();
//                        } else if (opcionCambioAdmin==0){
//                        } else System.out.println("IRRECONOCIBLE");
//                        System.out.println();
//
//                    } while (opcionMenuAdmin != 5);
//                    break;
//                case 2:
//                    //MENU ORGANIZADOR
//                    int opcionMenuOrg;
//                    int opcionCarteraDigitalOrg = 0;
//                    double dineroOrg = 50;
//                    do {
//
//                        int opcionCambioOrg = 0;
//                        int opcionPanelOrg = 0;
//                        opcionMenuOrg = menuPrincipalOrg();
//                        switch (opcionMenuOrg) {
//                            case 1:
//                                if (eventoOrg1){
//                                    System.out.print("1--" + ev1OrgNombre);
//                                    System.out.println(ev1OrgDescripcion);
//                                    System.out.println(ev1OrgCategoria);
//                                    System.out.println(ev1OrgFecha);
//                                    System.out.println(ev1OrgHora);
//                                    System.out.println(ev1OrgAforo + "/" + ev1OrgInscritos);
//                                    System.out.println();
//                                }
//                                if (eventoOrg2){
//                                System.out.print("2--" + ev2OrgNombre);
//                                System.out.println(ev2OrgDescripcion);
//                                System.out.println(ev2OrgCategoria);
//                                System.out.println(ev2OrgFecha);
//                                System.out.println(ev2OrgHora);
//                                System.out.println(ev2OrgAforo + "/" + ev2OrgInscritos);
//                                System.out.println();
//                            }
//                                if (eventoOrg3){
//                                System.out.print("3--" + ev3OrgNombre);
//                                System.out.println(ev3OrgDescripcion);
//                                System.out.println(ev3OrgCategoria);
//                                System.out.println(ev3OrgFecha);
//                                System.out.println(ev3OrgHora);
//                                System.out.println(ev3OrgAforo + "/" + ev3OrgInscritos);
//                                System.out.println();
//                            }else {
//                                    System.out.println("NO HAS CREADO NINGÚN EVENTO");
//                                }
//
//                                //ELECCIÓN DE BORRAR, EDITAR O CREAR EVENTOS
//                                int opcion = 0;
//                                System.out.println("¿Que quieres hacer?");
//                                System.out.println("1-- Crear eventos");
//                                System.out.println("2-- Borrar eventos");
//                                System.out.println("3-- Modificar eventos");
//                                opcion = Integer.parseInt(s.nextLine());
//
//                                switch (opcion){
//                                    case 1:
//                                        //APARTADO DE CREAR EVENTOS
//                                        if (!eventoOrg1){
//                                            eventoOrg1 = true;
//                                            contadorEventosCreados ++;
//                                            System.out.println("Escribe el nombre que tendrá el evento:");
//                                            ev1OrgNombre = s.nextLine();
//                                            System.out.println("Escribe la descipción que tendrá el evento:");
//                                            ev1OrgDescripcion = s.nextLine();
//                                            System.out.println("Escribe las categorías que tendrá el evento:");
//                                            ev1OrgCategoria = s.nextLine();
//                                            System.out.println("Escribe la fecha que tendrá el evento:");
//                                            ev1OrgFecha = s.nextLine();
//                                            System.out.println("Escribe la hora en la que empezará:");
//                                            ev1OrgHora = s.nextLine();
//                                            System.out.println("Escribe el aforo máximo que tendrá el evento:");
//                                            ev1OrgAforo = Integer.parseInt(s.nextLine());
//                                            System.out.println("Escribe la descripción de la entrada premium");
//                                            descripcionev1OrgEntradaPremium  =s.nextLine();
//                                            System.out.println("Escribe la descripción de la entrada semipremium");
//                                            descripcionev1OrgEntradaSemipremium  =s.nextLine();
//                                            System.out.println("Escribe la descripción de la entrada normal");
//                                            descripcionev1OrgEntradaNormal  =s.nextLine();
//                                            System.out.println("Escribe el precio de la entrada premium");
//                                            preciov1OrgEntradaPremium  =Integer.parseInt(s.nextLine());
//                                            System.out.println("Escribe el precio de la entrada semipremium");
//                                            preciov1OrgEntradaSemipremium  =Integer.parseInt(s.nextLine());
//                                            System.out.println("Escribe el precio de la entrada normal");
//                                            preciov1OrgEntradaNormal  =Integer.parseInt(s.nextLine());
//
//                                        }else if (!eventoOrg2){
//                                            eventoOrg2 = true;
//                                            contadorEventosCreados ++;
//                                            System.out.println("Escribe el nombre que tendrá el evento:");
//                                            ev2OrgNombre = s.nextLine();
//                                            System.out.println("Escribe la descipción que tendrá el evento:");
//                                            ev2OrgDescripcion = s.nextLine();
//                                            System.out.println("Escribe las categorías que tendrá el evento:");
//                                            ev2OrgCategoria = s.nextLine();
//                                            System.out.println("Escribe la fecha que tendrá el evento:");
//                                            ev2OrgFecha = s.nextLine();
//                                            System.out.println("Escribe la hora en la que empezará:");
//                                            ev2OrgHora = s.nextLine();
//                                            System.out.println("Escribe el aforo máximo que tendrá el evento:");
//                                            ev2OrgAforo = Integer.parseInt(s.nextLine());
//                                            System.out.println("Escribe la descripción de la entrada premium");
//                                            descripcionev2OrgEntradaPremium  =s.nextLine();
//                                            System.out.println("Escribe la descripción de la entrada semipremium");
//                                            descripcionev2OrgEntradaSemipremium  =s.nextLine();
//                                            System.out.println("Escribe la descripción de la entrada normal");
//                                            descripcionev2OrgEntradaNormal  =s.nextLine();
//                                            System.out.println("Escribe el precio de la entrada premium");
//                                            preciov2OrgEntradaPremium  =Integer.parseInt(s.nextLine());
//                                            System.out.println("Escribe el precio de la entrada semipremium");
//                                            preciov2OrgEntradaSemipremium  =Integer.parseInt(s.nextLine());
//                                            System.out.println("Escribe el precio de la entrada normal");
//                                            preciov2OrgEntradaNormal  =Integer.parseInt(s.nextLine());
//                                        }else if (!eventoOrg3){
//                                            eventoOrg3 = true;
//                                            contadorEventosCreados ++;
//                                            System.out.println("Escribe el nombre que tendrá el evento:");
//                                            ev3OrgNombre = s.nextLine();
//                                            System.out.println("Escribe la descipción que tendrá el evento:");
//                                            ev3OrgDescripcion = s.nextLine();
//                                            System.out.println("Escribe las categorías que tendrá el evento:");
//                                            ev3OrgCategoria = s.nextLine();
//                                            System.out.println("Escribe la fecha que tendrá el evento:");
//                                            ev3OrgFecha = s.nextLine();
//                                            System.out.println("Escribe la hora en la que empezará:");
//                                            ev3OrgHora = s.nextLine();
//                                            System.out.println("Escribe el aforo máximo que tendrá el evento:");
//                                            ev3OrgAforo = Integer.parseInt(s.nextLine());
//                                            System.out.println("Escribe la descripción de la entrada premium");
//                                            descripcionev3OrgEntradaPremium  =s.nextLine();
//                                            System.out.println("Escribe la descripción de la entrada semipremium");
//                                            descripcionev3OrgEntradaSemipremium  =s.nextLine();
//                                            System.out.println("Escribe la descripción de la entrada normal");
//                                            descripcionev3OrgEntradaNormal  =s.nextLine();
//                                            System.out.println("Escribe el precio de la entrada premium");
//                                            preciov3OrgEntradaPremium  =Integer.parseInt(s.nextLine());
//                                            System.out.println("Escribe el precio de la entrada semipremium");
//                                            preciov3OrgEntradaSemipremium  =Integer.parseInt(s.nextLine());
//                                            System.out.println("Escribe el precio de la entrada normal");
//                                            preciov3OrgEntradaNormal  =Integer.parseInt(s.nextLine());}
//                                        break;
//                                        case 2:
//                                            int opcionBorrar = 0;
//                                            System.out.println("Teclea el número del evento que quieras borrar");
//                                            opcionBorrar = Integer.parseInt(s.nextLine());
//                                            if (opcionBorrar==1 && eventoOrg1){
//                                                eventoOrg1 = false;
//                                                contadorEventosCreados--;
//                                                System.out.println("Evento borrado");
//                                            } else if (opcionBorrar==2 && eventoOrg2) {
//                                                contadorEventosCreados--;
//                                                eventoOrg2 = false;
//                                                System.out.println("Evento borrado");
//
//                                            } else if (opcionBorrar==3 && eventoOrg3) {
//                                                eventoOrg3 = false;
//                                                contadorEventosCreados--;
//                                                System.out.println("Evento borrado");
//                                            }else {
//                                                System.out.println("No se puede borrar o comando desconocido");
//                                            }
//                                            break;
//                                        case 3:
//                                            System.out.println("Escribe el número del evento que vas a modificar");
//                                            //MENU EDITAR EVENTOS
//                                        int opcionEditarEvento = Integer.parseInt(s.nextLine());
//                                        switch (opcionEditarEvento){
//                                            case 1:
//                                                if(eventoOrg1){
//                                                    System.out.println("Escribe el nombre que tendrá el evento:");
//                                                    ev1OrgNombre = s.nextLine();
//                                                    System.out.println("Escribe la descipción que tendrá el evento:");
//                                                    ev1OrgDescripcion = s.nextLine();
//                                                    System.out.println("Escribe las categorías que tendrá el evento:");
//                                                    ev1OrgCategoria = s.nextLine();
//                                                    System.out.println("Escribe la fecha que tendrá el evento:");
//                                                    ev1OrgFecha = s.nextLine();
//                                                    System.out.println("Escribe la hora en la que empezará:");
//                                                    ev1OrgHora = s.nextLine();
//                                                    System.out.println("Escribe el aforo máximo que tendrá el evento:");
//                                                    ev1OrgAforo = Integer.parseInt(s.nextLine());
//                                                    System.out.println("Escribe la descripción de la entrada premium");
//                                                    descripcionev1OrgEntradaPremium  =s.nextLine();
//                                                    System.out.println("Escribe la descripción de la entrada semipremium");
//                                                    descripcionev1OrgEntradaSemipremium  =s.nextLine();
//                                                    System.out.println("Escribe la descripción de la entrada normal");
//                                                    descripcionev1OrgEntradaNormal  =s.nextLine();
//                                                    System.out.println("Escribe el precio de la entrada premium");
//                                                    preciov1OrgEntradaPremium  =Integer.parseInt(s.nextLine());
//                                                    System.out.println("Escribe el precio de la entrada semipremium");
//                                                    preciov1OrgEntradaSemipremium  =Integer.parseInt(s.nextLine());
//                                                    System.out.println("Escribe el precio de la entrada normal");
//                                                    preciov1OrgEntradaNormal  =Integer.parseInt(s.nextLine());
//                                                }else System.out.println("El evento no existe");
//                                                break;
//                                            case 2:
//                                             if(eventoOrg2){
//                                                 System.out.println("Escribe el nombre que tendrá el evento:");
//                                                 ev2OrgNombre = s.nextLine();
//                                                 System.out.println("Escribe la descipción que tendrá el evento:");
//                                                 ev2OrgDescripcion = s.nextLine();
//                                                 System.out.println("Escribe las categorías que tendrá el evento:");
//                                                 ev2OrgCategoria = s.nextLine();
//                                                 System.out.println("Escribe la fecha que tendrá el evento:");
//                                                 ev2OrgFecha = s.nextLine();
//                                                 System.out.println("Escribe la hora en la que empezará:");
//                                                 ev2OrgHora = s.nextLine();
//                                                 System.out.println("Escribe el aforo máximo que tendrá el evento:");
//                                                 ev2OrgAforo = Integer.parseInt(s.nextLine());
//                                                 System.out.println("Escribe la descripción de la entrada premium");
//                                                 descripcionev2OrgEntradaPremium  =s.nextLine();
//                                                 System.out.println("Escribe la descripción de la entrada semipremium");
//                                                 descripcionev2OrgEntradaSemipremium  =s.nextLine();
//                                                 System.out.println("Escribe la descripción de la entrada normal");
//                                                 descripcionev2OrgEntradaNormal  =s.nextLine();
//                                                 System.out.println("Escribe el precio de la entrada premium");
//                                                 preciov2OrgEntradaPremium  =Integer.parseInt(s.nextLine());
//                                                 System.out.println("Escribe el precio de la entrada semipremium");
//                                                 preciov2OrgEntradaSemipremium  =Integer.parseInt(s.nextLine());
//                                                 System.out.println("Escribe el precio de la entrada normal");
//                                                 preciov2OrgEntradaNormal  =Integer.parseInt(s.nextLine());
//                                             }else System.out.println("El evento no existe");
//                                             break;
//                                            case 3:
//                                                if (eventoOrg3){
//                                                    System.out.println("Escribe el nombre que tendrá el evento:");
//                                                    ev3OrgNombre = s.nextLine();
//                                                    System.out.println("Escribe la descipción que tendrá el evento:");
//                                                    ev3OrgDescripcion = s.nextLine();
//                                                    System.out.println("Escribe las categorías que tendrá el evento:");
//                                                    ev3OrgCategoria = s.nextLine();
//                                                    System.out.println("Escribe la fecha que tendrá el evento:");
//                                                    ev3OrgFecha = s.nextLine();
//                                                    System.out.println("Escribe la hora en la que empezará:");
//                                                    ev3OrgHora = s.nextLine();
//                                                    System.out.println("Escribe el aforo máximo que tendrá el evento:");
//                                                    ev3OrgAforo = Integer.parseInt(s.nextLine());
//                                                    System.out.println("Escribe la descripción de la entrada premium");
//                                                    descripcionev3OrgEntradaPremium  =s.nextLine();
//                                                    System.out.println("Escribe la descripción de la entrada semipremium");
//                                                    descripcionev3OrgEntradaSemipremium  =s.nextLine();
//                                                    System.out.println("Escribe la descripción de la entrada normal");
//                                                    descripcionev3OrgEntradaNormal  =s.nextLine();
//                                                    System.out.println("Escribe el precio de la entrada premium");
//                                                    preciov3OrgEntradaPremium  =Integer.parseInt(s.nextLine());
//                                                    System.out.println("Escribe el precio de la entrada semipremium");
//                                                    preciov3OrgEntradaSemipremium  =Integer.parseInt(s.nextLine());
//                                                    System.out.println("Escribe el precio de la entrada normal");
//                                                    preciov3OrgEntradaNormal  =Integer.parseInt(s.nextLine());
//                                            }else System.out.println("El evento no existe");
//                                                break;
//                                            default:
//                                                System.out.println("IRRECONOCIBLE");
//                                        }
//                                    default:
//                                }   System.out.println("IRRECONOCIBLE");
//                                break;
//                            case 2:
//                                opcionCarteraDigitalOrg = menuCarteraDigitalOrg(dineroOrg);
//                                break;
//                            case 3:
//                                opcionCambioOrg = configuracionOrg();
//                                break;
//                            case 4:
//                                System.out.println("Cerrando sesión...");
//                                break;
//                            default:
//                                System.out.println("Opción no válida.");
//                        }
//
//                        switch (opcionCarteraDigitalOrg) {
//                            case 0: break;
//                            case 1: dineroOrg = anadirSaldoOrg(dineroOrg);opcionCarteraDigitalOrg= 0; break;
//                            case 2: dineroOrg = retirarSaldoOrg(dineroOrg);opcionCarteraDigitalOrg= 0; break;
//                            case 3: break;
//                            default: System.out.println("Opción no válida.");
//                        }
//
//                        if (opcionPanelOrg == 1) {
//                            cambiarEstadoUsuariosTexto();
//                            int opcion2 = s.nextInt();
//                            if (opcion2 == 1) {
//                                bloqueoUsers[1] = true;
//                            }
//                            if (opcion2 == 2) {
//                                bloqueoUsers[1] = false;
//                            }
//                        }
//
//                        if (opcionCambioOrg == 1) {
//                            System.out.println("Escribe como quieres que se llame este usuario");
//                            nombreUsers[1] = s.nextLine();
//                        } else if (opcionCambioOrg == 2) {
//                            System.out.println("Escribe la contraseña que desees");
//                            passwUsers[1] = s.nextLine();
//                        } else if (opcionCambioOrg==0){
//                        } else System.out.println("IRRECONOCIBLE");
//
//                        System.out.println();
//                    } while (opcionMenuOrg != 4);
//                    break;
//
//
//                case 3: //MENU USUARIO1
//                    int opcionMenuUser1;
//                    int opcionMostrarMisEventosUser1 = 0;
//                    int opcionCarteraDigitalUser1 = 0;
//
//                    int opcionUnirseAEventoUser1 = 0;
//
//                    do {
//                        int opcionCambioUser1 = 0;
//                        int opcionVerDatosEventoUser1 = 0;
//
//                        opcionMenuUser1 = menuPrincipalUser1();
//                        switch (opcionMenuUser1) {
//
//                            case 1: opcionMostrarMisEventosUser1 = mostrarMisEventosUser1(evUser1,evNombre); break;
//                            case 2: opcionVerDatosEventoUser1 = menuEventosUser1(contadorEventosCreados,evNombre,evUser1); break;
//                            case 3: opcionCarteraDigitalUser1 = menuCarteraDigitalUser1(dineroUser1); break;
//                            case 4: menuInvitarAmigoUser1(); break;
//
//                            case 5: opcionCambioUser1 = configuracionUser1(); break;
//                            case 6: System.out.println("Cerrando sesión..."); break;
//                            default: System.out.println("Opción no válida.");
//                        }
//
//                        switch (opcionCarteraDigitalUser1) {
//                            case 0: break;
//                            case 1: dineroUser1 = anadirSaldoUser1(dineroUser1);opcionCarteraDigitalUser1 = 0; break;
//                            case 2: dineroUser1 = retirarSaldoUser1(dineroUser1);opcionCarteraDigitalUser1 = 0; break;
//                            case 3: break;
//                            default: System.out.println("Opción no válida..");
//                        }
//
//                        //MOSTRAR DATOS DE LOS EVENTOS AÑADIDOS POR USUARIO1
//                        switch (opcionMostrarMisEventosUser1){
//                            case 1:
//                                if (evUser1[0]){
//                                    mostrarDatosEvento(evNombre[0], evDescripcion[0], evCategoria[0], evFecha[0], evHora[0], ev1Aforo, ev1Inscritos);
//                                }
//                                break;
//                            case 2:
//                                if (evUser1[1]) {
//                                    mostrarDatosEvento(evNombre[1], evDescripcion[1], evCategoria[1], evFecha[1], evHora[1], ev2Aforo, ev2Inscritos);
//                                }
//                                break;
//                            case 3:
//                                if (evUser1[2]) {
//                                    mostrarDatosEvento(evNombre[2], evDescripcion[2], evCategoria[2], evFecha[2], evHora[2], ev3Aforo, ev3Inscritos);
//                                }
//                                break;
//                            case 4:
//                                if (evUser1[3]) {
//                                    mostrarDatosEvento(evNombre[3], evDescripcion[3], evCategoria[3], evFecha[3], evHora[3], ev4Aforo, ev4Inscritos);
//                                }
//                                break;
//                            case 5:
//                                if (evUser1[4]) {
//                                    mostrarDatosEvento(evNombre[4], evDescripcion[4], evCategoria[4], evFecha[4], evHora[4], ev5Aforo, ev5Inscritos);
//                                }
//                                break;
//                            case 6:
//                                if (evUser1[5]) {
//                                    mostrarDatosEvento(evNombre[5], evDescripcion[5], evCategoria[5], evFecha[5], evHora[5], ev6Aforo, ev6Inscritos);
//                                }
//                                break;
//                            case 7:
//                                if (evUser1[6]) {
//                                    mostrarDatosEvento(evNombre[6], evDescripcion[6], evCategoria[6], evFecha[6], evHora[6], ev1Aforo, ev1Inscritos);
//                                }
//                                break;
//                            case 8:
//                                if (evUser1[7]) {
//                                    mostrarDatosEvento(evNombre[7], evDescripcion[7], evCategoria[7], evFecha[7], evHora[7], ev8Aforo, ev8Inscritos);
//                                }
//                                break;
//                            case 9:
//                                if (eventoOrg1){
//                                    mostrarDatosEvento(ev1OrgNombre, ev1OrgDescripcion, ev1OrgCategoria, ev1OrgFecha, ev1OrgHora, ev1OrgAforo, ev1OrgInscritos);
//                                }
//                                break;
//                            case 10:
//                                if (eventoOrg2){
//                                    mostrarDatosEvento(ev2OrgNombre, ev2OrgDescripcion, ev2OrgCategoria, ev2OrgFecha, ev2OrgHora, ev2OrgAforo, ev2OrgInscritos);
//                                }
//                                break;
//                            case 11:
//                                if (eventoOrg3){
//                                    mostrarDatosEvento(ev3OrgNombre, ev3OrgDescripcion, ev3OrgCategoria, ev3OrgFecha, ev3OrgHora, ev3OrgAforo, ev3OrgInscritos);
//                                }
//                                break;
//                        }
//
//
//                        //MOSTRAR DATOS DE EVENTOS USUARIO1
//                        switch (opcionVerDatosEventoUser1) {
//                            case 1: {
//                                mostrarDatosEvento(evNombre[0], evDescripcion[0], evCategoria[0], evFecha[0], evHora[0], ev1Aforo, ev1Inscritos);
//                                opcionUnirseAEventoUser1 = unirseAEvento1User1(ev1EntradasPremium,ev1EntradasPremiumComprada,ev1EntradasSemipremium,ev1EntradasSemipremiumComprada,ev1EntradasNormal,ev1EntradasNormalComprada);
//                                switch (opcionUnirseAEventoUser1){
//                                    case 1:
//                                        if (!evUser1[0]){
//                                            evUser1[0] = true;
//                                            System.out.println("Has comprado la entrada premium.");
//                                            dineroUser1 = dineroUser1-15;
//                                            dinero = dinero + (15-((15*10)/100));
//                                            dineroAdmin = dineroAdmin + (((15*10)/100));
//                                            ev1Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 2:
//                                        if (!evUser1[0]){
//                                            evUser1[0] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser1 = dineroUser1-10;
//                                            dinero = dinero + (10-((10*10)/100));
//                                            dineroAdmin = dineroAdmin + (((10*10)/100));
//                                            ev1Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 3:
//                                        if (!evUser1[0]){
//                                            evUser1[0] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser1 = dineroUser1-7;
//                                            dinero = dinero + (7-((7*10)/100));
//                                            dineroAdmin = dineroAdmin + (((7*10)/100));
//                                            ev1Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    default:
//                                }
//
//
//                            }
//                            break;
//
//                            case 2: {
//                                mostrarDatosEvento(evNombre[1], evDescripcion[1], evCategoria[1], evFecha[1], evHora[1], ev2Aforo, ev2Inscritos);
//                                opcionUnirseAEventoUser1 = unirseAEvento2User1(ev2EntradasPremium,ev2EntradasPremiumComprada,ev2EntradasSemipremium,ev2EntradasSemipremiumComprada,ev2EntradasNormal,ev2EntradasNormalComprada);
//                                switch (opcionUnirseAEventoUser1){
//                                    case 1:
//                                        if (!evUser1[1]){
//                                            evUser1[1] = true;
//                                            System.out.println("Has comprado la entrada premium.");
//                                            dineroUser1 = dineroUser1-15;
//                                            dinero = dinero + (15-((15*10)/100));
//                                            dineroAdmin = dineroAdmin + (((15*10)/100));
//
//                                            ev2Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 2:
//                                        if (!evUser1[1]){
//                                            evUser1[1] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser1 = dineroUser1-10;
//                                            dinero = dinero + (10-((10*10)/100));
//                                            dineroAdmin = dineroAdmin + (((10*10)/100));
//                                            ev1Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 3:
//                                        if (!evUser1[1]){
//                                            evUser1[1] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser1 = dineroUser1-7;
//                                            dinero = dinero + (7-((7*10)/100));
//                                            dineroAdmin = dineroAdmin + (((7*10)/100));
//                                            ev1Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    default:
//                                }
//
//                            }
//                            break;
//                            case 3:{
//                                mostrarDatosEvento(evNombre[2], evDescripcion[2], evCategoria[2], evFecha[2], evHora[2], ev3Aforo, ev3Inscritos);
//                                opcionUnirseAEventoUser1 = unirseAEvento3User1(ev3EntradasPremium,ev3EntradasPremiumComprada,ev3EntradasSemipremium,ev3EntradasSemipremiumComprada,ev3EntradasNormal,ev3EntradasNormalComprada);
//                                switch (opcionUnirseAEventoUser1){
//                                    case 1:
//                                        if (!evUser1[2]){
//                                            evUser1[2] = true;
//                                            System.out.println("Has comprado la entrada premium.");
//                                            dineroUser1 = dineroUser1-15;
//                                            dinero = dinero + (15-((15*10)/100));
//                                            dineroAdmin = dineroAdmin + (((15*10)/100));
//                                            ev3Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 2:
//                                        if (!evUser1[2]){
//                                            evUser1[2] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser1 = dineroUser1-10;
//                                            dinero = dinero + (10-((10*10)/100));
//                                            dineroAdmin = dineroAdmin + (((10*10)/100));
//                                            ev3Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 3:
//                                        if (!evUser1[2]){
//                                            evUser1[2] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser1 = dineroUser1-7;
//                                            dinero = dinero + (7-((7*10)/100));
//                                            dineroAdmin = dineroAdmin + (((7*10)/100));
//                                            ev1Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    default:
//                                }
//                            }
//                                break;
//                            case 4:{
//                                mostrarDatosEvento(evNombre[3], evDescripcion[3], evCategoria[3], evFecha[3], evHora[3], ev4Aforo, ev4Inscritos);
//                                opcionUnirseAEventoUser1 = unirseAEvento4User1(ev4EntradasPremium,ev4EntradasPremiumComprada,ev4EntradasSemipremium,ev4EntradasSemipremiumComprada,ev4EntradasNormal,ev4EntradasNormalComprada);
//                                switch (opcionUnirseAEventoUser1){
//                                    case 1:
//                                        if (!evUser1[3]){
//                                            evUser1[3] = true;
//                                            System.out.println("Has comprado la entrada premium.");
//                                            dineroUser1 = dineroUser1-280;
//                                            dinero = dinero + (280-((280*10)/100));
//                                            dineroAdmin = dineroAdmin + (((280*10)/100));
//                                            ev4Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 2:
//                                        if (!evUser1[3]){
//                                            evUser1[3] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser1 = dineroUser1-170;
//                                            dinero = dinero + (170-((170*10)/100));
//                                            dineroAdmin = dineroAdmin + (((170*10)/100));
//                                            ev4Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 3:
//                                        if (!evUser1[3]){
//                                            evUser1[3] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser1 = dineroUser1-150;
//                                            dinero = dinero + (150-((150*10)/100));
//                                            dineroAdmin = dineroAdmin + (((150*10)/100));
//                                            ev4Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    default:
//                                }
//
//                            }
//                                break;
//                            case 5:{
//                                mostrarDatosEvento(evNombre[4], evDescripcion[4], evCategoria[4], evFecha[4], evHora[4], ev5Aforo, ev5Inscritos);
//                                opcionUnirseAEventoUser1 = unirseAEvento5User1(ev5EntradasPremium,ev5EntradasPremiumComprada,ev5EntradasSemipremium,ev5EntradasSemipremiumComprada,ev5EntradasNormal,ev5EntradasNormalComprada);
//                                switch (opcionUnirseAEventoUser1){
//                                    case 1:
//                                        if (!evUser1[4]){
//                                            evUser1[4] = true;
//                                            System.out.println("Has comprado la entrada premium.");
//                                            dineroUser1 = dineroUser1-15;
//                                            dinero = dinero + (15-((15*10)/100));
//                                            dineroAdmin = dineroAdmin + (((15*10)/100));
//                                            ev5Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 2:
//                                        if (!evUser1[4]){
//                                            evUser1[4] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser1 = dineroUser1-10;
//                                            dinero = dinero + (10-((10*10)/100));
//                                            dineroAdmin = dineroAdmin + (((10*10)/100));
//                                            ev5Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 3:
//                                        if (!evUser1[4]){
//                                            evUser1[4] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser1 = dineroUser1-7;
//                                            dinero = dinero + (7-((7*10)/100));
//                                            dineroAdmin = dineroAdmin + (((7*10)/100));
//                                            ev5Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    default:
//                                }
//                            }
//                                break;
//                            case 6:{
//                                mostrarDatosEvento(evNombre[5],evDescripcion[5], evCategoria[5], evFecha[5], evHora[5], ev6Aforo, ev6Inscritos);
//                                opcionUnirseAEventoUser1 = unirseAEvento6User1(ev6EntradasNormal,ev6EntradasNormalComprada);
//                                switch (opcionUnirseAEventoUser1){
//                                    case 1:
//                                        if (!evUser1[5]){
//                                            evUser1[5] = true;
//                                            System.out.println("Has comprado la entrada normal.");
//                                            ev5Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    default:
//                                        System.out.println("IRRECONOCIBLE");
//                                }
//                            }
//                                break;
//                            case 7:{
//                                mostrarDatosEvento(evNombre[6], evDescripcion[6], evCategoria[6], evFecha[6], evHora[6], ev7Aforo, ev7Inscritos);
//                                opcionUnirseAEventoUser1 = unirseAEvento7User1(ev7EntradasPremium,ev7EntradasPremiumComprada,ev7EntradasSemipremium,ev7EntradasSemipremiumComprada,ev7EntradasNormal,ev7EntradasNormalComprada);
//                                switch (opcionUnirseAEventoUser1){
//                                    case 1:
//                                        if (!evUser1[6]){
//                                            evUser1[6] = true;
//                                            System.out.println("Has comprado la entrada premium.");
//                                            dineroUser1 = dineroUser1-15;
//                                            dinero = dinero + (15-((15*10)/100));
//                                            dineroAdmin = dineroAdmin + (((15*10)/100));
//                                            ev7Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 2:
//                                        if (!evUser1[6]){
//                                            evUser1[6] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser1 = dineroUser1-10;
//                                            dinero = dinero + (10-((10*10)/100));
//                                            dineroAdmin = dineroAdmin + (((10*10)/100));
//                                            ev7Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 3:
//                                        if (!evUser1[6]){
//                                            evUser1[6] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser1 = dineroUser1-7;
//                                            dinero = dinero + (7-((7*10)/100));
//                                            dineroAdmin = dineroAdmin + (((7*10)/100));
//                                            ev7Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    default:
//                                }
//
//                            }
//                                break;
//                            case 8:{
//                                mostrarDatosEvento(evNombre[7],evDescripcion[7], evCategoria[7], evFecha[7], evHora[7], ev8Aforo, ev8Inscritos);
//                                opcionUnirseAEventoUser1 = unirseAEvento8User1(ev8EntradasPremium,ev8EntradasPremiumComprada,ev8EntradasSemipremium,ev8EntradasSemipremiumComprada,ev8EntradasNormal,ev8EntradasNormalComprada);
//                                switch (opcionUnirseAEventoUser1){
//                                    case 1:
//                                        if (!evUser1[7]){
//                                            evUser1[7] = true;
//                                            System.out.println("Has comprado la entrada premium.");
//                                            dineroUser1 = dineroUser1-15;
//                                            dinero = dinero + (15-((15*10)/100));
//                                            dineroAdmin = dineroAdmin + (((15*10)/100));
//                                            ev8Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 2:
//                                        if (!evUser1[7]){
//                                            evUser1[7] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser1 = dineroUser1-10;
//                                            dinero = dinero + (10-((10*10)/100));
//                                            dineroAdmin = dineroAdmin + (((10*10)/100));
//                                            ev8Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 3:
//                                        if (!evUser1[7]){
//                                            evUser1[7] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser1 = dineroUser1-7;
//                                            dinero = dinero + (7-((7*10)/100));
//                                            dineroAdmin = dineroAdmin + (((7*10)/100));
//                                            ev8Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    default:
//                                }
//                            }
//                                break;
//                            case 9:
//                                if (eventoOrg1){
//                                    mostrarDatosEvento(ev1OrgNombre, ev1OrgDescripcion, ev1OrgCategoria, ev1OrgFecha, ev1OrgHora, ev1OrgAforo, ev1OrgInscritos);
//                                    opcionUnirseAEventoUser1 = unirseAEventosOrgUser1(descripcionev1OrgEntradaPremium,descripcionev1OrgEntradaSemipremium,descripcionev1OrgEntradaNormal,preciov1OrgEntradaPremium,preciov1OrgEntradaSemipremium,preciov1OrgEntradaNormal,ev1OrgEntradasPremium,ev1OrgEntradasPremiumComprada,ev1OrgEntradasSemipremium,ev1OrgEntradasSemipremiumComprada,ev1OrgEntradasNormal,ev1OrgEntradasNormalComprada);
//                                    switch (opcionUnirseAEventoUser1){
//                                        case 1:
//                                            if (!evUser1[8]){
//                                                evUser1[8] = true;
//                                                System.out.println("Has comprado la entrada premium.");
//                                                dineroUser1 = dineroUser1-preciov1OrgEntradaPremium;
//                                                dinero = dinero + (preciov1OrgEntradaPremium-((preciov1OrgEntradaPremium*10)/100));
//                                                dineroAdmin = dineroAdmin + (((preciov1OrgEntradaPremium*10)/100));
//                                                ev1OrgInscritos++;
//                                            }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                            break;
//                                        case 2:
//                                            if (!evUser1[8]){
//                                                evUser1[8] = true;
//                                                System.out.println("Has comprado la entrada semipremium.");
//                                                dineroUser1 = dineroUser1-preciov1OrgEntradaSemipremium;
//                                                dinero = dinero + (preciov1OrgEntradaSemipremium-((preciov1OrgEntradaSemipremium*10)/100));
//                                                dineroAdmin = dineroAdmin + (((preciov1OrgEntradaSemipremium*10)/100));
//                                                ev1OrgInscritos++;
//                                            }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                            break;
//                                        case 3:
//                                            if (!evUser1[8]){
//                                                evUser1[8] = true;
//                                                System.out.println("Has comprado la entrada semipremium.");
//                                                dineroUser1 = dineroUser1-preciov1OrgEntradaNormal;
//                                                dinero = dinero + (preciov1OrgEntradaNormal-((preciov1OrgEntradaNormal*10)/100));
//                                                dineroAdmin = dineroAdmin + (((preciov1OrgEntradaNormal*10)/100));
//                                                ev1OrgInscritos++;
//                                            }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                            break;
//                                        default:
//                                    }
//                                }
//                                break;
//                            case 10:
//                                if (eventoOrg2){
//                                    mostrarDatosEvento(ev2OrgNombre, ev2OrgDescripcion, ev2OrgCategoria, ev2OrgFecha, ev2OrgHora, ev2OrgAforo, ev2OrgInscritos);
//                                    opcionUnirseAEventoUser1 = unirseAEventosOrgUser1(descripcionev2OrgEntradaPremium,descripcionev2OrgEntradaSemipremium,descripcionev2OrgEntradaNormal,preciov2OrgEntradaPremium,preciov2OrgEntradaSemipremium,preciov2OrgEntradaNormal,ev2OrgEntradasPremium,ev2OrgEntradasPremiumComprada,ev2OrgEntradasSemipremium,ev2OrgEntradasSemipremiumComprada,ev2OrgEntradasNormal,ev2OrgEntradasNormalComprada);
//                                    switch (opcionUnirseAEventoUser1){
//                                        case 1:
//                                            if (!evUser1[9]){
//                                                evUser1[9] = true;
//                                                System.out.println("Has comprado la entrada premium.");
//                                                dineroUser1 = dineroUser1-preciov2OrgEntradaPremium;
//                                                dinero = dinero + (preciov2OrgEntradaPremium-((preciov2OrgEntradaPremium*10)/100));
//                                                dineroAdmin = dineroAdmin + (((preciov2OrgEntradaPremium*10)/100));
//                                                ev2OrgInscritos++;
//                                            }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                            break;
//                                        case 2:
//                                            if (!evUser1[9]){
//                                                evUser1[9] = true;
//                                                System.out.println("Has comprado la entrada semipremium.");
//                                                dineroUser1 = dineroUser1-preciov2OrgEntradaSemipremium;
//                                                dinero = dinero + (preciov2OrgEntradaSemipremium-((preciov2OrgEntradaSemipremium*10)/100));
//                                                dineroAdmin = dineroAdmin + (((preciov2OrgEntradaSemipremium*10)/100));
//                                                ev2OrgInscritos++;
//                                            }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                            break;
//                                        case 3:
//                                            if (!evUser1[9]){
//                                                evUser1[9] = true;
//                                                System.out.println("Has comprado la entrada semipremium.");
//                                                dineroUser1 = dineroUser1-preciov2OrgEntradaNormal;
//                                                dinero = dinero + (preciov2OrgEntradaNormal-((preciov2OrgEntradaNormal*10)/100));
//                                                dineroAdmin = dineroAdmin + (((preciov2OrgEntradaNormal*10)/100));
//                                                ev2OrgInscritos++;
//                                            }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                            break;
//                                        default:
//                                    }
//                                }
//                                break;
//                            case 11:
//                                if (eventoOrg3){
//                                    mostrarDatosEvento(ev3OrgNombre, ev3OrgDescripcion, ev3OrgCategoria, ev3OrgFecha, ev3OrgHora, ev3OrgAforo, ev3OrgInscritos);
//                                    opcionUnirseAEventoUser1 = unirseAEventosOrgUser1(descripcionev3OrgEntradaPremium,descripcionev3OrgEntradaSemipremium,descripcionev3OrgEntradaNormal,preciov3OrgEntradaPremium,preciov3OrgEntradaSemipremium,preciov3OrgEntradaNormal,ev3OrgEntradasPremium,ev3OrgEntradasPremiumComprada,ev3OrgEntradasSemipremium,ev3OrgEntradasSemipremiumComprada,ev3OrgEntradasNormal,ev3OrgEntradasNormalComprada);
//                                    switch (opcionUnirseAEventoUser1){
//                                        case 1:
//                                            if (!evUser1[10]){
//                                                evUser1[10] = true;
//                                                System.out.println("Has comprado la entrada premium.");
//                                                dineroUser1 = dineroUser1-preciov3OrgEntradaPremium;
//                                                dinero = dinero + (preciov3OrgEntradaPremium-((preciov3OrgEntradaPremium*10)/100));
//                                                dineroAdmin = dineroAdmin + (((preciov3OrgEntradaPremium*10)/100));
//                                                ev2OrgInscritos++;
//                                            }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                            break;
//                                        case 2:
//                                            if (!evUser1[10]){
//                                                evUser1[10] = true;
//                                                System.out.println("Has comprado la entrada semipremium.");
//                                                dineroUser1 = dineroUser1-preciov3OrgEntradaSemipremium;
//                                                dinero = dinero + (preciov3OrgEntradaSemipremium-((preciov3OrgEntradaSemipremium*10)/100));
//                                                dineroAdmin = dineroAdmin + (((preciov3OrgEntradaSemipremium*10)/100));
//                                                ev2OrgInscritos++;
//                                            }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                            break;
//                                        case 3:
//                                            if (!evUser1[10]){
//                                                evUser1[10] = true;
//                                                System.out.println("Has comprado la entrada semipremium.");
//                                                dineroUser1 = dineroUser1-preciov3OrgEntradaNormal;
//                                                dinero = dinero + (preciov3OrgEntradaNormal-((preciov3OrgEntradaNormal*10)/100));
//                                                dineroAdmin = dineroAdmin + (((preciov3OrgEntradaNormal*10)/100));
//                                                ev2OrgInscritos++;
//                                            }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                            break;
//                                        default:
//                                    }
//                                }
//                                break;
//                            default:
//                                if (opcionVerDatosEventoUser1== contadorEventosCreados+1);
//                                break;
//                        }
//
//
//                        if (opcionCambioUser1==1){
//                            System.out.println("Escribe como quieres que se llame este usuario");
//                            nombreUsers[2] = s.nextLine();
//                        } else if (opcionCambioUser1==2) {
//                            System.out.println("Escribe la contraseña que desees");
//                            passwUsers[2] = s.nextLine();
//                        } else if (opcionCambioUser1==0){
//                        }else System.out.println("IRRECONOCIBLE");
//
//
//                        System.out.println();
//                    } while (opcionMenuUser1 != 6);
//                    break;
//
//                case 4:
//
//                    //MENU USUARIO2
//                    int opcionMostrarMisEventosUser2 = 0;
//                    int opcionUnirseAEventoUser2 = 0;
//                    int opcionMenuUser2 = 0;
//                    int opcionCarteraDigitalUser2 =0;
//
//                    do {
//                        int opcionCambioUser2 = 0;
//                        int opcionVerDatosEventoUser2 = 0;
//
//                        opcionMenuUser2 = menuPrincipalUser2();
//                        switch (opcionMenuUser2) {
//                            case 1: opcionMostrarMisEventosUser2 = mostrarMisEventosUser2(evUser1,evNombre);break;
//                            case 2: opcionVerDatosEventoUser2 = menuEventosUser2(contadorEventosCreados,evUser1,evNombre); break;
//                            case 3: opcionCarteraDigitalUser2 = menuCarteraDigitalUser2(dineroUser2); break;
//                            case 4: menuInvitarAmigoUser2(); break;
//                            case 5: opcionCambioUser2 = configuracionUser2(); break;
//                            case 6: System.out.println("Cerrando sesión..."); break;
//                            default: System.out.println("Opción no válida.");
//                        }
//
//                        switch (opcionCarteraDigitalUser2) {
//                            case 0: break;
//                            case 1: dineroUser2 = anadirSaldoUser2(dineroUser2); opcionCarteraDigitalUser2 = 0;break;
//                            case 2: dineroUser2 = retirarSaldoUser2(dineroUser2);opcionCarteraDigitalUser2 = 0;break;
//                            case 3: break;
//                            default: System.out.println("Opción no válida.");
//                        }
//
//                        //MOSTRAR DATOS DE LOS EVENTOS AÑADIDOS POR USUARIO2
//                        switch (opcionMostrarMisEventosUser2){
//                            case 1:
//                                if (evUser2[0]){
//                                    mostrarDatosEvento(evNombre[0], evDescripcion[0], evCategoria[0], evFecha[0], evFecha[0], ev1Aforo, ev1Inscritos);
//                                }
//                                break;
//                            case 2:
//                                if (evUser2[1]) {
//                                    mostrarDatosEvento(evNombre[1], evDescripcion[1], evCategoria[1], evFecha[1], evFecha[1], ev2Aforo, ev2Inscritos);
//                                }
//                                break;
//                            case 3:
//                                if (evUser2[2]) {
//                                    mostrarDatosEvento(evNombre[2],  evDescripcion[2], evCategoria[2], evFecha[2], evFecha[2], ev3Aforo, ev3Inscritos);
//                                }
//                                break;
//                            case 4:
//                                if (evUser2[3]) {
//                                    mostrarDatosEvento(evNombre[3],  evDescripcion[3], evCategoria[3], evFecha[3], evFecha[3], ev4Aforo, ev4Inscritos);
//                                }
//                                break;
//                            case 5:
//                                if (evUser2[4]) {
//                                    mostrarDatosEvento(evNombre[4],  evDescripcion[4], evCategoria[4], evFecha[4], evFecha[4], ev5Aforo, ev5Inscritos);
//                                }
//                                break;
//                            case 6:
//                                if (evUser2[5]) {
//                                    mostrarDatosEvento(evNombre[5], evDescripcion[5], evCategoria[5], evFecha[5], evFecha[5], ev6Aforo, ev6Inscritos);
//                                }
//                                break;
//                            case 7:
//                                if (evUser2[6]) {
//                                    mostrarDatosEvento(evNombre[6],  evDescripcion[6], evCategoria[6], evFecha[6], evFecha[6], ev1Aforo, ev1Inscritos);
//                                }
//                                break;
//                            case 8:
//                                if (evUser2[7]) {
//                                    mostrarDatosEvento(evNombre[7],  evDescripcion[7], evCategoria[7], evFecha[7], evFecha[7], ev8Aforo, ev8Inscritos);
//                                }
//                                break;
//                            case 9:
//                                if (eventoOrg1){
//                                    mostrarDatosEvento(ev1OrgNombre, ev1OrgDescripcion, ev1OrgCategoria, ev1OrgFecha, ev1OrgHora, ev1OrgAforo, ev1OrgInscritos);
//                                }
//                                break;
//                            case 10:
//                                if (eventoOrg2){
//                                    mostrarDatosEvento(ev2OrgNombre, ev2OrgDescripcion, ev2OrgCategoria, ev2OrgFecha, ev2OrgHora, ev2OrgAforo, ev2OrgInscritos);
//                                }
//                                break;
//                            case 11:
//                                if (eventoOrg3){
//                                    mostrarDatosEvento(ev3OrgNombre, ev3OrgDescripcion, ev3OrgCategoria, ev3OrgFecha, ev3OrgHora, ev3OrgAforo, ev3OrgInscritos);
//                                }
//                                break;
//                        }
//
//                        //MOSTRAR DATOS DE EVENTOS USUARIO2
//                        switch (opcionVerDatosEventoUser2) {
//                            case 1: {
//                                mostrarDatosEvento(evNombre[0], evDescripcion[0], evCategoria[0], evFecha[0], evHora[0], ev1Aforo, ev1Inscritos);
//                                opcionUnirseAEventoUser2 = unirseAEvento1User2(ev1EntradasPremium,ev1EntradasPremiumComprada,ev1EntradasSemipremium,ev1EntradasSemipremiumComprada,ev1EntradasNormal,ev1EntradasNormalComprada);
//                                switch (opcionUnirseAEventoUser2){
//                                    case 1:
//                                        if (!evUser2[0]){
//                                            evUser2[0] = true;
//                                            System.out.println("Has comprado la entrada premium.");
//                                            dineroUser2 = dineroUser2-15;
//                                            dinero = dinero + (15-((15*10)/100));
//                                            dineroAdmin = dineroAdmin + (((15*10)/100));
//                                            ev1Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 2:
//                                        if (!evUser2[0]){
//                                            evUser2[0] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser2 = dineroUser2-10;
//                                            dinero = dinero + (10-((10*10)/100));
//                                            dineroAdmin = dineroAdmin + (((10*10)/100));                                            ev1Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 3:
//                                        if (!evUser2[0]){
//                                            evUser2[0] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser2 = dineroUser2-15;
//                                            dinero = dinero + (15-((15*10)/100));
//                                            dineroAdmin = dineroAdmin + (((15*10)/100));                                            ev1Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    default:
//                                }
//                            }
//                            break;
//
//                            case 2: {
//                                mostrarDatosEvento(evNombre[1],  evDescripcion[1], evCategoria[1], evFecha[1], evHora[1], ev2Aforo, ev2Inscritos);
//                                opcionUnirseAEventoUser2 = unirseAEvento2User2(ev2EntradasPremium,ev2EntradasPremiumComprada,ev2EntradasSemipremium,ev2EntradasSemipremiumComprada,ev2EntradasNormal,ev2EntradasNormalComprada);
//                                switch (opcionUnirseAEventoUser2){
//                                    case 1:
//                                        if (!evUser2[1]){
//                                            evUser2[1] = true;
//                                            System.out.println("Has comprado la entrada premium.");
//                                            dineroUser2 = dineroUser2-15;
//                                            dinero = dinero + (15-((15*10)/100));
//                                            dineroAdmin = dineroAdmin + (((15*10)/100));
//                                            ev2Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 2:
//                                        if (!evUser2[1]){
//                                            evUser2[1] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser2 = dineroUser2-10;
//                                            dinero = dinero + (10-((10*10)/100));
//                                            dineroAdmin = dineroAdmin + (((10*10)/100));                                            ev2Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 3:
//                                        if (!evUser2[1]){
//                                            evUser1[1] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser2 = dineroUser2-7;
//                                            dinero = dinero + (7-((7*10)/100));
//                                            dineroAdmin = dineroAdmin + (((7*10)/100));                                            ev2Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    default:
//                                }
//
//                            }
//                            break;
//                            case 3:{
//                                mostrarDatosEvento(evNombre[2],  evDescripcion[2], evCategoria[2], evFecha[2], evHora[2], ev3Aforo, ev3Inscritos);
//                                opcionUnirseAEventoUser2 = unirseAEvento3User2(ev3EntradasPremium,ev3EntradasPremiumComprada,ev3EntradasSemipremium,ev3EntradasSemipremiumComprada,ev3EntradasNormal,ev3EntradasNormalComprada);
//                                switch (opcionUnirseAEventoUser2){
//                                    case 1:
//                                        if (!evUser2[2]){
//                                            evUser2[2] = true;
//                                            System.out.println("Has comprado la entrada premium.");
//                                            dineroUser2 = dineroUser2-15;
//                                            dinero = dinero + (15-((15*10)/100));
//                                            dineroAdmin = dineroAdmin + (((15*10)/100));                                                ev3Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 2:
//                                        if (!evUser2[2]){
//                                            evUser2[2] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser2 = dineroUser2-10;
//                                            dinero = dinero + (10-((10*10)/100));
//                                            dineroAdmin = dineroAdmin + (((10*10)/100));                                                ev3Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 3:
//                                        if (!evUser2[2]){
//                                            evUser2[2] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser2 = dineroUser2-7;
//                                            dinero = dinero + (7-((7*10)/100));
//                                            dineroAdmin = dineroAdmin + (((7*10)/100));                                                ev3Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    default:
//                                }
//
//                            }
//                            break;
//                            case 4:{
//                                mostrarDatosEvento(evNombre[3],  evDescripcion[3], evCategoria[3], evFecha[3], evHora[3], ev4Aforo, ev4Inscritos);
//                                opcionUnirseAEventoUser2 = unirseAEvento4User2(ev4EntradasPremium,ev4EntradasPremiumComprada,ev4EntradasSemipremium,ev4EntradasSemipremiumComprada,ev4EntradasNormal,ev4EntradasNormalComprada);
//                                switch (opcionUnirseAEventoUser2){
//                                    case 1:
//                                        if (!evUser2[3]){
//                                            evUser2[3] = true;
//                                            System.out.println("Has comprado la entrada premium.");
//                                            dineroUser2 = dineroUser2-15;
//                                            dinero = dinero + (15-((15*10)/100));
//                                            dineroAdmin = dineroAdmin + (((15*10)/100));
//                                            ev4Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 2:
//                                        if (!evUser2[3]){
//                                            evUser2[3] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser2 = dineroUser2-10;
//                                            dinero = dinero + (10-((10*10)/100));
//                                            dineroAdmin = dineroAdmin + (((10*10)/100));                                                ev4Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 3:
//                                        if (!evUser2[3]){
//                                            evUser2[3] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser2 = dineroUser2-7;
//                                            dinero = dinero + (7-((7*10)/100));
//                                            dineroAdmin = dineroAdmin + (((7*10)/100));                                                ev4Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    default:
//                                }
//                            }
//                            break;
//                            case 5:{
//                                mostrarDatosEvento(evNombre[4],  evDescripcion[4], evCategoria[4], evFecha[4], evHora[4], ev5Aforo, ev5Inscritos);
//                                opcionUnirseAEventoUser2 = unirseAEvento5User2(ev5EntradasPremium,ev5EntradasPremiumComprada,ev5EntradasSemipremium,ev5EntradasSemipremiumComprada,ev5EntradasNormal,ev5EntradasNormalComprada);
//                                switch (opcionUnirseAEventoUser2){
//                                    case 1:
//                                        if (!evUser2[4]){
//                                            evUser2[4] = true;
//                                            System.out.println("Has comprado la entrada premium.");
//                                            dineroUser2 = dineroUser2-15;
//                                            dinero = dinero + (15-((15*10)/100));
//                                            dineroAdmin = dineroAdmin + (((15*10)/100));                                                ev5Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 2:
//                                        if (!evUser2[4]){
//                                            evUser2[4] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser2 = dineroUser2-10;
//                                            dinero = dinero + (10-((10*10)/100));
//                                            dineroAdmin = dineroAdmin + (((10*10)/100));                                                ev5Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 3:
//                                        if (!evUser2[4]){
//                                            evUser2[4] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser2 = dineroUser2-7;
//                                            dinero = dinero + (7-((7*10)/100));
//                                            dineroAdmin = dineroAdmin + (((7*10)/100));                                                ev5Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    default:
//                                }
//
//                            }
//                            break;
//                            case 6:{
//                                mostrarDatosEvento(evNombre[5],  evDescripcion[5], evCategoria[5], evFecha[5], evHora[5], ev6Aforo, ev6Inscritos);
//                                opcionUnirseAEventoUser2 = unirseAEvento6User2(ev6EntradasNormal,ev6EntradasNormalComprada);
//                                switch (opcionUnirseAEventoUser2){
//                                    case 1:
//                                        if (!evUser2[5]){
//                                            evUser2[5] = true;
//                                            System.out.println("Has comprado la entrada ");
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//
//                                }
//                            }
//                            break;
//                            case 7:{
//                                mostrarDatosEvento(evNombre[6],  evDescripcion[6], evCategoria[6], evFecha[6], evHora[6], ev7Aforo, ev7Inscritos);
//                                opcionUnirseAEventoUser2 = unirseAEvento7User2(ev7EntradasPremium,ev7EntradasPremiumComprada,ev7EntradasSemipremium,ev7EntradasSemipremiumComprada,ev7EntradasNormal,ev7EntradasNormalComprada);
//
//                                switch (opcionUnirseAEventoUser2){
//                                    case 1:
//                                        if (!evUser2[6]){
//                                            evUser2[6] = true;
//                                            System.out.println("Has comprado la entrada premium.");
//                                            dineroUser2 = dineroUser2-15;
//                                            dinero = dinero + (15-((15*10)/100));
//                                            dineroAdmin = dineroAdmin + (((15*10)/100));                                                ev7Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 2:
//                                        if (!evUser2[6]){
//                                            evUser2[6] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser2 = dineroUser2-10;
//                                            dinero = dinero + (10-((10*10)/100));
//                                            dineroAdmin = dineroAdmin + (((10*10)/100));                                                ev7Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 3:
//                                        if (!evUser2[6]){
//                                            evUser2[6] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser2 = dineroUser2-7;
//                                            dinero = dinero + (7-((7*10)/100));
//                                            dineroAdmin = dineroAdmin + (((7*10)/100));                                                ev7Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    default:
//                                }
//
//
//                            }
//                            break;
//                            case 8:{
//                                mostrarDatosEvento(evNombre[7],  evDescripcion[7], evCategoria[7], evFecha[7], evHora[7], ev8Aforo, ev8Inscritos);
//                                opcionUnirseAEventoUser2 = unirseAEvento8User2(ev8EntradasPremium,ev8EntradasPremiumComprada,ev8EntradasSemipremium,ev8EntradasSemipremiumComprada,ev8EntradasNormal,ev8EntradasNormalComprada);
//
//                                switch (opcionUnirseAEventoUser2){
//                                    case 1:
//                                        if (!evUser2[7]){
//                                            evUser2[7] = true;
//                                            System.out.println("Has comprado la entrada premium.");
//                                            dineroUser2 = dineroUser2-preciov1OrgEntradaPremium;
//                                            dinero = dinero + (preciov1OrgEntradaPremium-((preciov1OrgEntradaPremium*10)/100));
//                                            dineroAdmin = dineroAdmin + (((preciov1OrgEntradaPremium*10)/100));                                            ev8Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 2:
//                                        if (!evUser2[7]){
//                                            evUser2[7] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser2 = dineroUser2-preciov1OrgEntradaSemipremium;
//                                            dinero = dinero + (preciov1OrgEntradaSemipremium-((preciov1OrgEntradaSemipremium*10)/100));
//                                            dineroAdmin = dineroAdmin + (((preciov1OrgEntradaSemipremium*10)/100));                                               ev8Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    case 3:
//                                        if (!evUser2[7]){
//                                            evUser2[7] = true;
//                                            System.out.println("Has comprado la entrada semipremium.");
//                                            dineroUser2 = dineroUser2-preciov1OrgEntradaNormal;
//                                            dinero = dinero + (preciov1OrgEntradaNormal-((preciov1OrgEntradaNormal*10)/100));
//                                            dineroAdmin = dineroAdmin + (((preciov1OrgEntradaNormal*10)/100));                                             ev8Inscritos++;
//                                        }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                        break;
//                                    default:
//                                }
//                            }
//                            break;
//                            case 9:
//                                if (eventoOrg1){
//                                    mostrarDatosEvento(ev1OrgNombre, ev1OrgDescripcion, ev1OrgCategoria, ev1OrgFecha, ev1OrgHora, ev1OrgAforo, ev1OrgInscritos);
//                                    opcionUnirseAEventoUser2 = unirseAEvento1User2(ev1EntradasPremium,ev1EntradasPremiumComprada,ev1EntradasSemipremium,ev1EntradasSemipremiumComprada,ev1EntradasNormal,ev1EntradasNormalComprada);
//                                    switch (opcionUnirseAEventoUser2){
//                                        case 1:
//                                            if (eventoOrg1){
//                                                eventoOrg1 = true;
//                                                System.out.println("Has comprado la entrada premium.");
//                                                dineroUser1 = dineroUser1-preciov1OrgEntradaPremium;
//                                                dinero = dinero + (preciov1OrgEntradaPremium-((preciov2OrgEntradaPremium*10)/100));
//                                                dineroAdmin = dineroAdmin + (((preciov1OrgEntradaPremium*10)/100));
//                                                ev1OrgInscritos++;
//                                            }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                            break;
//                                        case 2:
//                                            if (eventoOrg1){
//                                                eventoOrg1 = true;
//                                                System.out.println("Has comprado la entrada semipremium.");
//                                                dineroUser1 = dineroUser1-preciov1OrgEntradaSemipremium;
//                                                dinero = dinero + (preciov1OrgEntradaSemipremium-((preciov1OrgEntradaSemipremium*10)/100));
//                                                dineroAdmin = dineroAdmin + (((preciov1OrgEntradaSemipremium*10)/100));
//                                                ev1OrgInscritos++;
//                                            }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                            break;
//                                        case 3:
//                                            if (eventoOrg1){
//                                                eventoOrg1 = true;
//                                                System.out.println("Has comprado la entrada semipremium.");
//                                                dineroUser2 = dineroUser2-preciov1OrgEntradaNormal;
//                                                dinero = dinero + (preciov1OrgEntradaNormal-((preciov1OrgEntradaNormal*10)/100));
//                                                dineroAdmin = dineroAdmin + (((preciov1OrgEntradaNormal*10)/100));
//                                                ev1OrgInscritos++;
//                                            }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                            break;
//                                        default:
//                                    }                                }
//                                break;
//                            case 10:
//                                if (eventoOrg2){
//                                    mostrarDatosEvento(ev2OrgNombre, ev2OrgDescripcion, ev2OrgCategoria, ev2OrgFecha, ev2OrgHora, ev2OrgAforo, ev2OrgInscritos);
//                                    opcionUnirseAEventoUser2 = unirseAEvento1User2(ev1EntradasPremium,ev1EntradasPremiumComprada,ev1EntradasSemipremium,ev1EntradasSemipremiumComprada,ev1EntradasNormal,ev1EntradasNormalComprada);
//                                    switch (opcionUnirseAEventoUser2){
//                                        case 1:
//                                            if (eventoOrg2){
//                                                eventoOrg2 = true;
//                                                System.out.println("Has comprado la entrada premium.");
//                                                dineroUser2 = dineroUser2-preciov2OrgEntradaPremium;
//                                                dinero = dinero + (preciov2OrgEntradaPremium-((preciov2OrgEntradaPremium*10)/100));
//                                                dineroAdmin = dineroAdmin + (((preciov2OrgEntradaPremium*10)/100));
//                                                ev2OrgInscritos++;
//                                            }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                            break;
//                                        case 2:
//                                            if (eventoOrg2){
//                                                eventoOrg2 = true;
//                                                System.out.println("Has comprado la entrada semipremium.");
//                                                dineroUser2 = dineroUser2-preciov2OrgEntradaSemipremium;
//                                                dinero = dinero + (preciov2OrgEntradaSemipremium-((preciov1OrgEntradaSemipremium*10)/100));
//                                                dineroAdmin = dineroAdmin + (((preciov2OrgEntradaSemipremium*10)/100));
//                                                ev2OrgInscritos++;
//                                            }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                            break;
//                                        case 3:
//                                            if (eventoOrg2){
//                                                eventoOrg2 = true;
//                                                System.out.println("Has comprado la entrada semipremium.");
//                                                dineroUser2 = dineroUser2-preciov2OrgEntradaNormal;
//                                                dinero = dinero + (preciov2OrgEntradaNormal-((preciov2OrgEntradaNormal*10)/100));
//                                                dineroAdmin = dineroAdmin + (((preciov2OrgEntradaNormal*10)/100));
//                                                ev2OrgInscritos++;
//                                            }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                            break;
//                                        default:
//                                    }                                }
//                                break;
//                            case 11:
//                                if (eventoOrg3){
//                                    mostrarDatosEvento(ev3OrgNombre, ev3OrgDescripcion, ev3OrgCategoria, ev3OrgFecha, ev3OrgHora, ev3OrgAforo, ev3OrgInscritos);
//                                    opcionUnirseAEventoUser2 = unirseAEvento1User2(ev1EntradasPremium,ev1EntradasPremiumComprada,ev1EntradasSemipremium,ev1EntradasSemipremiumComprada,ev1EntradasNormal,ev1EntradasNormalComprada);
//                                    switch (opcionUnirseAEventoUser2){
//                                        case 1:
//                                            if (eventoOrg3){
//                                                eventoOrg3 = true;
//                                                System.out.println("Has comprado la entrada premium.");
//                                                dineroUser2 = dineroUser2-preciov3OrgEntradaPremium;
//                                                dinero = dinero + (preciov3OrgEntradaPremium-((preciov3OrgEntradaPremium*10)/100));
//                                                dineroAdmin = dineroAdmin + (((preciov3OrgEntradaPremium*10)/100));
//                                                ev3OrgInscritos++;
//                                            }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                            break;
//                                        case 2:
//                                            if (eventoOrg3){
//                                                eventoOrg3 = true;
//                                                System.out.println("Has comprado la entrada semipremium.");
//                                                dineroUser2 = dineroUser2-preciov3OrgEntradaSemipremium;
//                                                dinero = dinero + (preciov3OrgEntradaSemipremium-((preciov3OrgEntradaSemipremium*10)/100));
//                                                dineroAdmin = dineroAdmin + (((preciov3OrgEntradaSemipremium*10)/100));
//                                                ev3OrgInscritos++;
//                                            }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                            break;
//                                        case 3:
//                                            if (eventoOrg3){
//                                                eventoOrg3 = true;
//                                                System.out.println("Has comprado la entrada semipremium.");
//                                                dineroUser2 = dineroUser2-preciov3OrgEntradaNormal;
//                                                dinero = dinero + (preciov3OrgEntradaNormal-((preciov3OrgEntradaNormal*10)/100));
//                                                dineroAdmin = dineroAdmin + (((preciov3OrgEntradaNormal*10)/100));
//                                                ev3OrgInscritos++;
//                                            }else System.out.println("ERROR: YA HAS COMPRADO ENTRADAS PARA ESTE EVENTO");
//                                            break;
//                                        default:
//                                    }
//                                }
//                                break;
//                            case 12:
//                                break;
//
//                            default: break;
//                        }
//
//
//                        if (opcionCambioUser2==1){
//                            System.out.println("Escribe como quieres que se llame este usuario");
//                            nombreUsers[3] = s.nextLine();
//                        } else if (opcionCambioUser2==2) {
//                            System.out.println("Escribe la contraseña que desees");
//                            passwUsers[3] = s.nextLine();
//                        } else if (opcionCambioUser2==0){
//                        }else System.out.println("IRRECONOCIBLE");
//
//                        System.out.println();
//                    } while (opcionMenuUser2 != 6);
//                    break;
//            }
//        }
//    }
//
//    public static int inscritosAleatorios(int aforo){
//        int a = (int) (Math.random() * (aforo-4) + 1);
//        return a;
//    }
//
//    public static void mostrarDatosEvento(String nombre, String descripcion, String categoria, String fecha, String hora, int maxPerson, int personas){
//        System.out.println("=====================================");
//        System.out.println(nombre.toUpperCase());
//        System.out.println(descripcion);
//        System.out.println("Categoría: " + categoria);
//        System.out.println("Fecha: " + fecha + "  Hora: " + hora);
//
//        // GRÁFICO DE AFORO CON BARRAS
//        mostrarGraficoAforo(nombre, maxPerson, personas);
//    }
//
//    public static void mostrarGraficoAforo(String nombreEvento, int aforoMaximo, int inscritos) {
//
//        if (inscritos > aforoMaximo) {
//            inscritos = aforoMaximo;
//        }
//
//        int porcentaje = (int) ((inscritos * 100.0) / aforoMaximo);
//
//        System.out.println("AFORO DEL EVENTO");
//        System.out.println("Inscritos: " + inscritos + " de " + aforoMaximo);
//
//        System.out.print("Progreso: ");
//
//        int bloques = porcentaje / 5; // 20 bloques = 100%
//
//        for (int i = 0; i < bloques; i++) {
//            System.out.print("█");
//        }
//        for (int i = bloques; i < 20; i++) {
//            System.out.print("░");
//        }
//
//        System.out.println(" " + porcentaje + "%");
//    }
//}
