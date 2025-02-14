package med.voll.api.medico;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Especialidade {

    ORTOPEDIA,
    CARDIOLOGIA,
    GINECOLOGIA,
    DERMATOLOGIA;

    @JsonCreator
    public static Especialidade fromValue(String value) {
        return Especialidade.valueOf(value.toUpperCase());
    }

}
