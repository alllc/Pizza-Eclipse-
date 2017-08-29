package toppings;
import main.Main;
import processing.core.*;
import utility.Object;
public class Shrimp extends Topping{


	public Shrimp (Main p){
		super(p);

		originalSpace = new PVector(515,p.height/2 + 100);
		pos = new PVector(515,p.height/2 + 100);
		img = p.loadImage("../assets/shrimp_box.png");
		img.resize(Objectw, Objecth);
		onP = p.loadImage("../assets/Shrimp.PNG");
		onP.resize(onPw, onPh);
	}
	
	
	//move back to original space when mouse release
	public void originalSpace() {
		pos.x = 515;
		pos.y = p.height/2 + 100;
	}
}