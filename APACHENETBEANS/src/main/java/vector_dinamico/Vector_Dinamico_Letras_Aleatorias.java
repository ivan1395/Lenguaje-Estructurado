package vector_dinamico;

import java.util.Scanner;

public class Vector_Dinamico_Letras_Aleatorias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra;
        int n;
        char letras[];
        int contadorVocales = 0;
        int contadorConsonantes = 0;

        
        System.out.println("Ingrese tamaño vector ");
        n = sc.nextInt();
        letras = new char[n];
        //LLENAR VECTOR
        for(int i=0; i<n; i++) {
           letras[i] = (char)(int)(Math.random()*27 + 65); 
        }
       //MOSTRAR VECTOR 
        for(int i=0; i<n; i++) {
            System.out.println("Letras: " + letras[i]);
        }
        for(int i=0; i<n; i++) {
        char letraActual = letras[i];
        if(letraActual == 'A' || letraActual == 'E' || letraActual == 'I' || letraActual == 'O' || letraActual == 'U') {
        contadorVocales++;
        } else {
        contadorConsonantes++;
        }
    }
        double porcentajeVocales = ((double)contadorVocales / n) * 100;
        double porcentajeConsonantes = ((double)contadorConsonantes / n) * 100;
        System.out.println("Porcentaje de vocales: " + porcentajeVocales + "%");
        System.out.println("Porcentaje de consonantes: " + porcentajeConsonantes + "%");


 }   
}
