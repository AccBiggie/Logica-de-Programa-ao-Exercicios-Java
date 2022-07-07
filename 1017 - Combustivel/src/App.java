import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner entradaUsuario = new Scanner(System.in)){
        int tempoViagem = entradaUsuario.nextInt();
        int velocidadeMedia = entradaUsuario.nextInt();

        double litrosKM  = 12;

        double quantidadeLitros = (tempoViagem * velocidadeMedia / litrosKM);

        System.out.println(quantidadeLitros);

        }
    }
}
