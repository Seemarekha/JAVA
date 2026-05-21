/*
while playing an RPG game, you were assigned to complete one of the hardest quests in this game. 
There are n monsters you will need to defeat in this quest. 

Each monster i is described with two integer numbers - poweri and bonusi. 

To defeat this monster, you will need at least poweri experience points. 

If you try fighting this monster without having enough experience points, you lose immediately. 

You will also gain bonusi experience points if you defeat this monster.
 
You can defeat monsters in any order. 

The quest turned out to be very hard - you try to defeat the monsters but keep losing repeatedly. 

Your friend told you that quest is impossible to complete. 

Knowing that, you're interested, what is the maximum possible number of monsters you can defeat? 

Input: 

The first line contains an integer, n, denoting the number of monsters. 
The next line contains an integer, e, denoting your initial experience. 

Each line i of the n subsequent lines ( where 0 <= i <n) contains an integer, 
poweri, which represents power of the corresponding monster. 

Each line i of the n subsequent lines ( where 0 <= i< n) contains an integer, 
bonusi, which represents bonus for defeating the corresponding monster. 

2 
123 
78 
130 
10 
0 

output: 
2
 */

package com.Infosys_PYQ;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMonstersDefeated {

	static class Monster {
		int power, bonus;

		public Monster(int power, int bonus) {
			this.power = power;
			this.bonus = bonus;
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter number of monsters : ");
		int n = scn.nextInt();

		System.out.println("Enter initial experience : ");
		int exp = scn.nextInt();

		System.out.println("Enter power of each monster : ");
		int[] power = new int[n];
		for (int i = 0; i < n; i++)
			power[i] = scn.nextInt();

		System.out.println("Enter bonus for each monster : ");
		int[] bonus = new int[n];
		for (int i = 0; i < n; i++)
			bonus[i] = scn.nextInt();

		System.out.println("Maximum number of monsters you can defeat :  " + maxDefeat(n, exp, power, bonus));

	}

	private static int maxDefeat(int n, int exp, int[] power, int[] bonus) {

		Monster[] monsters = new Monster[n];
		for (int i = 0; i < n; i++) {
			monsters[i] = new Monster(power[i], bonus[i]);
		}

		Arrays.sort(monsters, (a, b) -> a.power - b.power);

		int count = 0;

		for (Monster m : monsters) {
			if (exp > m.power) {
				exp += m.bonus;
				count++;
			} else {
				break;
			}
		}
		return count;
	}

}
