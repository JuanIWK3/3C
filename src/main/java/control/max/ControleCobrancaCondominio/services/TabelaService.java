package control.max.ControleCobrancaCondominio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import control.max.ControleCobrancaCondominio.models.TabelaTarifa;
import control.max.ControleCobrancaCondominio.repositories.TabelaRepo;

public class TabelaService {
  private final TabelaRepo tabelaRepo;

  @Autowired
  public TabelaService(TabelaRepo tabelaRepo) {
    this.tabelaRepo = tabelaRepo;
  }

  public TabelaTarifa addTabela(TabelaTarifa tabela) {
    return tabelaRepo.save(tabela);
  }

  public List<TabelaTarifa> findAllTabelas() {
    return tabelaRepo.findAll();
  }

  public TabelaTarifa findTabelaById(String id) {
    return tabelaRepo.findById(id).orElse(null);
  }

  public TabelaTarifa updateTabela(TabelaTarifa tabela) {
    return tabelaRepo.save(tabela);
  }

  public void deleteTabela(String id) {
    tabelaRepo.deleteById(id);
  }

}