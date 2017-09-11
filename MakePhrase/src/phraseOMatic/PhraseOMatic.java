package phraseOMatic;



public class PhraseOMatic {
	//this adds some explanation of the coding, I switched the order of the words because they sounded better if I were to switch the word order. The first two word lists are swapped. 
	private static String[] word1 = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "outside the box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
	private static String[] word2 = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "prevasive", "smart", "six-sigma", "critical path", "dynamic"} ;
	private static String[] word3 = {"process", "tipping-point", "solution", "architecture", "core competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};

	public static String makePhrase(){
		String phrase = ""; 
		//this adds some comments to test with push and pull requests
		phrase = word1[randomNumber(word1.length)] + " " + word2[randomNumber(word2.length)] + " " + word3[randomNumber(word3.length)];
		phrase = phrase.substring(0, 1).toUpperCase() + phrase.substring(1);
		
		return phrase;
	}
	
	private static int randomNumber(int choices){
		//this will return a random number from 0, the minimum index of an array, to the maximum size of that array. 
		int number; 	
		number = (int)(Math.random() * choices);
		return number;
	}
	
}
	
	

