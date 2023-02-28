package VidGame;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
	    for (int i = 0; i < 100; i++) {
	    	public int ATK () {
	    		Random gen = new Random();
	    		int atk=gen.nextInt(30);
	    		return atk;
	    	}
	    	final String ID = "ABCDEFGHIJKMNLOPQRSTUVWXYZ";
	    	final Set<String> ids = new HashSet<String>();
	    	final java.util.Random gen = new java.util.Random();
	    	public String playerID(){
	    		StringBuilder idGenerator=new StringBuilder(); 
	    		while (idGenerator.toString().length()==0) {
	    			int range = gen.nextInt(4)+4;
	    			for (int i=0;i<range;i++) {
	    				idGenerator.append(ID.charAt(gen.nextInt(ID.length())));
	    			}
	    			if (ids.contains(idGenerator.toString())) {
	    				idGenerator=new StringBuilder();
	    			}
	    		}
	    		return idGenerator.toString();
	    	}
	  }
