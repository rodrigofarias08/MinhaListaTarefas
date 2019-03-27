package br.senai.sc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.senai.sc.domain.Lista;
import br.senai.sc.domain.Tarefa;
import br.senai.sc.repositories.ListaRepository;
import br.senai.sc.repositories.TarefaRepository;

@SpringBootApplication
public class MinhaListaTarefasApplication implements CommandLineRunner {


	@Autowired
	private ListaRepository listaRepo;
	@Autowired
	private TarefaRepository tarefaRepo;

	public static void main(String[] args) {
		SpringApplication.run(MinhaListaTarefasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Lista lista1 = new Lista(null, "Minha Lista");
		Tarefa tarefa1 = new Tarefa(null, "Item 1", lista1);
		Tarefa tarefa2 = new Tarefa(null, "Item 2", lista1);
		Tarefa tarefa3 = new Tarefa(null, "Item 3", lista1);
		Tarefa tarefa4 = new Tarefa(null, "Item 4", lista1);
		Tarefa tarefa5 = new Tarefa(null, "Item 5", lista1);
		
		listaRepo.save(lista1);
		tarefaRepo.save(tarefa1);
		tarefaRepo.save(tarefa2);
		tarefaRepo.save(tarefa3);
		tarefaRepo.save(tarefa4);
		tarefaRepo.save(tarefa5);
		
	}

}
