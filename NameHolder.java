
public abstract class NameHolder {
	protected String firstName;
	protected String lastName;
	public abstract String describeSelf();
	
	@Override
	public String toString() {
		return "First name: " + firstName;
	}
	
	protected void setFirstName(String firstName) throws NameException {
		if (!firstName.isEmpty())
			this.firstName = firstName;
		else
			throw new NameException("wrong");
	}

	protected  String getFirstName() {
		return new String(firstName);
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return new String(lastName);
	}
	

}
