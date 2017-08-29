package sauces;
import main.Main;
import processing.core.*;
import utility.Object;
public class BBQ_Sauce extends Sauce{

	public BBQ_Sauce(Main p){
		super(p);


		pos = new PVector(195,p.height/2 - 2);
		img = p.loadImage("../assets/bbq_sauce.png");
		img.resize(Objectw, Objecth);
	}

	//move back to original space when mouse release
	public void originalSpace() {
		pos.x = 195;
		pos.y = p.height/2 - 2;
		
	}
}
