// package coreJava
package br.com.fintech.modules;

import java.util.Scanner;

// class metas
public class Meta extends Conta {
    // criando vars privados
    private static String nomeMeta;
    private static String mesAnoMetaFinal;
    private static double valorMeta;
    private static double saldoInvstimento;
    private static double investimento;

    // getters
    public static String getNomeMeta() { return nomeMeta; }
    public static double getValorMeta() { return valorMeta; }
    public static String getMesAnoMetaFinal() { return mesAnoMetaFinal; }
    public static double getSaldoInvstimento() { return saldoInvstimento; }

    // apresentaçao das contas
    @Override
    public void showValor() {
        if (nomeMeta == null) {
            System.out.println("Você não possui metas cadastradas!");
        } else {
            System.out.println("Sua meta de investimetno se encontra assim:\n");
            System.out.println("Nome: " + getNomeMeta());
            System.out.println("Data final: " + getMesAnoMetaFinal());
            System.out.println("Valor da meta: " + getValorMeta());
            System.out.println("Saldo da meta: " + getSaldoInvstimento() + "\n\n");
        }
    }


    // adionar investimento
    public static void addInvestimento(double valorInvestimento) {
        // verificador valor saldo
        if (getSaldo() < valorInvestimento) {
            System.out.println("operação invalida!");
        } else {
            saldo -= valorInvestimento;
            investimento = valorInvestimento;
            saldoInvstimento += valorInvestimento;

            // apresentação das infos do investimento
            System.out.println("\n\nValor acumulado atual: " + getSaldoInvstimento());
            System.out.println("Valor investido: " + investimento);
            System.out.println("Saldo atual: " + getSaldo() + "\n\n");
        }
    }


    // criar meta
    public void createMeta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome para a meta");
        String userName = sc.next();
        System.out.println("Digite a data final para a meta:");
        String data = sc.next();
        System.out.println("Digite o valor que deseja alcançar");
        double valorDesejado;
        valorDesejado = sc.nextDouble();
        System.out.println("\nMeta criada!\n");

        // passa para os setters
        setNomeMeta(userName);
        setMesAnoMetaFinal(data);
        setValorMeta(valorDesejado);
    }

    // setters
    public void setNomeMeta(String nome) { this.nomeMeta = nome; }
    public void setMesAnoMetaFinal(String mesAnoMetaFinal) { this.mesAnoMetaFinal = mesAnoMetaFinal; }
    public void setValorMeta(double valorMeta) { this.valorMeta = valorMeta; }
    public void setSaldoInvstimento(double saldoInvstimento) { this.saldoInvstimento = saldoInvstimento; }
    public void setInvestimento(double investimento) { this.investimento = investimento; }
}


