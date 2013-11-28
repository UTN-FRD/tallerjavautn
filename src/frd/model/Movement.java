package frd.model;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Movement {
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
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
	
	public Long getId() {
		return id;
	}

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

	public void setCantidad(Long cantidad) {
		// TODO Auto-generated method stub
		this.cantidad = cantidad;
	}
	public Long getCantidad() {
		return cantidad;
	}
//	public double getCant() {
//		return (double) this.getCantidad();
//	}
	public Long getLotId() {
		return lotId;
	}
	
	public void setLotId(Long lotId) {
		// TODO Auto-generated method stub
		this.lotId = lotId;
	}
}
