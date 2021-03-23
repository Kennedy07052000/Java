package AssociacaoExercicio.test;

import AssociacaoExercicio.classes.Alunos;
import AssociacaoExercicio.classes.Local;
import AssociacaoExercicio.classes.Professor;
import AssociacaoExercicio.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Alunos aluno = new Alunos("William Suane", 27);
        Alunos aluno2 = new Alunos("Joana D'Arc", 20);

        Seminario sem = new Seminario("Como ser um baita programador e ficar rico");
        Professor prof = new Professor("Yoda", "Usar a força para programar");
        Local local = new Local("Rua das araras", "mato");

        aluno.setSeminario(sem); //Esse aluno vai participar desse seminário
        aluno2.setSeminario(sem);

        sem.setProfessor(prof);//Associamos esse professor a esse seminário
        sem.setLocal(local);//Associamos esse Local a esse seminário
        sem.setAlunos(new Alunos[]{aluno, aluno2});

        Seminario[] semArray = new Seminario[1];
        semArray[0] = sem;
        prof.setSeminarios(semArray);

        sem.print();
        prof.print();

    }
}
