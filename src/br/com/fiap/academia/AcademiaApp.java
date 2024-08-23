package br.com.fiap.academia;

import br.com.fiap.academia.model.Cliente;

public class AcademiaApp {

    public static void teste(){
        System.out.println("Academia");
    }

    public static void main(String[] args) {
        System.out.println("Sistema Academia");

        Cliente maria = new Cliente();
        Cliente ana = new Cliente();
        Cliente joaquim = new Cliente();
        new Cliente();

        maria.nome = "Maria da Silva";
        maria.email = "maria@terra.com";
        maria.peso = 54;
        maria.altura = 1.68;
        maria.calcularImc();

        ana.nome = "Ana Oliveira";
        ana.email = "ana@terra.com";
        ana.peso = 35;
        ana.altura = 1.78;
        ana.calcularImc();

        joaquim.nome = "Joaquim Almeida";
        joaquim.email = "joaquim@terra.com";
        joaquim.peso = 78;
        joaquim.altura = 1.78;
        joaquim.calcularImc();

        maria.imprimirDados();
        ana.imprimirDados();
        joaquim.imprimirDados();




    }

}
