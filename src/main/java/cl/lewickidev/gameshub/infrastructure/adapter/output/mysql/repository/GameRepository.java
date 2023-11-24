package cl.lewickidev.gameshub.infrastructure.adapter.output.mysql.repository;

import cl.lewickidev.gameshub.infrastructure.adapter.output.mysql.entity.GameEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GameRepository implements PanacheRepositoryBase<GameEntity,Long> {
}
