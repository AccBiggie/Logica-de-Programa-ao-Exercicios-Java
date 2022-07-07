/*Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a
idade de um indivíduo. O último dado, que não entrará nos cálculos, contém o valor de
idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos. */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner entradaUsuario = new Scanner(System.in)){
            int cont = 0;
            double soma = 0;
            double numero = 0;
            while(numero >= 0){
                numero = entradaUsuario.nextInt();
                if(numero >= 0){
                    cont++;
                    soma += numero;
                    
                }
            }
            double media = soma / cont;
            System.out.println(media);
        }
    }
}
