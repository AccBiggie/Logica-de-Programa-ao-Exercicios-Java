/*Roumes era um aluno acima da média. Nas provas de matemática, ele sempre tirava nota
máxima, acertando todas as contas, mas o segredo dele não estava em fazer contas
corretamente. Ele interpretava o que via no ambiente a sua volta e conseguia deduzir as
respostas para as questões. Você também pode ser alguém especial, igual a Roumes.
Entrada
A entrada consiste em vários casos de teste. Cada caso contém um número N,
representando a quantidade de perguntas. Nas N linhas seguintes, aparece o que você
viu para chegar na resposta.
Saída
Para cada pergunta feita, imprima a palavra ‘resposta’, seguida por um espaço, depois
pelo número da pergunta, por dois pontos, um espaço e a resposta. */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner entradaUsuario = new Scanner(System.in)){
            int entrada = entradaUsuario.nextInt();
            int entradaY = 1;
            int cont = 0;
        for (int i = 0; i < entrada; i++){
            int scanner = entradaUsuario.nextInt();
        
            System.out.println("resposta :" + entradaY + scanner);

        }
        }
    }
}
