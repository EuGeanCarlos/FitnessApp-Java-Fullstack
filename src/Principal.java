package src;

import java.util.Scanner;

public class Principal {
    public static void main(String [] args){
    // Criando o "leitor" de dados do nosso sistema
        Scanner leitura = new Scanner(System.in);

    // Criando Objeto atleta beseado na class Usuario
        Usuario atleta = new Usuario();

        System.out.println("Digite seu nome: ");
        atleta.nome = leitura.nextLine();

        System.out.println("Digite seu peso: ");
        atleta.peso = leitura.nextDouble();

        System.out.println("Digite sua altura");
        atleta.altura = leitura.nextDouble();

        // chamando metodos
        atleta.exibirFicha();

        leitura.close();

    }


}
