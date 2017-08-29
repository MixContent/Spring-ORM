package com.spring_jdbc;

import java.util.List;

public interface CurdDAO {
	void save(Student s);

	void update(Student s);

	List<Student> findStudents();

}
