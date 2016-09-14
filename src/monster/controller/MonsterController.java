package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController {
	private MarshmallowMonster monster;
	public MonsterController(){
		monster = new MarshmallowMonster("Zambumafu The Destroyer",1.5,2,false,1,2);
	
	}
	/*
	 *name = Zambumafu The destroyer
	 *4 antenna 2 .5 and 2 .25
	 *2 eyes
	 *hasBellyButton = false;
	 *nose count 1
	 *armcount = 2
	 *
	 */
	public void start(){
		System.out.println(monster);
		
	}

}
