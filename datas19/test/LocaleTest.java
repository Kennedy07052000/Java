package datas19.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        //ISO 639 pt - português,  BR - Brazil, en - inglês, US - Estados Unidos
                                    //O primeiro parâmetro é o idioma e o segundo o PAÍS
        Locale locItaly = new Locale("it", "IT"); //italiano da Itália
        Locale locSuica = new Locale("it", "CH"); //italiano na Suiça
        Locale locBrasil = new Locale("pt", "BR"); //português no Brasil

        Calendar c = Calendar.getInstance();
        //se apagar esse set ele pega a data atual
        c.set(2015, Calendar.DECEMBER, 23);//Setando uma data
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locSuica);
        //vai retornar em italiano a data que foi setada
        System.out.println("Itália " + df.format(c.getTime())); //precisa de uma data, mas tem um calendar getTime pega o date
        System.out.println("Suiça " + df2.format(c.getTime()));

        //MÉTODOS DA CLASSE LOCALE

        System.out.println(locItaly.getDisplayLanguage());//A língua será retornada
        System.out.println(locSuica.getDisplayCountry());//Nome do País
        System.out.println(locSuica.getDisplayCountry(locBrasil));//Nome do País que é inglês porém em português
    }
}
