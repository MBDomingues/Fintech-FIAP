package br.com.fintech.modules;

public class Depositar extends Conta {
    public static void depositarValor(double valorDeposito) {
        if (valorDeposito <= 0) {
            System.out.println("Operação invalida! valor deve ser maior que 0!");
        } else {
            saldo += valorDeposito;

            // novo saldo
            System.out.println("\nSaldo: " + getSaldo() + "\n");
        }
    }
}
