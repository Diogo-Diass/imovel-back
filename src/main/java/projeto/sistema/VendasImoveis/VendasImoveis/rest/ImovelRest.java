package projeto.sistema.VendasImoveis.VendasImoveis.rest;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import projeto.sistema.VendasImoveis.VendasImoveis.model.Imovel;
import projeto.sistema.VendasImoveis.VendasImoveis.repository.ImovelRepository;

@RestController
@RequestMapping("/api/imovel")
public class ImovelRest {
	
	@Autowired
	ImovelRepository repository;

	
	@RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> salvar(@RequestBody Imovel imovel){
		
			repository.save(imovel);
		
		return ResponseEntity.created(URI.create("/"  + imovel.getId())).body(imovel);
	}
}
