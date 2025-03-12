package com.Piped_AI.backend;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "study_contents")
public class StudyContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "plano_id", nullable = false)
    private StudyPlan plano;
    
    private String tipo; // (vídeo, artigo, simulado, transcrição)
    
    private String url;
    
    @Column(name = "criado_em", updatable = false)
    private LocalDateTime criadoEm = LocalDateTime.now();
}
