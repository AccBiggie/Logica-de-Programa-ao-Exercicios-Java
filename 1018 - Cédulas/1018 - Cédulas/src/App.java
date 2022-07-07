/*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no
qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner entradaUsuario = new Scanner(System.in)){
            int cedulas = entradaUsuario.nextInt();
            int cedulasDe100 = 0;
            int cedulasDe50  = 0;
            int cedulasDe20  = 0;
            int cedulasDe10  = 0;
            int cedulasDe5   = 0;
            int cedulasDe2   = 0;
            int cedulasDe1   = 0;

            while(cedulas > 0){
                if (cedulas >= 100){
                    cedulasDe100++;
                    cedulas-=100;
                } else if(cedulas >= 50){
                    cedulasDe50++;
                    cedulas -= 50;
                } else if(cedulas >= 20){
                    cedulasDe20++;
                    cedulas -= 20;
                } else if(cedulas >= 10){
                    cedulasDe10++;
                    cedulas -= 10;
                } else if(cedulas >= 5){
                    cedulasDe5++;
                    cedulas -=5;
                } else if(cedulas >=2){
                    cedulasDe2++;
                    cedulas -=2;
                } else if (cedulas >=1){
                    cedulasDe1++;
                    cedulas -=1;
                }
            }
            System.out.println(cedulasDe100 + " notas (s) de R$ 100,00");
            System.out.println(cedulasDe50  + " notas (s) de R$ 50,00");
            System.out.println(cedulasDe20  + " notas (s) de R$ 20,00");
            System.out.println(cedulasDe10  + " notas (s) de R$ 10,00");
            System.out.println(cedulasDe5   + " notas (s) de R$ 5,00");
            System.out.println(cedulasDe2   + " notas (s) de R$ 2,00");
            System.out.println(cedulasDe1   + " notas (s) de R$ 1,00");
        }
    }
}
