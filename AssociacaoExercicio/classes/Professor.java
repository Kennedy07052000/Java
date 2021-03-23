package AssociacaoExercicio.classes;

public class Professor {
    private Seminario[] seminarios;
    private String nome;
    private String especialidade;

    public Professor(String nome, String especializacao) {
        this.nome = nome;
        this.especialidade = especializacao;
    }

    public Professor() {
    }

    public void print() {
        System.out.println("-----------Relatório de professor-----------");
        System.out.println("Nome do professor: " + this.nome);
        System.out.println("Especialidade : " + this.especialidade);
        System.out.println("Seminários participantes");
        if (seminarios != null && seminarios.length != 0) {
            for (Seminario sem : seminarios) {
                System.out.println(sem.getTitulo());
            }
            return; //podiamos usar um else no lugar de return
            //return serve como um break; caso seja verdadeira
        }
        System.out.println("Professor não vinculado a nenhum seminário");
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
