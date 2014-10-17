package controllers.event;

import java.util.Date;

public class EventBean {

	private String uuid;
	private String name;
	private String address;
	private boolean published;
	private Date beginning_date;
	private Date end_date;

	public EventBean() {
		this("4g5zeg1ah6her5g1zttz6hg5s", "Utopiales", 
			 "Centre des Congrès, Nantes", false,
			 new Date(2014, 10, 29), new Date(2014, 11, 3));
	}
	
	public EventBean(String uuid, String name, String address, boolean published, Date beginning_date, Date end_date) {
		this.uuid = uuid;
		this.name = name;
		this.address = address;
		this.published = published;
		this.beginning_date = beginning_date;
		this.end_date = end_date;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean getPublished() {
		return published;
	}

	public void setPublised(boolean published) {
		this.published = published;
	}
	
	public Date getBeginning_date() {
		return beginning_date;
	}

	public void setBeginning_date(Date beginning_date) {
		this.beginning_date = beginning_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	@Override
	public String toString() {
		return "EventBean [uuid=" + uuid + ", name=" + name + ", address="
				+ address + ", beginning_date=" + beginning_date
				+ ", end_date=" + end_date 
				+ ", published=" + published + "]";
	}
}
