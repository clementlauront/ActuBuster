package beans.gestion;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Articles;
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
	public boolean addAllTags(List<Tags> tags){
		// TODO à vérifier
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		session.save(tags);
		session.getTransaction().commit();
		session.close();
		return true;
	}
	
	public ArrayList<Tags> getAllTags(){
		// TODO à vérifier
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		ArrayList<Tags> allTags = (ArrayList<Tags>) session.createQuery("from Tags").list();
		session.getTransaction().commit();
		session.close();
		
		return (ArrayList<Tags>) allTags;
	}
	
	public ArrayList<Tags> getTagsByTag(String tag){
		// TODO à vérifier
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		List<Tags> tags = (List<Tags>) session.createQuery("from Tags WHERE Tags.tag = '"+tag+"'").list();
		session.getTransaction().commit();
		session.close();
		
		return (ArrayList<Tags>) tags;
	}
}
