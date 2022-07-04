package AulaPOOGuanabara;

public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[3];
        l[0] = new Lutador("Marcos", "Brasileiro", 22, 1.87, 90.7, 10, 3, 5);
        l[1]=new Lutador("batata","russo",25,1.90,95,4,3,2);
        l[2]=new Lutador("montanha","westerose",30,2.10,110,9,1,4);
        l[2].apresentar();
        Lutas UFC = new Lutas(l[0],l[1],3,true);
        UFC.marcarLuta(l[0],l[1]);
        UFC.lutar();

    }
}
