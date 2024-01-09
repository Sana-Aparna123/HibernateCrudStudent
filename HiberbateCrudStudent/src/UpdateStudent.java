

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudent {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session=factory.getCurrentSession();
		session.beginTransaction();
		Student tempStudent=(Student) session.get(Student.class, 3);
		tempStudent.setEmail("sudheer@gmail.com");
        session.getTransaction().commit();
	}

}
