package br.com.fintech.modules;

// import bibliotecas
import java.util.Scanner;

public class Cadastro extends Login {
    private String cpf;
    private String confirmaSenha;
    private String newEmail = getEmail();
    private String newSenha = getSenha();


    // getters
    public String getNewSenha() {return newSenha;}
    public String getConfirmaSenha() {
        return confirmaSenha;
    }



    // setters
    public void setNewEmail(String newEmail) {
        this.newEmail = newEmail;
    }
    public void setNewSenha(String newSenha) {
        this.newSenha = newSenha;
    }
    public void setConfirmaSenha(String confirmaSenha) {
        this.confirmaSenha = confirmaSenha;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    // polimorfismo - makelogin - cadastro
    @Override
    public void makeLogin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu email:");
        String newEmail = sc.next();
        System.out.println("Digite sua senha:");
        String newSenha = sc.next() + sc.nextLine();
        System.out.println("Confirme sua senha:");
        String confirmaSenha = sc.next() + sc.nextLine();
        System.out.println("Digite seu CPF");
        String cpf = sc.next();
        System.out.println("Digite seu Nome");
        String nomeCadastro = sc.next();

        // passo pra variavel
        setCpf(cpf);
        setNewEmail(newEmail);
        Conta.setNome(nomeCadastro);
        setNewSenha(newSenha);
        setConfirmaSenha(confirmaSenha);
        }
}