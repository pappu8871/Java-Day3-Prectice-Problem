package day3pdf2;

public class GeometryUC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1,x2,y1,y2;
		int a1,a2,b1,b2;
		double dis2;
        a1=2;b1=2;a2=4;b2=4;
	    double dis1;
	    x1=1;y1=1;x2=4;y2=4;
	   
	    dis1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	 	    
            System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis1);
    		
    	    dis2=Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));	 	    
                System.out.println("distancebetween"+"("+a1+","+b1+"),"+"("+a2+","+b2+")===>"+dis2);
            
                if (dis1 == dis2) {
                	System.out.println("lines are equa;ls");
                }
                else 
                		System.out.println("lines are not equals");
                	
                }
	}


