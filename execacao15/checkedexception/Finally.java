package execacao15.checkedexception;

public class Finally {
    public static void main(String[] args) {
        abrirArquivo();

    }

    public static String abrirArquivo() {
        try{
            System.out.println("Abrindo um arquivo");
            System.out.println("Executando a leitura do arquivo");
            System.out.println("Escrevendo no arquivo ");
            return "valor";
        }catch (Exception e){
            System.out.println("Dentro do catch");
            e.printStackTrace();
        }finally {
            System.out.println("Fechar o arquivo");
        }
        return null;
    }
}
