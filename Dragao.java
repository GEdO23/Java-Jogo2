package br.com.fiap.jogo.beans;

public class Dragao implements Mover{
	
	private int posX = 0;
	private int posY = 0;
	private int direcao;
	
	public Dragao() {}

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
