package aula50;

import java.util.Scanner;

public class Aluno {
	
	private String nome;
	private double nota1;
	private double nota2;
	private double nota3;
	
	public Aluno(String nome, double nota1, double nota2, double nota3) {
		this.setNome(nome);
		this.setNota1(nota1);
		this.setNota2(nota2);
		this.setNota3(nota3);
	}
	
	public String boletim() {
		if(this.getNota1()>30) {
			return "Insira uma nota válida";
		}
		if(this.getNota2()>35) {
			return "Insira uma nota válida";
		}
		if(this.getNota3()>35) {
			return "Insira uma nota válida";
		}
		double media = (this.getNota1()+ this.getNota2()+ this.getNota3());
		if(media>60.0) {
			return "PASS";
		}else {
			return "MISSING " + (60 - media) + " POINTS";
		}
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

}
