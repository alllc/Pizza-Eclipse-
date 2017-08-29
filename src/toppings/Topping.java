package toppings;

import processing.core.PImage;
import processing.core.PVector;
import main.Main;
import utility.Object;
public class Topping extends Object{



	PImage img;
	//image on pizza
	PImage onP;
	int onPx,onPy;
	int onPh,onPw;
	PVector originalSpace;
	public Topping (Main p){
		super(p);
		Objecth = 50;
		Objectw = 85;
		onPh = 21;
		onPw = 30;
		
	}
	//draw box
	public void drawMe(){
		p.pushMatrix();
		p.translate(originalSpace.x,originalSpace.y);
		p.image(img,-Objectw/2, -Objecth/2);
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
		p.pushMatrix();
		pos.x = p.mouseX;
		pos.y = p.mouseY;
		p.translate(pos.x,pos.y);
		p.image(onP, -onPw/2, -onPh/2);
		p.popMatrix();
		
	}
	public void onPizza(){

		
		onPx = p.mouseX;
		onPy = p.mouseY;
		p.pushMatrix();
		p.translate(onPx,onPy);
		p.image(onP, -onPw/2, -onPh/2);
		p.popMatrix();

	}
	@Override
	public void originalSpace() {
		// TODO Auto-generated method stub
		
	}
	


}
