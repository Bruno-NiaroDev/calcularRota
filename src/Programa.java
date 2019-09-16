public class Programa {

    public static void main(String args[]){
        Cidade saoJoao = new Cidade("São João");

        Cidade aguai = new Cidade("Aguaí");
        Cidade pinhal = new Cidade("Pinhal");
        Cidade vargem = new Cidade("Vargem");
        Cidade grama = new Cidade("Grama");

        //Inicio do mundo
        saoJoao.cidadesVizinhas.add(new CidadeVizinha(saoJoao, 0));

        //Possiveis rotas
        saoJoao.cidadesVizinhas.add(new CidadeVizinha(aguai, 20));
        saoJoao.cidadesVizinhas.add(new CidadeVizinha(pinhal, 40));
        saoJoao.cidadesVizinhas.add(new CidadeVizinha(vargem, 18));
        saoJoao.cidadesVizinhas.add(new CidadeVizinha(grama, 50));

        Rota rota = new Rota();

        System.out.println(rota.calculaRota(saoJoao, "São João", "Grama"));
    }
}
