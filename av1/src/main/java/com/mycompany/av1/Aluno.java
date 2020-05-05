
package com.mycompany.av1;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class Aluno extends Pessoa {
	private String curso;
	
	public Aluno(String Nome, Date nascimento,String curso) {
		super(Nome, nascimento);
		this.curso=curso;
	}
	public void mostraDados(){
		          JOptionPane.showMessageDialog(null,"Nome: "+this.Nome+"Data de Nascimento: "+calculaIdade(this.nascimento)+"curso: "+this.curso);
	}
	
}
