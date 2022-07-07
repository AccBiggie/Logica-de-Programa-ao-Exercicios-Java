/*Escreva um programa que leia um valor inteiro N (1 < N < 1000). Este N é a quantidade de
linhas de saída que serão apresentadas na execução do programa. */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner entradaUsuario = new Scanner(System.in)){
            int primeiroNumero = entradaUsuario.nextInt();
        for(int i =1; i <= primeiroNumero; i++){
            System.out.println(i + "" + (i * i) +""+ (i * i * i));
        }

        }
    }
}
