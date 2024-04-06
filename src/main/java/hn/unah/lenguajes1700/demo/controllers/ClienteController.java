package hn.unah.lenguajes1700.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1700.demo.entities.Cliente;
import hn.unah.lenguajes1700.demo.services.imp.ClienteServicesImp;

@RestController
@RequestMapping("/cuentabancaria")
public class ClienteController {

    @Autowired
    private ClienteServicesImp clienteServicesImp;

    @PostMapping("/crear/cliente")
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        return this.clienteServicesImp.crearcliente(cliente);
    }

    @GetMapping("/obtener/clientes")
    public List<Cliente> obtenerClientes() {
        return this.clienteServicesImp.obtenerClientes();
    }

    @GetMapping("/obtener/clientes/{dni}")
    public Optional<Cliente> obtenerCliente(@PathVariable String dni) {
        return this.clienteServicesImp.obtenerClientePorDni(dni);
    }

}
