package br.com.fiap.academia.model;

public class Cliente {

    public String nome;
    public String email;
    public String telefone;
    public double altura;
    public double imc;
    public String estadoImc;
    public int peso;

    public void calcularImc(){

        imc = peso / Math.pow(altura, 2);
        determinarEstado();

    }


    private void determinarEstado(){

        if(imc < 18.5){
            estadoImc = "Abaixo do Peso";
        } else {
            estadoImc =  "Peso Ideal";
        }

    }

    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("IMC: " + imc);
        System.out.println("Estado IMC: " + estadoImc);
        System.out.println("+++++++++++++++++++++++++++");
    }


}
