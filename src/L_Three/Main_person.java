package L_Three;

public class Main_person {
	private person p = new person();
	public class person{
		private String firstName;
		private String lastName;
		private int age;
		private String email;
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	}
	
	
	public static void main(String[] args) {
		Main_person MP = new Main_person();
		MP.p.setFirstName("Deewa");
        MP.p.setLastName("yadav");
        MP.p.setAge(21);
        MP.p.setEmail("Ydeewa@gmail.com");
        System.out.println(MP.p.getFirstName());
        System.out.println(MP.p.getLastName());
        System.out.println(MP.p.getAge());
        System.out.println(MP.p.getEmail());
	}
}
