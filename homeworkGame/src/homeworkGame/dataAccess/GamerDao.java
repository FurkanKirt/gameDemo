package homeworkGame.dataAccess;

import homeworkGame.entities.Gamer;

public interface GamerDao {
	void add(Gamer gamer);

	void delete(Gamer gamer);

	void update(Gamer gamer);
}
