package yago.ferreira.api.adapters.out.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import yago.ferreira.api.adapters.out.entity.UsuarioEntity;
import yago.ferreira.api.domain.common.BaseMapper;
import yago.ferreira.api.domain.model.UsuarioModel;

@Mapper
public interface NotificationMapper extends BaseMapper<UsuarioEntity, UsuarioModel> {
    NotificationMapper INSTANCE = Mappers.getMapper(NotificationMapper.class);
}
