package at.wrk.fmd.ikarusapp.types;

import java.util.Date;


/**
 * This class represents an Event
 *
 * @see https://github.com/wrk-fmd/ikarus-backend/blob/develop/doc/types.md#data-type-event
 */
public class Event
{
	private Integer id;
	private String externalId;
	private String name;
	private String description;
	private String location;
	private Date start;
	private Date end;

	public Integer getId ()
	{
		return id;
	}

	public void setId (Integer id)
	{
		this.id = id;
	}

	public String getExternalId ()
	{
		return externalId;
	}

	public void setExternalId (String externalId)
	{
		this.externalId = externalId;
	}

	public String getName ()
	{
		return name;
	}

	public void setName (String name)
	{
		this.name = name;
	}

	public String getDescription ()
	{
		return description;
	}

	public void setDescription (String description)
	{
		this.description = description;
	}

	public String getLocation ()
	{
		return location;
	}

	public void setLocation (String location)
	{
		this.location = location;
	}

	public Date getStart ()
	{
		return start;
	}

	public void setStart (Date start)
	{
		this.start = start;
	}

	public Date getEnd ()
	{
		return end;
	}

	public void setEnd (Date end)
	{
		this.end = end;
	}
}
