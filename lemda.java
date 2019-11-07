interface LembdaExpresion{
 public void print();
}

class Demo{
	public static void main(String args[]){
		int i=5;
	LembdaExpresion lmd=()->{System.out.print(i);	
	};
	lmd.print();
		
	}
	
	
}