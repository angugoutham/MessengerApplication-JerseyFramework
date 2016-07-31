package org.goutham.rest.messenger.messageResource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.goutham.rest.messenger.Model.Message;
import org.goutham.rest.messenger.Service.MessageService;
@Path("/messages")
public class messageResource {
	  MessageService messageservice = new MessageService();
@GET
/*@Produces(MediaType.APPLICATION_XML)*/
@Produces(MediaType.APPLICATION_JSON)
  public List<Message>getMessage(){

	  
	  return messageservice.getAllMessage();	
  }
@GET
@Path("/{messageId}")
@Produces(MediaType.APPLICATION_JSON)
public Message getMessageById(@PathParam("messageId") long Messageid){


return messageservice.getMessage(Messageid);
		
}
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public Message addMessage(Message m){
	return messageservice.addMessage(m);
	
	
}
}
