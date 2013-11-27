package frd.model;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Product {
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.SEQUENCE)
	private Long id;
	@Persistent
	private String name;
	@Persistent
	private String description;
	@Persistent
	private String userMail;
	
	public Product(){}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String usermail) {
		userMail = usermail;
	}
}
