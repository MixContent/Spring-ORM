package com.spring_jdbc;
import java.util.List;
public class DemoBean {
	private CurdDAO curdDAO;
	public void setCurdDAO(CurdDAO curdDAO) {
		this.curdDAO = curdDAO;
	}
	public void insertStudent(int sid,String sname,int marks)
	{
		Student s = new Student();
		s.setStudentId(sid);
		s.setStudentName(sname);
		s.setMarks(marks);
		curdDAO.save(s);
	}
	public void updateStudent(int sid,String sname,int marks)
	{
		Student s = new Student();
		s.setMarks(marks);
		s.setStudentId(sid);
		s.setStudentName(sname);
	}

	public List<Student> selectStudent() {
		List<Student> list = curdDAO.findStudents();
		return list;

	}

}
