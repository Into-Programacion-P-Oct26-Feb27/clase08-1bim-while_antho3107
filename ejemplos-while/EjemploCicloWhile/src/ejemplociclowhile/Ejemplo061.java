/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Ejemplo061 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean bandera = true;

        while (bandera == true) { //true == true // false == true
            System.out.println("Estoy en el ciclo:"); //Estoy en el ciclo

            int salir;
            System.out.println("Desea salir del ciclo, ingrese -100");
            salir = entrada.nextInt();// 100 // -100

            if (salir == -100) {// -100 = -100
                bandera = false;
            }
        }

    }

}
/*
Lo que estamos haciendo es repetir un ciclo cuantas veces quiera el usuario,
el determina cuantas se repetira, pudiendo salir el cualquier momento de
que ingrese lo que la condicion le pide
*/