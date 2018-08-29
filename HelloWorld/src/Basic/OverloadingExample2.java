package Basic;
public class OverloadingExample2
{
   private int rollNum;
   OverloadingExample2()
   {
      rollNum =100;
   }
   OverloadingExample2(int rnum)
   {
      this();
      /*this() is used for calling the default  
       * constructor from parameterized constructor.
       * It should always be the first statement 
       * inside constructor body.
       */
      rollNum = rollNum+ rnum;
   }
   public int getRollNum() {
	  return rollNum;
   }
   public int setRollNum(int rollNum) {
	  this.rollNum = rollNum;
	  return rollNum;
   }
   public static void main(String args[])
   {
	   OverloadingExample2 obj = new OverloadingExample2(12);
       System.out.println(obj.getRollNum());
       System.out.println(obj.setRollNum(2));
       System.out.println(obj.getRollNum());
    }
}