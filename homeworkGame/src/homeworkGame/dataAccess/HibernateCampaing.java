package homeworkGame.dataAccess;

import homeworkGame.entities.Campaing;

public class HibernateCampaing implements CampainDao {

	@Override
	public void add(Campaing campain) {
		System.out.println("eklendi " + campain.getName());

	}

	@Override
	public void delete(Campaing campain) {
		System.out.println("delete " + campain.getName());

	}

	@Override
	public void update(Campaing campain) {
		System.out.println("güncelle " + campain.getName());

	}

}
