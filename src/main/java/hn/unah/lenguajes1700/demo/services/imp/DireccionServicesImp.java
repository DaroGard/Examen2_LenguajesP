package hn.unah.lenguajes1700.demo.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1700.demo.entities.Cliente;
import hn.unah.lenguajes1700.demo.entities.Direccion;
import hn.unah.lenguajes1700.demo.repositories.ClienteRepository;
import hn.unah.lenguajes1700.demo.repositories.DireccionRepository;
import hn.unah.lenguajes1700.demo.services.DireccionServices;

@Service
public class DireccionServicesImp implements DireccionServices {

    @Autowired
    private DireccionRepository direccionRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Direccion crearDireccion(Direccion direccion, String dni) {
        if (this.clienteRepository.existsById(dni)) {
            Cliente clienteAct = this.clienteRepository.findById(dni).get();
            clienteAct.setDireccion(direccion);
            direccion.setCliente(clienteAct);
            this.clienteRepository.save(clienteAct);
            return this.direccionRepository.save(direccion);
        }
        return null;
    }
}
