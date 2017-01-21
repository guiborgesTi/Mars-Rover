/*
 * Mars Rover
 * @Author: Guilherme Alves
 * 
 */

package br.com.model;

//Determina as direções dos pontos cardiais
public enum Direction {

	S {
		@Override
		public Direction turnLeft() {
			return E;
		}

		@Override
		public Direction turnRight() {
			return W;
		}
	},

	N {
		@Override
		public Direction turnLeft() {
			return W;
		}

		@Override
		public Direction turnRight() {
			return E;
		}
	},

	E {

		@Override
		public Direction turnLeft() {
			return N;
		}

		@Override
		public Direction turnRight() {
			return S;
		}
	},

	W {
		@Override
		public Direction turnLeft() {
			return S;
		}

		@Override
		public Direction turnRight() {
			return N;
		}
	};

	public abstract Direction turnLeft();
	public abstract Direction turnRight();
}
