/*Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara.
Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel
calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      try(Scanner entradaUsuario = new Scanner(System.in)){
        double A = entradaUsuario.nextDouble();
        double B = entradaUsuario.nextDouble();
        double C = entradaUsuario.nextDouble();
        double bhaskara = Math.sqrt((B * B) - (4 * A * C) );
        
        if (A <= 0 || bhaskara <= 0){
            System.out.println("Impossivel calcular");
        } else {
        double R1 = (-B + bhaskara) / (2 * A);
        double R2 = (-B - bhaskara) / (2 * A);
        
        System.out.println("R1 = " + R1);
        System.out.println("R2 = " + R2);
        }
    }
}
}