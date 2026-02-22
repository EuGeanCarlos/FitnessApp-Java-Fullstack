package src;

public class Alimento {
    // Atributos
    String nome;
    double calorias;
    double quantidadeGramas;

    //Nosso construtor: Criando objetos com dados iniciais

    public Alimento(String nome, double calorias, double quantidadeGramas){

     this.nome = nome;
     this.calorias = calorias;
     this.quantidadeGramas = quantidadeGramas;

    }

    //Metodo para exibir as informações do alimento

    public void exibirInfo(){
        System.out.println("Item:" + nome + "| Calorias: " + calorias + " Kcal" + "| Quantidade de Gramas: " + quantidadeGramas  );
    }
}
