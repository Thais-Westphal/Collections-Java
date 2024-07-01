package Set.OperacoesBasicas;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidado
{
    private Set <Convidado> convidadoSet;

    public ConjuntoConvidado()
    {
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite)
    {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite)
    {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet )
        {
            if (c.getCodigoConvite() == codigoConvite)
            {
                convidadoParaRemover =  c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados()
    {
        return convidadoSet.size();
    }
    public void exibirConvidados()
    {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args)
    {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidados dentro do Set de Convidados ");

        conjuntoConvidado.adicionarConvidado("Convidado 1 ", 1234);
        conjuntoConvidado.adicionarConvidado("Convidado 2 ", 2468);
        conjuntoConvidado.adicionarConvidado("Convidado 3 ", 2468);
        conjuntoConvidado.adicionarConvidado("Convidado 4 ", 5555);

        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidados dentro do Set de Convidados ");

        conjuntoConvidado.removerConvidadoPorCodigoConvite(5555);
        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidados dentro do Set de convidados");

        conjuntoConvidado.exibirConvidados();



    }

}
