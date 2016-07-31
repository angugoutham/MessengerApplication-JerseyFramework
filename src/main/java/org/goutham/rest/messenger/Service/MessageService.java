package org.goutham.rest.messenger.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.goutham.rest.messenger.Databaseclass.Databaseclass;
import org.goutham.rest.messenger.Model.Message;

public class MessageService {

	private Map<Long,Message>messages=Databaseclass.getMessage();
	
	public MessageService() {
		// TODO Auto-generated constructor stub"
	
	messages.put(1l, new Message(1, "helloworld", null, "goutham"));
	messages.put(2l, new Message(2, "helloworld1", null, "goutham"));
	
	}
	
	
	public List<Message> getAllMessage(){
	
		return new ArrayList<Message>(messages.values());
		
		
	}
	
		public Message getMessage(long id ){
			
			return messages.get(id);
		}
		
		
		
		public Message addMessage(Message m)
		{
			m.setId(messages.size()+1);
			messages.put(m.getId(),m);
			return m;
		}
		
		
		public Message updateMessage(Message m)
		{
			
			
			if(m.getId()<=0)
			{
				return null;
			}
			else
			{
				
				messages.put(m.getId(), m);
			}
			return m;
		}
		
		public Message deleteMessage(Message m)
		{

			{
				messages.remove(m.getId());
			
			}
			return m;
		}
		}