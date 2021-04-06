package expressoesregulares20.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaracterNegacaoTest {
    public static void main(String[] args) {
        // ^ -> usado para excluir algo que vc não quer da expressão. [^abc] ou seja vc quer qualquer coisa que não seja abc

        int hex = 0x1;
        String regex = "proj([^,])*"; //vai começar com proj e tenha qualquer coisa que não seja "," e quer isso 0 ou + vezez
        String texto = "proj1.bkp, proj1.java, proj1.classe, proj1final.java, proj2.bkp, proj3.java, diagrama, texto, foto";

        Pattern pattern = Pattern.compile(regex); //Temos que compilar a expressão regular
        Matcher matcher = pattern.matcher(texto); //Vai procurar dentro do texto essa expressão regular

        System.out.println("texto: " +texto);
        System.out.println("indice: 0123456789012");
        System.out.println("expressao: " + matcher.pattern());
        System.out.println("posiçoes encontradas");

        //temos que percorrer esse texto
        while(matcher.find()){ //enquanto for encontrando ele vai imprimir onde encontrou
            System.out.println(matcher.start() +" " + matcher.group()); //matcher.group() vai retornar o valor
        }
    }
}
