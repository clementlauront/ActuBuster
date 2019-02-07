package beans.gestion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Articles;

public class GestionnaireArticle {
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	

	public GestionnaireArticle() {
	}

	
	public boolean ajouterArticle(Articles art) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		session.save(art);
		session.getTransaction().commit();
		session.close();
		return true;
	}
	
	public boolean retirerArticleAvecId(int id) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Articles art = (Articles) session.get(Articles.class, id);
		session.getTransaction().commit();
		session.beginTransaction();
		session.delete(art);
		session.getTransaction().commit();
		session.close();
		return true;
	}
	
	public boolean modifierArticleAvecId(int id) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Articles art = (Articles) session.get(Articles.class, id);
		session.getTransaction().commit();
		session.beginTransaction();
		session.update(art);
		session.getTransaction().commit();
		session.close();
		return true;
	}
	
	
}
