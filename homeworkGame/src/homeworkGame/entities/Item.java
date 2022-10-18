package homeworkGame.entities;

public class Item extends BaseEntities {
	public Item() {
		super();
	}

	public Item(int price) {
		super();
		this.price = price;
	}

	int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
