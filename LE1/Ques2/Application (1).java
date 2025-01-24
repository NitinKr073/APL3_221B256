class Application {
 public static void main (String args[]){

// Mother m= new Mother ( );
// m.show( ); // show of Mother is called

// for Question 2 don't make the object for mother class.
// Output be "this is the child class", because mother class show function is override by the child class show function.

 Child ch=new Child ( ); 
 ch. show ( ); // show ( ) inherited in Child from Mother is called
 }
}