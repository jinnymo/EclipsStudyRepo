package useful.ch07;

import useful.ch07.Spaceship.Engine;

public class SpaceshipTest {

	public static void main(String[] args) {
		
		Spaceship spaceship = new Spaceship();
		spaceship.startSpaceShip();
		
		Engine 누리호1번엔진 = new Engine();
		Engine 누리호2번엔 = new Spaceship.Engine();
		Engine 누리호3번엔 = new Spaceship.Engine();
		
	
		spaceship.addEngine(누리호1번엔진);
		spaceship.startSpaceShip();
		
	}

}
