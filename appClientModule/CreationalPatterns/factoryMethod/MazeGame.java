package CreationalPatterns.factoryMethod;

public class MazeGame {
	public MazeGame() {
	     Room room1 = makeRoom();
	     Room room2 = makeRoom();
	     room1.connect(room2);
	     this.addRoom(room1);
	     this.addRoom(room2);
	  }
	 
	  protected Room makeRoom() {
	     return new OrdinaryRoom();
	  }
}
