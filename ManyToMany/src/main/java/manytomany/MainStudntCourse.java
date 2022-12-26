package manytomany;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Persistence;

@Entity
class Student
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Name;
	private String email;
	
	
	@ManyToMany
	List<Course> course;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public List<Course> getCourse() {
		return course;
	}


	public void setCourse(List<Course> course) {
		this.course = course;
	}
	
	
	
}

@Entity
class Course
{
	@Id
	@GeneratedValue(strategy = (GenerationType.IDENTITY))
	private int id;
	private String C_Name;
	private String C_Dur;
	
	
	@ManyToMany
	List<Student> student;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getC_Name() {
		return C_Name;
	}


	public void setC_Name(String c_Name) {
		C_Name = c_Name;
	}


	public String getC_Dur() {
		return C_Dur;
	}


	public void setC_Dur(String c_Dur) {
		C_Dur = c_Dur;
	}


	public List<Student> getStudent() {
		return student;
	}


	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	
	
}


public class MainStudntCourse 
{
	public static void main(String[] args) 
	{

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s1 = new Student();
		s1.setName("Tom");
		s1.setEmail("T@gmail.com");
		
		Student s2 = new Student();
		s2.setName("Jerry");
		s2.setEmail("J@gmail.com");
		
		Course c1 = new Course();
		c1.setC_Name("JAVA");
		c1.setC_Dur("50Hrs");
		
		Course c2 = new Course();
		c2.setC_Name("Python");
		c2.setC_Dur("45Hrs");
		
		List<Student> st1 = new ArrayList<Student>();
		st1.add(s1);
		st1.add(s2);
		
		
		List<Course> cs1 = new ArrayList<Course>();
		cs1.add(c1);
		cs1.add(c2);
		
		c1.setStudent(st1);
		s1.setCourse(cs1);
		
		et.begin();
		em.persist(c1);
		em.persist(c2);
		em.persist(s1);
		em.persist(s2);
		et.commit();
		

		
	}

}

class MainStudentCourse2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		int n=1;
		while(n==1)
		{
				System.out.println("Press 1 to Enter data for Students \n press 2 for adding data for course");
				n=sc.nextInt();
				Student s1;
				List<Student> st1;
				Course c1;
				List<Course> cs1;
				
				
					while(n==1)
					{
						s1= new Student();
						st1=  new ArrayList<Student>();
						System.out.println("Name: \n Email:");
						
						s1.setName(sc.next());
						s1.setEmail(sc.next());
						
						c1 = new Course();
						st1.add(s1);
						c1.setStudent(st1);
						em.persist(s1);
						
						System.out.println("Press 1 to add more data for student \n Press 2 to add data in course");
						n= sc.nextInt();
				
					}
				
					while(n==2)
					{
						c1 = new Course();
						cs1 = new ArrayList<Course>();
						System.out.println("C_Name: \n C_Dur:");
						c1.setC_Name(sc.next());
						c1.setC_Dur(sc.next());
						
						
						s1= new Student();
						cs1.add(c1);
						s1.setCourse(cs1);
						em.persist(c1);
						System.out.println("Press 2 to add more data for Course \n  press any other number to exit");
						n=sc.nextInt();
						
					}	
				

				System.out.println("Data saved successfully \n press 1 to add more data");
				n=sc.nextInt();
		}
		et.commit();
		sc.close();
		System.out.println("Thanks!!!");
		
	}
}

class DeleteStCr
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		int n=1;
		while(n==1)
		{
			System.out.println("press 1 to delete from Student \n press 2 to delete from Course");
			n=sc.nextInt();
			if(n==1)
			{
				while(n==1)
				{
					System.out.println("enter id u want to delete");
					
				}
			}
		}
		
	}
}





















