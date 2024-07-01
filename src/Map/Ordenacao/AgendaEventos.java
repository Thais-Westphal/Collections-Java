package Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos
{
        private Map <LocalDate, Eventos> eventosMap;

    public AgendaEventos()
    {
        this.eventosMap = new HashMap<>();
    }
    public void adicionarEvento (LocalDate data, String nome, String atracao)
    {
        Eventos eventos = new Eventos(nome, atracao);
        eventosMap.put(data, eventos);
    }
    public void exibirAgenda()
    {
        Map <LocalDate, Eventos> eventosTreeMap =  new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }
    public void obterProximoEvento()
    {
        /*
        Set<LocalDate> dateSet = eventosMap.keySet();
        Collection <Eventos> values = eventosMap.values();
        */
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Eventos proximoEvento = null;
        Map <LocalDate, Eventos> eventosTreeMap =  new TreeMap<>(eventosMap);

        for (Map.Entry<LocalDate, Eventos> entry : eventosTreeMap.entrySet())
        {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual))
            {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println(" O  próximo evento: " + proximoEvento + "acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args)
    {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 1), "Evento 4", "Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 2), "Evento 5", "Atração 5");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
