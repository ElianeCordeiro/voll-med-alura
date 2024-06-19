package med.voll.api.controller;

import med.voll.api.medico.DadosListagemMedicos;
import med.voll.api.medico.MedicoRepository;
import med.voll.api.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;



@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private PacienteRepository pacienteRepository;


    @PostMapping
    public void agendarConsulta(@RequestBody Long medicoId, Long pacienteId, Date data){
        var paciente = pacienteRepository.getReferenceById(pacienteId);
        var medico = medicoRepository.getReferenceById(medicoId);

        if(medico == null){
            paciente.agendarConsulta(data, medico);
        }
    }
}
