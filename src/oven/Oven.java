package oven;
import main.Main;
import processing.core.*;
import utility.Object;
public class Oven extends Object{

	PImage img;
	public Oven (Main p){
		super(p);
		Objecth = 206;
		Objectw = 350;
		pos = new PVector(p.width-350,p.height/2 - 105);
		img = p.loadImage("../assets/oven.png");
		img.resize(Objectw, Objecth);
	}
	public void drawMe(){
		p.pushMatrix();
		p.fill(255);
		p.translate(pos.x,pos.y);
		p.image(img,0,-49);
		p.popMatrix();
	}
	@Override
	public void update() {

	}

	public void originalSpace() {
	
		
	}
}

