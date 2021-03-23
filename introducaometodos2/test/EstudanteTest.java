package introducaometodos2.test;

import introducaometodos2.classes.Estudante;

public class EstudanteTest
{
    public static void main(String[] args)
    {
        Estudante estudante = new Estudante();

        estudante.setNome("João Cleber");
        estudante.setIdade(-1);
        estudante.setNotas(new double[]{3,2,9.5});
        estudante.print();
        estudante.media();
        System.out.println(estudante.getNome());
        System.out.println("Aprovado? " + estudante.isAprovado());






    }
}
