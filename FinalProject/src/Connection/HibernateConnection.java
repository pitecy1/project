package Connection;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import model.*;



public class HibernateConnection {
	public static SessionFactory sessionFactory;
	public static SessionFactory doHibernateConnection(){
	 try {
		 Properties database = new Properties();
		 database.setProperty("hibernate.hbm2ddl.auto", "create");
		 database.setProperty("hibernate.show_sql", "true");
		 database.setProperty("hibernate.connection.driver_class","com.mysql.jdbc.Driver");
		 database.setProperty("hibernate.connection.username","root");
		 database.setProperty("hibernate.connection.password","1234");
		 database.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL5InnoDBDialect");
		 database.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/projectweb?");
		 Configuration cfg = new Configuration().setProperties(database).addPackage("com.springmvc.connection")
				 .addAnnotatedClass(Stuff.class)
				 .addAnnotatedClass(Category.class)
				 .addAnnotatedClass(Request.class)
				 .addAnnotatedClass(ShipmentTracking.class)
				 .addAnnotatedClass(User.class)
				 .addAnnotatedClass(Report.class)
				 .addAnnotatedClass(Score.class);
		 StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
		 sessionFactory = cfg.buildSessionFactory(ssrb.build());
		 System.out.println("connection sussec");
	 }catch(Exception e) {
		 System.out.println("connection fail");
	 }
	 return sessionFactory;
	}
}