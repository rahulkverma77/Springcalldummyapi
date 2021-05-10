package com.example.url.demourl;


//import javax.validation.constraints.Email;
//import javax.annotation.Generated;

public class basic {

	private Integer PostId;
	
	
	private Integer ID;
	
	
	private String Name;
	
	private String Email;
	
	private String Body;

	public basic(Integer postId, Integer iD, String name, String email, String body) {
		super();
		PostId = postId;
		ID = iD;
		Name = name;
		Email = email;
		Body = body;
	}

	public Integer getPostId() {
		return PostId;
	}

	public Integer getID() {
		return ID;
	}

	public String getName() {
		return Name;
	}

	public String getEmail() {
		return Email;
	}

	public String getBody() {
		return Body;
	}

	public void setPostId(Integer postId) {
		PostId = postId;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public void setBody(String body) {
		Body = body;
	}

	@Override
	public String toString() {
		return "basic [PostId=" + PostId + ", ID=" + ID + ", Name=" + Name + ", Email=" + Email + ", Body=" + Body
				+ "]";
	}
	
	
}
