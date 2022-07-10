package control.max.ControleCobrancaCondominio.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import control.max.ControleCobrancaCondominio.models.Cobranca;
import control.max.ControleCobrancaCondominio.services.CobrancaService;

@RestController
@RequestMapping("/cobranca")
public class CobrancaController {
  private final CobrancaService cobrancaService;

  public CobrancaController(CobrancaService cobrancaService) {
    this.cobrancaService = cobrancaService;
  }

  @PostMapping("/add")
  public ResponseEntity<Cobranca> addCobranca(Cobranca cobranca) {
    Cobranca cobrancaAdded = cobrancaService.addCobranca(cobranca);
    return new ResponseEntity<>(cobrancaAdded, HttpStatus.OK);
  }

  @GetMapping("/all")
  public ResponseEntity<List<Cobranca>> getAllCobrancas() {
    List<Cobranca> cobrancas = cobrancaService.findAllCobranca();
    return new ResponseEntity<>(cobrancas, HttpStatus.OK);
  }

  @GetMapping("/find/{id}")
  public ResponseEntity<Cobranca> getCobrancaById(@PathVariable("id") Long id) {
    Cobranca cobranca = cobrancaService.findCobrancaById(id);
    return new ResponseEntity<>(cobranca, HttpStatus.OK);
  }

  @PutMapping("/update")
  public ResponseEntity<Cobranca> updateCobranca(Cobranca cobranca) {
    Cobranca cobrancaUpdated = cobrancaService.updateCobranca(cobranca);
    return new ResponseEntity<>(cobrancaUpdated, HttpStatus.OK);
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<Void> deleteCobranca(@PathVariable("id") Long id) {
    cobrancaService.deleteCobranca(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }

}
