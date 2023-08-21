package io.viniciuswkf.contabanco;

import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Número da agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.print("Nome Completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " +
                            nomeCliente +
                            ", obrigado por criar uma conta em nosso banco, sua agência é " +
                            numeroAgencia +
                            ", conta " +
                            numeroConta +
                            " e seu saldo " +
                            saldo +
                            " já está disponível para saque");

        scanner.close();
    }
}
