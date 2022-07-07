/*Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro
pelo segundo. Caso não for possível mostre a mensagem “divisao impossivel” para os
valores em questão. */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner entradaUsuario = new Scanner(System.in)){ 
            int entrada = entradaUsuario.nextInt();
            for(int i = 0; i < entrada; i++){
                int A = entradaUsuario.nextInt();
                int B = entradaUsuario.nextInt();
                if(B == 0){
                    System.out.println(" Divisão impossivel");
                } else {
                    System.out.println((double)A/B);
                }
            }
        }
    }
}
