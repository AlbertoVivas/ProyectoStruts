/**
 * 
 */
package practica1.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * @author Alberto Vivas
 *
 * 
 */
public class SessionManagerHibernate {

	private  Session session;
	private static Configuration configuration;
	private static StandardServiceRegistryBuilder builder;
	private static SessionFactory factory;
	
	private static SessionManagerHibernate sessionManager = new SessionManagerHibernate();
	
	
	private SessionManagerHibernate(){
    	configuration = new Configuration().configure();
    	builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
    	factory = configuration.buildSessionFactory(builder.build());//Solo se hace una vez en cada programa
	}
	

	public static Session getSesion(){
		sessionManager.session = factory.openSession();
		return sessionManager.session;
	}
	
	public static SessionFactory getSesionFactory(){
		return factory;
	}
	
	public static void cerrarSesion(){
		sessionManager.session.close();
	}
	
	public static void desconectarSesion(){
		sessionManager.session.disconnect();
	}
	
	public static void cerrarfactory(){
		sessionManager.factory.close();
	}
	
	/*public static SesionManager getSesionManager(){
		return sesionManager;
	}*/
	
	
	
}
