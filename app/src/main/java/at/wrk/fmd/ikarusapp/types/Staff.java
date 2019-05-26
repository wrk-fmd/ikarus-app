package at.wrk.fmd.ikarusapp.types;

import java.util.Date;


/**
 * This class represents a Staff
 *
 * @see https://github.com/wrk-fmd/ikarus-backend/blob/develop/doc/types.md#data-type-staff
 */
public class Staff
{
	private Integer id;
	private String externalId;
	private String name;
	private String phone;
	private String email;
	private String startLocation;
	private Date startTime;
	private String comment;
	private String section;
	private StaffStatus status;

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

	public String getPhone ()
	{
		return phone;
	}

	public void setPhone (String phone)
	{
		this.phone = phone;
	}

	public String getEmail ()
	{
		return email;
	}

	public void setEmail (String email)
	{
		this.email = email;
	}

	public String getStartLocation ()
	{
		return startLocation;
	}

	public void setStartLocation (String startLocation)
	{
		this.startLocation = startLocation;
	}

	public Date getStartTime ()
	{
		return startTime;
	}

	public void setStartTime (Date startTime)
	{
		this.startTime = startTime;
	}

	public String getComment ()
	{
		return comment;
	}

	public void setComment (String comment)
	{
		this.comment = comment;
	}

	public String getSection ()
	{
		return section;
	}

	public void setSection (String section)
	{
		this.section = section;
	}

	public StaffStatus getStatus ()
	{
		return status;
	}

	public void setStatus (StaffStatus status)
	{
		this.status = status;
	}
}
