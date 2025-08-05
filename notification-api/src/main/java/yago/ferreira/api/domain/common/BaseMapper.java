package yago.ferreira.api.domain.common;

public interface BaseMapper<Entity, Model> {
    Entity toEntity(Model model);
    Model toDomainModel(Entity entity);
}
