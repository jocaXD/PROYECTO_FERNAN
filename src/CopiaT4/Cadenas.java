package CopiaT4;

public class Cadenas {

    public static boolean contrasenasIguales(String c1, String c2) {
        if (c1 == null || c2 == null) return false;
        return c1.equals(c2);
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

        return mayus && minus && numero && simbolo;
    }

    public static boolean longitudValida(String texto, int min, int max) {
        if (texto == null) return false;
        int l = texto.length();
        return l >= min && l <= max;
    }
}
