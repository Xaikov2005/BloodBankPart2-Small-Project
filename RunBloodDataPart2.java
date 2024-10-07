import java.util.Scanner;


class BloodData
{
	private String bloodType;
	private String rhFactor;

	public BloodData() 
	{
		bloodType = "O";
		rhFactor = "+";
	}

    public void setBloodType(String bloodType){
		this.bloodType = bloodType;
	}	


	public void setRhFactor(String rhFactor){
		this.rhFactor = rhFactor;
	}	

	public String getBloodType(){
		return bloodType;
	}

	public String getRhFactor(){
		return rhFactor;
	}

	public void display() 
	{

		System.out.print(bloodType + rhFactor + " is added to the Blood Bank!");

	}

}

public class RunBloodDataPart2
{
	public static void main(String[] args) 
	
	{

		Scanner s = new Scanner(System.in);
		
		System.out.println("== BLOOD BANK PART 2 == Programmed by Xai Delos Reyes BSIT - 307");

		
		System.out.print("Enter the Blood Type of the Patient : ");
		String inputBloodType = s.nextLine();
		
		while(inputBloodType.matches("[\\d!@#$%^&*.,;':/']+")) {
		System.out.println("Invalid input");
		RunBloodDataPart2.main(args);
		break;
		

		
		}

				System.out.print("Enter the Rhesus Factor (+ or -) : ");
				String inputRhesus = s.nextLine();


				while(inputRhesus.matches("[\\d!@#$%^&*.,;':/']+")) {
					System.out.println("Invalid input");
					RunBloodDataPart2.main(args);
					break;
					

				}
					if(inputBloodType.isEmpty() && inputRhesus.isEmpty()) {
		    		BloodData bd = new BloodData();
					bd.display();


					} else {
						BloodData bd2 = new BloodData();
						bd2.setBloodType(inputBloodType);
						bd2.setRhFactor(inputRhesus);
						String bloodtypeDisplay = bd2.getBloodType();
						String rhFactorDisplay = bd2.getRhFactor();
						System.out.print(bloodtypeDisplay + rhFactorDisplay + " is added to the Blood Bank!");
					}
				}
		}





