package br.com.fiap.jogo.beans;

public class BolaDeFogo implements Mover{
	
	private int posX;
	private int posY;
	private int direcao;
	
	private int poder;

	public BolaDeFogo() {}
	
	public int getPoder() {
		return poder;
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
