package datas19.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//Criando um calendário
        String mascara = "yyyy.MM.dd 'as' HH:mm:ss";
        String masc = "dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat formatador = new SimpleDateFormat(masc);//Data personalizada, usa letras para formatar
        System.out.println(formatador.format(c.getTime()));
    }
}
