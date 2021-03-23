package introducaometodos2.classes;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.notas != null) {
            for (double nota : this.notas) {
                System.out.println("Notas: " + nota);
            }
        }
    }

    public void media() {
        double soma = 0;
        double media = 0;
        if (this.notas == null) {
            System.out.println("Esse aluno não tem notas!!");
            return;
        }
        for (double nota : this.notas) {
            soma += nota;
        }

        media = soma / this.notas.length;

        if (media < 6) {
            this.aprovado = false;
            System.out.println("Reprovado");
        } else {
            this.aprovado = true;
            System.out.println("Aprovado");
        }

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if(idade < 0){
            System.out.println("você não pode fazer isso");
            return;
        }
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public boolean isAprovado(){
        return this.aprovado;
    }
}
