package singleton;

import java.awt.Dimension;
import javax.swing.JFrame;

public class Singleton extends JFrame{
	private static Singleton singleton = null;

	private Singleton(){
		setPreferredSize(new Dimension(640,480));
	}

	public static Singleton getInstance(){		
		if(singleton == null){
			singleton = new Singleton();
		}
		
		return singleton;
	}
}
