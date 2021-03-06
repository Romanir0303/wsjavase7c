package br.com.universidade.teste;

import javax.swing.JOptionPane;

import br.com.universidade.atalhos.Magica;
import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Endereco;

public class TesteConstrutorCheio {

	public static void main(String[] args) {
		Endereco objEndereco = new Endereco();
		
		Aluno obj = new Aluno(
				JOptionPane.showInputDialog("Nome").toUpperCase(),
				JOptionPane.showInputDialog("Email").toLowerCase(),
				Integer.parseInt(JOptionPane.showInputDialog("RM")),
				objEndereco
				);
		
		objEndereco.setAll(
				Magica.s("Logradouro"), 
				Magica.s("Numero"), 
				Magica.s("Complemento"), 
				Magica.s("Bairro"), 
				Magica.s("Cidade"), 
				Magica.s("UF"), 
				Magica.s("CEP")
				);
		//System.out.println(obj.getAll());
		System.out.println(obj.getEndereco().getBairro());
		
	}

}
