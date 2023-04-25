package vector_dinamico;

import java.util.Scanner;
 
class Vector_Contar_Letras_NoSalen {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    char letras[];
    int contadorVocales = 0;
    int contadorConsonantes = 0;
    
    System.out.println("Ingrese tamaño vector ");
    n = sc.nextInt();
    letras = new char[n];
    //LLENAR VECTOR
    for(int i=0; i<n; i++) {
       letras[i] = (char)(int)(Math.random()*26 + 97); 
    }
    //MOSTRAR VECTOR 
    for(int i=0; i<n; i++) {
        System.out.println("Letras: " + letras[i]);
    }
    for(int i=0; i<n; i++) {
        char letraActual = letras[i];
        if(letraActual == 'a' || letraActual == 'e' || letraActual == 'i' || letraActual == 'o' || 'u' == letraActual) {
            contadorVocales++;
        } else {
            contadorConsonantes++;
        }
    }
    int totalLetras = contadorVocales + contadorConsonantes;
    double porcentajeVocales = ((double)contadorVocales / totalLetras) * 100;
    double porcentajeConsonantes = ((double)contadorConsonantes / totalLetras) * 100;
    System.out.println("Porcentaje de vocales: " + porcentajeVocales + "%");
    System.out.println("Porcentaje de consonantes: " + porcentajeConsonantes + "%");
    
    //MOSTRAR LETRAS QUE NO APARECEN
    String alfabeto = "abcdefghijklmnopqrstuvwxyz";
    for(int i=0; i<alfabeto.length(); i++) {
        char letraActual = alfabeto.charAt(i);
        boolean letraEncontrada = false;
        for(int j=0; j<n; j++) {
            if(letras[j] == letraActual) {
                letraEncontrada = true;
                break;
            }
        }
        if(!letraEncontrada) {
            System.out.println("Letra no encontrada: " + letraActual);
        }
    }
}
}