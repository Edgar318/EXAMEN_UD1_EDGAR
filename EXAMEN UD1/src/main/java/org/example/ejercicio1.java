package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio1 {
    public void eejercicio1() {
        Scanner entrada = new Scanner(System.in);
        float num1 = 0;
        float num2 = 0;
        float num3 = 0;
        boolean error = true;
            while(error == true) {
                try {
                    System.out.println("Introduce la nota del primer trimestre (0-10): ");
                    num1 = entrada.nextInt();
                    System.out.println("Introduce la nota del segundo trimestre (0-10): ");
                    num2 = entrada.nextInt();
                    System.out.println("Introduce la nota del tercer trimestre (0-10): ");
                    num3 = entrada.nextInt();
                    error = false;
                } catch (InputMismatchException er) {
                    System.out.println("Error. Introduce un número.");
                    entrada.nextLine();
                }
                float suma = (num1 + num2 + num3);

                float resultado = (suma / 3);

                if (resultado > 5) {
                    System.out.println("La media obtenida es: " + resultado + " APROBADO");
                } else {
                    System.out.println("La media obtenida es: " + resultado + " Suspenso.");
                }

            }


        }

    }

