package mathmedics.repository;

import mathmedics.member.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {

    // Student 객체로 반환할것이다.
    public void save(Student student);
    Optional<Student> findById(int id);
    Optional<Student> findByName(String name);
    List<Student> findAll();

    public void saveclass(Student student);
}
