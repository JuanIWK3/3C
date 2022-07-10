
package control.max.ControleCobrancaCondominio.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import control.max.ControleCobrancaCondominio.models.Leitura;
import control.max.ControleCobrancaCondominio.services.LeituraService;

@RestController
@RequestMapping("/leitura")
public class LeituraController {
  private final LeituraService leituraService;

  public LeituraController(LeituraService leituraService) {
    this.leituraService = leituraService;
  }

  @PostMapping("/add")
  public ResponseEntity<Leitura> addLeitura(@RequestBody Leitura leitura) {
    return new ResponseEntity<>(leituraService.addLeitura(leitura), HttpStatus.OK);
  }

  @GetMapping("/all")
  public ResponseEntity<List<Leitura>> getAllLeituras() {
    return new ResponseEntity<>(leituraService.findAllLeituras(), HttpStatus.OK);
  }

  @GetMapping("/find/{id}")
  public ResponseEntity<Leitura> getLeituraById(Long id) {
    return new ResponseEntity<>(leituraService.findLeituraById(id), HttpStatus.OK);
  }

  @PutMapping("/update")
  public ResponseEntity<Leitura> updateLeitura(Leitura leitura) {
    Leitura leituraUpdated = leituraService.updateLeitura(leitura);
    return new ResponseEntity<>(leituraUpdated, HttpStatus.OK);
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<Void> deleteLeitura(@PathVariable Long id) {
    leituraService.deleteLeitura(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }

}
