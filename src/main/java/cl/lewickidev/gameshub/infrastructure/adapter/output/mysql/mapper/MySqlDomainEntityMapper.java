package cl.lewickidev.gameshub.infrastructure.adapter.output.mysql.mapper;

import cl.lewickidev.gameshub.domain.model.Game;
import cl.lewickidev.gameshub.infrastructure.adapter.output.mysql.entity.GameEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA)
public interface MySqlDomainEntityMapper {


    Game toDTO(GameEntity gameEntity);

    GameEntity toEntity(Game game);

    List<Game> toGameDTOs(List<GameEntity> gameEntities);


}
