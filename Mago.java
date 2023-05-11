package br.com.fiap.jogo.beans;

public class Mago extends Jogador {
	private int mp;
	
	public Mago() {}
	public Mago(String nome) {
		super(nome);
	}
	
	public int getMp() {
		return mp;
	}

}
