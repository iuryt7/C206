public class Carro {
    Motor motor;
    public int tipoDePneu;
    public void correr() {
        System.out.println("Correndo");
    }
    public Carro(int tipoDePneu, int potencia, int turbo){
        this.tipoDePneu = tipoDePneu;
        this.motor = new Motor(potencia, turbo);
    }
}
