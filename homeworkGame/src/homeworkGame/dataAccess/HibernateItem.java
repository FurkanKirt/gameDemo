package homeworkGame.dataAccess;

import homeworkGame.entities.Item;

public class HibernateItem implements ItemDao {

	@Override
	public void add(Item item) {
		System.out.println("eklendi " + item.getName());

	}

	@Override
	public void delete(Item item) {
		System.out.println("silindi " + item.getName());

	}

	@Override
	public void update(Item item) {
		System.out.println("güncellendi " + item.getName());

	}

}
