package yago.ferreira.api.adapters.out.repository;

import org.springframework.stereotype.Component;
import yago.ferreira.api.adapters.out.entity.UsuarioEntity;
import yago.ferreira.api.adapters.out.mapper.NotificationMapper;
import yago.ferreira.api.domain.model.UsuarioModel;
import yago.ferreira.api.domain.port.out.repository.UsuarioRepository;

@Component
public class UsuarioRepositoryImpl implements UsuarioRepository {
    private final JpaUsuarioRepository jpaUsuarioRepository;

    public UsuarioRepositoryImpl(JpaUsuarioRepository jpaUsuarioRepository) {
        this.jpaUsuarioRepository = jpaUsuarioRepository;
    }

    @Override
    public UsuarioModel executeSave(UsuarioModel domainModel) {
        UsuarioEntity usuarioEntity = NotificationMapper.INSTANCE.toEntity(domainModel);
        return NotificationMapper.INSTANCE.toDomainModel(jpaUsuarioRepository.save(usuarioEntity));
    }
}
