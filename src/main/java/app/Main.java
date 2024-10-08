package app;

import java.io.IOException;

import model.Endereco;
import service.ViaCepService;

public class Main {
	
	public static void main(String[] args) {
		ViaCepService viacep = new ViaCepService();
		
		try{
			System.out.println(viacep.getEndereco("04431060"));
			System.out.println("============================");
			Endereco endereco = viacep.getEndereco("04431060");
			System.out.println("Rua: " + endereco.getLogradouro());
			System.out.println("Bairro: " + endereco.getBairro());
			System.out.println("Cidade: " + endereco.getLocalidade());
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
	
	