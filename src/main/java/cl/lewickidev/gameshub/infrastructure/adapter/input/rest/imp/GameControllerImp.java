package cl.lewickidev.gameshub.infrastructure.adapter.input.rest.imp;

import cl.lewickidev.gameshub.domain.model.Game;
import cl.lewickidev.gameshub.domain.shared.ErrorResponse;
import cl.lewickidev.gameshub.domain.shared.Errors;
import cl.lewickidev.gameshub.domain.shared.HandledException;
import cl.lewickidev.gameshub.domain.shared.Message;
import cl.lewickidev.gameshub.infrastructure.adapter.input.rest.GameController;
import cl.lewickidev.gameshub.infrastructure.port.input.GameInputPort;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class GameControllerImp implements GameController {

    @Inject
    GameInputPort gameInputPort;

    @Override
    public Response insertGame(Game gameRequest) throws HandledException {
        Response response = Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity(new ErrorResponse(Errors.SERVER_ERROR, "Error inesperado")).build();
        try {
            Game gameResponse = gameInputPort.insertGame(gameRequest);
            response = Response.status(Response.Status.OK).entity(gameResponse).build();
        } catch (HandledException he) {
            log.error(he.getMessage());
            response = Response
                    .status(Response.Status.fromStatusCode(Integer.valueOf(he.getCode())))
                    .entity(new Message(he.getMessage()))
                    .build();
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error(ex.getMessage());
            response = Response
                    .status(Response.Status.CONFLICT)
                    .entity(new Message(ex.getMessage()))
                    .build();
        }
        return response;
    }
}
