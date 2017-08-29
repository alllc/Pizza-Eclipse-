package utility;

import main.Main;
import utility.Object;
import processing.core.*;

public abstract class ItemCreator {
	Main p;
	
	public ItemCreator(Main p)
	{
		this.p = p;
	}
	
	public abstract Object createItem (int type);
}
