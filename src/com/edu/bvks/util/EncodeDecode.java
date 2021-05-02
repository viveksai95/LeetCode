package com.edu.bvks.util;

import java.util.Arrays;

public class EncodeDecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(secureChannel(1, "Ope", "12345"));
//		System.out.println(secureChannel(1, "Opened", "12"));
//		System.out.println("12345".substring(0, 3));
		
//		2
//		Open
//		123
		
		 noOfWaysToDrawTheGame(34);
	}
	
	static int noOfWaysToDrawTheGame(int totalScore) {
        if(totalScore <=0)
            return 0;
        int counterArray[] = new int[totalScore + 1];
        int index;
        
        System.out.println("length " + counterArray.length);
        
        Arrays.fill(counterArray, 0);
        
        counterArray[0] = 1; // Base
        
//        for(index = 2; index<=totalScore; index++){
//            counterArray[index] += counterArray[index -2 ];
//        }
//        
//        for(index = 4; index<=totalScore; index++){
//            counterArray[index] += counterArray[index -4 ];
//        }
//        
//        for(index = 6; index<=totalScore; index++){
//            counterArray[index] += counterArray[index -6 ];
//        }
        
        for (index = 2; index <= totalScore; index++)
            counterArray[index] += counterArray[index - 2];
        
        for(int val: counterArray) {
        	System.out.print(val + " ");
        }
        System.out.println();
        for (index = 4; index <= totalScore; index++)
            counterArray[index] += counterArray[index - 4];
        
        for(int val: counterArray) {
        	System.out.print(val + " ");
        }
        System.out.println();
        for (index = 6; index <= totalScore; index++)
            counterArray[index] += counterArray[index - 6];
        
//        System.out.println("Hello");
        for(int val: counterArray) {
        	System.out.print(val + " ");
        }
        
        return counterArray[totalScore];

    }

	public static String secureChannel(int operation, String message, String key) {
		int ENCODING = 1;
		int DECODING = 2;

		System.out.println("operation" + operation);
		System.out.println("message" + message);
		System.out.println("key" + key);
		
		int length = message.length() > key.length() ? key.length() : message.length();

		if (operation == ENCODING)
			return encodeMessage(message, key.substring(0, length));

		if (operation == DECODING)
			return decodeMessage(message, key.substring(0, length));

		return "-1";

	}

	static String encodeMessage(String message, String key) {

		if (message == null || message.length() == 0 || !isNumeric(key))
			return "-1";

		int messageCounter = 0;
		StringBuilder sb = new StringBuilder();

		for (char charKey : key.toCharArray()) {
			char msgChar = message.charAt(messageCounter);
			appendIterTimes(sb, charKey, msgChar);
			messageCounter++;
		}

		if (messageCounter < message.length())
			appendLeftOutChars(message, messageCounter + 1, sb);

		return sb.toString();
	}

	private static void appendIterTimes(StringBuilder sb, char charKey, char msgChar) {
		for (int i = 0; i < Character.getNumericValue(charKey); i++) {
			sb.append(msgChar);
		}
	}

	private static void appendLeftOutChars(String message, int messageCounter, StringBuilder sb) {
		for (int i = messageCounter - 1; i < message.length(); i++) {
			sb.append(message.charAt(i));
		}
	}
	
	private static boolean isNumeric(String key) {
		try {
			Integer.parseInt(key);
		} catch(Exception e) {}
		return false;
	}

	static String decodeMessage(String message, String key) {

		if (message == null || message.length() == 0 || !isNumeric(key))
			return "-1";

		StringBuilder sb = new StringBuilder();
		int runningSum = 0;

		for (char charKey : key.toCharArray()) {
			System.out.println(runningSum);
			sb.append(message.charAt(runningSum));
			runningSum += Character.getNumericValue(charKey);
		}
		
		if (runningSum < message.length())
			appendLeftOutChars(message, runningSum + 1, sb);

		return sb.toString();
	}

}
