package med.voll.api.medico;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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
