package sauces;
import main.Main;
import processing.core.*;
import utility.Object;
public class Yellow_Mustard extends Sauce{

	public Yellow_Mustard(Main p){
		super(p);


		pos = new PVector(260,p.height/2 - 2);
		img = p.loadImage("../assets/Yellow_Mustard.png");
		img.resize(Objectw, Objecth);
	}


	//move back to original space when mouse release
	public void originalSpace() {
		pos.x = 260;
		pos.y = p.height/2 - 2;
		
	}
}
