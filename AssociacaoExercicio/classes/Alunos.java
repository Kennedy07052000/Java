package AssociacaoExercicio.classes;

public class Alunos {
    private Seminario seminario;
    private String nome;
    private int idade;

    public Alunos(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Alunos() {
    }

    public void print(){
        System.out.println("-----------Relatório de alunos-----------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if(this.seminario != null){ //verificamos se a variável tem algum valor nela para não retornar erro
            System.out.println("Seminário inscrito: " + this.seminario.getTitulo()); //pega o valor variável get
        }else{
            System.out.println("Aluno não está incrito em nenhum seminário" );
        } //FAZEMOS ISSO PARA TOSSAS AS VARIÁVEIS DE REFERÊNCIA(ASSOCIAÇÃO)


    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
