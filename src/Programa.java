public class Programa {

    public static void main(String args[]){
        Cidade universo = new Cidade("São João");

        Cidade aguai = new Cidade("Aguaí");
        Cidade pinhal = new Cidade("Pinhal");
        Cidade vargem = new Cidade("Vargem");
        Cidade grama = new Cidade("Grama");

        //Inicio do mundo
        universo.cidadesVizinhas.add(new CidadeVizinha(universo, 0));

        //Possiveis rotas
        universo.cidadesVizinhas.add(new CidadeVizinha(aguai, 20));
        universo.cidadesVizinhas.add(new CidadeVizinha(pinhal, 40));
        universo.cidadesVizinhas.add(new CidadeVizinha(vargem, 18));
        universo.cidadesVizinhas.add(new CidadeVizinha(grama, 50));

        Rota rota = new Rota();

        System.out.println(rota.calculaRota(universo, "São João", "Grama"));
    }
}
