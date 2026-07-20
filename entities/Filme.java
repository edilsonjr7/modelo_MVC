package entities;

import java.util.HashSet;

public class Filme {

    private String nomeFilme;
    private Diretor diretor;
    private HashSet<Ator> elenco;
    private float nota;


    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public Diretor getDiretor() {
        return diretor;
    }


    public void setDiretor(Diretor diretor) {
        this.diretor = new Diretor(diretor);
    }


    public HashSet<Ator> getElenco() {
        return new HashSet<Ator> (elenco);
    }

    public void setElenco(HashSet<Ator> elenco) {
        this.elenco = elenco;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    

    public Filme(String nomeFilme, Diretor diretor, HashSet<Ator> elenco, float nota) {
        this.nomeFilme = nomeFilme;
        this.diretor = diretor;
        this.elenco = elenco;
        this.nota = nota;
    }
     
    
   
    
}
