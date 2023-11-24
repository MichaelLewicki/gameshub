package cl.lewickidev.gameshub.domain.shared;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

@RegisterForReflection
@Data
public class ErrorResponse {

    private String code;
    private String message;

    public ErrorResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

}