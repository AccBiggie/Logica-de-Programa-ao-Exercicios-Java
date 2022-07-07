/*Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal,
correspondente às quatro notas de um aluno. Calcule a média com pesos 2, 3, 4 e 1,
respectivamente, para cada uma destas notas e mostre esta média acompanhada pela
mensagem "Media: ". Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno
aprovado.". Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno
reprovado.". Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa
deve imprimir a mensagem "Aluno em exame.".
No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida
pelo aluno. Imprima então a mensagem "Nota do exame: " acompanhada pela nota
digitada. Recalcule a média (some a pontuação do exame com a média anteriormente
calculada e divida por 2). e imprima a mensagem "Aluno aprovado." (caso a média final
seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a média tenha ficado 4.9 ou menos). Para
estes dois casos (aprovado ou reprovado após ter pego exame) apresente na última linha
uma mensagem "Media final: " seguido da média final para esse aluno. */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner entradaUsuario = new Scanner(System.in)){
            double primeiraNota = entradaUsuario.nextDouble();
            double segundaNota  = entradaUsuario.nextDouble();
            double terceiraNota = entradaUsuario.nextDouble();
            double quartaNota   = entradaUsuario.nextDouble();

            double media = ((primeiraNota *2) + (segundaNota * 3) + (terceiraNota * 4) + (quartaNota + 1))/10;
            System.out.println("Media: " + media);
        if(media >=7){
            System.out.println("Aluno Aprovado.");
        } else if( media < 7 && media >= 5){
            System.out.println("Aluno em exame");

            double notaExame = entradaUsuario.nextDouble();
            System.out.println("Nota do exame: " + notaExame);
            media = (media + notaExame) /2;
        if(media >= 5){
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno reprovado;");
        }
            System.out.println("Media Final: " + media);
        } else {
            System.out.println("Aluno reprovado.");
        }

        }
    }
}
