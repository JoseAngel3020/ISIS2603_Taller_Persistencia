package co.edu.uniandes.dse.TallerPersistencia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class ProyectoEntity extends BaseEntity{
    private String nombre;
    private String descripcion;

    @PodamExclude
    @OneToMany(mappedBy = "proyecto")
    private List<TareaEntity> tareas = new ArrayList<>();

    @PodamExclude
    @ManyToMany
    private List<DesarrolladorEntity> desarrolladores = new ArrayList<>();
}
