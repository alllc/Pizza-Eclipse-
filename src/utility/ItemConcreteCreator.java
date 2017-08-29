package utility;


import oven.Oven;
import main.Main;
import pizza.Pizza;
import processing.core.PApplet;
import sauces.*;
import toppings.*;
public class ItemConcreteCreator extends ItemCreator{

	public ItemConcreteCreator(Main p) {
		super(p);
		
	}

	@Override
	public Object createItem(int type) {
		Object item = null;
		if (type == 1)
		{
			item = new Pizza(p);
		}
		else if (type == 2)
		{
			item = new Oven(p);
		}
		else if (type == 3)
		{
			item = new Ketchup(p);
		}
		else if (type == 4)
		{
			item = new Olive_Oil(p);
		}
		else if (type == 5)
		{
			item = new BBQ_Sauce(p);
		}
		else if (type == 6)
		{
			item = new Yellow_Mustard(p);
		}
		else if (type == 7)
		{
			item = new Cheese(p);
		}
		else if (type == 8)
		{
			item = new Mushrooms(p);
		}
		else if (type == 9)
		{
			item = new Peppers(p);
		}
		else if (type == 10)
		{
			item = new Onions(p);
		}
		else if (type == 11)
		{
			item = new Pepperoni(p);
		}
		else if (type == 12)
		{
			item = new Shrimp(p);
		}
		else if (type == 13)
		{
			item = new Pineapple(p);
		}

		return item;
	}

}
