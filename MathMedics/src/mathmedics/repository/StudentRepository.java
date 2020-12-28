package mathmedics.repository;

import javafx.collections.ObservableList;
import mathmedics.member.Student;
import mathmedics.model.Grade;
import mathmedics.model.MC_Table;

import java.util.Optional;

public interface StudentRepository {

    // Student 객체로 반환할것이다.
    public String save(Student student);
    ObservableList<MC_Table> findByclass(String s);

    ObservableList<Grade> findAll(String s);

    public void saveclass(Student student);
}
