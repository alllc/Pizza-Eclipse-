package sauces;
import main.Main;
import processing.core.*;
import utility.Object;
public class Ketchup extends Sauce{


	public Ketchup(Main p){
		super(p);
		pos = new PVector(65,p.height/2 -2);

		img = p.loadImage("../assets/Ketchup.png");
		img.resize(Objectw, Objecth);
	}

	//move back to original space when mouse release
	public void originalSpace(){
		pos.x = 65;
		pos.y = p.height/2 - 2;
	}

}
