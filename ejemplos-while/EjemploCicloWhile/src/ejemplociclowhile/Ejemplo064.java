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
public class Ejemplo064 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean bandera = true;
        String pais;
        String capital;
        String forma = "";
        int total = 0;

        while (bandera == true) { //true == true // false == true

            System.out.println("Ingrese el pais");
            pais = entrada.nextLine();

            System.out.printf("Ingrese la capital de %s\n", pais);
            capital = entrada.nextLine();

            forma = String.format("%s%s | %s\n",
                    forma,
                    pais,
                    capital);

            String salir;
            System.out.println("Desea salir del ciclo, ingrese si");
            salir = entrada.nextLine();

            if (salir.equals("si")) {
                bandera = false;
            }
            total = total + 1;
        }
        forma = String.format("%sTotal de paises ingresados: %d\n",
                forma, total);

        System.out.printf("%s\n", forma);
    }

}
/*
Lo que estamos haciendo es repetir un ciclo cuantas veces quiera el usuario,
el determina cuantas se repetira, pudiendo salir el cualquier momento de
que ingrese lo que la condicion le pide
*/