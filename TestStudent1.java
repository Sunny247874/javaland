package hello;
/*public class TestStudent1 {
	public static void main(String args[])
	{
	student s1=new student();
	System .out.println(s1.id);
	System.out.println(s1.name);
	}

}*/

//public class TestStudent1{
	/*public static void main(String args[])
	{
		student s1=new  student();
		student s2=new  student();
		s1.id=101;
		s1.name="ayush";
		s2.id=102;
		s2.name="sunny";
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
		
	}
}*/
public class Student{
	int rollno;
	String name;
	void insertrecord(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void displayinformation() {System.out.println(rollno+" "+name);}
}
	public class TestStudent1{
	public static void main(String args[])
	{
		student s1=new student();
		student s2=new student();
		s1.insertrecord(111,"ayush");
		s2.insertrecord(222,"sunny");
		s1.displayinformation();
		s2.displayinformation();
	}
	}
	


