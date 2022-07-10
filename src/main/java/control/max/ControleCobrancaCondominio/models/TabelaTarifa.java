package control.max.ControleCobrancaCondominio.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TabelaTarifa implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false, updatable = false)
  private String categorias;
  private double taxaFixaAgua;
  private double faixa0_5;
  private double faixa5_10;
  private double faixa10_15;
  private double faixa15_20;
  private double faixa20_40;
  private double faixa40;

  public TabelaTarifa() {
  }

  public TabelaTarifa(String categorias, double taxaFixaAgua, double faixa0_5, double faixa5_10, double faixa10_15,
      double faixa15_20, double faixa20_40, double faixa40) {
    this.categorias = categorias;
    this.taxaFixaAgua = taxaFixaAgua;
    this.faixa0_5 = faixa0_5;
    this.faixa5_10 = faixa5_10;
    this.faixa10_15 = faixa10_15;
    this.faixa15_20 = faixa15_20;
    this.faixa20_40 = faixa20_40;
    this.faixa40 = faixa40;
  }

  public double getFaixa40() {
    return faixa40;
  }

  public void setFaixa40(double faixa40) {
    this.faixa40 = faixa40;
  }

  public double getFaixa20_40() {
    return faixa20_40;
  }

  public void setFaixa20_40(double faixa20_40) {
    this.faixa20_40 = faixa20_40;
  }

  public double getFaixa15_20() {
    return faixa15_20;
  }

  public void setFaixa15_20(double faixa15_20) {
    this.faixa15_20 = faixa15_20;
  }

  public double getFaixa10_15() {
    return faixa10_15;
  }

  public void setFaixa10_15(double faixa10_15) {
    this.faixa10_15 = faixa10_15;
  }

  public double getFaixa5_10() {
    return faixa5_10;
  }

  public void setFaixa5_10(double faixa5_10) {
    this.faixa5_10 = faixa5_10;
  }

  public double getFaixa0_5() {
    return faixa0_5;
  }

  public void setFaixa0_5(double faixa0_5) {
    this.faixa0_5 = faixa0_5;
  }

  public double getTaxaFixa() {
    return taxaFixaAgua;
  }

  public void setTaxaFixa(double taxaFixa) {
    this.taxaFixaAgua = taxaFixa;
  }

  public String getCategorias() {
    return categorias;
  }

  public void setCategorias(String categorias) {
    this.categorias = categorias;
  }
}