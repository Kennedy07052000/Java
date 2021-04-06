package execacao15.error;

public class ErrorTest {
    public static void main(String[] args) {
        stackOverflowError();
    }

    public static void stackOverflowError(){
        stackOverflowError();//stack == pilha, stackoverflow é estourar o espaço em memória
    }
}
