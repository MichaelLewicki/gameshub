package cl.lewickidev.gameshub.infrastructure.port.output;

import cl.lewickidev.gameshub.domain.model.Game;
import cl.lewickidev.gameshub.domain.shared.HandledException;

public interface GameOutputPort {

    Game insertGame(Game gameRequest) throws HandledException;

}
