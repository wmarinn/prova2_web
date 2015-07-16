/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if6ae.entity;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author user
 */
public class Inscricao_minicurso {
    
    @Column(name = "numero_inscricao")
    private Long numero_inscricao;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "minicurso")
    private Long minicurso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "data_hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data_hora;
    @Column(name = "situacao")
    private Integer situacao;
    @NotNull
    @Size(min = 1, max = 20)

    public Inscricao_minicurso(Long numero_inscricao, Long minicurso, Date data_hora, Integer situacao) {
        this.numero_inscricao = numero_inscricao;
        this.minicurso = minicurso;
        this.data_hora = data_hora;
        this.situacao = situacao;
    }

    public Long getNumero_inscricao() {
        return numero_inscricao;
    }

    public void setNumero_inscricao(Long numero_inscricao) {
        this.numero_inscricao = numero_inscricao;
    }

    public Long getMinicurso() {
        return minicurso;
    }

    public void setMinicurso(Long minicurso) {
        this.minicurso = minicurso;
    }

    public Date getData_hora() {
        return data_hora;
    }

    public void setData_hora(Date data_hora) {
        this.data_hora = data_hora;
    }

    public Integer getSituacao() {
        return situacao;
    }

    public void setSituacao(Integer situacao) {
        this.situacao = situacao;
    }
    
    
    
    
    
}
