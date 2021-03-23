package AssociacaoExercicio.classes;

public class Seminario {
    private Alunos[] alunos;
    private Professor professor;
    private Local local;
    private String titulo;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }

    public void print() {
        System.out.println("-----------Relatório de seminários-----------");
        System.out.println("Título: " + this.titulo);
        if (this.professor != null) {
            System.out.println("Professor palestrante: " + this.professor.getNome());
        } else {
            System.out.println("Nenhum professor cadastrado para esse seminário");
        }
        if (this.local != null) {
            System.out.println("Local: " + this.local.getRua() + " Bairro: " + this.local.getBairro());
        } else {
            System.out.println("Nenhum local cadastrado para esse seminário");
        }
        if (alunos != null && alunos.length != 0) {//Arrays devemos verificar .length para ver se tem valor dentro dele
            System.out.println("----Alunos participantes----");
            for (Alunos aluno : alunos) {
                System.out.println(aluno.getNome());
            }
            return;
        }
        System.out.println("Nenhum aluno cadastrado");//caso o if() não seja verdadeiro, mostra esse sout, poderia ser um else
    }

    public Alunos[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Alunos[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
