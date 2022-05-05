package pe.edu.upc.student.bussines;

import java.util.List;

import pe.edu.upc.student.beans.Student;

public interface StudentBusiness {
	
	public List<Student> findAll();
	
	public void saveStudent(Student student);
	
	public void updateStudent(Student student);
	
	public String deleteStudent(Student student);
	
	public Student searchById(Long id); 
	

}
