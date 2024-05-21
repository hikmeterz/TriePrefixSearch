import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner inputStream=null;
		
		try {
			
			
			inputStream = new Scanner(new File(args[1]));//Exception atma durumu:Eger oyle bir dosya yoksa.
			
			
		
		}catch(FileNotFoundException e){
			System.out.println("ERROR.There is no such a file.");
			System.exit(0);
			
		}
		int satir=0;
		Trie tree=new Trie();
		String s="";
		while(inputStream.hasNextLine()) {
			
			s=inputStream.nextLine();
			tree=ekle(tree,s);
			s="";
			
		}
		
		inputStream.close();
		
		Scanner k= new Scanner(System.in);
		String input =k.nextLine();
		System.out.println(findPrefix(tree,input));
		
		
	}
	
	public static String findPrefix(Trie t,String input){
		Node iterator = t.getRoot();
		boolean bulduMu=false;
		boolean externalMi=false;
		String output="";
		for(int i=0;i<input.length();i++) {
			
			if(iterator.getSize()!=0){
				for(int j=0;j<iterator.getSize();j++) {
					if(input.charAt(i)==iterator.getChild(j).getValue()) {
						output+=""+iterator.getChild(j).getValue();
						iterator=iterator.getChild(j);
						bulduMu=true;
					}
					
				}
				if(bulduMu==false) {
					//System.out.println(output);
					return "Mevcut degil.";
				}
			}else{
				//output+=""+iterator.getValue();
				
				externalMi=true;
				break;
			}
			
		}
		if(externalMi){
			return output;
		}else{
			if(iterator.getSize()==0) {
				return output;
			}
			//System.out.println(output);
			return "Mevcut degil.";
	
		}	
	}
	public static Trie ekle(Trie t,String word){
		
		Node iterator=t.getRoot();
		boolean bulduMu=false;
		for(int i=0;i<word.length();i++) {
			
			for(int j=0;j<iterator.getSize();j++) {
				if(word.charAt(i)==iterator.getChild(j).getValue()) {
					//System.out.println(word.charAt(i));
					iterator=iterator.getChild(j);
					bulduMu=true;
				}
				
			}
			if(bulduMu==false) {
				iterator.addChild(word.charAt(i));
				iterator=iterator.getChild(iterator.getSize()-1);
			}
			
			bulduMu=false;
			
		}
		return t;
	}
	
	
	
	
	
}
