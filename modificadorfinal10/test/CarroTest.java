package modificadorfinal10.test;

import modificadorfinal10.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.getCOMPRADOR().setNome("Kuririn");
        System.out.println(c.getCOMPRADOR());

    }
}
