package edu.handong.analysis;
import edu.handong.csee.*;
public class Main {
	public static void main(String[] args) {
		Analyzer analyzer = new Analyzer();
		try {
			if(args.length<4)
				throw new NotEnoughArgumentException();
			analyzer.run(args);
			Thread t = new Thread(analyzer);
			t.start();
		} catch (NotEnoughArgumentException e) {
			// TODO Auto-generated catch block
			System.out.println("Failed"); 
			e.printStackTrace();
		} 
	}
}

