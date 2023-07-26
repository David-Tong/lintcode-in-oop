package client;

import java.util.Map;

public class Demand {

    // Please add Properties, Constructors and any Method you need
    // --- write your code here ---
	private String username;
	private String type;
	private Map<String, String> content;
	
	public Demand(String username, String type, Map<String, String> content) {
		this.setUsername(username);
		this.setType(type);
		this.setContent(content);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Map<String, String> getContent() {
		return content;
	}

	public void setContent(Map<String, String> content) {
		this.content = content;
	}
	
}