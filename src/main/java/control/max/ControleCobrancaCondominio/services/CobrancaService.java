package control.max.ControleCobrancaCondominio.services;

import control.max.ControleCobrancaCondominio.repositories.CobrancaRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import control.max.ControleCobrancaCondominio.models.Cobranca;

public class CobrancaService {
  private final CobrancaRepo cobrancaRepo;

  @Autowired
  public CobrancaService(CobrancaRepo cobrancaRepo) {
    this.cobrancaRepo = cobrancaRepo;
  }

  public Cobranca addCobranca(Cobranca cobranca) {
    return cobrancaRepo.save(cobranca);
  }

  public List<Cobranca> findAllCobranca() {
    return cobrancaRepo.findAll();
  }

  public Cobranca findCobrancaById(Long id) {
    return cobrancaRepo.findById(id).orElse(null);
  }

  public Cobranca updateCobranca(Cobranca cobranca) {
    return cobrancaRepo.save(cobranca);
  }

  public void deleteCobranca(Long id) {
    cobrancaRepo.deleteById(id);
  }

}