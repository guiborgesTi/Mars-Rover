/*
 * Mars Rover
 * @Author: Guilherme Alves
 * 
 */

package br.com.model;

import org.junit.Assert;
import org.junit.Test;

import br.com.controller.Rover;
import br.com.model.Direction;

public class RoverTest {
     
	//Testes de uma série de comandos
	@Test
	public void commandOne() throws Exception{
		Rover rover1 = new Rover(1, 2, Direction.N);
		Assert.assertEquals("1 3 N", rover1.start("LMLMLMLMM"));
	}
     
	@Test
	public void commandTwo() throws Exception {
		Rover rover1 = new Rover(3, 3, Direction.E);
		Assert.assertEquals("5 1 E", rover1.start("MMRMMRMRRM"));
	}
	
	@Test
	public void commandTree() throws Exception {
		Rover rover1 = new Rover(2, 4, Direction.S);
		Assert.assertEquals("3 3 S", rover1.start("LMRRLMRL"));
	}
	
	//teste de um uníco comando
	@Test
	public void commandFour() throws Exception{
		Rover rover1 = new Rover(1, 6, Direction.S);
		Assert.assertEquals("1 6 E", rover1.start("L"));
	}
	
	@Test
	public void commandFive() throws Exception{
		Rover rover1 = new Rover(1, 6, Direction.S);
		Assert.assertEquals("1 6 E", rover1.start("L"));
	}
}
