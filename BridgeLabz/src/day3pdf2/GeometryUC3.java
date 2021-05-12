package day3pdf2;
import java.lang.Math;
public class GeometryUC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1,x2,y1,y2;
		int a1,a2,b1,b2;
		Double dis2;
        a1=2;b1=2;a2=4;b2=4;
	    Double dis1;
	    x1=1;y1=1;x2=4;y2=4;
	   
	    dis1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	 	    
            System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis1);
    		
    	    dis2=Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));	 	    
                System.out.println("distancebetween"+"("+a1+","+b1+"),"+"("+a2+","+b2+")===>"+dis2);
     
                
               
                int compareValue = dis1.compareTo(dis2);
                
                if (compareValue == 0)
                    System.out.println("line1 and lines are equal");
                else if (compareValue < 0)
                    System.out.println("lines1 is less than lines2");
                else
                    System.out.println("lines1 is greater than lines2");
                
	}

}
