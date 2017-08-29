package sauces;
import main.Main;
import processing.core.PImage;
import processing.core.PVector;
import utility.Object;
public class Sauce extends Object {



	PImage img;
	public Sauce(Main p){
		super(p);
		Objecth = 107;
		Objectw = 60;


		
	}
	//draw a bottle
	public void drawMe(){
	    
		p.pushMatrix();
		p.translate(pos.x,pos.y);
		p.image(img,-Objectw/2,-Objecth/2);
		p.popMatrix();
	}
	//if click on object
	public boolean click(){
		boolean hit = false;
		if( p.mouseX > pos.x - Objectw/2 && p.mouseX < pos.x+ Objectw/2
				&& p.mouseY > pos.y - Objecth/2 && p.mouseY < pos.y + Objecth/2 ){
			hit = true;
		}
		else{
			hit = false;
		}
		return hit;
	}
	//follow mouse
	public void update() {

			pos.x = p.mouseX;
			pos.y = p.mouseY;
		
	}

	public void originalSpace() {
		// TODO Auto-generated method stub
		
	}

}
