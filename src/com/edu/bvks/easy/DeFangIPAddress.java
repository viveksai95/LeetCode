package com.edu.bvks.easy;

/**
 * https://leetcode.com/problems/defanging-an-ip-address/
 * 
 * @author VivekVineeth
 *
 */

public class DeFangIPAddress {
	public String defangIPaddr(String address) {
		return address.replace(".", "[.]");
	}
}
