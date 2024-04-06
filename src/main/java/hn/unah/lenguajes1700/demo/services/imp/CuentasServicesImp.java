package hn.unah.lenguajes1700.demo.services.imp;

import org.springframework.beans.factory.annotation.Autowired;

import hn.unah.lenguajes1700.demo.entities.Cuentas;
import hn.unah.lenguajes1700.demo.repositories.CuentasRepository;
import hn.unah.lenguajes1700.demo.services.CuentasServices;

public class CuentasServicesImp implements CuentasServices {

    @Autowired
    private CuentasRepository cuentasRepository;

    @Override
    public Cuentas crearCuentas(Cuentas cuentas) {
        if (this.cuentasRepository.existsById(cuentas.getNumeroCuenta())) {
            return null;
        } else {
            if (cuentas.getSaldo() >= 500) {
                cuentas.setEstado(true);
                return this.cuentasRepository.save(cuentas);
            } else {
                return null;
            }
        }
    }

}
