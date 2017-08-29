package toppings;
import main.Main;
import processing.core.*;
import utility.Object;
public class Pineapple extends Topping{

	public Pineapple (Main p){
		super(p);

		originalSpace = new PVector(605,p.height/2 + 100);
		pos = new PVector(605,p.height/2 + 100);
		img = p.loadImage("../assets/pineapple_box.png");
		img.resize(Objectw, Objecth);
		onP = p.loadImage("../assets/pineapple.png");
		onP.resize(onPw, onPh);
	}
	
	//move back to original space when mouse release
	public void originalSpace() {
		pos.x = 605;
		pos.y = p.height/2 + 100;
	}
}
