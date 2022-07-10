package control.max.ControleCobrancaCondominio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import control.max.ControleCobrancaCondominio.models.Leitura;

public interface LeituraRepo extends JpaRepository<Leitura, Long> {
  void deleteLeituraById(Long id);

}
