package toppings;
import main.Main;
import processing.core.*;
import utility.Object;
public class Pepperoni extends Topping{

	public Pepperoni (Main p){
		super(p);

		originalSpace = new PVector(425,p.height/2 + 100);
		pos = new PVector(425,p.height/2 + 100);
		img = p.loadImage("../assets/pepperoni_box.png");
		img.resize(Objectw, Objecth);
		onP = p.loadImage("../assets/pepperoni.png");
		onP.resize(onPw, onPh);
	}
	

	//move back to original space when mouse release
	public void originalSpace() {
		pos.x = 425;
		pos.y = p.height/2 + 100;
	}
}
