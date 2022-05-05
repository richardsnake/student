package pe.edu.upc.student.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.student.beans.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
