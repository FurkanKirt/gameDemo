package homeworkGame.entities;

public class Campaing extends BaseEntities{
public Campaing() {
		super();
	}
public Campaing(String description, int discount) {
		super();
		this.description = description;
		this.discount = discount;
	}
String description;
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getDiscount() {
	return discount;
}
public void setDiscount(int discount) {
	this.discount = discount;
}
int discount;
}
