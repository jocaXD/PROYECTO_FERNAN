package FernanT4;

public class Cadenas {
    /**
     * Comprueba si en la base de datos hay contraseñas iguales a la que has puesto.
     * @return Returna si la contraseña ya está usada.
     *
     */
    public static boolean contrasenasIguales(String c, String[] contrasenasUsuarios) {
        if (c == null || c.length() < 2) return false;

        for (int i = 1; i < contrasenasUsuarios.length; i++) {
            if (c == null || contrasenasUsuarios[i].equals(c)) {
                return false;
            }
        }
        return true;
    }
    /**
     * Comprueba que la contraseña sea fuerte.
     * @return Returna si la contraseña es fuerte.
     *
     */

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

    /**
     * Comprueba si la contraseña tiene una logitud valida
     * @return Returna si la contraseña tiene buena longitud.
     *
     */

    public static boolean longitudValida(String texto, int min, int max) {
        if (texto == null) return false;
        int l = texto.length();
        return l >= min && l <= max;
    }
    /**
     * Reune todas las funciones para crear el protocolo de contraseñas
     * @return Returna si la contraseña cumple todas las normas.
     *
     */
    public static boolean protocoloContrasenas(String c, int min, int max, String[] contrasenasUsuarios) {
        if (contrasenasIguales(c,contrasenasUsuarios) && contrasenaFuerte(c) && longitudValida(c, min, max)) {
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
