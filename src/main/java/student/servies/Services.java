package student.servies;

import student.dao.StudentDao;
import student.dto.Student_deatials;

public class Services {
	double total;
	StudentDao st = new StudentDao();
	public void setGrade(Student_deatials s) throws Exception {
		total=(double)(s.getMaths()+s.getScience()+s.getEnglish())/3;
		if(total>80)
			s.setGrade("A");
		else if(total>60)
			s.setGrade("B");
		else if(total>35)
			s.setGrade("C");
		else
			s.setGrade("F");
	}
	public void Insert(Student_deatials s) throws Exception {
		st.insertEmployee(s);
	}
	public void Update(Student_deatials s) throws Exception {
		st.updateStudent(s);
	}
	

}
