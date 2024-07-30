package com.facebook.view;

import java.util.Scanner;

import com.facebook.controller.*;

public class facebookview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("********Main Menu ********");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to create view profile");
		System.out.println("press 3 to create delete profile");
		System.out.println("press 4 to create edit profile");
		System.out.println("press 5 to create search profile");
		System.out.println("press 6 to create view all profile");
		System.out.println("press 7 to create login profile");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		
		
		int c=sc.nextInt();
		
		facebookControllerInterface fc=new facebookController();
		
		switch(c)
		{
		case 1: fc.createProfileController();
			break;
		case 2: fc.createviewProfileController();
			break;
		case 3: fc.createdeleteProfileController();
			break;
		case 4: fc.createeditProfileController();
			break;
		case 5: fc.createsearchProfileController();
			break;
		case 6: fc.createviewallProfileController();
			break;
		case 7: fc.createloginProfileController();
			break;
		default:
			System.out.println("invalid valid input");
		}
		sc.close();
		
		
		
	}

}
