package Experience;
import java.util.Scanner;
public class Test {
	public final static void calculator(int salary,int fee) {
		int  year_salary = salary - fee;
		double x = 0;
		if (year_salary <= 36000) {
			x = year_salary * 0.03;
		}
		else if (36000 < year_salary && year_salary <= 144000){
			x = year_salary * 0.1 - 2520; }
		else if (144000 < year_salary && year_salary<= 300000) {
			x = year_salary * 0.2 - 16920;
		}
		else if (300000 < year_salary && year_salary<= 420000) {
			x = year_salary * 0.25 - 31920;
		}
		else if (420000 < year_salary && year_salary<= 660000) {
			x = year_salary * 0.3 - 52920;
		}
		else if (660000 < year_salary && year_salary<= 960000) {
			x = year_salary * 0.35 - 85920;
		}
		else if (960000 < year_salary) {
			x = year_salary * 0.45 - 181920;
		}
		System.out.println("��Ҫ���ɵ�˰��" +x);
	}
	//���۳�˰�ձ�д�ɶ����ķ���
	static void panduan(Student li){
		boolean i = true;
		Scanner sc = new Scanner(System.in);
		while(i){
			try {
				System.out.println("����нˮ");
				int salary = 0;
				salary= sc.nextInt();
				System.out.println(salary);
				li.setsalary(salary);
				//System.out.println(""+li.getfee());
			}
			catch(ArrayIndexOutOfBoundsException ne) {
				System.out.println("����Խ��");
				panduan(li);
			}
			catch(NumberFormatException e) {
				System.out.println(e.getMessage()+"���ָ�ʽ����");
				panduan(li);
			}
			catch(Exception m) {
				System.out.println("����δ֪����");
				panduan(li);
			}
			finally {
              i=false;
			}
		}
		System.out.println("��˰��Ϣ");
		calculator(li.getsalary(),li.getfee());
	}
	/*public static void calculator(int salary) {
		int  year_salary = salary * 12;
		double x;

		if (year_salary <= 36000) {	x = year_salary * 0.03;}
		else if (36000 < year_salary && year_salary <= 144000){
			x = year_salary * 0.1 - 2520; }
		else if (144000 < year_salary && year_salary<= 300000) {
			x = year_salary * 0.2 - 16920;
		}
		else if (300000 < year_salary && year_salary<= 420000) {
			x = year_salary * 0.25 - 31920;
		}
		else if (420000 < year_salary && year_salary<= 660000) {
			x = year_salary * 0.3 - 52920;
		}
		else if (660000 < year_salary && year_salary<= 960000) {
			x = year_salary * 0.35 - 85920;
		}
		else if (960000 < year_salary) {
			x = year_salary * 0.45 - 181920;
		}
		System.out.println("ÿ����Ҫ���ɵ�˰��" +x/12);
	}
*/



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//	Teacher teacher = new Teacher(args[0],args[1],age);

		int[] age = new int[5];
		String[] information = new String[10];
		System.out.println("�����о�����Ϣ");
		System.out.println("�Ա�����������");
		information[0] = sc.nextLine();
		information[1] = sc.nextLine();
		age[0] = sc.nextInt();
		sc.nextLine();
		Student li = new Student(information[0], information[1], age[0]);

		boolean i = true;
		while (i) {
			try {
				System.out.println("����нˮ");
				int salary = 0;
				salary = sc.nextInt();
				System.out.println(salary);
				li.setsalary(salary);
				int fee = 0;
				System.out.println("����ѧ��");
				fee = sc.nextInt();
				System.out.println(salary);
				li.setfee(fee);
				//System.out.println(""+li.getfee());
				i = false;
			} catch (ArrayIndexOutOfBoundsException ne) {
				System.out.println("����Խ��");

			} catch (NumberFormatException e) {
				System.out.println(e.getMessage() + "���ָ�ʽ����");
			} catch (Exception m) {
				System.out.println("����δ֪����");
			} finally {
				sc.nextLine();
			}
		}
		System.out.println("��˰��Ϣ");
		calculator(li.getsalary(),li.getfee());


		System.out.println("�����о�����Ϣ");
		System.out.println("�Ա�����������");
		information[2] = sc.nextLine();
		information[3] = sc.nextLine();
		age[1] = sc.nextInt();
		sc.nextLine();
		Student yang = new Student(information[2], information[3], age[1]);
		panduan(yang);
	}
	}


