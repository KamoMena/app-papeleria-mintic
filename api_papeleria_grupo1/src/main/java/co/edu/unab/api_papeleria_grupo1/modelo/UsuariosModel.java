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
@Table(name = "usuarios")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UsuariosModel {
    @Id
    @Column(name = "id_Usuario")
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int idusuario;
    @Column(nullable = false, unique = true)
    private String nombre;
    private String apellido;
    private int id_cargo;
    private int telefono;
    private String email;
    private int contraseña;
    private String estado;
    

   
}
