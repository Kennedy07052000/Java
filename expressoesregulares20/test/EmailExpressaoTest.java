package expressoesregulares20.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExpressaoTest {
    public static void main(String[] args) {
        //META CATACTERES

        // \d -> vai buscar em uma frase/texto todos os digitos, pega a posições de onde está os números
        // \D -> que vai encontrar tudo que não for digito
        // \s -> vai procurar por espaços em branco
        // \S -> caractere que não é branco
        // \w -> procura de palavras a-z A-Z, digitos e _
        // \W -> vai encontrar tudo que não for caractere de palavra, Ex: @# $
        // [] -> procura apenas o que está entre []

        // quantificadores quer dizer que vc deve procurar por uma ou mais ocorrências. 4 tipo de quantificadores
        // 1 -> ? zero ou uma
        // 2 -> * zero ou mais
        // 3 -> + uma ou mais
        // 4 -> {n,m} de n até m
        // () -> usado para agrupar
        // | -> colocar ou
        // $ -> usado para encontrar algo no fim da linha
        // EXEMPLO: o(vic)o -> procure algo que comece com "o" que tenha "vic" seguidos de "o"

        int hex = 0x1;        //0-9 = 0 1 2 3 4 5 6 7 8 9
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";// = "([\\w\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"
        String texto = "fulano@hotmail.com, 102Abc@gmail.com, #@!abrao@mail, teste@gmail.com.br, teste@mail";
        System.out.println("Email válido? " + " #@!abrao@mail".matches(regex));//matches(regex) vai validar se o  #@!abrao@mail é valido retornando true or false

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
