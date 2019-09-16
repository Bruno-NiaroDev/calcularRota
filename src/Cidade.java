import java.util.ArrayList;

public class Cidade {
    String nome;
    ArrayList<CidadeVizinha> cidadesVizinhas = new ArrayList<CidadeVizinha>();

    public Cidade(String nome){
        this.nome = nome;
    }
}