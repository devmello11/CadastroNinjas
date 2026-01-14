package dev.mello.cadastroninjas;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro_de_ninjas")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ninja, email;
    int idade;

    public NinjaModel() {
    }

    public NinjaModel(String ninja, String email, int idade) {
        this.ninja = ninja;
        this.email = email;
        this.idade = idade;
    }

    public String getNinja() {
        return ninja;
    }

    public void setNinja(String ninja) {
        this.ninja = ninja;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }










}
