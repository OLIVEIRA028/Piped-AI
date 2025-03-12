package com.Piped_AI.backend;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "study_plans")
public class StudyPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private User usuario;
    
    private String titulo;
    
    private String descricao;
    
    private Float progresso = 0.0f;
    
    @Column(name = "criado_em", updatable = false)
    private LocalDateTime criadoEm = LocalDateTime.now();

    @OneToMany(mappedBy = "plano", cascade = CascadeType.ALL)
    private List<StudyContent> conteudos;
}
