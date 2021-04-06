package datas19.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        float valor = 123.4567f;
        Locale locFranca = new Locale("fr");
        NumberFormat[] nfa = new NumberFormat[4]; //NumberFormat é uma classe abstrata, ou seja new NumberFormat() não existe, por isso criamos uma Array
        nfa[0] = NumberFormat.getInstance();//Pega o número padrão de acordo com o idioma do seu pc
        nfa[1] = NumberFormat.getInstance(locFranca);//Pega o número e coloca no formato da França

        //Moedas
        nfa[2] = NumberFormat.getCurrencyInstance();//Moeda padrão de acordo com seu pc, ou seja, Brasil = Real, pegando o valor setado lá em cima
        nfa[3] = NumberFormat.getCurrencyInstance(locFranca);// Pega o valor e colocar o valor na moeda da França

        for(NumberFormat nf : nfa){
            System.out.println(nf.format(valor));
        }

        //Quantidade de números depois da vírgula
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(5);
        System.out.println(nf.format(valor));


        String valorString = "123.4567";
        try {
            System.out.print("Valor String: ");
                                //O parse vai converter uma STRING em um VALOR DOUBLE,FLOAT
            System.out.println(nf.parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
