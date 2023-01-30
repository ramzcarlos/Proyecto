package org.bedu.crp.Proyecto.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.rest.core.annotation.RestResource;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "spectrum4")
@RestResource(rel= "sprectum", path = "spectrum")
public class Spectrum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="Descripcion", nullable = false, length = 100)
    @NotNull(message = "La descripcion no puede estar vacío")
    private String name;
    @Column(name="Canal", nullable = false, length = 3)
    //@NotBlank(message = "Se debe proporcionar una dirección")
    @Size(min = 3, max = 5, message = "El nombre del cliente debe tener al menos 3 letras y ser menor a 5")
    private String channel;
    @Column(name="path", nullable = false, length = 100)
    private String fileSprectrum;
    @Column(name="year", nullable = false, length = 4)
    //@NotBlank(message = "Se debe proporcionar un year")
    //@Size(min = 2, max = 5, message = "El nombre del cliente debe tener al menos 2 digitos y ser menor a 5")
    @NotNull(message = "year no puede estar vacío")

    private int year;
    @Column(name="mount", nullable = false, length = 2)
    //@NotBlank(message = "Se debe proporcionar un mes")
    private int mount;
    @Column(name="day", nullable = false, length = 2)
    //@NotBlank(message = "Se debe proporcionar un dia")
    private int day;
    @Column(name="Country", nullable = false, length = 20)
    //@NotBlank(message = "Se debe proporcionar un pais")
    private String country;
    @Column(name="Town", nullable = false, length = 20)
    //@NotBlank(message = "Se debe proporcionar una ciudad")
    private String town;



}
