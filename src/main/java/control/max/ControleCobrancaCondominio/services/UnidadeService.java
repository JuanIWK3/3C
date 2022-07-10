package control.max.ControleCobrancaCondominio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import control.max.ControleCobrancaCondominio.models.Unidade;
import control.max.ControleCobrancaCondominio.repositories.UnidadeRepo;

@Service
public class UnidadeService {
  private final UnidadeRepo unidadeRepo;

  @Autowired
  public UnidadeService(UnidadeRepo unidadeRepo) {
    this.unidadeRepo = unidadeRepo;
  }

  public Unidade addUnidade(Unidade unidade) {
    return unidadeRepo.save(unidade);
  }

  public List<Unidade> findAllUnidades() {
    return unidadeRepo.findAll();
  }

  public Unidade findUnidadeById(String id) {
    return unidadeRepo.findById(id).orElse(null);
  }

  public Unidade updateUnidade(Unidade unidade) {
    return unidadeRepo.save(unidade);
  }

  public void deleteUnidade(String id) {
    unidadeRepo.deleteById(id);
  }
}