package projeto.sistema.VendasImoveis.VendasImoveis.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import projeto.sistema.VendasImoveis.VendasImoveis.model.Condominio;


public interface condominioRepository  extends PagingAndSortingRepository<Condominio, Long>  {
	
	public List<Condominio> findAll();

}
