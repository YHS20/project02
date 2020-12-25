package mathmedics.service;


import mathmedics.member.Student;
import mathmedics.repository.StudentRepository;
import mathmedics.repository.memoryStudentRepository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

public class MemberService {

    private memoryStudentRepository memorystudentRepository;

    public MemberService(memoryStudentRepository memorystudentRepository){
        this.memorystudentRepository = memorystudentRepository;
    }

    public String join(Student student) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        String sql;
        String url = "jdbc:mysql://3.36.62.82/project2?characterEncoding=UTF-8&serverTimezone=UTC";
        String memoryName = null;

        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = getConnection(url, "userstudent", "7276");
        Statement stmt = conn.createStatement();
        sql = "select * from student_info where name='"+student.getName()+"';";
        stmt.executeQuery(sql);
        String save_result = memorystudentRepository.save(student);
        return save_result;
    }
}
