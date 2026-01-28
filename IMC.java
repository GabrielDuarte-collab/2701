public class IMC {

    // Função 1: calcularIMC
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Função 2: classificarIMC
    public static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso normal";
        } else if (imc >= 25.0 && imc <= 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    // Função 3: exibirResultado
    public static void exibirResultado(String nome, double imc, String classificacao) {
        System.out.println("Nome: " + nome);
        System.out.println("IMC: " + imc);
        System.out.println("Classificação: " + classificacao);
    }

    // Método principal para testar o programa
    public static void main(String[] args) {
        String nome = "João";
        double peso = 80.0;
        double altura = 1.75;

        double imc = calcularIMC(peso, altura);
        String classificacao = classificarIMC(imc);
        exibirResultado(nome, imc, classificacao);
    }
}