/*Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada
X e Y uma mensagem que indique se estes valores foram digitados em ordem crescente
ou decrescente. */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner entradaUsuario = new Scanner(System.in)){
            int entrada1 = entradaUsuario.nextInt();
            int entrada2 = entradaUsuario.nextInt();
            
        while(entrada1 != entrada2){
        if(entrada1 > entrada2){
            System.out.println("Decrescente");
        }else{
            System.out.println("Crescente");
        } break;
        }
        }
    }
}
