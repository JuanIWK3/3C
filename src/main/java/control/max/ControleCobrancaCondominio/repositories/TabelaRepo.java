package control.max.ControleCobrancaCondominio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import control.max.ControleCobrancaCondominio.models.TabelaTarifa;

public interface TabelaRepo extends JpaRepository<TabelaTarifa, String> {

}