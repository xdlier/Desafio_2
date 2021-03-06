package Compasso.Teste.Gabrie.CatalogoMongo.Model;

import lombok.Getter;

@Getter
public class Erro {

	private Integer status_code;
	private String message;

	public Erro(Integer status) {
		this.status_code = status;
		if (status.equals(400)) {
			this.message = "Requisição inválida, tente novamente!";
		} else if (status.equals(404)) {
			this.message = "Item não encontrado, tente novamente!";
		}
	}

}
