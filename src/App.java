import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in);

        System.out.println("Digite um numero a ser multiplicado");
        
        int numero = reader.nextInt();

        System.out.println("Tabela de multiplicação de " + numero);

        for(int i = 0; i <= 10; i++){
            int resultado = numero * i;

            System.out.println( "|" + numero + " x " + i + " = " + resultado + "|");
        }
    }
}
