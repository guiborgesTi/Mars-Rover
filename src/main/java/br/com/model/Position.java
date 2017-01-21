/*
 * Mars Rover
 * @Author: Guilherme Alves
 * 
 */

package br.com.model;

//Determino os pontos no eixo x e y, e a direção a seguir
public class Position {

	private int x;
	private int y;
	private Direction direction;

	public Position(int x, int y, Direction direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public void incrementY() {
		this.y++;
	}
	
	public void incrementX() {
		this.x++;
	}
	
	public void decrementY() {
		this.y--;
	}
	
	public void decrementX() {
		this.x--;
	}	
}
