package exam;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud1 = new Student(1, "Rochelle", "SE", 10, 20, 10, 20);
		stud1.display(1, "Rochelle", "DA", 20);
		
		SessionFactory ses = new Configuration().configure().buildSessionFactory();
		Session session = ses.openSession();
		session.beginTransaction();
		session.save(stud1);
		
		session.getTransaction().commit();
		ses.close();
		session.close();
	}

}