package pizza;
import main.Main;
import processing.core.*;
import utility.Object;
public class Pizza extends Object{


	// contructor
	public Pizza (Main p){
		super(p);
		Objecth = 250;
		Objectw = 250;
		pos = new PVector(p.width/2,p.height/2 + 270);

	}
	public void drawMe(){
		p.pushMatrix();
		p.fill(161,194,25);
		p.strokeWeight((float) 0.5);
		p.translate(pos.x,pos.y);
		p.ellipse(0, 0, Objectw, Objecth);
		p.fill(234,255,145);
		p.ellipse(0, 0, Objectw-10, Objecth-10);
		p.noFill();
		
		p.popMatrix();
	}

	boolean hitOnPizza(Object otherObject){
		return click;
		
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
	
	public void update() {
			pos.x = p.mouseX;
			pos.y = p.mouseY;
	}
	
	//back into original space
	public void originalSpace() {
		pos.x = p.width/2; 
		pos.y = p.height/2+250;
		
	}
}
