
package phraseomatic1;

/**
 *
 * @author kyrylo
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class PhraseOMatic1 {
	public static void main (String[] args) {

		//make three sets of words to choose from. Add you own!

		String[] wordListOne = {"24/7", "multi-Tier", "30000-foot",
 		"B-to-B", "win-win", "front-end", "web-based",
		 "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};

		String[] wordListTwo = {"empowered", "sticky", "value-added",
		 "oriented", "centric", "distributed", "clustered",
		 "branded", "outside-the-box", "positioned", "networked",
		 "focused", "leveraged", "aligned",
		 "targeted", "shared", "cooperative", "accelerated"};

		String[] wordListThree = {"process", "tipping-point", "solution",
		 "architecture", "core competency", "strategy", "mindshare",
		 "portal", "space", "vision", "paradigm", "mission"};


		//find out how many words are in each list

		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;


		//generate three random numbers

		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);


		//new build in phrase
		
		String phrase = wordListOne[rand1] + " " +
		wordListTwo[rand2] + " " + wordListThree[rand3];

		System.out.println("What we need is a " + phrase);
	}

}
