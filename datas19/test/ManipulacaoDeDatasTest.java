package datas19.test;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDeDatasTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);//data atual

        //Calendar c = new Calendar(); não podemos instanciar um objeto que é abstrato
        Calendar c = Calendar.getInstance(); //Pega um objeto da classe calendar
        if(Calendar.SUNDAY == c.getFirstDayOfWeek()){
            System.out.println("Domingo é o primeiro dia da semana");
        }
                            //get pega
        System.out.println(c.get(Calendar.DAY_OF_MONTH));//Pega algo que vc queira, usamos CALENDAR, pois uma classe abstrata é chamada pelo seu nome
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        c.add(Calendar.HOUR, 2); //Quero adicionar 2 horas
        c.add(Calendar.MONTH, 9); //Adiconar 9 meses na data
        Date date2 = c.getTime();//date2 pega o getTime do Calendar o número que reprensa a Data
        System.out.println(date2);

        //NumberFormat, Locate, Calendar, Date, DateFormat      5 classes quando se que trabalhar com números, datas ou moedas
    }
}
