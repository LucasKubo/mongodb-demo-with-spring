package com.example.mongodbdemowithspring.repository;

import com.example.mongodbdemowithspring.model.Pessoa;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PessoaRepository extends MongoRepository<Pessoa, String> {

}