

package Nimisha106;

public class variables {
int a;//instance

static int b;//static    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int c;//local
     
     variables obj=new variables();//creating object
     
     obj.a=10;
     
     variables.b=30;
     
     c=20;
     
     System.out.println(obj.a);//instance  variable accesing through object
     System.out.println(b);//static variable accesing through class
     System.out.println(c);//local accesing not required
	}

}
