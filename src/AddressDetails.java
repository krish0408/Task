
public class AddressDetails {
	
	private int id;
	private String hno;
	private String StreetName;
	private String city;
	private int phone;
	
public AddressDetails() {
	
}
public AddressDetails(int id, String hno, String streetName, String city, int phone) {
	super();
	this.id = id;
	this.hno = hno;
	StreetName = streetName;
	this.city = city;
	this.phone = phone;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getHno() {
	return hno;
}

public void setHno(String hno) {
	this.hno = hno;
}

public String getStreetName() {
	return StreetName;
}

public void setStreetName(String streetName) {
	StreetName = streetName;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public int getPhone() {
	return phone;
}

public void setPhone(int phone) {
	this.phone = phone;
}
@Override
public String toString() {
	return "AddressDetails [id=" + id + ", hno=" + hno + ", StreetName=" + StreetName + ", city=" + city + ", phone="
			+ phone + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((StreetName == null) ? 0 : StreetName.hashCode());
	result = prime * result + ((city == null) ? 0 : city.hashCode());
	result = prime * result + ((hno == null) ? 0 : hno.hashCode());
	result = prime * result + id;
	result = prime * result + phone;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	AddressDetails other = (AddressDetails) obj;
	if (StreetName == null) {
		if (other.StreetName != null)
			return false;
	} else if (!StreetName.equals(other.StreetName))
		return false;
	if (city == null) {
		if (other.city != null)
			return false;
	} else if (!city.equals(other.city))
		return false;
	if (hno == null) {
		if (other.hno != null)
			return false;
	} else if (!hno.equals(other.hno))
		return false;
	if (id != other.id)
		return false;
	if (phone != other.phone)
		return false;
	return true;
}







}


	


