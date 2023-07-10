package fr.webforce.farmManager.model;

import fr.webforce.farmManager.interfaces.ITamagochi;

abstract public class Tamagotchi implements ITamagochi {
	

	// private
	// public
	// protected	
	protected String name;
	
	protected String type;
	
	//s'il atteint 0, fin du jeu
	protected int pv = 10;
	
	//s'il atteint 10, fin du jeu
	protected int hungerLevel = 0;
	
	//s'il atteint 0, fin du jeu
	protected int happyLevel = 10;

	public Tamagotchi(String name, String type, int pv, int hungerLevel, int happyLevel) {
		super();
		this.name = name;
		this.type = type;
		this.pv = pv;
		this.hungerLevel = hungerLevel;
		this.happyLevel = happyLevel;
	}
	
	public Tamagotchi(String name, String type) {
		this.name = name;
		this.type = type;
		this.pv = 10;
		this.hungerLevel = 0;
		this.happyLevel = 10;
	}

	public Tamagotchi() {
	}
	
	@Override
	public void manger() {
		this.hungerLevel -= 2;
		this.happyLevel += 2;
		this.pv -= 1;
		this.checkStatus();
	}

	@Override
	public void dormir() {
		this.hungerLevel += 2;
		this.happyLevel -= 2;
		this.pv += 1;
		this.checkStatus();
	}
	
	public void statistic() {
		System.out.println("Voici les information de " + this.name + " : ");
		System.out.println("Joie : " + this.happyLevel + " Faim : " + this.hungerLevel + "Vie : " + this.pv);
	}

    // Méthode isDead()
    public boolean isDead() {
        return (hungerLevel >= 10 || happyLevel <= 0 || pv <= 0);
    }
    

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Je surchage toString";
	}


    // Méthode checkStatus() pour l'alerte
    private void checkStatus() {
    	if (hungerLevel >= 8 || happyLevel <= 2 || pv <= 2) {
            System.out.println("Attention ! " + name + " est sur le point de mourir !");
        }
		this.statistic();
    }
    
	
	public String getName() {
		return this.name;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public int getHappyLevel() {
		return happyLevel;
	}

	public void setHappyLevel(int happyLevel) {
		this.happyLevel = happyLevel;
	}

	public void setName(String name) {
		if(name != null) {
			this.name = name;
		}
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public void setHungerLevel(int hungerLevel) {
		this.hungerLevel = hungerLevel;
	}
	
}
