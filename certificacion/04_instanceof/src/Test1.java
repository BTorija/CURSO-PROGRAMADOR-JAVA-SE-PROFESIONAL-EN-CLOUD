import java.awt.Component;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test1 {

	public static void main(String[] args) {
		Integer n=10;

		System.out.println(n instanceof Integer);
		System.out.println(n instanceof Number);
		//System.out.println(n instanceof String);
		System.out.println(n instanceof Object);
		
		
		Object cmp=new JFrame();
		System.out.println(cmp instanceof JFrame);
		System.out.println(cmp instanceof Component);
		System.out.println(cmp instanceof JButton);
		
		
		
		
	}

}
