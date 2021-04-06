package wrappers17.test;

public class WrappersTest {
    public static void main(String[] args) {
        //Tipos primitivos: são 8
        //São eles: byte, short, int, long, float, double, char e boolean

        //Utlizando uma classe wrapper, basta colocar o tipo primitivo maiúsculo
        //encapsula os tipos primitivos
        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Integer integerWrapper = 1;  //== Integer integerWrapperIgual = new Integer(10);// podemos colocar "10" como String que converte e fazer isso para todos
        Long longWrapper = 10L;
        Float floatWrapper = 10f;
        Double doubleWrapper = 10D;
        Character characterWrapper = 'A';
        Boolean booleanWrapper = true;

        String valor = "10";
        Float f = Float.parseFloat(valor); //vai converter em float
        System.out.println(f);

        System.out.println(Character.isDigit('9'));//Se for um número retorna TRUE
        System.out.println(Character.isLetter('A'));//se for uma letra retorna TRUE
    }
}
