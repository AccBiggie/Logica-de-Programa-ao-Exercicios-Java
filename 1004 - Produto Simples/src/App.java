// 1004 - Produto Simples;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner entradaUsuario = new Scanner(System.in)){
        int A = entradaUsuario.nextInt();
        int B = entradaUsuario.nextInt();
        
        int calculaProduto  = A * B;
        
        System.out.println("PROD = "  + calculaProduto);

         }
    }
}
