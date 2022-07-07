/*Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em
ordem crescente, uma linha em branco e em seguida, os valores na sequência como
foram lidos. */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner entradaUsuario = new Scanner(System.in)){
            int A = entradaUsuario.nextInt();
            int B = entradaUsuario.nextInt();
            int C = entradaUsuario.nextInt();
            if (A < B && A < C) {
                System.out.println(A);
                    if (B < C) {
                        System.out.println(B);
                        System.out.println(C);
                    } else {
                        System.out.println(C);
                        System.out.println(B);
                    }
                    } else if (B < C) {
                        System.out.println(B);
                     if (A < C) {        
                        System.out.println(A);
                        System.out.println(C);
                    } else {
                        System.out.println(C);
                        System.out.println(A);
                    }
                    } else {
                        System.out.println(C);
                    if (A < B) {
                        System.out.println(A);
                        System.out.println(B);
                    } else {
                        System.out.println(B);
                        System.out.println(A);
                    }
                }
                System.out.println("");
                System.out.println(A);
                System.out.println(B);
                System.out.println(C);
            }
        }
    }

    

