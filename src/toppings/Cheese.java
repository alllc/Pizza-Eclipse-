package toppings;
import main.Main;
import processing.core.*;
import utility.Object;
public class Cheese extends Topping{


	public Cheese (Main p){
		super(p);

		originalSpace = new PVector(65,p.height/2 +100);
		pos = new PVector(65,p.height/2 + 100);
		img = p.loadImage("../assets/cheese_box.png");
		img.resize(Objectw, Objecth);
		onP = p.loadImage("../assets/Cheese.png");
		onP.resize(onPw, onPh);
	}
	
	//move back to original space when mouse release
	public void originalSpace() {
		pos.x = 65;
		pos.y = p.height/2 + 100;
		
	}
}
