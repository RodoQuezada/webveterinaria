/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.gazulabs.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author rodo
 */
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
    
    @Id
    @OneToOne (cascade = CascadeType.PERSIST)
    @JoinColumn (name="codigo", nullable = false)
    private Persona codigo;
    
    @Column(name="usuario")
    private String usuario;
    
    @Column(name="clave")
    private String clave;
    
    @Column(name="tipo")
    private String tipo;
    
    @Column(name="estado")
    private short estado;  

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public Persona getCodigo() {
        return codigo;
    }

    public void setCodigo(Persona codigo) {
        this.codigo = codigo;
    }
    
    
    
    
}
