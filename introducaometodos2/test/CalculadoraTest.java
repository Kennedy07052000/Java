package introducaometodos2.test;

import introducaometodos2.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(55.5,5);
        System.out.println("Divisão de dois números");
        double result = calc.divideDoisNumeros(20,0);
        System.out.println(result);
        System.out.println("imprimindo dois numeros divididos");
        calc.imprimiDoisNumerosDivididos(20,0);
        System.out.println("Continuar a exec");

        int[] numeros = {1,2,3,4,5};
        calc.somaArray(numeros);
        calc.somaVarArgs(1,2,3,4,5);
    }
}
