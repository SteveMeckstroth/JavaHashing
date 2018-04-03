package main;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		String yourString = "anything you want";
		
		byte[] bytesOfMessage = yourString.getBytes("UTF-8");
		
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] thedigest = md.digest(bytesOfMessage);
		
		System.out.println(Arrays.toString(thedigest));

	}

}
