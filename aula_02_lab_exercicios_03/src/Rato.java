public class Rato {
    public float velocidade;
    public boolean escondido;
    public void esconder(){
        this.escondido = true;
    }
    public void procurarComida(){
        this.escondido = false;
    }
    public String toString(){
        return "Velocidade Rato: " + this.velocidade + "O rato está escondido?" + this.escondido;
    }
    public  Rato(int velocidade){
        this.velocidade = velocidade;
    }
}
