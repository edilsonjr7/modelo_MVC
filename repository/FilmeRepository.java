package repository;

import java.util.HashSet;

import entities.Filme;



public class FilmeRepository {
    
     private HashSet<Filme> filmes;

    
      public FilmeRepository(){// construtor
            this.filmes= new HashSet<Filme>();
            
        }

          public HashSet<Filme> getFilmes(){
                return new HashSet<Filme>(this.filmes);
            }

            public boolean AddFilme(Filme filme){
                return this.filmes.add(filme);
            }

             public Filme getFilme(String nome) {
             for (Filme filme : this.filmes) {
                 if (filme.getNomeFilme().equalsIgnoreCase(nome)) {
            return filme;
        }
    }
        return null;
}
}
