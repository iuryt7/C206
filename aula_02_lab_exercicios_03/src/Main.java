//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rato rato = new Rato(60);
        Gato gato = new Gato("preto", 9, 80);
        rato.procurarComida();
        rato.esconder();
        rato.procurarComida();
        gato.caçar(rato);
    }
}