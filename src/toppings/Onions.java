package toppings;
import main.Main;
import processing.core.*;
import utility.Object;
public class Onions extends Topping{

	public Onions (Main p){
		super(p);

		originalSpace =new PVector(335,p.height/2 + 100);
		pos = new PVector(335,p.height/2 + 100);
		img = p.loadImage("../assets/onion_box.png");
		img.resize(Objectw, Objecth);
		onP = p.loadImage("../assets/Onion.png");
		onP.resize(onPw, onPh);
	}
	

	//move back to original space when mouse release
	public void originalSpace() {
		pos.x = 335;
		pos.y = p.height/2 + 100;
	}
}

