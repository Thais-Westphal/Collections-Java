package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos
{
    private Set<Contato> contatoSet;

    public AgendaContatos()
    {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero)
    {
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContatos()
    {
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome)
    {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet)
        {
            if (c.getNome().startsWith(nome))
            {
                contatosPorNome.add(c);
            }

        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero)
    {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet)
        {
            if (c.getNome().equalsIgnoreCase(nome))
            {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args)
    {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Thais", 123456);
        agendaContatos.adicionarContato("Thais",584754);
        agendaContatos.adicionarContato("Thais Cunha", 1111111);
        agendaContatos.adicionarContato("Thais 2",654987);
        agendaContatos.adicionarContato("Erica Silva",1111111);

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Erica Silva "));
        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Erica Silva",5555555));

        agendaContatos.exibirContatos();

    }



}
