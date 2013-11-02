package frd.model;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Movement {
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.INCREMENT)
	private Long id;
	@Persistent
	private Date date;
	@Persistent
	private Long cantidad;
	@Persistent
	private String description;
	@Persistent
	private Long lotId;
	
	public Movement(){}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
