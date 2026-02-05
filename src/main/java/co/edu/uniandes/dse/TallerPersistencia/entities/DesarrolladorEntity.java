package co.edu.uniandes.dse.TallerPersistencia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;

@Data
@Entity
public class DesarrolladorEntity extends BaseEntity{
    private String nombre;
    private String correo;
    @PodamExclude
    @ManyToMany(mappedBy = "desarrolladores")
    private java.util.List<ProyectoEntity> proyectos = new java.util.ArrayList<>();
    @ManyToMany(mappedBy = "desarrolladores")
    private java.util.List<TareaEntity> tareas = new java.util.ArrayList<>();
}
