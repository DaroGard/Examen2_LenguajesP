package hn.unah.lenguajes1700.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1700.demo.entities.Direccion;
import hn.unah.lenguajes1700.demo.services.imp.DireccionServicesImp;

@RestController
@RequestMapping("/cuentabancaria")
public class DireccionController {

    @Autowired
    private DireccionServicesImp direccionServicesImp;

    @PostMapping("/crear/direccion/cliente/{dni}")
    public Direccion crearDireccion(@RequestBody Direccion direccion, @PathVariable String dni) {
        return this.direccionServicesImp.crearDireccion(direccion, dni);
    }

}
