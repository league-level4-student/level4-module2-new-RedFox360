package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Candy extends Item{
	public Candy() {
		this.cost = 1;
		if(new Random().nextBoolean()) {
			this.item = "candy1.jpeg";
		}
		else {
			this.item = "candy2.jpeg";
		}
	}

	@Override
	public JLabel getItem() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}
