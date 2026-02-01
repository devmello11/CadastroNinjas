package dev.mello.cadastroninjas.Missoes;


import dev.mello.cadastroninjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    //Um ninja tem uma missão.
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;








}
