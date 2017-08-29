package utility;
import processing.core.PApplet;
import processing.core.PFont;

public class Text {
	PApplet p;

	PFont overFont;

	public Text(PApplet p){
		this.p=p;
		
		overFont = p.createFont("Arial", 48, false);
	}
	
	
	public void wellCook(){
		p.background(0);
		p.textFont(overFont,60);
		p.fill(255);
		p.textAlign(p.CENTER);
		p.text("WELL DONE", p.width/2, p.height/2);
		p.textFont(overFont,20);
		p.text("You just made a pizza!!", p.width/2, p.height/2 + 30);
	}
	public void failCook(){
		p.background(0);
		p.textFont(overFont,60);
		p.fill(255);
		p.textAlign(p.CENTER);
		p.text("SORRY", p.width/2, p.height/2);
		p.textFont(overFont,20);
		p.text("You made some mistakes.", p.width/2, p.height/2 + 30);
	}
	
	public void intro(){
		p.background(0);
		p.fill(255);
		p.text("Introduction:", 30, 300);
		p.text("This is a pizza making demo. ", 30, 320);
		p.text("You have 4 sacuces and 7 topping to choose. ", 30, 340);
		p.text("You can add as many item as you want on the pizza.", 30, 360);
		p.text("Before you put your pizza onto the oven, you need to pre-heat the oven.", 30, 380);
		p.text("You have to take out the pizza by click on the oven in order to control the baking time.", 30, 400);
		p.text("The result of pizza will based on the time and temperature of the oven.", 30, 420);
		p.text("Good Luck !", 30, 560);
	}
}
