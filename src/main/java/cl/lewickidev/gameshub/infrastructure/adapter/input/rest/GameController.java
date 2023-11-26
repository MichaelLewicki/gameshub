package cl.lewickidev.gameshub.infrastructure.adapter.input.rest;

import cl.lewickidev.gameshub.domain.model.Game;
import cl.lewickidev.gameshub.domain.shared.HandledException;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path("/api/v1/gameshub")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Tag(name = "GameController", description = "Game Rest Controller for GamesHub API")
public interface GameController {

    @POST
    @Path("/game")
    @Operation(summary = "InsertGame", description = "Allows the insertion of a Game")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", description = "OK",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Game.class))),
            //@APIResponse(responseCode = "404", description="Resource not found."),
            //@APIResponse(responseCode = "409", description="Ha ocurrido un conflicto que impide aplicar la lógica de negocio en el servidor"),
            //@APIResponse(responseCode = "500", description="El servidor encontró una condición inesperada que le impide completar la petición.")

    })
    Response insertGame(@Valid @RequestBody Game gameRequest) throws HandledException;

}
