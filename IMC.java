import java.util.Scanner;

public class IMC {

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    
    public static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso normal";
        } else if (imc >= 25.0 && imc <= 29.5) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    
    public static void Resultado(String nome, double imc, String classificacao) {
        System.out.println("nome: " + nome);
        System.out.println("imc: " + imc);
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

        String nome = sc.nextLine();
        int peso = sc.nextInt();
        int altura = sc.nextInt();
        

        double imc = calcularIMC(peso,altura);
        String classificaçao = classificarIMC(imc);
        Resultado(nome,imc,classificaçao);

        sc.close();
     }
}
    
    

    
    
