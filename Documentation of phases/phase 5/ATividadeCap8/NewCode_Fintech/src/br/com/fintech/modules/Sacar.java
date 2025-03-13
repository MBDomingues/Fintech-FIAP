package br.com.fintech.modules;

public class Sacar extends Conta {
    public static void sacarValor(double valorSaque) {
        // verifica o valor pra saque
        if (saldo < valorSaque) {
            System.out.println("Operação invalida! Valor maior que saldo!");
        } else if (valorSaque <= 0) {
            System.out.println("Operação invalida! Valor deve ser maior que 0");
        } else {
            saldo -= valorSaque;

            // novo saldo
            System.out.println("\n\nSaldo: " + getSaldo());
            System.out.println("Você sacou: " + valorSaque + "\n");
        }
    }
}
