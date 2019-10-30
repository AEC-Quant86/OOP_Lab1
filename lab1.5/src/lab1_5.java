public class lab1_5 {
    
    static public void main(String args[]) {
       test t1 = new test(); 
       test t2 = new test(65);
       test t3 = new test(120);
       System.out.println(t1.get_x() + " : " + t2.get_x() + " : " + t3.get_x());

	}
}

class test {
   private int _x;

    public int get_x() {
	    return _x;
    }

    test() {  
        set_x();
    }
    
    test(int _x){
    	set_x(_x);
    }

    public void set_x() {
	    this._x = 0;
    }

    public void set_x(int _x) {
	    this._x = _x <= 100 ? _x : 100;
    }
   
}