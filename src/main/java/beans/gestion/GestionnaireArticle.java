package beans.gestion;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Articles;

public class GestionnaireArticle {
	SessionFactory sessionFactory;
	

	public GestionnaireArticle() {
		this.sessionFactory = new Configuration().configure().buildSessionFactory();
	}

	
	public boolean addArticle(Articles art) {
		// TODO prévoir si l'ajout ne se fait pas
		// TODO à vérifier
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		session.save(art);
		session.getTransaction().commit();
		session.close();
		return true;
	}
	
	public boolean deleteArticleById(int id) {
		// TODO prévoir si id n'existe pas
		// TODO à vérifier
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
	
	public boolean updateArticle(int id) {
		// TODO prévoir si id de l'article n'existe pas
		// TODO à vérifier
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
	
	public Articles getArticleById(int id) {
		// TODO à vérifier
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Articles art = (Articles) session.get(Articles.class, id);
		session.getTransaction().commit();
		session.close();
		return art;
	}
	
	public ArrayList<Articles> getAllArticles(){
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		List<Articles> articles = session.createQuery("from Articles").list();
		session.getTransaction().commit();
		session.close();
		
		return (ArrayList<Articles>) articles;
	}
	
	
}
