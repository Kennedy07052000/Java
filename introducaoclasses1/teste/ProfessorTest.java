package introducaoclasses1.teste;

import introducaoclasses1.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {

        Professor professor = new Professor();

        professor.nome = "Lucas";
        professor.matricula = "201802200738";
        professor.rg = "589.478.785";
        professor.cpf = "048.458.457-00";

        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.rg);
        System.out.println(professor.cpf);
    }
}
