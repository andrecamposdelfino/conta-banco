import java.util.Scanner;

public class ContaTerminal {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        int numero = 1021;
        String agencia;
        String nomeCliente = "Mario Andrade";
        Double saldo = 237.48;

        System.out.println("Por favor digite o numero da agencia");
        agencia = scanner.next();

        System.out.println("Olá " + nomeCliente + "\n"
        + "obrigado por criar uma conta em nosso banco, sua agencia é, " + agencia + "\n" 
        + "conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque");

        
    }
}
