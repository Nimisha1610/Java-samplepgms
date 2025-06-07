package oopsJavaLab;
import java.util.Scanner;

class MarksValidationException extends Exception{
	private String msg;

	MarksValidationException(String msg){
		this.msg=msg;
	}
	public String toString() {
		return (msg);
	}
	}

public class EXCEPTION {
	public static void main(String[] args) {
	
		String s1name,s2name;
		int s1mark[]=new int[3];
		int s2mark[]=new int[3];
		int sum2=0,sum1=0,avg=0;
        Scanner sc=new Scanner(System.in);
        
        try {
        	System.out.println("Enter student 1 name:");
        	s1name=sc.nextLine();
        	
        for(int i=0;i<3;i++) {
        	System.out.println("enter s1 mark"+(i+1)+":");
        	s1mark[i]=Integer.parseInt(sc.next());
        	
   if(s1mark[i]<0||s1mark[i]>100)
	   throw new MarksValidationException("enter in 0-100 range");
    sum1=sum1+s1mark[i];
        }
        
        System.out.println("Enter student 2 name:");
    	s2name=sc.next();
    	
    for(int i=0;i<3;i++) {
    	System.out.println("enter s2 mark"+(i+1)+":");
    	s2mark[i]=Integer.parseInt(sc.next());
if(s2mark[i]<0||s2mark[i]>100)
   throw new MarksValidationException("enter in 0-100 range");
sum2=sum2+s2mark[i];
        }
    avg=(sum1+sum2)/6;
	System.out.println("avg marks of "+s1name +" and "+s2name+" is: "+avg);
        }
        catch(NumberFormatException e) {
        	System.out.println("enter integer"+e);
        }
        catch(MarksValidationException e) {
        	System.out.println(e.toString());
        }
        finally {
        	sc.close();
        }
	}}
