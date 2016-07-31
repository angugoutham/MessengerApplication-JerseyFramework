package org.goutham.rest.messenger.Databaseclass;

import java.util.HashMap;
import java.util.Map;

import org.goutham.rest.messenger.Model.Message;
import org.goutham.rest.messenger.Model.Profile;

public class Databaseclass {

	
	private static Map<Long,Message> message=new HashMap<>();
	private static Map<Long,Profile> profile=new HashMap<>();
	public static Map<Long, Message> getMessage() {
		return message;
	}
	public static Map<Long, Profile> getProfile() {
		return profile;
	}
	
	
} 
