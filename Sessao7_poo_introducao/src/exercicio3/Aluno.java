package exercicio3;

public class Aluno {
    private String nome;
    private double nota1, nota2, nota3;

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return nota1 * 0.30 + nota2 * 0.35 + nota3 * 0.35;
    }

    public boolean testeAprovado() {
        return calcularMedia() >= 60.0;
    }

    public double pontosFaltando() {
        if (testeAprovado()) {
            return 0.0;
        } else {
            return 60.0 - calcularMedia();
        }
    }

}
