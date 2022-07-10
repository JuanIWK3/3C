package control.max.ControleCobrancaCondominio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import control.max.ControleCobrancaCondominio.models.Cobranca;

public interface CobrancaRepo extends JpaRepository<Cobranca, Long> {

}