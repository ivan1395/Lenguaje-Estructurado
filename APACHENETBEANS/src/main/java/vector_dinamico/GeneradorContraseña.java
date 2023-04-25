package vector_dinamico;

import java.util.Random;
import java.util.Scanner;

public class GeneradorContraseña {

    public static void main(String[] args) {
        int longitud; // longitud de la contraseña
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"; // caracteres permitidos
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese tamaño de su contraseña: ");
        longitud = sc.nextInt();

        // Generar la contraseña
        StringBuilder sb = new StringBuilder(longitud);
        for (int i = 0; i < longitud; i++) {
            int index = rnd.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }

        String contraseña = sb.toString();
        System.out.println("La contraseña generada es: " + contraseña);
    }

}
