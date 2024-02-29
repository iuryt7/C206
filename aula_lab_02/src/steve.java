public class steve {
    public int vida;
    public int fome;
    public int armadura;
    public float xp;

    public Ferramenta ferramentaAtual;

    public void correr() {
        System.out.println("Correndo!");
    }

    public void andar() {
        System.out.println("Andando!");
    }

    public void addFerramenta(Ferramenta ferramenta) {
        this.ferramentaAtual = ferramenta;
    }

    public String toString() {
        return "Vida: " + this.vida + " Fome: " + this.fome + " Armadura: " + this.armadura + " XP: " + this.xp;
    }

    steve(int vida, int fome, Ferramenta ferramenta) {
        this.ferramentaAtual = ferramenta;
        this.vida = vida;
        this.fome = fome;
        System.out.println("Steve criado!");
    }

    steve(int vida, int fome) {
        this.ferramentaAtual = new Ferramenta();
        this.vida = vida;
        this.fome = fome;
        System.out.println("Steve criado!");
    }

}
