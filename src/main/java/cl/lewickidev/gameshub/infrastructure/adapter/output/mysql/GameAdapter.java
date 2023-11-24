package cl.lewickidev.gameshub.infrastructure.adapter.output.mysql;

import cl.lewickidev.gameshub.domain.model.Game;
import cl.lewickidev.gameshub.domain.shared.HandledException;
import cl.lewickidev.gameshub.infrastructure.adapter.output.mysql.entity.GameEntity;
import cl.lewickidev.gameshub.infrastructure.adapter.output.mysql.mapper.MySqlDomainEntityMapper;
import cl.lewickidev.gameshub.infrastructure.adapter.output.mysql.repository.GameRepository;
import cl.lewickidev.gameshub.infrastructure.port.output.GameOutputPort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class GameAdapter implements GameOutputPort {

    @Inject
    GameRepository gameRepository;

    @Inject
    MySqlDomainEntityMapper mapper;

    @Override
    public Game insertGame(Game gameRequest) throws HandledException {
        GameEntity gameEntity = mapper.toEntity(gameRequest);
        gameEntity.persist();
        return mapper.toDTO(gameEntity);
    }
}
