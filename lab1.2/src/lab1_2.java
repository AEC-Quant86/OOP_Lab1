
public class lab1_2 {
    
    static public void main(String args[]) {
       test t = new test(); 
       t.printAllBetwine();
	}
}

class test {
    public char start = 'A';
    public char stop = 'F';
    
    public int printAllBetwine() {
    	
    	for (char x = start; x <= stop; x++) {
    		System.out.println(x);
    	}
    	
    	return 0;
    }
	
}