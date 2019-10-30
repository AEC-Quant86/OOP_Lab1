public class lab1_3 {
    
    static public void main(String args[]) {
       test t1 = new test(); 
       test t2 = new test(1);
       test t3 = new test(1,2);
       t1.printField();
       t2.printField();
       t3.printField();

	}
}

class test {
 
	 public int x1;
	 public int x2;
	 
	 test(){
		 this.x1 = 0;
		 this.x2 = 0;
	 }
	 
	 test(int x1){
		 this.x1 = x1;
		 this.x2 = 0;
	 }
	 
	 test(int x1, int x2){
		 this.x1 = x1;
		 this.x2 = x2;
	 }
	 
	 public void printField() {
		 System.out.println(this.x1 + " : " + this.x2);
	 }
}