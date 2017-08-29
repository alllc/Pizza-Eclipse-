package utility;


import main.Main;
import processing.core.*;

public abstract class Object {

	public Main p;
	public int x,y;
	//for topping box space
	public PVector originalSpace;
	//object height and object width
	public int Objectw,Objecth;
	public PVector pos;	
	public boolean click;
	public boolean adding;
	public Object(Main p){
		this.p = p;
	}
	public 	boolean detectCollision(Object otherObject){
			if(p.abs(pos.x - otherObject.pos.x) < (Objectw/2-30)
					&&p.abs(pos.y - otherObject.pos.y)<(Objecth/2-30)){
				return true;
			}
		return false;
	}
	public abstract void update();

	public abstract void drawMe();
	
	public abstract void originalSpace();

	public boolean click() {
		return false;
	}
	public void onPizza() {
		// TODO Auto-generated method stub
		
	}

}
