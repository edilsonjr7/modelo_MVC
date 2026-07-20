package repository;

import java.util.HashSet;

import entities.Ator;

public class AtorRepository {

    private HashSet<Ator> atores;


      public AtorRepository(){// construtor
            this.atores= new HashSet<Ator>();
        }

            public HashSet<Ator> getAtores(){
                return new HashSet<Ator>(this.atores);
            }

            public boolean AddAtor(Ator ator){
                return this.atores.add(ator);
            }

        public Ator getAtor(String nome) {
                for (Ator ator : this.atores) {
                 if (ator.getNome().equalsIgnoreCase(nome)) {
              return ator;
        }
    }
    return null;
}
 
}
