package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController {
	private MarshmallowMonster monster;
	private Scanner input;
	public MonsterController(){
		monster = new MarshmallowMonster("Zambumafu The Destroyer",1.5,2,false,1,2);
		input = new Scanner(System.in);
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
		System.out.println("my Monster has this many eyes: " + monster.getEyeCount());

		
//		if(monster.getEyeCount()==0){
//			System.out.println("he is blind");
		boolean loopbreak = false;
		do{
			System.out.println("Do you want to change me?");
		String answer = input.next();
//		}
		if(answer.equalsIgnoreCase("yes"))
		{
		System.out.println("what do you wish to change");
		input.nextLine();
		String change = input.nextLine().toLowerCase();
		if(change != null){
			System.out.println("what do you want to change the "+change+" to");
			
		}
		switch (change){
		
		
		case "name":
			String newValue = input.nextLine();
		monster.setName(newValue);
		break;
		case"antenna":
		
			monster.setAntennaCount(input.nextDouble());
		break;
		case "eye":
			monster.setEyeCount(input.nextInt());
		break;
		case "bellybutton":
			monster.setHasBellyButton(input.nextBoolean());
		break;
		case "nose":
			monster.setNoseCount(input.nextInt());
		break;
		case "arm":
			monster.setArmCount(input.nextInt());
		break;}		

		}
		else{loopbreak = true;}
		}while(loopbreak == false);
		System.out.println(monster);
	}

}
