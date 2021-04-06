package string18;

public class StringBuilderTest {
    public static void main(String[] args) {
        String s = "Uma frase comum";
        StringBuilder sb = new StringBuilder(16);
        sb.append("Uma frase comum");//toda vez que quiser adicionar uma string usando o método APPEND
        System.out.println(sb);
        System.out.println(sb.delete(0,2));//Vai deletar do indice 0 até o 2
        System.out.println(sb.insert(2, "####"));//vai inserir ### depois do indice 2
        System.out.println(sb.reverse());//inverte a String inteira


    }
}
