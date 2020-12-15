package mathmedics.repository;

import mathmedics.member.Student;

import java.sql.*;
import java.util.List;
import java.util.Optional;

public class memoryStudentRepository implements StudentRepository{



    @Override
    public void save(Student student) {
        Connection conn = null;
        String sql;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/project2?characterEncoding=UTF-8&serverTimezone=UTC";
            conn = DriverManager.getConnection(url, "userstudent", "7276");
            Statement stmt = conn.createStatement();
            System.out.println("SQL 성공");
            sql = "INSERT INTO student_info(grade,mClass,name,birthday,gender,mobile,address) VALUES("+ student.toString()+");";
            System.out.println(sql);
            stmt.executeUpdate(sql);

        }catch(ClassNotFoundException e){
            System.out.println("드라이버로딩실패");
        }catch(SQLException e){
            System.out.println("에러: " + e);
        }
        finally{
            try{
                if( conn != null && !conn.isClosed()){
                    conn.close();
                }
            }
            catch( SQLException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public Optional<Student> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<Student> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public void saveclass(Student student) {

    }
}
