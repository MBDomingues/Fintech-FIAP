package br.com.fintech.modules;

public class Conta {
    // criar variaveis
    protected static double saldo; // protected para poder ser modificado
    private static String nome;

    // apresentaçao das contas
    public void showValor() {
        System.out.println("\nNome: " + getNome());
        System.out.println("Saldo: " + getSaldo() + "\n");
    }


    // setters
    public static void setNome(String n) { nome = n; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    // getters
    public static double getSaldo() { return saldo; }
    public static String getNome() {return nome;}
}
