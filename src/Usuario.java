package src;

public class Usuario {
    String nome;
    double peso;
    double altura;

    //metodo para calcular o peso do usuario

    public double calcularIMC(){
        return  (altura * altura) / peso;
    }

    /// Metodo para exibição no console
    public void exibirFicha(){
        System.out.println("--Ficha do Atleta--");
        System.out.println("Nome :" + nome);
        System.out.println("IMC:" + String.format("%.2f", calcularIMC()));

        System.out.println("___________");
    }
}
