package med.voll.api.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroPaciente(        @NotBlank(message = "Nome é obrigatório")
                                            String nome,

                                            @NotBlank (message = "Email é obrigatório")
                                            String email,

                                            @NotBlank (message = "CPF é obrigatório")
                                            String cpf,

                                            @NotBlank (message = "Telefone é obrigatório")
                                            String telefone,

                                            @NotNull(message = "Endereço é obrigatório") @Valid
                                            DadosEndereco endereco) {
}
