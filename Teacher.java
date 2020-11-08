package Experience;

interface TeacherManage {
    void setsalary(int salary);
    int getsalary();
}


public class Teacher implements TeacherManage{
	String sex; 
    String name;
    int age;
    int salary;
    Teacher(String sex,String name,int age){
    	this.age=age;
    	this.name = name;
    	this.sex = sex;
    	System.out.println(sex+age+name);
    }
    
    public void setsalary(int salary) {
    	this.salary = salary; 
     }
    public int getsalary() {
    	 return salary;
     }
}
