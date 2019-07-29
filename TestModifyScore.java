import java.util.Scanner;


public class TestModifyScore {
	public static void main(String[] args) {
		ModifyScore ms=new ModifyScore();
		Student[] stus=new Student[3];
		Student s1=new Student("张三",40);				
		Student s2=new Student("李四",90);		
		Student s3=new Student("王五",50);
		
		stus[0]=s1;
		stus[1]=s2;
		stus[2]=s3;
		
		ms.modifyScore(stus);
		ms.showInfo(stus);
	}
}
