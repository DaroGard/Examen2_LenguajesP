package hn.unah.lenguajes1700.demo.services;

import java.util.List;
import java.util.Optional;

import hn.unah.lenguajes1700.demo.entities.Cliente;

public interface ClienteServices {

    public Cliente crearcliente(Cliente cliente);

    public List<Cliente> obtenerClientes();

    public Optional<Cliente> obtenerClientePorDni(String dni);

}
