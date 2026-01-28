import java.util.Scanner;

public class imc {

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    
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

    
    public static void Resultado(String nome, double imc, String classificacao) {
        System.out.println("Nome: " + nome);
        System.out.println("IMC: " + imc);
        System.out.println("Classificação: " + classificacao);
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        sc.nextLine();
        System.out.printf("Digite seu peso: ");
        sc.nextInt();
        System.out.printf("Digite sua altura: ");
        sc.nextInt();

        double peso = 0;
        double altura = 0;
        String nome = sc.nextLine();

        double imc = calcularIMC(peso,altura);
        String classificaçao = classificarIMC(imc);
        Resultado(nome,imc,classificaçao);

        sc.close();
     }
}