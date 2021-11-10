package pack1;

	public class Counter  {
	    static int count = 0;
	    Counter() {
	        this.count++;
	        System.out.println(this.count);
	    }

	    public static void main(String[] args) {
	    	System.out.println(Math.PI);
	    	System.out.println(Math.random());
	        Counter c1 = new Counter();
	        Counter c2 = new Counter();
	        Counter c3 = new Counter();
	        
	        
	        //static은 객체 생성없이 사용 가능 (클래명.static변수명)
	        System.out.println(Counter.count);
	        Print();
	    }
	    
	    public static void Print() {
	    	System.out.println("123456");
	    	System.out.println("asdzxc");
	    }
	    
	    class Name{
	    	static int Old
	    }
	}

