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
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		session.save(art);
		session.getTransaction().commit();
		session.close();
		return true;
	}
	
	public boolean deleteArticleById(int id) {
		// TODO prévoir si id n'existe pas
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
	
	public boolean updateArticle(Articles article) {
		// TODO prévoir si id de l'article n'existe pas
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		session.getTransaction().commit();
		session.beginTransaction();
		session.update(article);
		session.getTransaction().commit();
		session.close();
		return true;
	}
	
	public Articles getArticleById(int id) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Articles art = (Articles) session.get(Articles.class, id);
		session.getTransaction().commit();
		session.close();
		return art;
	}
	
	public ArrayList<Articles> getAllArticles(){
		// TODO à vérifier
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		List<Articles> articles = (List<Articles>) session.createQuery("from Articles").list();
		session.getTransaction().commit();
		session.close();
		
		return (ArrayList<Articles>) articles;
	}
	
	public ArrayList<Articles> getArticlesByTitre(String titre){
		// TODO à vérifier
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		List<Articles> articles = (List<Articles>) session.createQuery("from Articles WHERE titre = '"+titre+"'").list();
		session.getTransaction().commit();
		session.close();
		
		return (ArrayList<Articles>) articles;
	}
	
	public ArrayList<Articles> getArticlesByAuteur(String auteur){
		// TODO à vérifier
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		List<Articles> articles = (List<Articles>) session.createQuery("from Articles WHERE membres = '"+auteur+"'").list();
		session.getTransaction().commit();
		session.close();
		
		return (ArrayList<Articles>) articles;
	}
	

	public ArrayList<Articles> getArticlesByContenu(String contenu){
		// TODO à vérifier
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		List<Articles> articles = (List<Articles>) session.createQuery("from Articles WHERE contenue = '"+contenu+"'").list();
		session.getTransaction().commit();
		session.close();
		
		return (ArrayList<Articles>) articles;
	}
	public ArrayList<Articles> getArticlesByChapeau(String chapeau){
		// TODO à vérifier
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		List<Articles> articles = (List<Articles>) session.createQuery("from Articles WHERE chapeau = '"+chapeau+"'").list();
		session.getTransaction().commit();
		session.close();
		
		return (ArrayList<Articles>) articles;
	}
//	public ArrayList<Articles> getArticlesByTag(String tag){
//		// TODO à vérifier
//		Session session = this.sessionFactory.openSession();
//		session.beginTransaction();
//		List<Articles> articles = (List<Articles>) session.createQuery("from Tags WHERE Tags.tags = '"+tag+"'").list();
//		session.getTransaction().commit();
//		session.close();
//		
//		return (ArrayList<Articles>) articles;
//	}
}
