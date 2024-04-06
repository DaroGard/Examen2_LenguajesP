package hn.unah.lenguajes1700.demo.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1700.demo.entities.Cliente;
import hn.unah.lenguajes1700.demo.repositories.ClienteRepository;
import hn.unah.lenguajes1700.demo.repositories.CuentasRepository;
import hn.unah.lenguajes1700.demo.services.ClienteServices;

@Service
public class ClienteServicesImp implements ClienteServices {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private CuentasRepository cuentasRepository;

    @Override
    public Cliente crearcliente(Cliente cliente) {
        if (this.clienteRepository.existsById(cliente.getDni())) {
            return null;
        } else {
            return this.clienteRepository.save(cliente);
        }
    }

    @Override
    public List<Cliente> obtenerClientes() {
        return (List<Cliente>) this.clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> obtenerClientePorDni(String dni) {
        return this.clienteRepository.findById(dni);
    }

}
