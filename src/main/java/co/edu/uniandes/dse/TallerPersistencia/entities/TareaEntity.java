package co.edu.uniandes.dse.TallerPersistencia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;

@Data
@Entity
public class TareaEntity extends ProyectoEntity{
    private String titulo;
    private String estado;
    private int duracionEstimada;

    @PodamExclude
    @ManyToOne
    private ProyectoEntity proyecto;

    @PodamExclude
    @ManyToMany
    private java.util.List<DesarrolladorEntity> desarrolladores = new java.util.ArrayList<>();
}
