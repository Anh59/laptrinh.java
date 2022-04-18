interface Stack
{
   public void push( int x );
   public int  pop ( );
}
class ArrayStack implements Stack
{
   
   public int[] item;
   public int stackTop;

   public ArrayStack( int size )
   {
      item = new int[size];      
      stackTop = 0;
   }

  
   public void push( int x )
   {
      item[stackTop] = x;         
      stackTop++;                 
   }

   public int  pop ( )
   {
      int returnItem;

      returnItem = item[ stackTop-1 ];   
      stackTop--;                        

      return returnItem;
   }
}
public class Stackbai1
{
   public static void main( String[] args )
   {
      int   x;
      Stack s;

      s = new ArrayStack( 10 );

      x = 4; s.push(x); System.out.println("push(" + x + ");");
      x = 7; s.push(x); System.out.println("push(" + x + ");");
      x = 8; s.push(x); System.out.println("push(" + x + ");");
      x = 9; s.push(x); System.out.println("push(" + x + ");");

      x = s.pop(); System.out.println("pop() ---> " + x );
      x = s.pop(); System.out.println("pop() ---> " + x );
      x = s.pop(); System.out.println("pop() ---> " + x );
      x = s.pop(); System.out.println("pop() ---> " + x );
   }
}
