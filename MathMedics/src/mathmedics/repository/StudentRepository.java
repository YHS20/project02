package mathmedics.repository;

import mathmedics.member.Student;

import java.sql.ResultSet;
import java.util.Optional;

public interface StudentRepository {

    // Student 객체로 반환할것이다.
    public String save(Student student);
    Optional<Student> findByName(String name);
    ResultSet findAll();

    public void saveclass(Student student);
}
