package pe.edu.upc.student.bussines;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.student.beans.Student;
import pe.edu.upc.student.data.StudentRepository;


@Service
public class StudentBusinessImpl implements StudentBusiness{

	
	@Autowired
	private StudentRepository repository;
	
	
	@Override
	public List<Student> findAll() {
		
		return repository.findAll();
	}

	@Override
	public void saveStudent(Student student) {
		
		repository.save(student);
	}

	@Override
	public void updateStudent(Student student) {
		if(repository.existsById(student.getId()))
			repository.save(student);
	}

	@Override
	public String deleteStudent(Student student) {
		repository.delete(student);
		return student.getDNI();
	}

	@Override
	public Student searchById(Long id) {
		// TODO Auto-generated method stub
		return repository.getById(id);
	}

}
