package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	
	private String topic;
	private String message;
	
	public PublishMsg(String user, String topic, String message) {
		super(MessageType.PUBLISH,user);
		this.topic = topic;
		this.message = message;
	}
	
	public String getMessage() {
		
		return message;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "Message [type: " + getType() + ", user: " + getUser() + ", topic: " + topic + ", message: " + message + "]";
	}
}
