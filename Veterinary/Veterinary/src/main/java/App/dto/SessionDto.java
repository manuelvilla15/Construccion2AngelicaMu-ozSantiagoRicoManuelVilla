package App.dto;

public class SessionDto {
	private long id;
	private String user;
	private String role;

	public SessionDto(long id, String user, String role) {
		super();
		this.id = id;
		this.user = user;
		this.role = role;
	
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	

}
