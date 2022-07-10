package control.max.ControleCobrancaCondominio.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Leitura implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false, updatable = false)
  private Long id;
  private int unidade;
  private String dataAnterior;
  private String dataAtual;
  private Double quantAnterior;
  private Double quantAtual;

  public Leitura() {
  }

  public Leitura(int unidade, String dataAnterior, String dataAtual, Double quantAnterior, Double quantAtual) {
    this.unidade = unidade;
    this.dataAnterior = dataAnterior;
    this.dataAtual = dataAtual;
    this.quantAnterior = quantAnterior;
    this.quantAtual = quantAtual;
  }

  public String getDataAnterior() {
    return dataAnterior;
  }

  public Double getQuantAtual() {
    return quantAtual;
  }

  public Long getId() {
    return id;
  }

  public Double getQuantAnterior() {
    return quantAnterior;
  }

  public int getUnidade() {
    return unidade;
  }

  public String getDataAtual() {
    return dataAtual;
  }

  public void setDataAnterior(String dataAnterior) {
    this.dataAnterior = dataAnterior;
  }

  public void setQuantAtual(Double quantAtual) {
    this.quantAtual = quantAtual;
  }

  public void setQuantAnterior(Double quantAnterior) {
    this.quantAnterior = quantAnterior;
  }

  public void setDataAtual(String dataAtual) {
    this.dataAtual = dataAtual;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setUnidade(int unidade) {
    this.unidade = unidade;
  }
}
