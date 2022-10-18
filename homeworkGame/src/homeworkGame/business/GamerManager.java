package homeworkGame.business;

import homeworkGame.checkEdevlet.Check;
import homeworkGame.dataAccess.GamerDao;
import homeworkGame.entities.Gamer;

public class GamerManager {
	private GamerDao gamerDao;
	private Check checko;


	public GamerManager(GamerDao gamerDao, Check checko) {
		super();
		this.gamerDao = gamerDao;
		this.checko = checko;
	}

	

	public void add(Gamer gamer) throws Exception {
		checko.check(gamer);
		gamerDao.add(gamer);
	}

	public void delete(Gamer gamer) {
		gamerDao.delete(gamer);
	}

	public void update(Gamer gamer) {
		gamerDao.update(gamer);
	}

}
