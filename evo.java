/**************************
Evo Gladiator
**************************/

public class Main{
	public static void main(String [] args){
		System.out.println("Application started.");
		
		Console console = System.console();
		private final Gladiator player = new Gladiator;
		
		Engine ex = new Engine();
		new Thread(ex).start();
	}
}

public class Engine implements Runnable{
	public void run(){
		while(true){
		System.out.println(" While ! ");
		}
	}
	
}

// Gladiator
public final class Gladiator{

	// Primary Attributes - increase by EXP
	private int HP;			// Health Points
	private int EP;			// Energy Points
	private int PHY;		// Physique
	private int LQ;			// Mental
	private int HAR			// Hardiness
	private int AGI;		// Agility
	private int SKI;		// Skill
	private int TAL;		// Talent

	// Secondary Attributes - increase by gear and Primary Attributes
	private int DAM;		// Damage
	private int RES;		// Resistance
	private int ACC;		// Accuracy
	private int EVA;		// Evade
	private int DEF;		// Defence
	private int BLO;		// Block
	private int SPE;		// Speed

	// Other Attributes
	private int LEV;		// Level ?
	private int EXP;		// Experience Points
	private int AP;			// Advancement Points
	private int COIN;
	private static String NAME;
	private int AGE;
	private int PRI;		// Prime Age
	private boolean GEN;	// Gender
	private int RACE;		// Race
	private int ALI;		// Alignment
	private int[] INV;		// Inventory
	private int[] EQU;		// Equipped
	private int[] SKI;		// Skills
	
	public enum RACE { LGA("Little Green Aliens"), HUM("Human"), NEP("Nephilim") };	// Little Green Aliens, Human, Nephilim
	
	public enum RACE {
		private int name;
		private RACE(String name) {
			this.name = name;
		}
	};
	
	Gladiator() {
		NAME = console.readLine("Enter your name: ");
		GEN = console.readLine("Enter your gender: ");
		RACE = console.readLine("Enter your race: ");
		/*
		alignment questions
		*/
		ALI = 
		
	}
}

public class Equipment{
	
	private int ID;			// Identifying number
	private int RUNE;		// Prefix Rune	ex. Smiting	(adjective)
	private static String NAME;	// Name			ex. Axe
	private int GLY;		// Suffix Glyph	ex. Power	(noun)
	private int DUR;		// Durability
	private int LEV;		// Level
	private int RANK;		// Rank
	
	private int DAM;		// Damage
	private int DAMTYP;		// Damage Type
	private int PARBLO;		// Parry Block
	private int DEF;		// Defence
	private int DEFTYP;		// Defence Type
	private int EFF;		// Effect
	private int RES;		// Resistance
}

public class Armor extends Equipment{
}

public class Rune{
}

public class Glyph{
}

public class Dungeon{
	byte TIER;		// Tier 1-3
}