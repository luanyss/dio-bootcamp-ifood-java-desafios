package br.com.dio.desafio.dominio;
import java.util.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Bootcamp {

    private String nomeBootcamp;
    private String descricaoBootcamp;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNomeBootcamp() {
        return nomeBootcamp;
    }

    public void setNomeBootcamp(String nomeBootcamp) {
        this.nomeBootcamp = nomeBootcamp;
    }

    public String getDescricaoBootcamp() {
        return descricaoBootcamp;
    }

    public void setDescricaoBootcamp(String descricaoBootcamp) {
        this.descricaoBootcamp = descricaoBootcamp;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsIncritos() {
        return devsInscritos;
    }

    public void setDevsIncritos(Set<Dev> devsIncritos) {
        this.devsInscritos = devsIncritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "Nome Bootcamp = '" + nomeBootcamp + '\'' +
                ",Descrição Bootcamp = '" + descricaoBootcamp + '\'' +
                ",Data Inicial = " + dataInicial +
                ",Data Final = " + dataFinal +
                ",Devs Inscritos = " + devsInscritos +
                ",Conteúdos = " + conteudos +
                '}';
    }
}
