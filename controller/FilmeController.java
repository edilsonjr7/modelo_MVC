package controller;

import java.util.List;

import dtos.FilmeDTO;
import service.FilmeService;

public class FilmeController {

    private FilmeService filmeService;
	
	public FilmeController() {
		this.filmeService = new FilmeService();
	}
	
	public boolean addFilme(FilmeDTO filmeDto) {
		
		if(!filmeDto.validate())
			return false;
		
		return filmeService.AddFilme(filmeDto);		
	}
	
	public List<FilmeDTO> listaFilmesPorNome(){
		return filmeService.listaFilmesPorNome();
	}
	
	public List<FilmeDTO> listaFilmesPorDiretor(String diretor){
		return filmeService.listaFilmesPorDiretor(diretor);
	}
	
	public List<FilmeDTO> listaFilmesPorAtor(String ator){
		return filmeService.listaFilmesPorAtor(ator);
	}
	
	public List<FilmeDTO> listaFilmesPorNota(float nota){
		return filmeService.listaFilmesPorNota(nota);
	}
	
	public List<String> listaAtores(){
		return filmeService.listaAtores();
	}
	
	public List<String> listaDiretores() {
		return filmeService.listaDiretores();
	}
	
	
    
}
