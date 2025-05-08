package com.inforush.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conteudo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Area area;

    @NotBlank
    @Size(max = 100)
    private String titulo;

    @NotBlank
    @Size(min = 10, max = 5000)
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Usuario autor;
}
