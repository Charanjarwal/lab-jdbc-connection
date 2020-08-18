package controller;

import java.sql.Connection;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) {
		
	// Fill your code
		Connection con  = null;
		try {
			con = ConnectionManager.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(con == null) {
			System.out.println("Check your connection");
		}
		else {
			System.out.println("Connection established");
		}
	}
}