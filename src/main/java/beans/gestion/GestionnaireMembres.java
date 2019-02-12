package beans.gestion;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Articles;
import beans.Membres;

public class GestionnaireMembres {
	SessionFactory sessionFactory;

	public GestionnaireMembres() {
		this.sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	
	public boolean addMembre(Membres membre) {
		// TODO prévoir si l'ajout ne se fait pas
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		session.save(membre);
		session.getTransaction().commit();
		session.close();
		return true;
	}
	
	public boolean deleteMembreById(int id) {
		// TODO prévoir si id n'existe pas
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Membres membre = (Membres) session.get(Membres.class, id);
		session.getTransaction().commit();
		session.beginTransaction();
		session.delete(membre);
		session.getTransaction().commit();
		session.close();
		return true;
	}
	
	public boolean updateMembre(int id) {
		// TODO prévoir si id de l'article n'existe pas
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Membres membre = (Membres) session.get(Membres.class, id);
		session.getTransaction().commit();
		session.beginTransaction();
		session.update(membre);
		session.getTransaction().commit();
		session.close();
		return true;
	}
	
	public Membres getMembreById(int id) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Membres membre = (Membres) session.get(Membres.class, id);
		session.getTransaction().commit();
		session.close();
		return membre;
	}
	
	public ArrayList<Membres> getAllMembres(){
		// TODO à vérifier
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		List<Membres> membres = (List<Membres>) session.createQuery("from Membres").list();
		session.getTransaction().commit();
		session.close();
		
		return (ArrayList<Membres>) membres;
	}

}
