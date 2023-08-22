package projeto.sistema.VendasImoveis.VendasImoveis.rest;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import projeto.sistema.VendasImoveis.VendasImoveis.model.Condominio;
import projeto.sistema.VendasImoveis.VendasImoveis.repository.condominioRepository;

@RestController
@RequestMapping("/api/condominio")
public class CondominioRest {
	
	@Autowired
	condominioRepository repository;

	
	@RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> salvar(@RequestBody Condominio condominio){
		
			repository.save(condominio);
		
		return ResponseEntity.created(URI.create("/"  + condominio.getId())).body(condominio);
		
		
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public Iterable<Condominio> listar(){
		
		return repository.findAll();
	}
	
	

}
