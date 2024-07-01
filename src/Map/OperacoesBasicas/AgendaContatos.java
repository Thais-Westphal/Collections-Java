package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos
{
    private Map <String, Integer> agendaContatoMap;


    public AgendaContatos()
    {
        this.agendaContatoMap = new HashMap<>();
    }

   public void adicionarContato(String nome, Integer telefone)
   {
       agendaContatoMap.put(nome,telefone);
   }

   public void removerContato(String nome)
   {
        if (!agendaContatoMap.isEmpty())
        {
            agendaContatoMap.remove(nome);
        }
   }
   public void exibirContatos()
   {
       System.out.println(agendaContatoMap);
   }
   public Integer pesquisarPorNome(String nome)
   {
       Integer numeroPorNome = null;
       if (!agendaContatoMap.isEmpty())
       {
           numeroPorNome = agendaContatoMap.get(nome);
       }
       return numeroPorNome;
   }

    public static void main(String[] args)
    {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato ("Thais", 123456);
        agendaContatos.adicionarContato ("Thais", 23456);
        agendaContatos.adicionarContato ("Thais Westphal", 3456);
        agendaContatos.adicionarContato ("Thais2 ",1111111 );
        agendaContatos.adicionarContato ("Thais",1111111 );
        agendaContatos.adicionarContato ("Erika Santos",4444444 );

        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Erika Santos");
        agendaContatos.exibirContatos();

        System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Thais Westphal"));
    }



}
