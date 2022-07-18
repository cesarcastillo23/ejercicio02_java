package com.open_bootcamp;

public class Main {
    public static void main(String[] args) {
        int numero= 0;
        if(numero >0) {
            System.out.println("Este numero es positivo: " + numero);
        }
        else if(numero <0) {
            System.out.println("Este numero es negativo: "+numero);
        }
        else {
            System.out.println("Este numero es = 0");
        }
        //while 
        int numeroWhile = 0;
        {
            while (numeroWhile < 3) {
                System.out.println(numeroWhile);
                numeroWhile++;
            }
        }
        int numeroDoWhile=2;
        do {
            numeroDoWhile++;
            System.out.println("do While ahora es: "+numeroDoWhile);
        }while (numeroDoWhile<3);

        for (int numFor=0;numFor <=3;numFor++) {
            System.out.println("for vale: "+numFor);
        }


        String estacion = "Verano";
        switch(estacion) {
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "Verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("No es una estación");
        }
    }
}



