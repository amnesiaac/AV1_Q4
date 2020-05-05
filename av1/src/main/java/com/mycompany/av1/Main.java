
package com.mycompany.av1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner s = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		int a=Integer.parseInt(JOptionPane.showInputDialog("Digite 1-Instanciar uma pessoa 2-Instanciar Aluno"));
		
		switch(a) {
		case 1:
                        String Nome=JOptionPane.showInputDialog("Informe o nome");
			String datanf =JOptionPane.showInputDialog("informe data de nascimento no formato dd/MM;yyyy");
			Date data = format.parse(datanf);
			Pessoa pessoa = new Pessoa(Nome, data );
			pessoa.mostraDados();
			break;
		case 2:
                         String Nome1=JOptionPane.showInputDialog("Informe o nome");
			String datanf1 =JOptionPane.showInputDialog("informe data de nascimento no formato dd/MM;yyyy");
			Date data1 = format.parse(datanf1);
			String curso = JOptionPane.showInputDialog("informe curso");
			Aluno aluno = new Aluno(Nome1,data1,curso);
			aluno.mostraDados();
		}
		
		}
	}