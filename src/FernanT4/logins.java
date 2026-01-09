package FernanT4;

import java.util.Scanner;

import static FernanT4.FactorEnDosPasosGmail.enviarConGMail;

public class logins {

    // VARIABLES DE COLORES
    public static final String RESET = "\u001B[0m";
    public static final String GRIS = "\u001B[90m";
    public static final String NARANJA = "\u001B[38;5;208m";

    public static int loginUsuario(String usuario, boolean[] lockUsers, String[] nombreUsers) {
        if (usuario.equals(nombreUsers[0])) {
            if (!lockUsers[0]){
                return 1;
            }
            else System.out.println(GRIS + "El usuario admin está bloqueado" + RESET);
            return 5;
        } else if (usuario.equals(nombreUsers[1])) {
            if (!lockUsers[1]) return 2;
            else System.out.println(GRIS + "El usuario organizador está bloqueado" + RESET);
            return 5;
        } else if (usuario.equals(nombreUsers[2])) {
            if (!lockUsers[2]) return 3;
            else System.out.println(GRIS + "El usuario usuario1 está bloqueado" + RESET);
            return 5;
        } else if (usuario.equals(nombreUsers[3])) {
            if (!lockUsers[3]) return 4;
            else System.out.println(GRIS + "El usuario usuario2 está bloqueado" + RESET);
            return 5;
        } else {
            return 6;
        }
    }


    // PEDIR CLAVE Y BANEAR A MAS DE 3 INTENTOS
    public static int pedirClave(String[] passUsers, int valorUsuario) {
        Scanner s = new Scanner(System.in);
        int salida = 0;

        for (int i = 1; i <= 3; i++) {

            // MENÚ EN GRIS
            System.out.println(GRIS + "Introduce la clave" + RESET);

            // OPCIÓN EN NARANJA
            System.out.print(NARANJA + "> " + RESET);
            String clave = s.nextLine();

            if (clave.equals("")) {
                System.out.println(GRIS + "La contraseña no puede estar vacía" + RESET);
            }
            else if (clave.equals(passUsers[valorUsuario])) {
//                if (FactorDosPasos()){
//                    System.out.println("Has iniciado sesión correctamente");
//
//                }else System.out.println("El inicio de sesión no se ha podido realizar");
                salida = 1;
                break;
            }else {
                System.out.println(NARANJA + "CONTRASEÑA INCORRECTA" + RESET);
                salida = 5;
            }
        }
        return salida;
    }


    public static boolean FactorDosPasos(){
        String codigo = "";
        String codIntroducido = "";
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            int numero = (int) (Math.random()*20 +1);
            if (numero<10){
                codigo += numero;
            }else{
                char letra = (char)(numero + 64);
                codigo += letra;
            }
        }

        enviarConGMail("peccicarrilloalejandro@gmail.com","--Clave doble factor--","+*  "+codigo+"  *+");


        System.out.println("Introduce el código enviado al gmail 'peccicarrilloalejandro@gmail.com'");
        codIntroducido = s.nextLine().toUpperCase();

        if (codigo.equals(codIntroducido)) return true;
        else{
            System.out.println("El código no es correcto, no se puede iniciar sesión");
            return false;
        }
    }

    public static int reconocerUsuario(String[] nombres){
        Scanner s = new Scanner(System.in);
        boolean ususarioEncontrado = false;
        String nombre = s.nextLine();

        for (int i = 0; i < nombres.length; i++) {
            if (nombre.equals(nombres[i])){
                ususarioEncontrado = true;
                return i;
            }
        }
        if (!ususarioEncontrado){
            System.out.println("No se ha encontrado el usuario");
            System.out.println("--Quieres añadir el usuario '"+ nombre + " '");
            return hacerUsuario();
        }else return 0;
    }

    public static int hacerUsuario(){
        Scanner s = new Scanner(System.in);
        System.out.println("1-Si");
        System.out.println("2-No");
        return -Integer.parseInt(s.nextLine());
    }

    public static int definirTipoDeUsuario(){
        Scanner s = new Scanner(System.in);
        System.out.println("¿Qué tipo de usuario quieres crear?");
        System.out.println("1- Organizador");
        System.out.println("2- Asistente");

        return Integer.parseInt(s.nextLine());
    }
}
