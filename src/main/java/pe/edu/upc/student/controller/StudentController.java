package pe.edu.upc.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.student.beans.Student;
import pe.edu.upc.student.bussines.StudentBusiness;

@RestController
@RequestMapping(value = "/api/v1")
public class StudentController {
	
	@Autowired
	private StudentBusiness business;
	
	//listar todos
	@GetMapping(value = "/students")
	public ResponseEntity<Object> getAll(){
		return new ResponseEntity<>(business.findAll(), HttpStatus.OK);
	}
	
	
	// buscar por id
	@GetMapping(value = "/students/{id}")
	public ResponseEntity<Object> getStudentById(@PathVariable(name = "id") Long id){
		return new ResponseEntity<>(business.searchById(id), HttpStatus.OK);
	}
	
	// guardar
	@PostMapping(value = "/students")
	public ResponseEntity<Object> saveStudent(@RequestBody Student student){
		business.saveStudent(student);
		return new ResponseEntity<>("Estudiante guardado", HttpStatus.OK);
	}
	
	
	//modificar
	@PatchMapping(value = "/students")
	public ResponseEntity<Object> updateStudent(@RequestBody Student student){
		business.updateStudent(student);
		return new ResponseEntity<>("Estudiante actualizado", HttpStatus.OK);
	}
	
	
	//eliminar
	@DeleteMapping(value = "/students")
	public ResponseEntity<Object> deleteStudent(@RequestBody Student student)
	{
		business.deleteStudent(student);
		return new ResponseEntity<>("Estudiante eliminado", HttpStatus.OK);
	}
	
}
