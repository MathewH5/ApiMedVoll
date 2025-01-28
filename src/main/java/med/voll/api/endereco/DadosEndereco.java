package med.voll.api.endereco;

import jakarta.validation.constraints.NotNull;

public record DadosEndereco(@NotNull(message = "Rua é obrigatória")
                                    String logradouro,

                            @NotNull(message = "Bairro é obrigatório")
                                    String bairro,

                            @NotNull(message = "Cidade é obrigatória")
                                    String cidade,

                            @NotNull(message = "Estado é obrigatório")
                                    String estado,

                            @NotNull(message = "CEP é obrigatório")
                                    String cep,

                            String numero,

                            String complemento) {
}
