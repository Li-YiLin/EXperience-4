package Experience;
interface StudentManage {
    void setfee(int fee);
    int getfee();
}
public class Student implements StudentManage,TeacherManage{
    String sex; 
    String name;
    int age;
    int spending;
    int salary;
    Student(String sex,String name,int age){
    	this.age=age;
    	this.name = name;
    	this.sex = sex;
    	System.out.println("已经导入："+sex+age+name);
    }
    public void setsalary(int salary) {
    	this.salary = salary;
    }
     public int getsalary(){
    	return salary;
    }
     public void setfee(int fee) {
    	 this.spending = fee;
     }
     public int getfee() {
    	 return spending;
     }
}
