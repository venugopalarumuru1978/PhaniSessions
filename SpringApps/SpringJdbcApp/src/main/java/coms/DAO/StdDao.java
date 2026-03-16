package coms.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import coms.beans.Student;

public class StdDao {

	private DataSource  dataSource;
	private JdbcTemplate jdbcTemp;
	
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemp = new JdbcTemplate(this.dataSource);
		//System.out.println("Db Connected");
	}
	
	public void AddNewStudent(Student std)
	{
		String sqlcmd = "Insert into Student(rollno, sname, course, fees) values(?,?,?,?)";		
		jdbcTemp.update(sqlcmd, new Object[] {std.getRollno(), std.getSname(), std.getCourse(), std.getFees()});
		System.out.println("New Student is Added...");
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Student> ShowAll()
	{
		List<Student>  stdList = new ArrayList<Student>();
		String sqlcmd = "select * from Student";
		stdList = jdbcTemp.query(sqlcmd, new BeanPropertyRowMapper(Student.class));		
		return stdList;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Student  SearchStd(int rno)
	{
		Student std = null;
		try {
			String sqlcmd = "select * from Student where rollno=?";
			std = (Student)jdbcTemp.queryForObject(sqlcmd, new Object[] {rno}, new BeanPropertyRowMapper(Student.class));							
		} catch (Exception e) {
			std = null;
		}
		return std;
	}
	
	public void DeleteStudent(int rno)
	{
		String sqlcmd = "Delete from Student where rollno=?";		
		jdbcTemp.update(sqlcmd, new Object[] {rno});
		System.out.println("Student is Deleted...");
	}
	
	public void UpdateStudent(int rno, String sname)
	{
		String sqlcmd = "Update Student set sname=? where rollno=?";		
		jdbcTemp.update(sqlcmd, new Object[] {sname, rno});
		System.out.println("Student is Updated...");
	}
	
}
