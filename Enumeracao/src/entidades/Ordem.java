package entidades;

import java.util.Date;

import entidades.enums.StatusDoPedido;

public class Ordem {
   
	private Integer id;
	private Date moment;
	private StatusDoPedido status;
	
	public Ordem() {	
	}

	public Ordem(Integer id, Date moment, StatusDoPedido status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public StatusDoPedido getStatus() {
		return status;
	}

	public void setStatus(StatusDoPedido status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Ordem [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
	
	
}
