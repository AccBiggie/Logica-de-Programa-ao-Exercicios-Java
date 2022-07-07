/*Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são
pares e mostre esta informação.
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner entradaUsuario = new Scanner(System.in)){
            int cont = 0;
            for(int i = 0; i < 5; i++){
                
                int valor = entradaUsuario.nextInt();
            if (valor % 2 == 0)cont++;

            
        }
            System.out.println(cont + " Valores pares");
        }
    }
}
