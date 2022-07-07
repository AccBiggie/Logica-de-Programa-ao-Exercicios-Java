/*Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos
(desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos
digitados.
 */
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner entradaUsuario = new Scanner(System.in)){ 
        int cont = 0;
            
        for (int i = 0; i < 6; i++){
            double entrada = entradaUsuario.nextDouble();
            if(entrada > 0) cont++;
           }
           System.out.println(cont + "valores positivos ");
        }
    }
}