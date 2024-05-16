package model;

import java.util.Date;
import utils.Utils;

public class Pessoa {
	
	private static int counter = 1;
	
	private int numeroPessoa;
	private String name;
	private String cpf;
	private String email;
	private Date accountCreationDate;
	
	public Pessoa() {}
	
	public Pessoa(String name, String cpf, String email) {
		
		this.name = name;
		this.cpf = cpf;
		this.email = email;
		
		this.accountCreationDate = new Date();
		Pessoa.counter += 1;
		this.numeroPessoa = Pessoa.counter;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setName() {
		this.name = name;
	}
	
	public void setCpf() {
		this.cpf = cpf;
	}
	
	public void setEmail() {
		this.email = email;
	}
	
	public Date getAccountCreationDate() {
		return this.accountCreationDate;
	}
	
	public int getNumeroPessoa() { //Não setamos o Numero Pessoa aqui pois já foi definido antes
		return this.numeroPessoa;
	}
	
	public String toString() {
		return 	"\nName: " + this.getName() +
				"\nCPF: " + this.getCpf() +
				"\nEmail: " + this.getEmail() +
				"\nDate: " + Utils.dateToString(this.getAccountCreationDate());
	}
}
