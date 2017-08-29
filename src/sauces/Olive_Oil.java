package sauces;
import main.Main;
import processing.core.*;
import utility.Object;
public class Olive_Oil extends Sauce{

	public Olive_Oil(Main p){
		super(p);


		pos = new PVector(130,p.height/2 - 2);
		img = p.loadImage("../assets/Olive_oil.png");
		img.resize(Objectw, Objecth);
	}

	//move back to original space when mouse release
	public void originalSpace() {
		pos.x = 130;
		pos.y = p.height/2 - 2;
	}
}
