package control.max.ControleCobrancaCondominio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import control.max.ControleCobrancaCondominio.models.Leitura;
import control.max.ControleCobrancaCondominio.repositories.LeituraRepo;

@Service
public class LeituraService {
  private final LeituraRepo leituraRepo;

  @Autowired
  public LeituraService(LeituraRepo leituraRepo) {
    this.leituraRepo = leituraRepo;
  }

  public Leitura addLeitura(Leitura leitura) {
    return leituraRepo.save(leitura);
  }

  public List<Leitura> findAllLeituras() {
    return leituraRepo.findAll();
  }

  public Leitura findLeituraById(Long id) {
    return leituraRepo.findById(id).orElse(null);
  }

  public Leitura updateLeitura(Leitura leitura) {
    return leituraRepo.save(leitura);
  }

  public void deleteLeitura(Long id) {
    leituraRepo.deleteLeituraById(id);
  }

}
