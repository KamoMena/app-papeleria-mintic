package co.edu.unab.api_papeleria_grupo1.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cargos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CargoModel {
    @Id
    @Column(name="id_cargo")
    @GeneratedValue(strategy =  GenerationType.IDENTITY)//campo autoincrementado
    private int idcargo;
    private String nombre;
    private String estado;
    
}
