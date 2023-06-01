package CaesarCipher;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String mensajeAEncriptar = "HOLA QUE TAL";
        ArrayList<Character> encrypted = new ArrayList<Character>();
        ArrayList<Character> decrypted = new ArrayList<Character>();
        char[] x = mensajeAEncriptar.toCharArray();

        for (char c : x) {
            encrypted.add((char) (((int) c + 1) % 90));
        }

        encrypted.forEach(c ->
                decrypted.add((char) (((int) c - 1) % 90)));

        System.out.println(encrypted.toString());
        System.out.println(decrypted.toString());
    }
}
