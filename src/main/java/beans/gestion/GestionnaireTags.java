package beans.gestion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Tags;

public class GestionnaireTags {
	SessionFactory sessionFactory;

	public GestionnaireTags() {
		this.sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	
	public boolean addTag(Tags tag) {
		// TODO prévoir si l'ajout ne se fait pas
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		session.save(tag);
		session.getTransaction().commit();
		session.close();
		return true;
	}
}
