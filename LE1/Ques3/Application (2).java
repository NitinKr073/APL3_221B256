class Application {
 public static void main (String args[]){

 Mother m= new Mother ( );
 m.show( ); 
 
 Child ch=new Child ( ); 
 ch. show ( ); // show ( ) inherited in Child from Mother is called

 Mother m1=new Child ( ); // Question 3 solution 
 m1.show( );

 
 }
}