public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Calculadora.setPI(3.14f);
        System.out.println(calculadora.circunferencia(3));
        System.out.println(calculadora.volumeEsfera(5));
        System.out.println(calculadora.volumeCilindro(2,10));
    }
}