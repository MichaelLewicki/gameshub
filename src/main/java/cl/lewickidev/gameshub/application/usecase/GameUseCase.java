package cl.lewickidev.gameshub.application.usecase;

import cl.lewickidev.gameshub.domain.model.Game;
import cl.lewickidev.gameshub.domain.shared.HandledException;
import cl.lewickidev.gameshub.infrastructure.port.input.GameInputPort;
import cl.lewickidev.gameshub.infrastructure.port.output.GameOutputPort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class GameUseCase implements GameInputPort {

    @Inject
    GameOutputPort gameOutputPort;

    @Override
    public Game insertGame(Game gameRequest) throws HandledException {
        return gameOutputPort.insertGame(gameRequest);
    }
}
