package toppings;
import main.Main;
import processing.core.*;
import utility.Object;
public class Mushrooms extends Topping{

	
	public Mushrooms (Main p){
		super(p);

		originalSpace = new PVector(155,p.height/2 + 100);
		pos = new PVector(155,p.height/2 + 100);
		img = p.loadImage("../assets/mushroom_box.png");
		img.resize(Objectw, Objecth);
		onP = p.loadImage("../assets/mushroom.png");
		onP.resize(onPw, onPh);
	}
	

	//move back to original space when mouse release
	public void originalSpace() {
		pos.x = 155;
		pos.y = p.height/2 + 100;
	}
}
