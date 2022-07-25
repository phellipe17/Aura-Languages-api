package br.com.alura.LinguagensAPi;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinguagemRepository extends MongoRepository<Linguagem,String>{
    
}
