package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.util.util;

public class userdaoimp implements userdao {

	@Override
	public boolean isvalid(String username, String password) {
		 String query = "SELECT * FROM users WHERE username = ? AND password = ?";
    	 try (Connection connection = util.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
    		 System.out.println("Query run");

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
		
	}
	}
}


	   
	       
	        
	    
	