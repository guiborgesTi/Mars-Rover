/*
 * Mars Rover
 * @Author: Guilherme Alves
 * 
 */

package br.com.controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import br.com.model.Command;
import br.com.model.Direction;
import br.com.model.Position;

public class Rover {

	private Position position;

	public Rover(int x, int y, Direction direction) {
		this.position = new Position(x, y, direction);
	}

	// Comando para o rover se mover em uma determinada direção
	private Position move() {
		switch (this.position.getDirection()) {
		case N:
			this.position.incrementY();
			break;

		case S:
			this.position.decrementY();
			break;

		case E:
			this.position.incrementX();
			break;

		case W:
			this.position.decrementX();
			break;
		}
		return this.position;
	}

	// Comando para o rover virar para a esquerda
	private Position left() {
		this.position.setDirection(this.position.getDirection().turnLeft());
		return this.position;
	}

	// Comando para o rover virar para a direita
	private Position right() {
		this.position.setDirection(this.position.getDirection().turnRight());
		return this.position;

	}

	private String print() {
		return this.position.getX() + " " + this.position.getY() + " " + this.position.getDirection();
	}

	// Dá uma série de comandos para o rover seguir
	public String start(String commands) {
		String lastPosition = null;

		for (char cmd : commands.toCharArray()) {
			Command command = Command.valueOf(String.valueOf(cmd));
			lastPosition = insertCommand(command);
		}

		// para verificar no Teste Unitario
		return lastPosition;
	}

	// Dá lista de comandos para o rover seguir
	public String start(List<Command> commands) {
		String lastPosition = null;
		for (Command command : commands) {
			lastPosition = insertCommand(command);
		}

		// para verificar no Teste Unitario
		return lastPosition;
	}

	// Rover executa um único comando passado
	public String insertCommand(Command command) {
		try {
			switch (command) {
			case L: {
				left();
				break;
			}

			case R: {
				right();
				break;
			}

			case M: {
				move();
				break;
			}
			}

		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException();
		}
		return print();
	}

	// Popula uma lista de comando
	public List<Command> createListCommand(Command... commands) {
		List<Command> commandsList = new ArrayList<>();
		for (Command command : commands) {
			commandsList.add(command);
		}
		return commandsList;
	}
}
