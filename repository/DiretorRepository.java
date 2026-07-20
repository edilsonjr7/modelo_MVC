package repository;

import java.util.HashSet;

import entities.Ator;
import entities.Diretor;

public class DiretorRepository {

    private HashSet<Diretor> diretores;

    
      public DiretorRepository(){// construtor
            this.diretores= new HashSet<Diretor>();
        }

          public HashSet<Diretor> getDiretos(){
                return new HashSet<Diretor>(this.diretores);
            }

            public boolean AddDiretor(Diretor diretor){
                return this.diretores.add(diretor);
            }

           
     public Diretor getDiretor(String nome) {
             for (Diretor diretor : this.diretores) {
                 if (diretor.getNome().equalsIgnoreCase(nome)) {
            return diretor;
        }
    }
        return null;
}
    
}
