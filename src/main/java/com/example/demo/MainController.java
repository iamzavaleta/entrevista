package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/api")
public class MainController {
    @Autowired
    private ComprobanteRepository comprobanteRepository;

    @PostMapping(path="/comprobante")
    public @ResponseBody
    String addNewUser (@RequestParam String serie
            , @RequestParam Integer numero, @RequestParam Float monto) {

        Comprobante comprobante = new Comprobante();
        comprobante.setSerie(serie);
        comprobante.setNumero(numero);
        comprobante.setMonto(monto);

        comprobanteRepository.save(comprobante);
        return "Guardado Exitosamente";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Comprobante> getAll() {

        return comprobanteRepository.findAll();
    }
}
