package mathmedics.repository;

import javafx.collections.ObservableList;
import mathmedics.member.Student;
import mathmedics.model.Grade;
import mathmedics.model.MC_Table;

import java.util.Optional;

public class memoryClassRepository implements StudentRepository{


    @Override
    public String save(Student student) {
        return null;
    }

    @Override
    public ObservableList<MC_Table> findByclass(String s) {
        return null;
    }

    @Override
    public ObservableList<Grade> findAll(String s) {
        return null;
    }

    @Override
    public void saveclass(Student student) {

    }
}
