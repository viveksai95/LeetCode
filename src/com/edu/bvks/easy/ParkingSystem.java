/**
 * 
 */
package com.edu.bvks.easy;

/**
 * https://leetcode.com/problems/design-parking-system/
 * 
 * @author VivekVineeth
 *
 */
public class ParkingSystem {

	private int[] parkingTypes = new int[3];

	public ParkingSystem(int big, int medium, int small) {

		parkingTypes[0] = big;
		parkingTypes[1] = medium;
		parkingTypes[2] = small;

		for (int i : parkingTypes)
			System.out.println(i);

	}

	public boolean addCar(int carType) {
		int availableCars = parkingTypes[carType - 1];

		// Note: When tried to implement try catch to handle false inputs, the
		// processing time took longer

		// System.out.println("availableCars" + availableCars);

		if (availableCars > 0) {
			parkingTypes[carType - 1]--;
			return true;
		}

		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParkingSystem p = new ParkingSystem(1, 1, 0);

		System.out.println(p.addCar(1));
		System.out.println(p.addCar(2));
		System.out.println(p.addCar(3));
		System.out.println(p.addCar(1));

	}

}
