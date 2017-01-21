/*
 * Mars Rover
 * @Author: Guilherme Alves
 * 
 */
package br.com.model;

//Possíveis ações do rover
public enum Command {
	
	L("Left"),
	R("Right"),
	M("Move");
	
	private String command;
	
	Command(String command) {
		this.command = command;
	}
	
	public String getCommand() {
        return command;
    }
	
	@Override
	public String toString() {
		return super.toString();
	}
}
