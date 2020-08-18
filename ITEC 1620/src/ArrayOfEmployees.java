
public class ArrayOfEmployees {

	public static void main(String[] args) {
		
	Employee emp [] = new Employee[2];
	Employee hold;
	
	emp[0] = new Employee("Mary","Analyst",6);
	emp[1] = new Employee("Tom","Programmer",3);
	emp[2] = new Employee("Stewart","Manager",10);
	
	for (int i = 0; i < 10; i++) {
		if (e[i].getName().equals("Mary"))
			System.out.println(Mary gets $ + e[i].pay());
	}
	
	
	for (int pass = 1; pass < count; pass++) {
		for (int e = 0; e < count - 1; e++) {
			if (emp[e].getName().compareTo (emp[e+1].getName())>0) { 
				hold = emp[e];
				emp[e] = emp[e + 1];
				emp[e + 1] = hold;
			}
	

		System.out.println(emp[i].toString);
			
class Employee {
   String name, job;  
   int yearsExperience;

   public Employee (String n, String j, int ye){
      name=n;
      job=j;
      yearsExperience=ye;
   } 

   public String getName(){
    return name;
   }

   public String getJob(){
    return job;
   }

   public int getYears(){
    return yearsExperience;
   }

   public int pay(){
     int payRate; 
     if (yearsExperience > 5){
       if (job.equals("Manager"))  
        payRate = 80000;
       else if (job.equals("Analyst"))
        payRate = 50000;
       else 
        payRate = 40000;
     } 
     else {
       if (job.equals("Manager"))  
        payRate = 70000;
       else if (job.equals("Analyst"))
        payRate = 40000;
       else 
        payRate = 30000;
     } 
     return payRate;
   }

   public String toString() {
     return name+" working as "+job+" has a salary=$"+ pay();
   }
}
		
	}

}
