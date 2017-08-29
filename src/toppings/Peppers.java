package toppings;
import main.Main;
import processing.core.*;
import utility.Object;
public class Peppers extends Topping{

	public Peppers (Main p){
		super(p);
		originalSpace = new PVector(245,p.height/2 + 100);
		pos = new PVector(245,p.height/2 + 100);
		img = p.loadImage("../assets/papper_box.png");
		img.resize(Objectw, Objecth);
		onP = p.loadImage("../assets/pepper.png");
		onP.resize(onPw, onPh);
	}
	

	//move back to original space when mouse release
	public void originalSpace() {
		pos.x = 245;
		pos.y = p.height/2 + 100;
	}
}

