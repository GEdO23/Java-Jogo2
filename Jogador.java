package br.com.fiap.jogo.beans;

public abstract class Jogador implements Mover {
	
	private String nome = "anonimo";
	private int xp = 100;
	private int hp = 100;
	private boolean envenenado;
	
	private int posX = 0;
	private int posY = 0;
	private int direcao;
	
	public Jogador() {
		System.out.println("Criando jogador " + nome);
	}
	
	//sobrecarda de metodo
	public Jogador(String nome) { //parametro
		System.out.println("Criando jogador " + nome);
		this.nome = nome;
	}
	
	public void receberDano(int pontos) {
		hp -= pontos;
		if(foiDerrotado()) {
			System.out.println("Game Over " + nome);
		}
	}

	public void receberCura(int pontos) {
		hp += pontos;		
	}

	public String getNome() {
		return nome;
	}

	public int getXp() {
		return xp;
	}

	public int getHp() {
		return hp;
	}

	public boolean isEnvenenado() {
		return envenenado;
	}

	public void ganharExperiencia(int pontos) {
		xp += pontos;		
	}

	public void receberAntidoto() {
//		if(isEnvenenado()) { //code smell
//			envenenado = false;
//		}
//		
//		if(!isEnvenenado()) {
//			envenenado = true;
//		}
		
		envenenado = !envenenado;
		
	}

	public void atacar(Jogador jogador) {
		// this -> atacante
		// jogador -> atacado
		jogador.receberDano(this.getXp());
		if(jogador.foiDerrotado())
			ganharExperiencia(jogador.getXp());
		
	}

	private boolean foiDerrotado() {
		return hp <= 0;
	}

	public int getPosX() {
		return posX;
	}
	
	public int getPosY() {
		return posY;
	}
	
	@Override
	
	public void Mover(int direcao) {
		this.direcao = direcao;
		if(this.direcao == 0 || this.direcao == 360) {
			this.posX += 10;
		} else if(this.direcao == 90) {
			this.posY += 10;
		} else if(this.direcao == 180) {
			this.posX -= 10;
		} else if(this.direcao == 270) {
			this.posY -= 10;
		} else {
			System.out.println("Direcao invalida, favor inserir 0, 90, 180, 270 ou 360 graus");
		}
	}
	

}
