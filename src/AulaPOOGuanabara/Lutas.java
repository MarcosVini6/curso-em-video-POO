package AulaPOOGuanabara;

import java.util.Random;

public class Lutas {
    Lutador desafiado;
    Lutador desafiante;
    int rounds;
    boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public Lutas(Lutador desafiado, Lutador desafiante, int rounds, boolean aprovada) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.rounds = rounds;
        this.aprovada = aprovada;
    }

    void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiante = l1;
            this.desafiado = l2;
        } else {
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }

    void lutar() {
        if (this.aprovada) {
            this.desafiado.apresentar();
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(desafiado.getNome() + " ganhou");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(desafiante.getNome() + " ganhou");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
            }
        } else {
            System.out.println("A luta não pode acontecer");
        }
    }
}
