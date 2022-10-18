package homeworkGame.dataAccess;

import homeworkGame.entities.Campaing;

public interface CampainDao {
	void add(Campaing campain);

	void delete(Campaing campain);

	void update(Campaing campain);
}
