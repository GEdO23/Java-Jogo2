package br.com.fiap.jogo;
import br.com.fiap.jogo.beans.*;

public class Jogo {

	public static void main(String[] args) {
		var guerreiro = new Guerreiro("Jack");
		/*
		System.out.println("x : " + guerreiro.getPosX());

		System.out.println("y : " + guerreiro.getPosY());
		
		guerreiro.mover(0);
	
		System.out.println("x : " + guerreiro.getPosX());
		
		System.out.println("y : " + guerreiro.getPosY());
		
		guerreiro.mover(90);
	
		System.out.println("x : " + guerreiro.getPosX());

		System.out.println("y : " + guerreiro.getPosY());	
		
		guerreiro.mover(180);
	
		System.out.println("x : " + guerreiro.getPosX());

		System.out.println("y : " + guerreiro.getPosY());
		*/
		guerreiro.Mover(270);
	
		System.out.println("x : " + guerreiro.getPosX());

		System.out.println("y : " + guerreiro.getPosY());
		
		
		
	}
	
}
