package beans.gestion;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Articles;
import beans.Messages;

public class GestionnaireMessages {
		SessionFactory sessionFactory;
		

		public GestionnaireMessages() {
			this.sessionFactory = new Configuration().configure().buildSessionFactory();
		}

		
		public boolean addMessage(Messages mes) {
			Session session = this.sessionFactory.openSession();
			session.beginTransaction();
			session.save(mes);
			session.getTransaction().commit();
			session.close();
			return true;
		}
		
		public boolean deleteMessageById(int id) {
			// TODO prévoir si id n'existe pas
			Session session = this.sessionFactory.openSession();
			session.beginTransaction();
			Messages art = (Messages) session.get(Messages.class, id);
			session.getTransaction().commit();
			session.beginTransaction();
			session.delete(art);
			session.getTransaction().commit();
			session.close();
			return true;
		}
		
		public Messages getMessageById(int id) {
			Session session = this.sessionFactory.openSession();
			session.beginTransaction();
			Messages art = (Messages) session.get(Messages.class, id);
			session.getTransaction().commit();
			session.close();
			return art;
		}
		
		public ArrayList<Messages> getAllMessages(){
			Session session = this.sessionFactory.openSession();
			session.beginTransaction();
			List<Messages> articles = (List<Messages>) session.createQuery("from Messages").list();
			session.getTransaction().commit();
			session.close();
			
			return (ArrayList<Messages>) articles;
		}

}
