package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.medico.DadosCadastroMedico;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    private static final Logger log = LoggerFactory.getLogger(MedicoController.class);

    @PostMapping
    public void cadastra(@Valid @RequestBody DadosCadastroMedico dados){
//        log.info(dados);
        System.out.println(dados);
    }

}
