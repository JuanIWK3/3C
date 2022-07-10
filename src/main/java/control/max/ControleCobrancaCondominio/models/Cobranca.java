package control.max.ControleCobrancaCondominio.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.io.*;

@Entity
public class Cobranca implements Serializable {
  // Atributos.
  @Id
  @GeneratedValue
  @Column(nullable = false, updatable = false)
  private Long id;
  private double valorGeralUn;
  private Leitura cliente;

  // Constructor Default
  public Cobranca() {

  }

  // Constructor Parametros
  public Cobranca(double valorGeral, Leitura cliente) {
    this.valorGeralUn = valorGeral;
    this.cliente = cliente;
  }

  public Leitura getCliente() {
    return cliente;
  }

  public double getValorGeralUn() {
    return valorGeralUn;
  }

  public void setCliente(Leitura cliente) {
    this.cliente = cliente;
  }

  public void setValorGeralUn(double valorGeralUn) {
    this.valorGeralUn = valorGeralUn;
  }

  @Override
  public String toString() {
    return "{\nunidade: " + getCliente().getUnidade()
        + ",\nvalorGeralUn: " + getValorGeralUn() + "}";
  }
}