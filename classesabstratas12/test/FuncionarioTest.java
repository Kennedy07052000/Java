package classesabstratas12.test;

import classesabstratas12.classes.Funcionaio;
import classesabstratas12.classes.Gerente;
import classesabstratas12.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        //Funcionaio f = new Funcionaio("Marcos", "20102-2", 2000); Não existe mais pois é uma classe ABSTRACT e classes ABSTRACTS não podem ser instaciadas
        Gerente g = new Gerente("Anna", "11122-2", 2000);
        Vendedor v = new Vendedor("Camila", "22211-4", 1500, 5000);
        v.calculaSalario();
        g.calculaSalario();
        System.out.println(g);
        System.out.println("-----------------------------");
        System.out.println(v);
    }
}
