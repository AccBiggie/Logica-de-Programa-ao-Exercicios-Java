/*Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas
efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de
comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com
duas casas decimais.*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner entradaUsuario = new Scanner(System.in)){
            String nomeVendedor = entradaUsuario.next();
            double salarioFixo = entradaUsuario.nextDouble();
            double totalVenda = entradaUsuario.nextDouble();
            int comissao = 15;

            double totaldasVendas= ( salarioFixo + totalVenda * comissao / 100);

            System.out.println(nomeVendedor);
            System.out.println("TOTAL = R$ " + totaldasVendas);
        }
    }
}
