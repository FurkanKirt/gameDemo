package homeworkGame;

import homeworkGame.business.GamerManager;
import homeworkGame.checkEdevlet.Check;
import homeworkGame.dataAccess.HibernateGamer;
import homeworkGame.entities.Gamer;
import homeworkGame.logging.Logging;
import homeworkGame.logging.MailLogging;

public class Main {

	public static void main(String[] args) throws Exception {
		// 1. Oyuncular�n sisteme kay�t olabilece�i, bilgilerini g�ncelleyebilece�i,
		// kay�tlar�n� silebilece�i bir ortam� simule ediniz.
		// M��teri bilgilerinin do�rulu�unu e-devlet sistemlerini kullanarak do�rulama
		// yapmak istiyoruz.
		// (E-devlet sistemlerinde do�rulama TcNo, Ad, Soyad, Do�umY�l� bilgileriyle
		// yap�l�r. Bunu yapacak servisi simule etmeniz yeterlidir.) (Loglama gibi)
		// 2. Oyun sat��� yap�labilecek sat�� ortam�n� simule ediniz.( Yap�lan sat��lar
		// oyuncu ile ili�kilendirilmelidir. Oyuncunun parametre olarak metotta olmas�n�
		// kastediyorum.)
		// 3. Sisteme yeni kampanya giri�i, kampanyan�n silinmesi ve g�ncellenmesi
		// imkanlar�n� simule ediniz.
		// 4. Sat��larda kampanya entegrasyonunu simule ediniz.

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
