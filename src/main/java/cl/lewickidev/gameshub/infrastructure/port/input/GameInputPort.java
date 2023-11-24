package cl.lewickidev.gameshub.infrastructure.port.input;

import cl.lewickidev.gameshub.domain.model.Game;
import cl.lewickidev.gameshub.domain.shared.HandledException;

public interface GameInputPort {

    Game insertGame(Game gameRequest) throws HandledException;

}
