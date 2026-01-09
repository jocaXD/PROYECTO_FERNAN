package FernanT4;

public class Cadenas {

    public static boolean contrasenasIguales(String[] c) {
        if (c == null || c.length < 2) return false;

        for (int i = 1; i < c.length; i++) {
            if (c[i] == null || !c[i].equals(c[0])) {
                return false;
            }
        }
        return true;
    }


    public static boolean contrasenaFuerte(String pass) {
        if (pass == null || pass.length() < 8) return false;

        boolean mayus = false;
        boolean minus = false;
        boolean numero = false;
        boolean simbolo = false;

        for (int i = 0; i < pass.length(); i++) {
            char c = pass.charAt(i);

            if (Character.isUpperCase(c)) mayus = true;
            else if (Character.isLowerCase(c)) minus = true;
            else if (Character.isDigit(c)) numero = true;
            else if ("-_.,*+@".indexOf(c) >= 0) simbolo = true;
        }

        if (mayus & minus & numero & simbolo) return true;
        else return false;
    }

    public static boolean longitudValida(String texto, int min, int max) {
        if (texto == null) return false;
        int l = texto.length();
        return l >= min && l <= max;
    }

    public static boolean protocoloContrasenas(String[] c, int min, int max) {
        if (contrasenasIguales(c) && contrasenaFuerte(c[0]) && longitudValida(c[0], min, max)) {
            return true;
        } else {
            return false;
        }
    }

    /* contrasenasIguales(c) verifica que ambas contraseñas sean iguales.

    contrasenaFuerte(c[0]) comprueba que la contraseña cumpla los requisitos de seguridad.

    longitudValida(c[0], min, max) valida la longitud.

     */

}
