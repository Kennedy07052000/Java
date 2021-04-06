package expressoesregulares20.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataTest {
    public static void main(String[] args) {
        int hex = 0x1;        //0-9 = 0 1 2 3 4 5 6 7 8 9
        String regex = "\\d\\d/\\d\\d/\\d\\d\\d\\d"; // ou poderia ser assim "\\d{2}/\\d{2}/\\d{2,4}" {2} vai procurar dois digitos, vai procurar 2 ou 4 digitos \\d{2,4}
        String texto = "05/10/2010 05/05/2015 1/1/01 01/05/95"; //dd/MM/yyyy

        Pattern pattern = Pattern.compile(regex); //Temos que compilar a expressão regular
        Matcher matcher = pattern.matcher(texto); //Vai procurar dentro do texto essa expressão regular

        System.out.println("texto: " +texto);
        System.out.println("indice: 0123456789012");
        System.out.println("expressao: " + matcher.pattern());//ab, ou seja, matcher.pattern() é a expressão
        System.out.println("posiçoes encontradas");

        //temos que percorrer esse texto
        while(matcher.find()){ //enquanto for encontrando ele vai imprimir onde encontrou
            System.out.println(matcher.start() +" " + matcher.group()); //matcher.group() vai retornar o valor
        }
    }
}
