package src;

public class Alimento {
    // Atributos
    private String nome;
    private double calorias;
    private double quantidadeGramas;

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

    //getters e setters (pora outras classes acessar os atributos)

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getQuantidadeGramas() {
        return quantidadeGramas;
    }

    public void setQuantidadeGramas(double quantidadeGramas) {
        this.quantidadeGramas = quantidadeGramas;
    }
}
