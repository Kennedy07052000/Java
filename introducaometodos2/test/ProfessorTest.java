package introducaometodos2.test;

import introducaometodos2.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "122.666.444-99";
        prof.matricula = "12145";
        prof.nome = "Marcos";
        prof.rg = "155551-5";

        Professor prof2 = new Professor();
        prof2.cpf = "257.785.441-00";
        prof2.matricula = "203657j";
        prof2.nome = "Joana";
        prof2.rg = "2014-7";

        prof.imprime(prof);
        prof.imprime(prof2);

    }
}
