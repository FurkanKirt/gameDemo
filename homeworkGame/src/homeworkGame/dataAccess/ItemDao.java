package homeworkGame.dataAccess;

import homeworkGame.entities.Item;

public interface ItemDao {
	void add(Item item);

	void delete(Item item);

	void update(Item item);
}
