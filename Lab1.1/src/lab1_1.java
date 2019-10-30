

public class lab1_1 {
    
    static public void main(String args[]) {
		test t =  new test();
		t.set_closed('X');
		t.print();
	}
}


class test {
    private char _closed;

	public int get_closed_code() {
		int x;
		x = _closed;
		return x;
	}

	public void set_closed(char _closed) {
		this._closed = _closed;
	}
    
	public void print() {
		System.out.print("Symbol:" + _closed + " Code:" + get_closed_code());
	}
}

