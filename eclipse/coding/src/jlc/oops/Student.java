package jlc.oops;

public class Student {
	int sid;
	String sname;
		
	void Student(int id, String name) {
		System.out.println("2-arg constructor");
		sid = id;
		sname = name;
	}
	
	Student() {
		System.out.println("Default constructor");
	}
	
	void show() {
		System.out.println(sid+"\t"+sname);
	}

}
