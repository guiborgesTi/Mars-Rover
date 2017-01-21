/*
 * Mars Rover
 * @Author: Guilherme Alves
 * 
 */

package br.com.view;

import br.com.controller.Rover;
import br.com.model.Direction;

public class Application {

	public static void main(String[] args) {
		System.out.println("Saída");
		
		/*
		 * Rover rover = new Rover(1, 2, Direction.N); String lastPosition =
		 * rover.start("MMRMMRMRRM"); 
		 * System.out.println(lastPosition);
		 
		Rover rover = new Rover(3, 3, Direction.E);
		String lastPosition = rover.start("MMRMMRMRRM");
		System.out.println(lastPosition);
       
		
		Rover rover = new Rover(2, 4, Direction.S);
		String lastPosition = rover.start("LMRRLMRL");
		System.out.println(lastPosition);
		
		*/
		
		Rover rover = new Rover(2, 4 ,Direction.S);
		String lastPosition = rover.start("L");
		System.out.println(lastPosition);
	}
}
