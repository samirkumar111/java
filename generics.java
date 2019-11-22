import java.util.*;

class gene <T>{
    T ob;
    
    gene(T obj){
        ob = obj;
    }
    
    T ret(){
    	return ob;
    }
    
    void showtype(){
    	System.out.println(ob.getClass().getName());
    }
    
}

class main{
	public static void main(String arg[]){
		gene <Integer> g = new gene <Integer>(5013);
		int x = g.ret();
		System.out.println(x);
		g.showtype();
		
		gene<String> s = new gene <String>("hello friends");
		String y = s.ret();
		System.out.println(y);
		s.showtype();
	}
}
