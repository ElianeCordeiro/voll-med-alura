package med.voll.api.consulta;

import med.voll.api.medico.DadosListagemMedicos;
import med.voll.api.paciente.DadosListagemPaciente;

import java.time.LocalDateTime;

public record DadosConsulta(DadosListagemPaciente paciente,
                            DadosListagemMedicos medico,
                            LocalDateTime data) {
}
