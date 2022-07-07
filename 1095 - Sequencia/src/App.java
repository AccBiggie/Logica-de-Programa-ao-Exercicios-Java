/*você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner entradaUsuario = new Scanner(System.in)){
            int valorI= 1;
            int valorJ= 60;
        while(valorJ >= 0) {
            System.out.println("I= " + valorI + "J= " + valorJ);
            valorJ-=5;
            valorI+=3;
        }    
        }
    }
}
