public class Calculadora {
    public static void setPI(float PI) {
        Calculadora.PI = PI;
    }

    private static float PI;
    public double circunferencia(double radio){
            double valor = 2 * PI * radio;
            return valor;
    }
    public static double volumeEsfera(double raio){
        double valor = (4/3) * PI * raio;
        return valor;
    }
    public static double volumeCilindro(double raio, double h){
        double valor = PI * (raio * raio) * h;
        return valor;
    }
}
