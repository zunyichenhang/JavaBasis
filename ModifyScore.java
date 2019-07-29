//修改成绩的类
public class ModifyScore {
	
	public void modifyScore(Student[] stus){
		for(int i=0;i<stus.length;i++){
			if(stus[i].score<60){
				stus[i].score+=2;
			}
		}
	}
	
	public void showInfo(Student[] stus){
		for(Student i:stus){
			i.showInfo();
		}
	}
}
