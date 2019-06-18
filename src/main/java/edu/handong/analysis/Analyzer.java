package edu.handong.analysis;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
 
import edu.handong.csee.*; 
import edu.handong.csee.NotEnoughArgumentException; 

public class Analyzer implements Runnable{
	String input;
	String output; 
	boolean help; 
	static private String i;
	static private String o;
	static private int num=0; 
	
	public static int getNum() {
		return num;
	}
	
	public void run(String[] args)  {  
		this.i=args[1]+"\\";
		this.o=args[3]; 
	
		Options options = createOptions();
		File dir = new File(args[1]); 
		File[] files;
		
		if(parseOptions(options, args)){
			if (help){
				printHelp(options);
				return;
			}
			//files = dir.listFiles(); 
			for(File file: dir.listFiles()) {
				num++;
				ZipReader zipReader = new ZipReader(); 
				args[1]=i+file.getName();
				System.out.println("***********************"+i+file.getName());
				zipReader.run(args);   
				//System.out.println(file.getName());
			} 
		}
	}

	private boolean parseOptions(Options options, String[] args) {
		CommandLineParser parser = new DefaultParser();

		try {
			CommandLine cmd = parser.parse(options, args);
			input = cmd.getOptionValue("i");
			output = cmd.getOptionValue("o");
			help = cmd.hasOption("h");

		} catch (Exception e) {
			printHelp(options);
			return false;
			
		} 

		return true;
	}

	// Definition Stage
	private Options createOptions() {
		Options options = new Options();

		// add options by using OptionBuilder
		options.addOption(Option.builder("i").longOpt("input")
				.desc("Set a path of a directory or a file to display")
				.hasArg()
				.argName("Path name to display")
				.required()
				.build()); 
		
		options.addOption(Option.builder("o").longOpt("output")
				.desc("Set a path of a directory or a file to display")
				.hasArg()
				.argName("Path name to display")
				.required()
				.build()); 
		 
		options.addOption(Option.builder("h").longOpt("help")
		        .desc("Help")
		        .build());

		return options;
	}
	
	private void printHelp(Options options) {
		// automatically generate the help statement
		HelpFormatter formatter = new HelpFormatter();
		String header = "Zip program";
		String footer =" ";
		formatter.printHelp("CLIExample", header, options, footer, true);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

 
		
}
