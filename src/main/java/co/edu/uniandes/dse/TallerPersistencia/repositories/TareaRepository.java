package co.edu.uniandes.dse.TallerPersistencia.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.edu.uniandes.dse.TallerPersistencia.entities.DesarrolladorEntity;
import co.edu.uniandes.dse.TallerPersistencia.entities.TareaEntity;

@Repository
public interface TareaRepository extends JpaRepository<DesarrolladorEntity, Long> {
    List<TareaEntity> findByEstado(String estado);
}
