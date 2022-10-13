package objects;

public class Students {

	String name;
	int age;
	String division;

	void tellmeYourstudydivision() {
		System.out.println(" Hello i am studying in " + division);

	}

	void tellmeYourName() {

		System.out.println(" My name is " + name );

	}

	void tellmeYourAge() {

		System.out.println(" My age is " + age);

	}

	void increasedAge() {
	//	age = age+1;
	//	System.out.println(" My Increased Age is " + age);
	} 

	void tellmeYourAgegroup() {
		if(age < 18) {
			System.out.println(" I am a Kid ");
		} else {
			System.out.println(" I am an Adult ");
		}
	}
}

class TestStudents {

	public static void main(String[] args) {

		University u1 = new University();
		u1.universityname = "Bharti Vidyapeet";
		u1.universityaddress = "Kandalgav"; 
		u1.collegename = "Bharti Vidyapeet College of Pharmacy";
		Students s1 = new Students();
		s1.name = "Amit";
		s1.age = 29;
		s1.division = "A Division";
		
		University u2 = new University();
		u2.universityname = "Shivaji University";
		u2.universityaddress = "Kolhapur"; 
		u2.collegename = "New College";	
	    Students s2 = new Students();
		s2.name = "Prajkta";
		s2.age = 17;
		s2.division = "B Division";
		
		s1.tellmeYourName();
		s1.tellmeYourAge();
		s1.tellmeYourstudydivision();
		s1.increasedAge();
        s1.tellmeYourAgegroup();
        u1.tellmeYouruniversityname();
        u1.tellmeYouruniversityaddress();
        u1.tellmeYourcollegename();
        
        
		s2.tellmeYourName();
		s2.tellmeYourAge();
		s2.tellmeYourstudydivision();
		s2.increasedAge();
        s2.tellmeYourAgegroup();
        u2.tellmeYouruniversityname();
        u2.tellmeYouruniversityaddress();
        u2.tellmeYourcollegename();
        

	}
}
