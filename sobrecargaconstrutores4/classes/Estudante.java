package sobrecargaconstrutores4.classes;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;

    public Estudante(String matricula, String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    //sobrecarga de construtor
    public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
        this(matricula, nome, notas); //chamando o construtor de cima
        this.dataMatricula = dataMatricula;
    }

    //sobrecarga construtor
    public Estudante() {

    }

    public void imprime() {
        System.out.println(this.matricula);
        System.out.println(this.nome);
        for (double nota : notas) {
            System.out.println(nota + " ");
        }
        System.out.println(this.dataMatricula);
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
