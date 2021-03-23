package introducao;

public class Exercicio6 {
    public static void main(String[] args) {
        int contador = 0;
        while(contador < 100001){
            if(contador % 2 == 0){
                System.out.println(contador);
            }
            contador++;
        }
    }
}
