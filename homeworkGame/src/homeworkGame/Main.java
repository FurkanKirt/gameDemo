package homeworkGame;

import homeworkGame.business.GamerManager;
import homeworkGame.checkEdevlet.Check;
import homeworkGame.dataAccess.HibernateGamer;
import homeworkGame.entities.Gamer;
import homeworkGame.logging.Logging;
import homeworkGame.logging.MailLogging;

public class Main {

	public static void main(String[] args) throws Exception {
		// 1. Oyuncularýn sisteme kayýt olabileceði, bilgilerini güncelleyebileceði,
		// kayýtlarýný silebileceði bir ortamý simule ediniz.
		// Müþteri bilgilerinin doðruluðunu e-devlet sistemlerini kullanarak doðrulama
		// yapmak istiyoruz.
		// (E-devlet sistemlerinde doðrulama TcNo, Ad, Soyad, DoðumYýlý bilgileriyle
		// yapýlýr. Bunu yapacak servisi simule etmeniz yeterlidir.) (Loglama gibi)
		// 2. Oyun satýþý yapýlabilecek satýþ ortamýný simule ediniz.( Yapýlan satýþlar
		// oyuncu ile iliþkilendirilmelidir. Oyuncunun parametre olarak metotta olmasýný
		// kastediyorum.)
		// 3. Sisteme yeni kampanya giriþi, kampanyanýn silinmesi ve güncellenmesi
		// imkanlarýný simule ediniz.
		// 4. Satýþlarda kampanya entegrasyonunu simule ediniz.

		Gamer gamer = new Gamer();
		gamer.setTc("123");
		gamer.setName("sare");
		gamer.setSurname("Kirt");

		Gamer gamer2 = new Gamer();
		gamer2.setTc("124");
		gamer2.setName("furi");
		gamer2.setSurname("Kirt");

		Logging[] loggers = { new MailLogging() };

		GamerManager gamerManager = new GamerManager(new HibernateGamer(), new Check(loggers));
		
		gamerManager.add(gamer);
		
		System.out.println("----------------");
		gamerManager.add(gamer2);
	}

}
