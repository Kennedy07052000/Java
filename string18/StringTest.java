package string18;

import java.util.Locale;

public class StringTest {
    public static void main(String[] args) {
        String nome = "William";
        //String sobrenome = new String(" Sousa");
        nome.concat(" Sousa"); //Dessa forma vai só imprimir o nome "William" pois a variável a ponta para esse endereço de memória
        nome = nome.concat(" Sousa"); //vai imprimir "William Sousa", pois está sendo guardado dentro da variável e a variável apontando para aquele endereço de memória
        System.out.println(nome);

        String teste = "Goku";
        String teste2 = "goku";
        System.out.println(teste.charAt(0));//Vai trazer G, pois o índice de G é o 0
        System.out.println(teste.equalsIgnoreCase(teste2));
        System.out.println(teste.length());//saber o tamanho da String
        System.out.println(teste.replace('o', 'a'));//Vai substituir o O pelo A
        System.out.println(teste.toLowerCase());//Vai passar tudo para minúsuculo
        System.out.println(teste.toUpperCase());//Vai passar tudo para maiúsculo
        System.out.println(teste.substring(0,2));//Vai pegar um String até onde vc manda, passando os índices
        System.out.println(teste2.trim());//vai tirar todos os espaços do começo e do fim da string

    }
}
