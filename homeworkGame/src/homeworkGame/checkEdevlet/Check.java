package homeworkGame.checkEdevlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import homeworkGame.dataAccess.GamerDao;
import homeworkGame.entities.Gamer;
import homeworkGame.entities.Person;
import homeworkGame.logging.Logging;

public class Check {
	private Person[] People;
	private Logging[] Logs;


	public Check(Logging[] logs) {
		super();
		Logs = logs;
	}

	public void check(Gamer gamer) throws Exception {

		Person person = new Person();
		person.setTc("123");
		person.setName("sare");
		person.setSurname("Kirt");

		Person person2 = new Person();
		person2.setTc("124");
		person2.setName("furi");
		person2.setSurname("Kirt");

		Person[] people= {person,person2};
		
		for (Person personn : people) {
			if (personn.getTc() == gamer.getTc() && personn.getName() == gamer.getName()
					&& personn.getSurname() == gamer.getSurname()) {
				System.out.println("Baþarýlý giriþ");
				
				for (Logging logging : Logs) {
					logging.log(gamer.getName());				
				}	
				
			}
			else{
				System.out.println("sen kimsin!!!");
				throw new Exception("Böyle bir vatandaþ yok");
			}
		}
		
	}
}
