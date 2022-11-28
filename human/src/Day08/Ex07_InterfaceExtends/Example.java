package Day08.Ex07_InterfaceExtends;

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();)
				
		InterfaceA iA= impl;
		iA.methodA();
		System.out.println();
		
		InterfaceA iB= impl;
		iB.methodB();
		System.out.println();
		
		InterfaceA iC= impl;
		iC.methodC();
		iC.methodA()
	
		InterfaceC iC = impl;
		iC.methodA();
	
	}
}
