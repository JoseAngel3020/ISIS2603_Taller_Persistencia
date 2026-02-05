package co.edu.uniandes.dse.TallerPersistencia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.edu.uniandes.dse.TallerPersistencia.entities.ProyectoEntity;

@Repository
public interface ProyectoRepository extends JpaRepository<ProyectoEntity, Long> {
}