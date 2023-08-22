package projeto.sistema.VendasImoveis.VendasImoveis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Condominio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String cep;
	
	private String logradouro;
	
	private int numero;
	
	private String bairro;
	
	private String bairroSite;
	
	private String cidade;
	
	private String estado;
	
	

}
