package expressoesregulares20.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {
    public static void main(String[] args) {
        //2 classes que podem ser usadas para trabalhar com expressões regulares
        //primeira classe é a PATTERN -> procura padões
        //segunda classe é a MATCHER -> encontra os padrões

        String regex = "ab"; // nosso padrão
        String texto = "abaaaba";

        Pattern pattern = Pattern.compile(regex); //Temos que compilar a expressão regular
        Matcher matcher = pattern.matcher(texto); //Vai procurar dentro do texto essa expressão regular

        System.out.println("texto: " +texto);
        System.out.println("indice: 0123456789012");
        System.out.println("expressao: " + matcher.pattern());//ab, ou seja, matcher.pattern() é a expressão
        System.out.println("posiçoes encontradas");

        //temos que percorrer esse texto
        while(matcher.find()){ //enquanto for encontrando ele vai imprimir onde encontrou
            System.out.print(matcher.start() +" ");
        }




    }
}
