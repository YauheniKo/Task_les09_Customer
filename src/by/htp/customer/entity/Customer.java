package by.htp.customer.entity;

//id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
public class Customer {

	private int id;
	private String firstName;
	private String lasttName;
	private String adress;
	private int numCrCard;

	public Customer(int id, String firstName, String lasttName, String adress, int numCrCard, int numBankCard) {

		this.id = id;
		this.firstName = firstName;
		this.lasttName = lasttName;
		this.adress = adress;
		this.numCrCard = numCrCard;
		this.numBankCard = numBankCard;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLasttName() {
		return lasttName;
	}

	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getNumCrCard() {
		return numCrCard;
	}

	public void setNumCrCard(int numCrCard) {
		this.numCrCard = numCrCard;
	}

	public int getNumBankCard() {
		return numBankCard;
	}

	public void setNumBankCard(int numBankCard) {
		this.numBankCard = numBankCard;
	}

	private int numBankCard;

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lasttName=" + lasttName + ", adress=" + adress
				+ ", numCrCard=" + numCrCard + ", numBankCard=" + numBankCard + "]" + "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lasttName == null) ? 0 : lasttName.hashCode());
		result = prime * result + numBankCard;
		result = prime * result + numCrCard;
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
		Customer other = (Customer) obj;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lasttName == null) {
			if (other.lasttName != null)
				return false;
		} else if (!lasttName.equals(other.lasttName))
			return false;
		if (numBankCard != other.numBankCard)
			return false;
		if (numCrCard != other.numCrCard)
			return false;
		return true;
	}

}
