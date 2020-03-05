package fi.rbmk.ticketguru.ticketType;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.validator.constraints.Length;

import fi.rbmk.ticketguru.eventTicket.EventTicket;

@Entity
@Table(name = "TicketTypes")
public class TicketType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ticketType_ID")
	private Long id;

	@NotEmpty(message = "Ticket type is required")
	@Length(max = 100)
	@Column(name = "name")
	private String name;
	
	@JsonIgnore
	@OneToMany(mappedBy = "ticketType")
	private List<EventTicket> eventTickets;

	public TicketType() {
	}

	public TicketType(TicketType ticketType) {
	}

	public TicketType(String name) {
		this.name = name;
	}
	
	//Getters

	public Long getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}
	
	//Setters

	public void setName(String name) {
		this.name = name;
	}

	public List<EventTicket> getEventTickets() {
		return eventTickets;
	}

}