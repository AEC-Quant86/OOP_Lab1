public class lab1_4 {
    
    static public void main(String args[]) {
       test t1 = new test(127 , 'F'); 
       test t2 = new test(65.1267);
       t1.printResult();
       t2.printResult();
	}
}

class test {
    public int x1;
    public char c1;
    
    test(int x1, char c1){
    	this.x1 = x1;
    	this.c1 = c1;
    }
    
    test(double d){
    	this.c1 = (char) (d / 1);
    	this.x1 = (int) ((d % 1) * 100);
    	
    }
	
    void printResult() {
    	System.out.println(c1 + " : " + x1);
    }
}