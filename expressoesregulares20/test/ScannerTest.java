package expressoesregulares20.test;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("1 true 100 oi");

        while(scanner.hasNext()){// existe uma posição/valor
            System.out.println(scanner.next());//vai pegar o valor
        }

        System.out.println("############################################");

        Scanner scanner2 = new Scanner("1 true 100 oi");

        while(scanner2.hasNext()){// existe uma posição/valor
            if(scanner2.hasNextInt()){//existe uma posião/valor int
                int i = scanner2.nextInt();//pega o valor
                System.out.println("Int: "+i);
            }else if(scanner2.hasNextBoolean()){
                boolean b = scanner2.nextBoolean();
                System.out.println("Bollean: "+b);
            }else{
                System.out.println("String: "+scanner2.next());
            }
        }

    }
}
