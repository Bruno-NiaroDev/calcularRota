import java.util.ArrayList;

public class Rota {

    Cidade cidade;
    private int percurso;
    private boolean comecaContar = false;
    private boolean fim = false;
    String retorno;

    String calculaRota(Cidade cidade, String partida, String destino ){

        for(CidadeVizinha vizinha: cidade.cidadesVizinhas){

            if(vizinha.cidade.nome == partida) {
                //percurso = vizinha.distancia;
                comecaContar = true;

            } else if (comecaContar == true && fim == false) {
                percurso = percurso + vizinha.distancia;
                if(vizinha.cidade.nome == destino){
                    comecaContar = false;
                    fim = true;

                }
            }



        }
        retorno =  "--------------------------------------------------------------------\n\n CALCULAMOS SUA ROTA";
        retorno +=  "\n\n--------------------------------------------------------------------\n\n";
        retorno += "Cidade de partida: " + partida;
        retorno += "\nCidade de destino: " + destino;
        retorno += "\nO quanto você percoreu foi : " + percurso + "Km";

        return retorno;
    }
}
