package service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import dtos.FilmeDTO;
import entities.Ator;
import entities.Diretor;
import entities.Filme;
import repository.AtorRepository;
import repository.DiretorRepository;
import repository.FilmeRepository;

public class FilmeService {

    private FilmeRepository filmeRepository;
    private AtorRepository atorRepository;
    private DiretorRepository diretorRepository;

    public FilmeService(){
        this.filmeRepository = new FilmeRepository();
        this.atorRepository = new AtorRepository();
        this.diretorRepository = new DiretorRepository();
    }

    // versão antiga, com parâmetros soltos
    public boolean AddFilme(String nomeFilme, String diretor,
            String atores[], float nota) {

        Diretor d = new Diretor(diretor);
        this.diretorRepository.AddDiretor(d);

        HashSet<Ator> elenco = new HashSet<Ator>();

        for (String nomeAtor : atores) {
            Ator ator = new Ator(nomeAtor);
            this.atorRepository.AddAtor(ator);
            elenco.add(ator);
        }

        Filme filme = new Filme(nomeFilme, d, elenco, nota);

        return this.filmeRepository.AddFilme(filme);
    }

    // nova versão, que o Controller está chamando: recebe um FilmeDTO
    public boolean AddFilme(FilmeDTO filmeDto) {
        return this.AddFilme(
                filmeDto.getNome(),
                filmeDto.getDiretor(),
                filmeDto.getElenco(),
                filmeDto.getNota()
        );
    }

    public List<FilmeDTO> listaFilmesPorNome() {
        List<FilmeDTO> lista = new ArrayList<>();

        for (Filme filme : this.filmeRepository.getFilmes()) {
            lista.add(new FilmeDTO(filme));
        }

        lista.sort((f1, f2) -> f1.getNome().compareToIgnoreCase(f2.getNome()));

        return lista;
    }

    public List<FilmeDTO> listaFilmesPorDiretor(String diretor) {
        List<FilmeDTO> lista = new ArrayList<>();

        for (Filme filme : this.filmeRepository.getFilmes()) {
            if (filme.getDiretor().getNome().equalsIgnoreCase(diretor)) {
                lista.add(new FilmeDTO(filme));
            }
        }

        return lista;
    }

    public List<FilmeDTO> listaFilmesPorAtor(String ator) {
        List<FilmeDTO> lista = new ArrayList<>();

        for (Filme filme : this.filmeRepository.getFilmes()) {
            for (Ator a : filme.getElenco()) {
                if (a.getNome().equalsIgnoreCase(ator)) {
                    lista.add(new FilmeDTO(filme));
                    break; // já achou, não precisa continuar olhando o elenco desse filme
                }
            }
        }

        return lista;
    }

    public List<FilmeDTO> listaFilmesPorNota(float nota) {
        List<FilmeDTO> lista = new ArrayList<>();

        for (Filme filme : this.filmeRepository.getFilmes()) {
            if (filme.getNota() == nota) {
                lista.add(new FilmeDTO(filme));
            }
        }

        return lista;
    }

    public List<String> listaAtores() {
        List<String> lista = new ArrayList<>();

        for (Ator ator : this.atorRepository.getAtores()) {
            lista.add(ator.getNome());
        }

        return lista;
    }

    public List<String> listaDiretores() {
        List<String> lista = new ArrayList<>();

        for (Diretor diretor : this.diretorRepository.getDiretos()) {
            lista.add(diretor.getNome());
        }

        return lista;
    }
}