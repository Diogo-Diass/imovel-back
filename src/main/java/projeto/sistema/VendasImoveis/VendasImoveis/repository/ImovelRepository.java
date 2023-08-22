package projeto.sistema.VendasImoveis.VendasImoveis.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import projeto.sistema.VendasImoveis.VendasImoveis.model.Imovel;

public interface ImovelRepository  extends PagingAndSortingRepository<Imovel, Long>  {
	

}
