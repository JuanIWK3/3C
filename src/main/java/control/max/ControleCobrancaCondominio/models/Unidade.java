package control.max.ControleCobrancaCondominio.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Unidade implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false, updatable = false)
  private Long id;
  private String nome;
  private String email;
  private String telefone;
  private double taxaFixa;
  private double fundoReserva;

  public Unidade() {

  }

  public Unidade(String nome, String email, String telefone, double taxaFixa, double fundoReserva) {
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
    this.taxaFixa = taxaFixa;
    this.fundoReserva = fundoReserva;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getTaxaFixa() {
    return taxaFixa;
  }

  public void setTaxaFixa(double taxaFixa) {
    this.taxaFixa = taxaFixa;
  }

  public double getFundoReserva() {
    return fundoReserva;
  }

  public void setFundoReserva(double fundoReserva) {
    this.fundoReserva = fundoReserva;
  }

  public String getEmail() {
    return email;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }
}