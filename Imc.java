public class Imc {
    public static  double calcularAreaRetangulo(double base, double altura) {
    return base * altura;
   }
    public static double calcularPerimetroRetangulo(double base, double altura) {
    return 2 * (base + altura);
   }
   public static void main(String[] args) {
    double base = 5.0;
    double altura = 3.0;
    
    double area =  calcularAreaRetangulo(base, altura);

    double perimetro = calcularPerimetroRetangulo(base, altura);

    System.out.println("Retangulo com base" + base + " e altura" + altura);
    System.out.println("area: " + area );
    System.out.println("perimetro: " + perimetro);
   }
}