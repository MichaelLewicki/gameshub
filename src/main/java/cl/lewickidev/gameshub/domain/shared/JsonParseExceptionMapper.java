package cl.lewickidev.gameshub.domain.shared;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

import java.io.IOException;

@Provider
public class JsonParseExceptionMapper implements ExceptionMapper<JsonParseException> {

    @Override
    public Response toResponse(JsonParseException exception) {
        // Crear una respuesta personalizada en formato JSON
        ErrorResponse errorResponse = new ErrorResponse("Error en el mapeo JSON", exception.getOriginalMessage());

        // Serializar el objeto JSON en una cadena
        String jsonError = toJsonString(errorResponse);

        return Response.status(Response.Status.BAD_REQUEST)
                .entity(jsonError)
                .type("application/json")
                .build();
    }

    private String toJsonString(Object object) {
        try {
            return new ObjectMapper().writeValueAsString(object);
        } catch (IOException e) {
            e.printStackTrace();
            return "{}";
        }
    }

    static class ErrorResponse {
        private final String error;
        private final String message;

        public ErrorResponse(String error, String message) {
            this.error = error;
            this.message = message;
        }

        public String getError() {
            return error;
        }

        public String getMessage() {
            return message;
        }
    }

}
