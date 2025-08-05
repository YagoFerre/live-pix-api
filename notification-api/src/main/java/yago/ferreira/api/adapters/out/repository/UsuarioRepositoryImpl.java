package yago.ferreira.api.adapters.out.repository;

import org.springframework.stereotype.Component;
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
        return null;
    }
}
