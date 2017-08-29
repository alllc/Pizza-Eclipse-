package main;





import java.util.ArrayList;

import background.Decorator;
import controlP5.Button;
import controlP5.ControlEvent;
import controlP5.ControlP5;
import oven.Oven;
import pizza.Pizza;
import processing.core.*;
import sauces.*;
import toppings.*;
import utility.Object;
import utility.*;
import ddf.minim.*;
import ddf.minim.analysis.FFT;




public class Main extends PApplet {
	// list for every object
	Object[] object = new Object[13];
	ArrayList<Object> item = new ArrayList();
	Minim minim;
	AudioPlayer song;
	Text txt;
	ControlP5 controlP5;
	Button playButton;
	Decorator room;
	boolean gameOver = false;

	boolean intro = true;
	PImage bg = loadImage("../assets/Kitchen1.jpg");
	public void setup() 
	{
		
		size(1000,800);
		background(255);
		room = new LineDecorator(new TableDecorator(new SimpleRoom()));
		minim = new Minim (this);
		try
		{
			song = minim.loadFile("../assets/background.mp3", 2048);
			//song.play();
			song.loop();
			
		}
		
		catch (Exception e)
		{
			println ("Something wrong with your sound file or buffer size is not power of 2!");
		}
		ItemCreator itemFactory = new ItemConcreteCreator (this);
		//assign object to the list
//		object[0] = new Pizza(this);
//		object[1] = new Oven(this);
//		object[2] = new Ketchup(this);
//		object[3] = new Olive_Oil(this);
//		object[4] = new BBQ_Sauce(this);
//		object[5] = new Yellow_Mustard(this);
//		object[6] = new Cheese(this);
//		object[7] = new Mushrooms(this);
//		object[8] = new Peppers(this);
//		object[9] = new Onions(this);
//		object[10] = new Pepperoni(this);
//		object[11] = new Shrimp(this);
//		object[12] = new Pineapple(this);

		for (int i=0; i<object.length; i++){
			object[i] =  itemFactory.createItem(i+1);
		
		}
		txt = new Text(this);
		
		controlP5 = new ControlP5(this);
		playButton  = controlP5.addButton("Play",1,30,500,60,25);
		playButton.setColorCaptionLabel(color(0));
		playButton.setColorBackground(color(0,255,0));
		playButton  = controlP5.addButton("Replay",1,470,100,60,25);
		playButton.setColorCaptionLabel(color(0));
		playButton.setColorBackground(color(0,255,0));
		
	}
	public void draw() {
		background(255); // call background to redraw background

		if(gameOver){
			txt.wellCook();
			controlP5.getController("Replay").show();
			controlP5.getController("Play").hide();
		}
		else if(intro){
			txt.intro();
			drawPizza();
			controlP5.getController("Replay").hide();
			controlP5.getController("Play").show();
		}
		else{
			play();
			controlP5.getController("Replay").hide();
			controlP5.getController("Play").hide();
		}
	}
	public void play() {
		background(255);
		room.showRoom();

		// draw all objects
		for(int i =0; i < object.length;i++){
			object[i].drawMe();
		}
		try {
		
				for(int i = 1; i < object.length; i++){
					if(object[i].click() && clickObject()){
						object[i].update();
						break;
						}
					
				
			
					else if( object[0].detectCollision(object[i]) && !mousePressed){
							
							object[i].onPizza();
						}
					else{
						object[i].originalSpace();
					}
					}
				
			} catch (IndexOutOfBoundsException e) {
				println("Hey, that’s not a valid index!"); 
			} catch (NullPointerException e) {
				println("You might have forgot to instantiate the array or its elements");
			}

		}
	public void controlEvent(ControlEvent theEvent){
		if(theEvent.getController().getName()== "Replay"){
			setup();	
		}
		if(theEvent.getController().getName()== "Play"){
			intro = false;	
		}
	}
//home screen pizza
	public void drawPizza(){

			pushMatrix();
			fill(161,194,25);
			strokeWeight((float) 0.5);
			translate(width/2+200,height/2-200);
			ellipse(0, 0, 250, 250);
			fill(234,255,145);
			ellipse(0, 0, 250-10, 250-10);
			noFill();
			popMatrix();
		
	}
//if mouse left press

	public boolean clickObject(){
		if(mousePressed && mouseButton == LEFT){
			return true;
		}
		return false;
	}
	public class SimpleRoom implements Decorator {
		
		SimpleRoom(){	
		}
		
		@Override
		public void showRoom(){
			pushMatrix();
			image(bg,0,0);;
			popMatrix();
		}
	}
	
	
	class RoomDecorator implements Decorator {
		
		protected Decorator specialRoom;
		

		public RoomDecorator(Decorator specialRoom) {
			this.specialRoom = specialRoom;
		}

		public void showRoom() {
			specialRoom.showRoom();
		}
	}
	
	public class LineDecorator extends RoomDecorator {

		public LineDecorator(Decorator specialRoom) {
			super(specialRoom);
		}

		public void showRoom() {
			specialRoom.showRoom();
			addLine();
		}

		private void addLine() {
			table(width/2-500,height/2+55,8,3,90);

		}
		//adding fractal as table
		public void table(float x , float y, float z, int level, int num){
			for(int i = 0; i < num ;i++){
				stroke(109,22,61);
				strokeWeight(1);
				line(x,y,x,y+z);
				line(x,y,x+z*sqrt(3)/2, y-z/2);
				line(x,y,x-z*sqrt(3)/2, y-z/2);
				if(level>1){
					z*=-0.6;
					level -= 1;
					table(x,y+z,z,level,num);
					table(x+z*sqrt(3)/2, y-z/2,z,level,num);
					table(x-z*sqrt(3)/2, y-z/2,z,level,num);
		
				}
				stroke(0);
				x += 15;
			}
		}
	}
	
	public class TableDecorator extends RoomDecorator {

		public TableDecorator(Decorator specialRoom) {
			super(specialRoom);
		}

		public void showRoom() {
			specialRoom.showRoom();
			addTable();
		}

		private void addTable() {	
			fill(200, 200, 0);
			
			pushMatrix();
			fill(140);
			rect(width/2-500,height/2+55,width/2+500,height/2-55);
			noFill();
			popMatrix();
		}
	}


}
