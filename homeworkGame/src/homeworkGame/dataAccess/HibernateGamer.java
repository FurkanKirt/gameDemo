package homeworkGame.dataAccess;

import homeworkGame.entities.Gamer;

public class HibernateGamer implements GamerDao {

	@Override
	public void add(Gamer gamer) {
		System.out.println("eklendi " + gamer.getName());

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("silindi " + gamer.getName());

	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("güncellendi " + gamer.getName());

	}

}
