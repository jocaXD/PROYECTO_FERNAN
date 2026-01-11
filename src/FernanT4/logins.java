package FernanT4;

import java.util.Scanner;
import static FernanT4.FactorEnDosPasosGmail.enviarConGMail;

public class logins {

    public static final String RESET = "\u001B[0m";
    public static final String GRIS = "\u001B[90m";
    public static final String NARANJA = "\u001B[38;5;208m";



    public static int pedirClave(String[] passUsers, int valorUsuario) {
        Scanner s = new Scanner(System.in);
        int salida = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println(GRIS + "Introduce la clave" + RESET);
            System.out.print(NARANJA + "> " + RESET);
            String clave = s.nextLine();

            if (clave.equals("")) {
                System.out.println(GRIS + "La contraseña no puede estar vacía" + RESET);
            } else if (clave.equals(passUsers[valorUsuario])) {
                salida = 1;
                break;
            } else {
                System.out.println(NARANJA + "CONTRASEÑA INCORRECTA" + RESET);
                salida = 5;
            }
        }
        return salida;
    }

    public static boolean FactorDosPasos() {
        String codigo = "";
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            int numero = (int) (Math.random() * 20 + 1);
            if (numero < 10) codigo += numero;
            else codigo += (char) (numero + 64);
        }

        String cuerpo = """
<!DOCTYPE html>
<html>
<head>
    <style>
        body {
            background-color: #f4f6f8;
            font-family: Arial, sans-serif;
            padding: 20px;
        }
        .card {
            max-width: 400px;
            margin: auto;
            background: white;
            border-radius: 10px;
            padding: 25px;
            text-align: center;
        }
        .codigo {
            font-size: 28px;
            letter-spacing: 6px;
            font-weight: bold;
            color: #ff8800;
            margin: 20px 0;
        }
        .footer {
            font-size: 12px;
            color: #777;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="card">
        <h2>🔐 Verificación en dos pasos</h2>
        <p>Usa el siguiente código para iniciar sesión:</p>
        <div class="codigo">{{CODIGO}}</div>
        <p>Este código caduca en unos minutos.</p>
        <div class="footer">
            Si no has solicitado este código, ignora este mensaje.
        </div>
    </div>
</body>
</html>
""";

        cuerpo = cuerpo.replace("{{CODIGO}}", codigo);

        enviarConGMail(
                "peccicarrilloalejandro@gmail.com",
                "Código de verificación",
                cuerpo
        );

        System.out.println("Introduce el código enviado al gmail");
        String codIntroducido = s.nextLine().toUpperCase();

        return codigo.equals(codIntroducido);
    }

    public static int reconocerUsuario(String[] nombres) {
        Scanner s = new Scanner(System.in);
        String nombre = s.nextLine();

        for (int i = 0; i < nombres.length; i++) {
            if (nombre.equals(nombres[i])) return i;
        }

        System.out.println("No se ha encontrado el usuario");
        System.out.println("--Quieres añadir el usuario '" + nombre + "'");
        return hacerUsuario();
    }

    public static int hacerUsuario() {
        Scanner s = new Scanner(System.in);
        System.out.println("1-Si");
        System.out.println("2-No");
        return -Integer.parseInt(s.nextLine());
    }

    public static int definirTipoDeUsuario() {
        Scanner s = new Scanner(System.in);
        System.out.println("¿Qué tipo de usuario quieres crear?");
        System.out.println("1- Organizador");
        System.out.println("2- Asistente");
        return Integer.parseInt(s.nextLine());
    }
}
