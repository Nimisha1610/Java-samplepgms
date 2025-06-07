package oopsJavaLab;

public class bmical {
String name;
double weight;
double height;
bmical(String pname,double wt,double ht){
	name=pname;
	weight=wt;
	height=ht;
}
double bmi(){
	return (weight/(height*height))*703;
}
	public static void main(String[] args) {

bmical p1=new bmical("nimisha",121,66);

System.out.println("BMI of "+p1.name+"is "+p1.bmi());
bmical p2=new bmical("ganesha",173,70);
System.out.println("BMI of "+p2.name+"is "+p2.bmi());
	}

}
