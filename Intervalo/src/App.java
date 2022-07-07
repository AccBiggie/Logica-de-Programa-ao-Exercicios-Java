/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem
dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se
 public static void main(String[] args) throws IOException {
 Scanner leitor = new Scanner(System.in);
 int a = leitor.nextInt();
 int b = leitor.nextInt();
 int c = leitor.nextInt();
 int d = leitor.nextInt();
 if (b > c && d > a && c > 0 && d > 0 && (c + d) > (a + b) && a % 2 == 0) {
 System.out.println("Valores aceitos");
 } else {
 System.out.println("Valores nao aceitos");
 }
 }
encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser
impressa a mensagem “Fora de intervalo”.
O símbolo ( representa "maior que". Por exemplo:
[0,25] indica valores entre 0 e 25.0000, inclusive eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       try(Scanner entradaUsuario = new Scanner(System.in)){
            double valor = entradaUsuario.nextDouble();
        if(valor >= 0 && valor <=25){
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25 && valor <=50) {
            System.out.println("Intervalo [25,50]");
        } else if (valor > 50 && valor <= 75){
            System.out.println("Intervalo [50,75]");
        } else if (valor > 75 && valor <= 100){
            System.out.println("Intervalo [75,100]");
        } else {
            System.out.println("Fora do intervalo");
        }

       }
    }
}