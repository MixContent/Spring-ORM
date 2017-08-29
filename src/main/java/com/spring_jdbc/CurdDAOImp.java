package com.spring_jdbc;

import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class CurdDAOImp implements CurdDAO {
	private HibernateTemplate ht;

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	public void save(Student s) {
		System.out.println(ht.save(s));

	}

	public void update(Student s) {
		ht.update(s);

	}

	public List<Student> findStudents() {
		List<Student> list = (List<Student>) ht.find("from Student s");
		return list;
	}

}
