package expressoesregulares20.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rangeTest {
    public static void main(String[] args) {
        //META CATACTERES

        // \d -> vai buscar em uma frase/texto todos os digitos, pega a posições de onde está os números
        // \D -> que vai encontrar tudo que não for digito
        // \s -> vai procurar por espaços em branco
        // \S -> caractere que não é branco
        // \w -> procura de palavras a-z A-Z, digitos e _
        // \W -> vai encontrar tudo que não for caractere de palavra, Ex: @# $
        // [] -> procura apenas o que está entre []

        String regex = "[abc]"; //procure apenas abc, não precisa está na ordem
        String texto = "cafeBABE";

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
