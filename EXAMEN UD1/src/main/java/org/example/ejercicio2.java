package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio2 {
    public void eejercicio2 (){
        Scanner entrada = new Scanner(System.in);
        float num1 = 0;
        int num2 = -1;
        boolean error = true;
        while(error == true) {
            try {
                System.out.println("Introduce un numero: ");
                num1 = entrada.nextInt();
                error = false;
            } catch (InputMismatchException er) {
                System.out.println("Error. Introduce un numero.");
                entrada.nextLine();
            }
            if (num1 > 0) {
                float resultado = (num2 * num1);
                System.out.println("El valor absoluto es: " + resultado);

            }
            if (num1 < 0) {
                float resultado = (num2 * num1);
                System.out.println("El valor absoluto es: " + resultado);

            }
        }
    }
}
