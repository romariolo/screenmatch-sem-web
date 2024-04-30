package br.com.alura.screenmacth;

import br.com.alura.screenmacth.models.DadosSeries;
import br.com.alura.screenmacth.service.ConsumoApi;
import br.com.alura.screenmacth.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmacthApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmacthApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("http://www.omdbapi.com/?t=gilmore+girls&apikey=e84c7a24");
		/*System.out.println(json);
		json = consumoApi.obterDados("https://v6.exchangerate-api.com/v6/34f6e3db0f18c8317dc2aac7/latest/USD");*/
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSeries dados = conversor.obeterDados(json, DadosSeries.class);
		System.out.println(dados);
	}
}
