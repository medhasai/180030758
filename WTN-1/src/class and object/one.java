package classandobject;

public class one {
	double h,w,d;

    one(double width,double height,double depth)
   {
       h=height;
       w=width;
       d=depth;
   }
   double volume()
   { double v;
   v=h*w*d;
   return v;
   }
  
   public static void main(String[] args) {
      
   one bc = new one(8.5,80.3,9.6);
   System.out.println(bc.volume());

   }

}