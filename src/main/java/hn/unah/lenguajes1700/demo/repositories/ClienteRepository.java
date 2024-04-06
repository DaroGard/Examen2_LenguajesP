package hn.unah.lenguajes1700.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes1700.demo.entities.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String> {

}
