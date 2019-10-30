public class lab1_6 {
    
    static public void main(String args[]) {
       test t1 = new test(65);
       test t2 = new test(120, 10);
       t1.setMinMax(-60);
       t1.printField();
       t2.printField();
	}
}

class test {
   private int _min;
   private int _max;
   

    test(int x) {  
        setMinMax(x);
    }
    
    test(int x, int y){
    	setMinMax(x, y);
    }

	public int get_min() {
		return _min;
	}

	public int get_max() {
		return _max;
	}

	public void setMinMax(int x) { //Метод с одним полем, меняет поля, если они меньше (ьольше сущетсвующих)
		this._min = (x < _min) ? x : this._min; 
		this._max = (x > _max) ? x : this._max;
	}
	
	public void setMinMax(int x, int y) { //Метод с одним полем, меняет поля, если они меньше (ьольше сущетсвующих)
		this._min = (x < _min) ? x : y; 
		this._max = (x > _max) ? x : y;
	}

   public void printField() {
	   System.out.println("Min: " + _min + " Max: " + _max);
   }
}