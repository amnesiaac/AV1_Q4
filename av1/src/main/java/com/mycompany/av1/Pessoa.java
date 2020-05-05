
package com.mycompany.av1;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class Pessoa {
	protected String Nome;
	protected Date nascimento;
	
	public Pessoa(String Nome, Date nascimento ) {
		this.Nome = Nome;
		this.nascimento=nascimento;
	}
	public int calculaIdade(Date nascimento) {
	    Calendar dataNascimento = Calendar.getInstance();  
	    dataNascimento.setTime(nascimento); 
	    Calendar datahj = Calendar.getInstance();  

	    int idade = datahj.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR); 

	    if (datahj.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
	      idade--;  
	    } 
	    else 
	    { 
	        if (datahj.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) && datahj.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
	            idade--; 
	        }
	    }

	    return idade;
	}
	public void mostraDados(){
		          JOptionPane.showMessageDialog(null,"Nome: "+this.Nome+"Data de Nascimento: "+calculaIdade(this.nascimento));
	}
}