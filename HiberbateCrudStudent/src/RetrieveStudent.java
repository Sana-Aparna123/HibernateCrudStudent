

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetrieveStudent {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
        //To retrieve all data		
		List<Student> tempStudent = session.createQuery("from Student").list();
		for(Student x:tempStudent) {
			System.out.println(x);
		}
		
		//to retrieve single data
		Student tempStudents = (Student) session.get(Student.class, 3);
		System.out.println(tempStudents);
		
		session.getTransaction().commit();
		
	}

}
