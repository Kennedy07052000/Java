package expressoesregulares20.test;

public class TokenTest {
    public static void main(String[] args) {
        String str = "William, Paulo, Joana, Camila, Anna, John, Matheus";
        String[] tokens = str.split(","); //colocamos o delimitador
        for(String arr: tokens){
            System.out.println(arr.trim());
        }
    }
}
