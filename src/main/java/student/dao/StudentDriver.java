package student.dao;

import java.util.Scanner;


import student.dto.Student_deatials;
import student.servies.Services;

public class StudentDriver {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		StudentDao s = new StudentDao();
		Student_deatials sd =new Student_deatials();
		
		boolean exit = true;
		while(exit)
		{
			System.out.println("1.add Student \n2.Delete student \n3.Update Student \n4.Show student Details \n5.exit");
			int chioce=scn.nextInt();
			switch(chioce) {
			case 1:
			{
				System.out.println("enter the name of student");
				String name=scn.next();
				System.out.println("enter the id of student");
				int id=scn.nextInt();
				System.out.println("enter the English marks of student");
				int e=scn.nextInt();
				System.out.println("enter the maths marks name of student");
				int m=scn.nextInt();
				System.out.println("enter the science marks name of student");
				int sc=scn.nextInt();
				sd.setName(name);
				sd.setEnglish(e);
				sd.setId(id);
				sd.setMaths(m);
				sd.setScience(sc);
				Services se = new Services();
				se.setGrade(sd);
				se.Insert(sd);
				System.out.println("done.................!");
			}
			break;
			case 2:
			{
				System.out.println("enter the id of student");
				int id=scn.nextInt();
				s.deleteEmployee(id);
				System.out.println("Deleted.................!");
			}
			break;
			case 3:
			{
				System.out.println("enter the name of student");
				String name=scn.next();
				System.out.println("enter the id of student");
				int id=scn.nextInt();
				System.out.println("enter the English marks of student");
				int e=scn.nextInt();
				System.out.println("enter the maths marks name of student");
				int m=scn.nextInt();
				System.out.println("enter the science marks name of student");
				int sc=scn.nextInt();
				sd.setName(name);
				sd.setEnglish(e);
				sd.setId(id);
				sd.setMaths(m);
				sd.setScience(sc);
				Services sev = new Services();
				sev.setGrade(sd);
				sev.Update(sd);
				System.out.println("done.................!");
			}
			break;
			case 4:{
				System.out.println("enter the id of student");
				int id=scn.nextInt();
				s.showStudent(id);
			}
			break;
			case 5:
			{
				exit= false;
				System.out.println("thank you");
			}
			}
		}
	}

}
