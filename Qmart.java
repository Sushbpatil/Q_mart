

/*______________________________________________________________________________________________________________________________________________________________________________________
//
//
//														   PROJECT NAME:- QMART/JMART
// 														   NAME :- SUSHANT BABAN PATIL
//                                                         BRANCH :- MECHANICAL 
//                                                         COURSE :- BECHELOR'S OF ENGINEERING  
  														          ****JMART*****
 * 										 1)ELECTRONICS   2)GROCERY    3)FASHION   4)GOOD SPORTS & FITNESS EQUIPMENT     
 * 									
 * 										CONCEPT USED:- 1)ENCAPSULATION   2)INHERITANCE  3)POLYMORPHISM  4)ABSTRACTION 
 * 														   5)METHOD  RECURSION  6)ALL MEMBERS 7)OTHERS                              
//														
//                                           my project 13000
//* ______________________________________________________________________________________________________________________________________________________________________________________
 */



import java.util.*;

//______________________________________________________________________________________________________________________________________________________________________________________
//
//                                                       DRIVER CLASS 
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Qmart
{

	static {
		System.out.println("");

		System.out.println("");
		System.out.println(
				"**********************************************************************************************************************************************************************");
		System.out.println(
				"                                                                   HELLO SIR/MAM                                                                                  ");
		System.out.println(
				"*****************************************************************************************************************************************************************************");

		System.out.println("");

		System.out.println("");

		System.out.println(
				"=========================================================================================================================================================================================================================");
		System.out.println(
				"                                                              [ Welcome To Q Mart/J Mart ]                                                                            ");
		System.out.println(
				"==============================================================================================================================================================================================================================");

	}

	public static void main(String[] args) {
        
		LoGin b = new LoGin();
		//LOGIN METHOD
		b.ck();
		

	}
}


//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                                    SUPER CLASS 
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Jmart
{
	public String Category;
	public String Name;
	public double Price;

	// Method of Super CLASS
	public void Jmart() {

		System.out.println("");

		System.out.println("");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println(
				"                                                                     SELECT                                                                   ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Press 1 For Electronics...!!");
		System.out.println("Press 2 For Grocary..!!");
		System.out.println("Press 3 For Sports and Fitness Equipments..!!");
		System.out.println("Press 4 For Fashion..!!");

		// Creating Objects of Sub Classes
		Electronics e1 = new Electronics();
		Grocery g1 = new Grocery();
		Sports_Gym b1 = new Sports_Gym();
		Fashion f1 = new Fashion();

		@SuppressWarnings("resource")
		Scanner Se = new Scanner(System.in);
		
//_______________________________________________________________EXCEPTION HANDLING_________________________________________________________________________________________________________________________________________
		
		try {
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		
		
		String c1 = Se.next();

		switch (c1) {

		case "1":
			e1.Electronics();
			break;

		case "2":
			g1.Grocery();
			break;

		case "3":
			b1.Sports_Gym();
			break;

		case "4":
			f1.Fashion();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"*********************************************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
			 "*************************************************************************************************************************************************************************************************************************************");
			//METHOD RECURSION
			Jmart();
			break;
		}
		}
		catch(Exception  e)
		{
			System.out.println(" Exception");
		}

		

	}
	
   //Cancel Method
	public void Cancel() {

		System.out.println("");

		System.out.println("");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println(
				"                                                                     SELECT                                                                   ");

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Press 1  to Buy Another item ");
		System.out.println("Press 2 to Cofirm Cancellation");
		
		// UPCASTING & DOWNCASTING
		Cancel c1 = new Ak(); 
		@SuppressWarnings("unused")
		Ak a = new Ak();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
	

		String s1 = sc.next();

		switch (s1) {
		case "1":
			Jmart();
			break;

		case "2":
			c1.cancel();
			break;
			
			default:
				System.out.println("");
				System.out.println(
						"**********************************************************************************************************************************************************************************************************************************");
				System.out.println(
						"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
				System.out.println(
						"**************************************************************************************************************************************************************************************************************************************");
				Cancel();
				break;

				

		}

	}
}
//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                 ABSTRACTION
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

interface Cancel {
	void cancel(); // Abstract Method

}

//ABSTRACTION
class Ak implements Cancel {

	@Override
	public void cancel() // METHOD OVERRIDING
	{
		System.out.println("");

		System.out.println("");
		System.out.println(
				"*********************************************************************************************************************************************************************************************************************************");
		System.out.println(
				"                                                   Your Order is Cancelled                                ");
		System.out.println(
				"*************************************************************************************************************************************************************************************************************************************");

	}
}

//_____________________________________________________________________________________________________________________________________________________________________________________
//

//
//________________________________________________________________LOGIN PAGE______________________________________________________________________________________________________________________
//

class LoGin

{
	public String username;
	private String password;
	private String mobileno;
	public String Adress;
	String Password;

	
	//Getter Method
	public String getMobileno() {
		return mobileno;
	}
	
	//Setter Method
	
	public void setMobileno(String mobileno)
	{
		this.mobileno=mobileno;
	}
	
	//Getter Method
	public String getPassword() 
	{
	 return mobileno;
	}
		
	//Setter Method
	public void setPassword(String password)
	{
	    this.password=password;
	}
		

	String a = getMobileno();
 
	@SuppressWarnings("resource")
	public void ck() {
		Scanner i1 = new Scanner(System.in);
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                       Login Page                                                           ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("");
		System.out.print("Enter Username: ");
		username = i1.next();
		System.out.println("");

		password();
		
		mobileno();
		
		System.out.println("");
		System.out.print("Enter Your Address : ");
		Adress = i1.next();
		

		// users check = new users(username, password);
		// if(username.equals(username) && password.equals(password))
		// System.out.println("You are logged in");
		
		login2();

	}
	
	//METHOD TO VALIDATE MOBILENO
	
	@SuppressWarnings("resource")
	public void mobileno()
	{
		Scanner i2 = new Scanner(System.in);

		System.out.println("");
		System.out.print("Enter Your 10 digit Mobile Number --->  ");
		a = i2.next();
		
		if(a.length()!=10)
		{
			System.out.println("");
			
			System.out.println("Please Enter Valid Mobile Number");
			mobileno();
			System.out.println("");
		}
		
	}
	
	    //METHOD TO VALIDATE PASSWORD
		@SuppressWarnings("resource")
		public void password() {
			Scanner i3 = new Scanner(System.in);
			System.out.print("Enter Password : ");
			password = i3.next();
			System.out.println("");
			
			System.out.print("Confirm Password : ");
			Password = i3.next();
			
			if (password.equals(Password))
			{
				
			}
			else 
			{
				System.out.println("");
				System.out.println("Enter correct Password");
				password();
				
			}
				
		
		}
		
	
	
   //METHOD TO DISPLAY DETAILS
	@SuppressWarnings("resource")
	public void login2() {

		System.out.println("");
		System.out.println("");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println(
				"                                                               Confirm Your Details                                                       ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("USERNAME : " + username);
		System.out.println("PASSWORD : " + password);
		System.out.println("MOBILENO :" + a);
		System.out.println("ADDRESS   : " + Adress);

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("");

		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println("Enter 1 If Details are Correct ");
		System.out.println("Enter 2 If Details are InCorrect  ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		;
		Jmart j1 = new Jmart();
		Scanner sp = new Scanner(System.in);
		String o = sp.next();
		switch (o) {
		case "1":
			j1.Jmart();
			break;

		case "2":
			ck();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**********************************************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"**************************************************************************************************************************************************************************************************************************************");
			login2();
			break;

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                                      ELECTRONICS CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Electronics extends Jmart // Sub-Class 1 (1.mobile 2.laptop 3.Other_electronics)
{
	@SuppressWarnings("resource")
	void Electronics() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println(
				"                                                                       Electronics Shop                                                                           ");
		System.out.println(
				"===============================================================================================================================================================================================================================================");
		System.out.println("Press 1 For Mobile...!!");
		System.out.println("Press 2 For Laptop..!!");
		System.out.println("Press 3 For Other_Electronics..!!");
		System.out.println(" ");
		// Object of Mobile class to access Mobile Method
		Mobile m1 = new Mobile();
		// Object of Laptop class to access Laptop Method
		Laptop l1 = new Laptop();
		// Object of Other Electronics to access Other electronics Method
		Other_Electronics e1 = new Other_Electronics();
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number : ");
		// Scanner class
		Scanner sk = new Scanner(System.in);
		// String as input (Using Method Chaining)
		String c2 = sk.next();
		switch (c2) {
		case "1":
			// mobile shop to be called
			m1.mobile();
			break;
		case "2":
			// Laptop should call
			l1.Laptop();
			break;
		case "3":
			e1.Other_Electronics();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**********************************************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"**************************************************************************************************************************************************************************************************************************************");

			Electronics();
			break;
		}

		choose();
	}

//
//________________________________________________________________Choose Method______________________________________________________________________________________________________________________
//

	@SuppressWarnings("resource")
	public void choose() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                       Choose                                                           ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println("Enter 1 For Confirm Order");
		System.out.println("Enter 2 For Main menu ");
		System.out.println("Enter 3 For Electronics Menu ");
		System.out.println("Enter 4 For Cancellation ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		buy b1 = new buy();
		String c1 = sk.next();

		switch (c1) {
		case "1":
			b1.buy();
			break;

		case "2":
			Jmart();
			break;

		case "3":
			Electronics();
			break;

		case "4":
			Cancel();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			choose();

		}

	}

}

//
//_______________________________________________________________________________BUY Method______________________________________________________________________________________________________________________
//

class buy {

	@SuppressWarnings("resource")
	public void buy() {
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println(
				"                                                                     SELECT                                                                   ");

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter 1 to pay by Cash");
		System.out.println("Enter 2 to pay by UPI");
		System.out.println("Enetr 3 to pay by Bank Tarnsfer");

		Scanner sc = new Scanner(System.in);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		System.out.print("");
		LoGin l1=new LoGin();
		String c2 = sc.next();

		switch (c2) {
		case "1":
			System.out.print("");
			System.out.print("");
			
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println(
					"                                                           Your Payment is done successfully !!                                                                ");
			System.out.println(
					"                                                            Thank you for Shopping with us                                                                  ");
			System.out.println(
					"                                                               Have a Great Day!!!!!                                                               ");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			break;

		case "2":
			System.out.print("");
			System.out.print("");
            l1.mobileno();
			
			System.out.print("Enter Amount:");
			@SuppressWarnings("unused")
			String c4=sc.next();
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println(
					"                                                           Your Payment is done successfully                                                                 ");
			System.out.println(
					"                                                            Thank you for Shopping with us                                                                  ");
			System.out.println(
					"                                                               Have a Great Day!!!!!                                                               ");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			break;

		case "3":
			
			System.out.print("");
			System.out.print("");
			 l1.mobileno();
				
				System.out.print("Enter Amount:");
			sc.next();

			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println(
					"                                                           Your Payment is done successfully                                                                 ");
			System.out.println(
					"                                                            Thank you for Shopping with us                                                                  ");
			System.out.println(
					"                                                               Have a Great Day!!!!!                                                               ");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			break;

		default:
			System.out.println("");
			System.out.println("");
			System.out.println(
					"***********************************************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"*********************************************************************************************************************************************************************************************************************************");
			buy();
			break;

		}

	}
}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                                    MOBILE CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class Mobile extends Electronics // sub class of Electronics 1
{
	String Category = "Mobile";
	public String Brand;
	public String Storage;
	public String Camera;

	public String Battery;

	public void Test() {

	}

	public void mobile() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"=======================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite brand                                                                    ");
		System.out.println(
				"========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For ONE PLUS");
		System.out.println("Enter 2 For VIVO");
		System.out.println("Enter 3 For REALME");
		System.out.println("Enter 4 For IPHONE");
		System.out.println("Enter 5 For OPPO");
		System.out.println("Enter 6 For MI");
		one_plus a = new one_plus();
		vivo b = new vivo();
		realme c = new realme();
		iphone d = new iphone();
		oppo e = new oppo();
		Mi f = new Mi();
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number : ");
		Scanner Sd = new Scanner(System.in);
		String c3 = Sd.next();
		switch (c3) {

		case "1":
			// Method Calling Statement for One Plus
			a.OneplusMobiles();
			break;

		case "2":
			// Method Calling Statement of VIVO
			b.VivoMobiles();
			break;

		case "3":
			// Method Calling Statement of REALME
			c.realmeMobiles();
			break;

		case "4":
			// Method Calling Statement of Iphone
			d.iosmobiles();
			break;

		case "5":
			// Method Calling Statement of Oppo
			e.oppoMobiles();
			break;

		case "6":
			f.MiMobiles();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"***********************************************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"*********************************************************************************************************************************************************************************************************************************");

			mobile();
			break;

		}

	}

	// COOMON METHOD FOR ALL IOS MOBILES
	public String os;

	void Method6() {
		System.out.println("");

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Brand:" + Brand);
		System.out.println("Name:" + Name);
		System.out.println("Price:" + Price);
		System.out.println("Storage:" + Storage);
		System.out.println("OS:" + os);
		System.out.println("Battery:" + Battery);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("");

	}

	// COMMON METHOD FOR ALL ANDROID MOBILES
	public String Ram;

	void Method() {
		System.out.println("");

		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Brand:" + Brand);
		System.out.println("Name:" + Name);
		System.out.println("Price:" + Price);
		System.out.println("Storage:" + Storage);
		System.out.println("ram:" + Ram);
		System.out.println("battery:" + Battery);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("");

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                                  LAPTOP CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________



class Laptop extends Electronics // sub class of Electronics 2
{

	String Category = "Laptop";
	public String Brand;
	public String Storage;
	public String operating_system;
	public String Processor;

	public static void on() {

	}

	public static void off() {

	}

	public static void restart() {

	}

	public void Laptop() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite brand                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For HP");
		System.out.println("Enter 2 For ASUS");
		System.out.println("Enter 3 For DELL");
		System.out.println("Enter 4 For LENOVO");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		HP h1 = new HP();
		Asus a1 = new Asus();
		Dell d1 = new Dell();
		Lenovo l1 = new Lenovo();
		Scanner so = new Scanner(System.in);
		String c2 = so.next();

		switch (c2) {

		case "1":
			h1.HPLaptop();
			break;

		case "2":

			a1.AsusLaptop();
			break;

		case "3":

			d1.DellLaptop();
			break;

		case "4":

			l1.LenovoLaptop();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Laptop();
			break;

		}

	}

	// Method2() is same for all the Laptop
	public void Method2() {
		System.out.println("");

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Brand:" + Brand);
		System.out.println("Name:" + Name);
		System.out.println("Price:" + Price);
		System.out.println("Storage:" + Storage);
		System.out.println("operating_system:" + operating_system);
		System.out.println("Processor:" + Processor);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("");

	}
}




//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                                  OTHER ELECTRONICS CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class Other_Electronics extends Electronics {
	public String Brand;
	public String Model;
	public String Battery;

	void Other_Electronics() {

		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite brand                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For SmartWatches");
		System.out.println("Enter 2 For Speakers");
		Scanner sd = new Scanner(System.in);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.print("Enter Number : ");

		SmartWatches s1 = new SmartWatches();
		Speakers s2 = new Speakers();
		String c1 = sd.next();

		switch (c1) {
		case "1":
			s1.SmartWatches();
			break;

		case "2":
			s2.Speakers();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Other_Electronics();

		}

	}
}


//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                                  SPEAKERS CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class Speakers extends Other_Electronics {
	public String Connectivity;
	public String Microphone;

	void Method3() {
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Brand:" + Brand);
		System.out.println("Name:" + Name);
		System.out.println("Price:" + Price);
		System.out.println("Connectivity :" + Connectivity);
		System.out.println("Microphone:" + Microphone);
		System.out.println("Model :" + Model);
		System.out.println("Battery : " + Battery);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

	}

	public void Speakers() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite brand                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For JBL");
		System.out.println("Enter 2 For MIVI");
		System.out.println("Enter 3 For HAMMER");
		Scanner sh = new Scanner(System.in);
		JBL j1 = new JBL();
		Mivi m1 = new Mivi();
		Hammer h1 = new Hammer();
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.print("Enter Number : ");
		String c2 = sh.next();
		switch (c2) {
		case "1":
			j1.JblSpeaker();
			break;

		case "2":
			m1.MiviSpeaker();
			break;

		case "3":
			h1.HammerSpeaker();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Speakers();

		}

	}
}

class JBL extends Speakers {

	public void JblSpeaker() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println(
				"                                                                           Welcome to  JBL Speakers");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("!!!!...Select Your Favourite JBL Headphone...!!!!");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter 1 For JBL Tune 230");
		System.out.println("Enter 2 For JBL Black Wireless");
		System.out.println("Enter 3 For JBL JR POP");
		System.out.println("Enter 4 For JBL T500BT");
		System.out.println(" ");

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.print("Enter Number : ");

		Scanner sc = new Scanner(System.in);
		String c1 = sc.next();

		switch (c1) {
		case "1":
			JBL_Tune_230 j1 = new JBL_Tune_230("JBL", "JBL Tune 230", "Type-C", 2499, "8Hrs", "Wireless", "YES");
			break;

		case "2":
			JBL_Black_Wireless j2 = new JBL_Black_Wireless("JBL", "JBL Wireless ", "Jbl_2.0", 5197, "12HR", "WIRELESS",
					"YES");
			break;

		case "3":
			JBL_Tune_760 j3 = new JBL_Tune_760("JBL", "JBL JR POP", "JR Pop", 2078, "6HR", "WIRELESS", "NO");
			break;

		case "4":
			JBL_T500Bt j4 = new JBL_T500Bt("JBL", "JBL T500BT", "500 BT", 3118, "8HR", "WIRELESS", "YES");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			JblSpeaker();

		}

	}

}

class Mivi extends Speakers {

	public void MiviSpeaker() {
		System.out.println("");
		System.out.println("");

		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println(
				"                                                                          Welcome to Mivi Speakers ");

		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("!!!!...Select Your Favourite MIVI Headphone...!!!!");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter 1 For Mivi 20");
		System.out.println("Enter 2 For Mivi Duopod A25");
		System.out.println("Enter 3 For Mivi Collar Flash");
		System.out.println("Enter 4 For Mivi Duopod F30");
		System.out.println(" ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.print("ENTER NUMBER : ");
		Scanner ds = new Scanner(System.in);
		String j1 = ds.next();

		switch (j1) {
		case "1":
			Mivi_2o m1 = new Mivi_2o("MIVI", "MIVI 20 ", "mivi 20", 1199, "16HR", "WIRELESS", "YES");
			break;

		case "2":
			Mivi_Duopod_A25 m2 = new Mivi_Duopod_A25("MIVI", "MIVI Duopod A25 ", "Duopod A25", 1199, "16HR", "WIRELESS",
					"YES");
			break;

		case "3":
			Mivi_collar_flash m3 = new Mivi_collar_flash("MIVI", "MIVI Collar Flash ", "collar flash ", 999, "14HR",
					"WIRELESS", "YES");
			break;

		case "4":
			Mivi_Duopod_F30 m4 = new Mivi_Duopod_F30("MIVI", "Mivi Duopod F30 ", "Duopod F30 ", 1999, "16HR",
					"WIRELESS", "YES");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			MiviSpeaker();

		}

	}
}

class Hammer extends Speakers {

	public void HammerSpeaker() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                           Welcome to Hammer Speakers");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println("!!!!...Select Your Favourite Hammer Headphone...!!!!");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter 1 For Hammer KO 2.0");
		System.out.println("Enter 2 For Hammer String 3.0");
		System.out.println("Enter 3 For Solid Airflow 2.0");
		System.out.println(" ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("ENTER NUMBER : ");

		Scanner ds = new Scanner(System.in);
		String j1 = ds.next();

		switch (j1) {
		case "1":
			Hammer_KO_2 k1 = new Hammer_KO_2("HAMMER", "Hammer KO 2.0", "KO 2.0 ", 1999, "16HR", "WIRELESS", "YES");
			break;

		case "2":
			Hammer_sting_3 k2 = new Hammer_sting_3("HAMMER", "Hammer sting 3", "Sting 3.0 ", 3495, "20HR", "WIRELESS",
					"YES");
			break;

		case "3":
			Hammer_solid_Airflow_2 k3 = new Hammer_solid_Airflow_2("HAMMER", "Hammer Airflow 2.0", " Airflow 2.0", 1995,
					"18HR", "WIRELESS", "YES");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			HammerSpeaker();

		}

	}

}





//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                                SMARTWATCH CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class SmartWatches extends Other_Electronics {

	public void Method3() {
		System.out.println("");

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Brand:" + Brand);
		System.out.println("Name:" + Name);
		System.out.println("Price:" + Price);
		System.out.println("Battery :" + Battery);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("");

	}

	public void SmartWatches() {
		boAt b1 = new boAt();
		Fire_Boltt f1 = new Fire_Boltt();
		Samsung s1 = new Samsung();
		Noise n1 = new Noise();
		Apple_Watch a1 = new Apple_Watch();
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite brand                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For boAt");
		System.out.println("Enter 2 For FireBoltt");
		System.out.println("Enter 3 For SAMSUNG");
		System.out.println("Enter 4 For Noise");
		System.out.println("Enter 5 For Apple Watches");
		Scanner sd = new Scanner(System.in);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.print("Enter Number : ");

		String c6 = sd.next();
		switch (c6) {

		case "1":
			b1.boAtSmartwatches();
			break;

		case "2":
			f1.Fire_boltt();
			break;

		case "3":
			s1.SamsungWatches();
			break;

		case "4":
			n1.NoiseSmartwatches();
			break;

		case "5":
			a1.AppleWatch();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			SmartWatches();

		}

	}
}




class boAt extends SmartWatches {
	public void boAtSmartwatches() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println(
				"                                                                          Welcome to  boAt smartWatches ");

		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(" ");
		System.out.println("!!!!...Select Your Favourite boAt smartWatch ...!!!!");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter 1 For boAt Wave Neo");
		System.out.println("Enter 2 For boAt Wave Connect");
		System.out.println("Enter 3 For boAt Blaze");
		System.out.println("Enter 4 For boAt Storm");
		System.out.println("Enter 5 For boAt Xtend");
		System.out.println(" ");
		System.out.print("Enter Number : ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		Scanner sd = new Scanner(System.in);
		String c1 = sd.next();

		switch (c1) {

		case "1":

			Wave_neo b1 = new Wave_neo("boAt", "boAt Wave Neo", " Wave Neo", 1779, "7 DAYS");
			break;

		case "2":
			Wave_Connect b2 = new Wave_Connect("boAt", "boAt Wave Connect", "Wave Connect", 3990, "7 DAYS");
			break;

		case "3":
			Blaze b3 = new Blaze("boAt", "boAt Blaze", " Watch Blaze", 3499, "7 DAYS");
			break;

		case "4":
			Storm b4 = new Storm("boAt", "boAt Storm", " Watch Storm", 4999, "10 DAYS");
			break;

		case "5":
			Xtend b5 = new Xtend("boAt", "boAt Xtend", " Watch Xtend", 2659, "8 DAYS");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			boAtSmartwatches();

		}

	}
}

class Fire_Boltt extends SmartWatches {

	public void Fire_boltt() {

		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println(
				"                                                                          Welcome to FireBoltt  smartWatches");

		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(" ");
		System.out.println("!!!!...Select Your Favourite FireBolTT smartWatch ...!!!!");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter 1 For FireBoltt Ninja Pro Max");
		System.out.println("Enter 2 For FireBoltt Invincible");
		System.out.println("Enter 3 For FireBoltt Mercury");
		System.out.println("Enter 4 For FireBoltt Talk");
		System.out.println("Enter 5 For FireBoltt Ring3");

		System.out.println(" ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.print("Enter Number : ");
		Scanner sd = new Scanner(System.in);
		String c1 = sd.next();

		switch (c1) {
		case "1":

			Ninja_Pro_Max n1 = new Ninja_Pro_Max("FireBoltt", "FireBoltt Ninja Pro Max", " Ninja Pro Max", 1699,
					"8 DAYS");
			break;

		case "2":

			Invincible n2 = new Invincible("FireBoltt", "FireBoltt Invincible", "Invincible", 5999, "10 DAYS");
			break;

		case "3":

			Mercury n3 = new Mercury("FireBoltt", "FireBoltt Mercury", "Mercury", 1999, "8 DAYS");
			break;

		case "4":

			Talk n4 = new Talk("FireBoltt", "FireBoltt Talk", "Talk", 1999, " 10 DAYS");
			break;

		case "5":

			Ring_3 n5 = new Ring_3("FireBoltt", "FireBoltt Ring 3.0 ", "Ring 3.0", 2999, " 10 DAYS");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Fire_boltt();

		}
	}

}

class Samsung extends SmartWatches {

	public void SamsungWatches() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println(
				"                                                                         Welcome to  Samsung smartWatches");

		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(" ");
		System.out.println("!!!!...Select Your Favourite  Samsung smartWatch ...!!!!");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter 1 For Samsung Watch 4");
		System.out.println("Enter 2 For Samsung watch 4 Classic");
		System.out.println("Enter 3 For Samsung Watch 3");
		System.out.println("Enter 4 For Samsung Watch 5");
		System.out.println(" ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.print("Enter Number : ");
		Scanner sd = new Scanner(System.in);
		String c1 = sd.next();
		switch (c1) {
		case "1":

			Samsung_Watch4 n1 = new Samsung_Watch4("Samsung", "Samsung Watch 4", "Watch 4", 26999, "40 HRS");
			break;

		case "2":

			Samsung_Watch4_Classic n2 = new Samsung_Watch4_Classic("Samsung", "Samsung watch 4 Classic", "Watch 4",
					34999, "46 HRS");
			break;

		case "3":

			Samsung_Watch3 n3 = new Samsung_Watch3("Samsung", "Samsung watch 3", "Watch 3", 11999, "40 HRS");
			break;

		case "4":

			Samsung_Watch5 n4 = new Samsung_Watch5("Samsung", "Samsung Watch 5", "Watch 5", 30999, "40 HRS");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			SamsungWatches();

		}

	}
}

class Noise extends SmartWatches {

	public void NoiseSmartwatches() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println(
				"                                                                         Welcome to  Noise smartWatches");

		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(" ");
		System.out.println("!!!!...Select Your Favourite  Noise smartWatch ...!!!!");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter 1 For Noise Colorfit Icon Buzz");
		System.out.println("Enter 2 For Noise Colorfit Go Buzz");
		System.out.println("Enter 3 For Noise Colorfit Pro");
		System.out.println("Enter 4 For Noise Colorfit Icon2");
		System.out.println(" ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.print("Enter Number : ");
		Scanner sd = new Scanner(System.in);
		String c1 = sd.next();
		switch (c1) {
		case "1":

			Colorfit_Icon_Buzz n1 = new Colorfit_Icon_Buzz("Noise", "Noise Colorfit Icon Buzz", "Icon Buzz", 1999,
					"7 Days");
			break;

		case "2":

			ColorfitPlus_Go_Buzz n2 = new ColorfitPlus_Go_Buzz("Noise", "Noise Colorfit Go Buzz", " Go Buzz ", 1999,
					"7 Days");
			break;

		case "3":

			ColorFit_Pro4 n3 = new ColorFit_Pro4("Noise", "Noise Colorfit Pro", "Pro ", 2499, " 10 Days");
			break;

		case "4":

			ColorFit_Icon2 n4 = new ColorFit_Icon2("Noise", " Noise Colorfit Icon2", "Icon2", 2499, " 12 Days");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			NoiseSmartwatches();

		}
	}
}

class Apple_Watch extends SmartWatches {

	public void AppleWatch() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println(
				"                                                                         Welcome to  Apple Watches");

		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("");

		System.out.println("");
		System.out.println(" ");
		System.out.println("!!!!...Select Your Favourite  iWatch ...!!!!");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter 1 For iwatch series 6");
		System.out.println("Enter 2 For iwatch series SE");
		System.out.println("Enter 3 For iwatch series 4");
		System.out.println("Enter 4 For iwatch series 7");
		System.out.println("Enter 5 For iwatch series 8");
		System.out.println("Enter 6 For iwatch series 5");
		System.out.println(" ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.print("Enter Number : ");
		Scanner sd = new Scanner(System.in);
		String c1 = sd.next();
		switch (c1) {
		case "1":

			iwatch_Series_6 n1 = new iwatch_Series_6("Apple", "iwatch series 6", "series 6", 49999, "18 HRS");
			break;

		case "2":

			iwatch_SE n2 = new iwatch_SE("Apple", "iwatch series SE", "series SE", 34999, "18 HRS");
			break;

		case "3":

			iwatch_Series_4 n3 = new iwatch_Series_4("Apple", "iwatch series 4", "series 4", 43999, "18 HRS");
			break;

		case "4":

			iwatch_Series_7 n4 = new iwatch_Series_7("Apple", "iwatch series 7 ", "series 7 ", 47999, "18 HRS");
			break;

		case "5":

			iwatch_Series_8 n5 = new iwatch_Series_8("Apple", "iwatch series 8 ", "series 8 ", 49999, "18 HRS");
			break;

		case "6":

			iwatch_Series_5 n6 = new iwatch_Series_5("Apple", "iwatch series 5 ", "series 5 ", 40999, "18 HRS");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			AppleWatch();

		}

	}
}




//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                              SUB CLASSES OF MOBILE CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

//Hierarchical Inheritance (Sub-class of mobile class)
class one_plus extends Mobile {

	public void OneplusMobiles() {
		System.out.println("");
		System.out.println("");

		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                           Welcome to  One plus");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("!!!!...Select Your Favourite OnePlus Mobile...!!!!");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter 1 For One Plus Nord");
		System.out.println("Enter 2 For One Plus Nord-2");
		System.out.println("Enter 3 For One Plus Nord-9");
		System.out.println("Enter 4 For One Plus Nord-9R");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		String One = Sc.nextLine();
		switch (One) {
		case "1":

			// Calling constructor of Oneplus_nord_1
			Oneplus_Nord o1 = new Oneplus_Nord("One Plus", "One Plus Nord", 27999, "128GB", "48MP+8MP+5MP+3MP",
					"8GB RAM", "4000mah");// (CCS)
			break;

		case "2":
			Oneplus_Nord_2 o2 = new Oneplus_Nord_2("One Plus", "One Plus Nord 2", 28999, "128GB", "48MP+8MP+5MP+3MP",
					"8GB RAM", "4000mah");
			break;

		case "3":
			Oneplus_Nord_9 o3 = new Oneplus_Nord_9("One Plus", "One Plus Nord 9", 35999, "256GB", "48MP+8MP+5MP+2MP",
					"12GB RAM", "4500mah");
			break;

		case "4":
			OnePlus_Nord_9R o4 = new OnePlus_Nord_9R("One Plus", "One Plus Nord 9R", 32999, "128GB", "48MP+8MP+5MP+2MP",
					"12GB RAM", "4500mah");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");

			OneplusMobiles();
			// method calling statement

		}

	}
}

//Hierarchical Inheritance (Sub-class of mobile class)
class vivo extends Mobile {

	public void VivoMobiles() {
		System.out.println("");
		System.out.println("");

		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println(
				"                                                                           Welcome to  vivo ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("!!!!...Select Your Favourite Vivo Mobile...!!!!");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter 1 For Vivo v23");
		System.out.println("Enter 2 For Vivo X70");
		System.out.println("Enter 3 For Vivo X70 Pro");
		System.out.println("Enter 4 For Vivo Y75");
		System.out.println("Enter 5 For Vivo Y21");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.print("Enter number: ");
		Scanner si = new Scanner(System.in);
		String a = si.next();
		switch (a) {
		case "1":

			vivo_v23 v1 = new vivo_v23("Vivo", "Vivo V23", 36499, "128 GB", "48MP+8MP+5MP+2MP", "8GB RAM", "4200Mah");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			break;

		case "2":

			vivo_x70 v2 = new vivo_x70("Vivo", "Vivo X70", 31499, "128 GB", "48MP+8MP+5MP+2MP", "8GB RAM", "4000Mah");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			break;

		case "3":

			vivo_x70_pro v3 = new vivo_x70_pro("Vivo", "Vivo X70 Pro", 79999, "256 GB", "50MP+48MP+12MP+8MP",
					"12GB RAM", "4500Mah");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			break;

		case "4":
			vivo_Y75 v4 = new vivo_Y75("Vivo", "Vivo Y75 ", 21999, "128 GB", "48MP+8MP+5MP+2MP", "8 GB RAM", "4000Mah");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

			break;

		case "5":
			System.out.println("You've Purchased --Vivo Y21--");
			vivo_Y21 v5 = new vivo_Y21("Vivo", "Vivo Y21 ", 13999, "64 GB", "32MP+6MP+5MP+2MP", "4 GB RAM", "4000Mah");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");

			VivoMobiles();
			// Method calling statement if User enters error input
			break;

		}

	}
}

//Hierarchical Inheritance (Sub-class of mobile class)
class realme extends Mobile {

	public void realmeMobiles() {
		System.out.println("");
		System.out.println("");

		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                           Welcome to  REALME ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println("!!!!...Select Your Favourite REALME Mobile...!!!!");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter 1 For Realme 9");
		System.out.println("Enter 2 For Realme 9i");
		System.out.println("Enter 3 For Realme Narzo 50");
		System.out.println("Enter 4 For Realme Narzo 50 Pro");

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		Scanner Sc = new Scanner(System.in);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.print("Enter number: ");

		String One = Sc.nextLine();
		switch (One) {
		case "1":
			realme_9 v1 = new realme_9("Realme", "Realme 9", 16499, "128 GB", "50MP+8MP+4MP", "6GB RAM", "5000Mah");
			System.out.println("You Are Selecting --realme 9--");
			break;

		case "2":
			realme_9i v2 = new realme_9i("Realme", "Realme 9i", 17499, "128 GB", "50MP+8MP+4MP+2MP", "6GB RAM",
					"5000Mah");
			System.out.println("You Are Selecting --realme 9i--");
			break;

		case "3":
			realme_narzo_50 v3 = new realme_narzo_50("Realme", "Realme Narzo 50", 17499, "128 GB", "50MP+8MP+4MP+2MP",
					"6GB RAM", "5000Mah");
			System.out.println("You Are Selecting --realme Narzo 50--");
			break;

		case "4":
			realme_narzo_50Pro v4 = new realme_narzo_50Pro("Realme", "Realme Narzo 50 Pro", 21499, "128 GB",
					"50MP+8MP+4MP", "6GB RAM", "4700Mah");
			System.out.println("You Are Selecting --realme Narzo 50Pro--");
			break;

		default:

			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");

			realmeMobiles();
			break;

		}
	}

}

//Hierarchical Inheritance (Sub-class of mobile class)
class iphone extends Mobile {

	public void iosmobiles() {
		System.out.println("");
		System.out.println("");

		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                           Welcome to  Apple Iphone ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("!!!!...Select Your Favourite Iphone ...!!!!");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter 1 For Iphone 7");
		System.out.println("Enter 2 For Iphone 8");
		System.out.println("Enter 3 For Iphone X");
		System.out.println("Enter 4 For Iphone 11");
		System.out.println("Enter 5 For Iphone 12");
		System.out.println("Enter 6 For Iphone 13");
		System.out.println("Enter 7 For Iphone 14");
		System.out.println("Enter 8 For Iphone 14 pro ");
		System.out.println("Enter 9 For Iphone 14 pro max");
		System.out.println(" ");
		Scanner sc3 = new Scanner(System.in);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.print("Enter number: ");

		String I1 = sc3.next();
		switch (I1) {
		case "1":

			System.out.println("You Are Selecting --iPhone 7--");
			iphone_7 i1 = new iphone_7("iphone", "Iphone 7", 17499, "64 GB", "24Mp+8Mp", "Fusion A10", "1960 MAh");
			break;

		case "2":

			System.out.println("You Are Selecting --iPhone 8--");
			iphone_X i3 = new iphone_X("iphone", "Iphone 8", 27499, "128 GB", "32Mp+8Mp", "Fusion A10", "2060 MAh");
			break;

		case "3":

			System.out.println("You Are Selecting --iPhone X--");
			iphone_X i4 = new iphone_X("iphone", "Iphone X", 34499, "128 GB", "32Mp+8Mp", "Apple A12", "3000 MAh");
			break;

		case "4":
			System.out.println("You Are Selecting --iPhone 11--");
			iphone_X i5 = new iphone_X("iphone", "Iphone 11", 60999, "64 GB", "32Mp+8Mp", "A14-Bionic", "3000 MAh");
			break;

		case "5":

			System.out.println("You Are Selecting --iPhone 12 --");
			iphone_12 i7 = new iphone_12("iphone", "Iphone 12 ", 60499, "128 GB", "42Mp+10Mp", "A14 Bionic",
					"3000 MAh");
			break;

		case "6":

			System.out.println("You Are Selecting --iPhone 13 --");
			iphone_13 i9 = new iphone_13("iphone", "Iphone 13", 69999, "128 GB", "42Mp+10Mp", "Bionic-15", "3000 MAh");
			break;

		case "7":

			System.out.println("You Are Selecting --iPhone 14  --");
			iphone_14 i12 = new iphone_14("iphone", "Iphone 14 ", 83999, "128 GB", "50Mp+12Mp", "Bionic-15",
					"4000 MAh");
			break;

		case "8":

			System.out.println("You Are Selecting --iPhone 14 pro  --");
			iphone_14Pro i13 = new iphone_14Pro("iphone", "Iphone 14 Pro ", 123999, "128 GB", "50Mp+12Mp+8Mp",
					"Bionic-15", "4000 MAh");
			break;

		case "9":

			System.out.println("You Are Selecting --iPhone 14 pro Max --");
			iphone_14ProMax i14 = new iphone_14ProMax("iphone", "Iphone 14 Pro Max", 149999, "128 GB", "50Mp+12Mp+8Mp",
					"Bionic-15", "4000 MAh");
			break;

		default:

			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");

			iosmobiles();
			break;

		}
	}

}

//Hierarchical Inheritance (Sub-class of mobile class)
class oppo extends Mobile {

	public void oppoMobiles() {

		System.out.println("");
		System.out.println("");

		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                           Welcome to  oppo ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("!!!!...Select Your Favourite Oppo Mobiles...!!!!");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter 1 For Oppo Find X5 pro");
		System.out.println("Enter 2 For Oppo Reno 8");
		System.out.println("Enter 3 For Oppo Reno 8 Pro");
		System.out.println("Enter 4 For Oppo F9");
		System.out.println("Enter 5 For Oppo F21");
		System.out.println("Enter 6 For Oppo F9 Pro");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		Scanner sh = new Scanner(System.in);
		System.out.print("Enter Number");
		String q = sh.next();

		switch (q) {
		case "1":
			System.out.println("You Are Selecting --Oppo Find X5 pro--");
			oppo_find_x5_pro o1 = new oppo_find_x5_pro("Oppo", "OPPO Find X5 Pro", 60199, "256GB", "50Mp+13Mp+6Mp",
					"12GB", "5000mAh");
			break;

		case "2":
			System.out.println("You Are Selecting --Oppo Reno 8--");
			oppo_Reno_8 o2 = new oppo_Reno_8("Oppo", "OPPO Reno 8", 29999, "128GB", "50Mp+8Mp+2Mp", "8GB", "4500mAh");
			break;

		case "3":
			System.out.println("You Are Selecting --Oppo Reno 8 pro--");
			oppo_Reno_8_Pro o3 = new oppo_Reno_8_Pro("Oppo", "OPPO Reno 8 Pro", 45999, "256GB", "50Mp+8Mp+2Mp", "12GB",
					"4500mAh");
			break;

		case "4":
			System.out.println("You Are Selecting --Oppo F9--");
			oppo_F9 o4 = new oppo_F9("Oppo", "OPPO F9", 19999, "64GB", "25Mp+8Mp", "4GB", "3500mAh");
			break;

		case "5":
			System.out.println("You Are Selecting --Oppo F21--");
			oppo_F21 o5 = new oppo_F21("Oppo", "OPPO F21", 24999, "128GB", "64Mp+2Mp+2Mp", "8GB", "4500mAh");
			break;

		case "6":
			System.out.println("You Are Selecting --Oppo F9 Pro--");
			oppo_F9_Pro o6 = new oppo_F9_Pro("Oppo", "OPPO F9 Pro", 19999, "64GB", "32Mp+2Mp", "4GB", "4500mAh");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");

			oppoMobiles();
			break;

		}

	}

}

//Hierarchical Inheritance (Sub-class of mobile class)
class Mi extends Mobile {

	public void MiMobiles() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                           Welcome to REDMI ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("!!!!...Select Your Favourite Xiaomi Mobiles...!!!!");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter 1 For Redmi K50");
		System.out.println("Enter 2 For Redmi note 9");
		System.out.println("Enter 3 For Redmi note 11");
		System.out.println("Enter 4 For Redmi note 11 Pro");
		System.out.println("Enter 5 For Mi 11x");
		System.out.println("Enter 6 For Mi 11");
		System.out.println("Enter 6 For Mi 11i");

		Scanner sj = new Scanner(System.in);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("ENTER NUMBER : ");

		String e = sj.next();

		switch (e) {

		case "1":
			System.out.println("You Are Selecting --Redmi K50--");
			Redmi_K50 o1 = new Redmi_K50("Xiaomi ", "Redmi K50", 26999, "128GB", "48MP+8MP+2MP", "6GB", "5000mAh");
			break;

		case "2":
			System.out.println("You Are Selecting --Redmi Note 9--");
			mi_note_9 o2 = new mi_note_9("Xiaomi ", "Redmi Note 9", 12999, "64GB", "48MP+8MP+2MP", "4GB", "5020mAh");
			break;

		case "3":
			System.out.println("You Are Selecting --Redmi note 11--");
			mi_note_11 o3 = new mi_note_11("Xiaomi ", "Redmi note 11", 12999, "64GB", "13MP+2MP", "4GB", "5000mAh");
			break;

		case "4":
			System.out.println("You Are Selecting --Redmi note 11 Pro--");
			mi_note_11Pro o4 = new mi_note_11Pro("Xiaomi ", "Redmi note 11 Pro", 19999, "128GB", "108MP+8MP", "6GB",
					"5000mAh");
			break;

		case "5":
			System.out.println("You Are Selecting --Mi 11x--");
			Mi_11x o5 = new Mi_11x("Xiaomi ", "Mi 11x", 24999, "128GB", "64MP+8MP+5MP", "6GB", "4250mAh");
			break;

		case "6":
			System.out.println("You Are Selecting --Xiaomi 11--");
			Xiomi_11 o6 = new Xiomi_11("Xiaomi ", " Xiaomi 11", 35999, "128GB", "64MP+8MP+5MP", "6GB", "5050mAh");
			break;

		case "7":
			System.out.println("You Are Selecting --Xiaomi 11i--");
			Xiomi_11i o7 = new Xiomi_11i("Xiaomi ", " Xiaomi 11i", 22999, "128GB", "108MP+8MP+2MP", "6GB", "5080mAh");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");

			MiMobiles();
			break;

		}

	}

}




//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                              SUB- CLASSES OF LAPTOP CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

//Hierarchical Inheritance (Sub-class of Laptop class)
class HP extends Laptop {

	public void HPLaptop() {
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out
				.println("                                                                           Welcome to HP  ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println(" ");
		System.out.println("!!!!...Select Your Favourite HP Laptop...!!!!");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter 1 For HP 15S");
		System.out.println("Enter 2 For HP Core i7");
		System.out.println("Enter 3 For Hp Athlon Dual");
		System.out.println("Enter 4 For HP Pavillion 5");
		System.out.println("Enter 5 For HP Core i3 ");
		System.out.println("Enter 6 For HP Omen Ryzen 7");
		Scanner sj = new Scanner(System.in);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("ENTER NUMBER : ");
		String e = sj.next();
		switch (e) {
		case "1":
			HP_15s n1 = new HP_15s("HP", "HP 15S ", 51890, "8GB/512GB", "Windows 11 OS", "AMD RYZEN 5");
			break;

		case "2":
			HP_Core_i7 n2 = new HP_Core_i7("HP", "HP Core i7 ", 82680, "16GB/512GB", "Windows 11 OS", "Intel Core-i7");
			break;

		case "3":
			HP_Athlon_dual n3 = new HP_Athlon_dual("HP", "HP Athlon Dual ", 29990, "8GB/512GB", "Windows 11 OS",
					"Athlon Dual core-i3");
			break;

		case "4":
			HP_Pavilion_5 n4 = new HP_Pavilion_5("HP", "HP Pavillion 5 ", 60990, "8GB/512GB", "Windows 11 OS",
					"AMD RYZEN 5");
			break;

		case "5":
			HP_Core_i3 n5 = new HP_Core_i3("HP", "HP Core i3 ", 45990, "8GB/512GB", "Windows 11 OS", "Intel Core-i3");
			break;

		case "6":
			HP_OMEN_Ryzen_7 n6 = new HP_OMEN_Ryzen_7("HP", "HP Omen Ryzen 7 ", 112490, "16GB/1TB", "Windows 11 OS",
					"OCTA CORE AMD i7");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");

			HPLaptop();
			break;
		}

	}

}

//Hierarchical Inheritance (Sub-class of Laptop class)
class Asus extends Laptop {

	public void AsusLaptop() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                           Welcome to  Asus ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(" ");
		System.out.println("!!!!...Select Your Favourite Asus Laptop...!!!!");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Enter 1 For Asus X54 i3");
		System.out.println("Enter 2 For Asus ZenBook i3");

		System.out.println("Enter 3 For Asus X54 i5");
		System.out.println("Enter 6 For Asus Rog i7");
		System.out.println("Enter 6 For VivoBook S14");
		Scanner sj = new Scanner(System.in);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("ENTER NUMBER : ");

		String e = sj.next();
		switch (e) {
		case "1":
			Asus_X54_i3 e1 = new Asus_X54_i3("Asus", "Asus X54 ", 32490, "8GB/512GB", "Windows 10 OS", "Intel Core-i3");
			break;

		case "2":
			Asus_ZenBook_13 e2 = new Asus_ZenBook_13("Asus", "Asus ZenBook ", 67990, "8GB/512GB", "Windows 11 OS",
					"Intel Core-i5");
			break;

		case "3":
			Asus_X54_i5 e3 = new Asus_X54_i5("Asus", "Asus X54  ", 84990, "8GB/512GB", "Windows 11 OS",
					"Intel Core-i5");
			break;

		case "4":
			Asus_Rog_i7 e4 = new Asus_Rog_i7("Asus", "Asus Rog  ", 10390, "16GB/1TB", "Windows 11 OS", "Intel Core-i7");
			break;

		case "5":
			Asus_VivoBook_S14 e5 = new Asus_VivoBook_S14("Asus", "Asus VivoBook S14 ", 74990, "16GB/512GB",
					"Windows 11 OS", "Intel Core-i5");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");

			AsusLaptop();
			break;
		}

	}
}

//Hierarchical Inheritance (Sub-class of Laptop class)
class Dell extends Laptop {
	public void DellLaptop() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                           Welcome to  DELL ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(" ");
		System.out.println("!!!!...Select Your Favourite DELL Laptop...!!!!");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter 1 For Dell Lattitude Core i7");
		System.out.println("Enter 2 For Dell Vostro Core i7");
		System.out.println("Enter 3 For Dell Vostro 15");
		System.out.println("Enter 4 For Dell Inspiration 14");
		System.out.println("Enter 5 For Dell Inspiration 13");
		Scanner sj = new Scanner(System.in);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("ENTER NUMBER : ");
		String e = sj.next();

		switch (e) {
		case "1":
			Lattitude_Core_i7 n1 = new Lattitude_Core_i7("Dell", "Dell Lattitude  ", 165014, "16GB/512 GB ",
					"Windows 11 OS", "Intel Core-i7");
			break;

		case "2":
			Vostro_Core_i7 n2 = new Vostro_Core_i7("Dell", "Dell Vostro ", 85490, "8GB/512 GB ", "Windows 11 OS",
					"Intel Core-i5");
			break;

		case "3":
			Vostro_15 n3 = new Vostro_15("Dell", "Dell Vostro 15 ", 103994, "16GB/512 GB ", "Windows 11 OS",
					"Intel Core-i5");
			break;

		case "4":
			Inspiron_14 n4 = new Inspiron_14("Dell", " Dell Inspiration 14", 100457, "16GB/512 GB ", "Windows 11 OS",
					"Intel Core-i5");
			break;

		case "5":
			Inspiron_13 n5 = new Inspiron_13("Dell", " Dell Inspiration 13", 96967, "16GB/512 GB ", "Windows 11 OS",
					"Intel Core-i5");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");

			DellLaptop();
			break;

		}

	}
}

//Hierarchical Inheritance (Sub-class of Laptop class)
class Lenovo extends Laptop {

	public void LenovoLaptop() {

		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                           Welcome to  Lenovo");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(" ");
		System.out.println("!!!!...Select Your Favourite Lenovo Laptop...!!!!");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter 1 For Lenovo Ideapad Slim 1");
		System.out.println("Enter 2 For Lenovo Ideapad slim 3");
		System.out.println("Enter 3 For Lenovo Gaming 3");

		Scanner sj = new Scanner(System.in);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("ENTER NUMBER : ");

		String e = sj.next();

		switch (e) {
		case "1":
			Lenovo_IdeaPad_Slim_1 n1 = new Lenovo_IdeaPad_Slim_1("Lenovo", "Lenovo IdeaPad Slim 1", 34749,
					"8GB/512 GB SSD", "Windows 11 OS", "Hexa Core");
			break;

		case "2":
			Lenovo_IdeaPad_Slim_3 n2 = new Lenovo_IdeaPad_Slim_3("Lenovo", "Lenovo Ideapad slim 3", 38000,
					"8GB/512 GB SSD", "Windows 11 OS", "Intel core i3");
			break;

		case "3":
			Lenovo_IdeaPad_Gaming3_ n3 = new Lenovo_IdeaPad_Gaming3_("Lenovo", "Lenovo Gaming 3", 65000,
					"8GB/512 GB SSD", "Windows 11 OS", "Intel core i5");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");

			LenovoLaptop();
		}

	}
}


//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                              CONSTRUCTORS OF MOBILE CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

//Hierarchical Inheritance (Sub-class of One_plus class)
class Oneplus_Nord extends one_plus {

	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Oneplus Nord ");
	}
	public Oneplus_Nord(String Brand, String Name, double Price, String Storage, String Camera, String Ram,
			String Battery) 
	
	{
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}
}

//Hierarchical Inheritance (Sub-class of One_plus class)

class Oneplus_Nord_2 extends one_plus {
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Oneplus  Nord 2");
	}
	Oneplus_Nord_2(String Brand, String Name, double Price, String Storage, String Camera, String Ram, String Battery)
	{
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}

}

//Hierarchical Inheritance (Sub-class of One_plus class)

class Oneplus_Nord_9 extends one_plus {
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Oneplus  Nord 9");
	}
	
	Oneplus_Nord_9(String Brand, String Name, double Price, String Storage, String Camera, String Ram, String Battery)
	
	{
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}

}

//Hierarchical Inheritance (Sub-class of One_plus class)

class OnePlus_Nord_9R extends one_plus {
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Oneplus Nord  9R");
	}
	
	OnePlus_Nord_9R(String Brand, String Name, double Price, String Storage, String Camera, String Ram,
			String Battery)

	{
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}

}

//Hierarchical Inheritance (Sub-class of Vivo class)

class vivo_v23 extends vivo {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Vivo V23 ");
	}
	
	vivo_v23(String Brand, String Name, double Price, String Storage, String Camera, String Ram, String Battery)
	{
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}

}

//Hierarchical Inheritance (Sub-class of Vivo class)

class vivo_x70 extends vivo {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Vivo x70 ");
	}
	
	vivo_x70(String Brand, String Name, double Price, String Storage, String Camera, String Ram, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}
}

//Hierarchical Inheritance (Sub-class of Vivo class)

class vivo_x70_pro extends vivo {
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Vivo x70 pro ");
	}
	
	vivo_x70_pro(String Brand, String Name, double Price, String Storage, String Camera, String Ram, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}
}

//Hierarchical Inheritance (Sub-class of Vivo class)

class vivo_Y75 extends vivo {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Vivo Y75 ");
	}
	
	vivo_Y75(String Brand, String Name, double Price, String Storage, String Camera, String Ram, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}
}

//Hierarchical Inheritance (Sub-class of Vivo class)

class vivo_Y21 extends vivo {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Vivo Y21 ");
	}
	
	vivo_Y21(String Brand, String Name, double Price, String Storage, String Camera, String Ram, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}
}

//Hierarchical Inheritance (Sub-class of realme class)

class realme_9 extends realme {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Realme 9 ");
	}
	
	realme_9(String Brand, String Name, double Price, String Storage, String Camera, String Ram, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}

}

//Hierarchical Inheritance (Sub-class of realme class)

class realme_9i extends realme {
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Realme 9i ");
	}
	realme_9i(String Brand, String Name, double Price, String Storage, String Camera, String Ram, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}

}

//Hierarchical Inheritance (Sub-class of realme class)

class realme_narzo_50 extends realme {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Realme Narzo 50 ");
	}
	realme_narzo_50(String Brand, String Name, double Price, String Storage, String Camera, String Ram,
			String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}

}

//Hierarchical Inheritance (Sub-class of realme class)

class realme_narzo_50Pro extends realme {

	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Realme Narzo 50 pro ");
	}
	realme_narzo_50Pro(String Brand, String Name, double Price, String Storage, String Camera, String Ram,
			String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}

}

//Hierarchical Inheritance (Sub-class of Iphone class)

class iphone_7 extends iphone {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Iphone 7 ");
	}
	iphone_7(String Brand, String Name, double Price, String Storage, String Camera, String os, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.os = os;
		this.Battery = Battery;
		Method6();

	}
}

//Hierarchical Inheritance (Sub-class of Iphone class)

class iphone_7Plus extends iphone {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Iphone 7 Plus ");
	}
	iphone_7Plus(String Brand, String Name, double Price, String Storage, String Camera, String os, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.os = os;
		this.Battery = Battery;
		Method6();

	}
}

//Hierarchical Inheritance (Sub-class of Iphone class)

class iphone_SE extends iphone {
	

	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Iphone SE ");
	}
	iphone_SE(String Brand, String Name, double Price, String Storage, String Camera, String os, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.os = os;
		this.Battery = Battery;
		Method6();

	}

}

//Hierarchical Inheritance (Sub-class of Iphone class)

class iphone_8 extends iphone {
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Iphone 8 ");
	}
	iphone_8(String Brand, String Name, double Price, String Storage, String Camera, String os, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.os = os;
		this.Battery = Battery;
		Method6();

	}
}

//Hierarchical Inheritance (Sub-class of Iphone class)

class iphone_X extends iphone {
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Iphone X ");
	}
	iphone_X(String Brand, String Name, double Price, String Storage, String Camera, String os, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.os = os;
		this.Battery = Battery;
		Method6();

	}

}

//Hierarchical Inheritance (Sub-class of Iphone class)

class iphone_Xr extends iphone {
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Iphone Xr ");
	}
	
	iphone_Xr(String Brand, String Name, double Price, String Storage, String Camera, String os, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.os = os;
		this.Battery = Battery;
		Method6();

	}
}

//Hierarchical Inheritance (Sub-class of Iphone class)

class iphone_11 extends iphone {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Iphone 11 ");
	}
	
	iphone_11(String Brand, String Name, double Price, String Storage, String Camera, String os, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.os = os;
		this.Battery = Battery;
		Method6();

	}
}

//Hierarchical Inheritance (Sub-class of Iphone class)

class iphone_11Pro extends iphone {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Iphone 11Pro ");
	}
	
	iphone_11Pro(String Brand, String Name, double Price, String Storage, String Camera, String os, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.os = os;
		this.Battery = Battery;
		Method6();

	}
}

//Hierarchical Inheritance (Sub-class of Iphone class)

class iphone_12 extends iphone {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Iphone 12 ");
	}
	
	iphone_12(String Brand, String Name, double Price, String Storage, String Camera, String os, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.os = os;
		this.Battery = Battery;
		Method6();

	}
}

//Hierarchical Inheritance (Sub-class of Iphone class)

class iphone_12Pro extends iphone {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Iphone 12Pro ");
	}
	
	iphone_12Pro(String Brand, String Name, double Price, String Storage, String Camera, String os, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.os = os;
		this.Battery = Battery;
		Method6();

	}
}

//Hierarchical Inheritance (Sub-class of Iphone class)

class iphone_12ProMax extends iphone {
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Iphone 12ProMax ");
	}
	
	iphone_12ProMax(String Brand, String Name, double Price, String Storage, String Camera, String os, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.os = os;
		this.Battery = Battery;
		Method6();

	}
}

//Hierarchical Inheritance (Sub-class of Iphone class)

class iphone_13 extends iphone {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Iphone 13 ");
	}
	
	iphone_13(String Brand, String Name, double Price, String Storage, String Camera, String os, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.os = os;
		this.Battery = Battery;
		Method6();

	}
}

//Hierarchical Inheritance (Sub-class of Iphone class)

class iphone_13Pro extends iphone {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Iphone 13 Pro ");
	}
	
	iphone_13Pro(String Brand, String Name, double Price, String Storage, String Camera, String os, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.os = os;
		this.Battery = Battery;
		Method6();

	}
}

//Hierarchical Inheritance (Sub-class of Iphone class)

class iphone_13ProMax extends iphone {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Iphone 13 pro Max ");
	}
	
	iphone_13ProMax(String Brand, String Name, double Price, String Storage, String Camera, String os, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.os = os;
		this.Battery = Battery;
		Method6();

	}
}

//Hierarchical Inheritance (Sub-class of Iphone class)

class iphone_14 extends iphone {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Iphone 14 ");
	}
	
	iphone_14(String Brand, String Name, double Price, String Storage, String Camera, String os, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.os = os;
		this.Battery = Battery;
		Method6();

	}
}

//Hierarchical Inheritance (Sub-class of Iphone class)

class iphone_14Pro extends iphone {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Iphone 14pro ");
	}
	
	iphone_14Pro(String Brand, String Name, double Price, String Storage, String Camera, String os, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.os = os;
		this.Battery = Battery;
		Method6();

	}
}

//Hierarchical Inheritance (Sub-class of Iphone class)

class iphone_14ProMax extends iphone {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Iphone 14 Pro Max ");
	}
	
	iphone_14ProMax(String Brand, String Name, double Price, String Storage, String Camera, String os, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.os = os;
		this.Battery = Battery;
		Method6();

	}
}

class oppo_find_x5_pro extends oppo {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting OPPO find X5 Pro ");
	}
	
	oppo_find_x5_pro(String Brand, String Name, double Price, String Storage, String Camera, String Ram,
			String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}

}

class oppo_Reno_8 extends oppo {
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting OPPO Reno 8 ");
	}
	
	oppo_Reno_8(String Brand, String Name, double Price, String Storage, String Camera, String Ram, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}
}

class oppo_Reno_8_Pro extends oppo {
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting OPPO  Reno 8 Pro ");
	}
	
	oppo_Reno_8_Pro(String Brand, String Name, double Price, String Storage, String Camera, String Ram,
			String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}
}

class oppo_F9 extends oppo {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting OPPO F9 ");
	}
	
	oppo_F9(String Brand, String Name, double Price, String Storage, String Camera, String Ram, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}
}

class oppo_F21 extends oppo {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting OPPO F21 ");
	}
	
	oppo_F21(String Brand, String Name, double Price, String Storage, String Camera, String Ram, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}
}

class oppo_F9_Pro extends oppo {
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting OPPO F9 Pro ");
	}
	
	oppo_F9_Pro(String Brand, String Name, double Price, String Storage, String Camera, String Ram, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}
}

class Redmi_K50 extends Mi {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Redmi K50 ");
	}
	
	Redmi_K50(String Brand, String Name, double Price, String Storage, String Camera, String Ram, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}

}

class mi_note_9 extends Mi {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Redmi Note 9 ");
	}
	
	mi_note_9(String Brand, String Name, double Price, String Storage, String Camera, String Ram, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}
}

class mi_note_11 extends Mi {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Redmi Note 11 ");
	}
	
	mi_note_11(String Brand, String Name, double Price, String Storage, String Camera, String Ram, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}
}

class mi_note_11Pro extends Mi {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Redmi Note 11 Pro ");
	}
	
	mi_note_11Pro(String Brand, String Name, double Price, String Storage, String Camera, String Ram, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}
}

class Mi_11x extends Mi {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Redmi 11x ");
	}
	
	Mi_11x(String Brand, String Name, double Price, String Storage, String Camera, String Ram, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}
}

class Xiomi_11 extends Mi {
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Redmi 11 ");
	}
	
	Xiomi_11(String Brand, String Name, double Price, String Storage, String Camera, String Ram, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}
}

class Xiomi_11i extends Mi {
	
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You are selecting Redmi 11i ");
	}
	
	Xiomi_11i(String Brand, String Name, double Price, String Storage, String Camera, String Ram, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.Camera = Camera;
		this.Ram = Ram;
		this.Battery = Battery;
		Method();

	}
}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                            CONSTRUCTORS OF LAPTOP CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class HP_15s extends HP {
	HP_15s(String Brand, String Name, double Price, String Storage, String operating_system, String Processor) {

		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.operating_system = operating_system;
		this.Processor = Processor;
		Method2();

	}

}

class HP_Core_i7 extends HP {
	HP_Core_i7(String Brand, String Name, double Price, String Storage, String operating_system, String Processor) {

		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.operating_system = operating_system;
		this.Processor = Processor;
		Method2();

	}

}

class HP_Athlon_dual extends HP {
	HP_Athlon_dual(String Brand, String Name, double Price, String Storage, String operating_system, String Processor) {

		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.operating_system = operating_system;
		this.Processor = Processor;
		Method2();

	}

}

class HP_Pavilion_5 extends HP {
	HP_Pavilion_5(String Brand, String Name, double Price, String Storage, String operating_system, String Processor) {

		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.operating_system = operating_system;
		this.Processor = Processor;
		Method2();

	}

}

class HP_Core_i3 extends HP {
	HP_Core_i3(String Brand, String Name, double Price, String Storage, String operating_system, String Processor) {

		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.operating_system = operating_system;
		this.Processor = Processor;
		Method2();

	}

}

class HP_OMEN_Ryzen_7 extends HP {
	HP_OMEN_Ryzen_7(String Brand, String Name, double Price, String Storage, String operating_system,
			String Processor) {

		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.operating_system = operating_system;
		this.Processor = Processor;
		Method2();

	}

}

class Lattitude_Core_i7 extends Dell {
	Lattitude_Core_i7(String Brand, String Name, double Price, String Storage, String operating_system,
			String Processor) {

		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.operating_system = operating_system;
		this.Processor = Processor;
		Method2();

	}

}

class Vostro_Core_i7 extends Dell {
	Vostro_Core_i7(String Brand, String Name, double Price, String Storage, String operating_system, String Processor) {

		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.operating_system = operating_system;
		this.Processor = Processor;
		Method2();

	}

}

class Latitude_Core_i5 extends Dell {
	Latitude_Core_i5(String Brand, String Name, double Price, String Storage, String operating_system,
			String Processor) {

		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.operating_system = operating_system;
		this.Processor = Processor;
		Method2();

	}

}

class Vostro_15 extends Dell {
	Vostro_15(String Brand, String Name, double Price, String Storage, String operating_system, String Processor) {

		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.operating_system = operating_system;
		this.Processor = Processor;
		Method2();

	}

}

class Inspiron_14 extends Dell {
	Inspiron_14(String Brand, String Name, double Price, String Storage, String operating_system, String Processor) {

		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.operating_system = operating_system;
		this.Processor = Processor;
		Method2();

	}

}

class Inspiron_13 extends Dell {
	Inspiron_13(String Brand, String Name, double Price, String Storage, String operating_system, String Processor) {

		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.operating_system = operating_system;
		this.Processor = Processor;
		Method2();

	}

}

class Asus_VivoBook_S4 extends Asus {
	Asus_VivoBook_S4(String Brand, String Name, double Price, String Storage, String operating_system,
			String Processor) {

		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.operating_system = operating_system;
		this.Processor = Processor;
		Method2();

	}

}

class Asus_X54_i3 extends Asus {
	Asus_X54_i3(String Brand, String Name, double Price, String Storage, String operating_system, String Processor) {

		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.operating_system = operating_system;
		this.Processor = Processor;
		Method2();

	}

}

class Asus_ZenBook_13 extends Asus {
	Asus_ZenBook_13(String Brand, String Name, double Price, String Storage, String operating_system,
			String Processor) {

		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.operating_system = operating_system;
		this.Processor = Processor;
		Method2();

	}

}

class Asus_ZenBook_14 extends Asus {
	Asus_ZenBook_14(String Brand, String Name, double Price, String Storage, String operating_system,
			String Processor) {

		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.operating_system = operating_system;
		this.Processor = Processor;
		Method2();

	}

}

class Asus_X54_i5 extends Asus {
	Asus_X54_i5(String Brand, String Name, double Price, String Storage, String operating_system, String Processor) {

		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.operating_system = operating_system;
		this.Processor = Processor;
		Method2();

	}

}

class Asus_Rog_i7 extends Asus {
	Asus_Rog_i7(String Brand, String Name, double Price, String Storage, String operating_system, String Processor) {

		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.operating_system = operating_system;
		this.Processor = Processor;
		Method2();

	}

}

class Asus_VivoBook_S14 extends Asus {
	Asus_VivoBook_S14(String Brand, String Name, double Price, String Storage, String operating_system,
			String Processor) {

		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.operating_system = operating_system;
		this.Processor = Processor;
		Method2();

	}
}

class Lenovo_IdeaPad_Slim_1 extends Lenovo {
	Lenovo_IdeaPad_Slim_1(String Brand, String Name, double Price, String Storage, String operating_system,
			String Processor) {

		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.operating_system = operating_system;
		this.Processor = Processor;
		Method2();

	}

}

class Lenovo_IdeaPad_Slim_3 extends Lenovo {
	Lenovo_IdeaPad_Slim_3(String Brand, String Name, double Price, String Storage, String operating_system,
			String Processor) {

		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.operating_system = operating_system;
		this.Processor = Processor;
		Method2();

	}

}

class Lenovo_IdeaPad_Gaming3_ extends Lenovo {
	Lenovo_IdeaPad_Gaming3_(String Brand, String Name, double Price, String Storage, String operating_system,
			String Processor) {

		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Storage = Storage;
		this.operating_system = operating_system;
		this.Processor = Processor;
		Method2();

	}

}


//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                            CONSTRUCTORS OF SMARTWATCH CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class Wave_neo extends boAt {

	Wave_neo(String Brand, String Name, String Model, double Price, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Battery = Battery;
		Method3();
	}

}

class Wave_Connect extends boAt {
	Wave_Connect(String Brand, String Name, String Model, double Price, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Battery = Battery;
		Method3();
	}

}

class Blaze extends boAt {

	Blaze(String Brand, String Name, String Model, double Price, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Battery = Battery;
		Method3();
	}

}

class Storm extends boAt {

	Storm(String Brand, String Name, String Model, double Price, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Battery = Battery;
		Method3();
	}
}

class Xtend extends boAt {
	Xtend(String Brand, String Name, String Model, double Price, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Battery = Battery;
		Method3();
	}
}

class Ninja_Pro_Max extends Fire_Boltt {
	Ninja_Pro_Max(String Brand, String Name, String Model, double Price, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Battery = Battery;
		Method3();
	}
}

class Invincible extends Fire_Boltt {
	Invincible(String Brand, String Name, String Model, double Price, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Battery = Battery;
		Method3();
	}

}

class Mercury extends Fire_Boltt {
	Mercury(String Brand, String Name, String Model, double Price, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Battery = Battery;
		Method3();
	}

}

class Talk extends Fire_Boltt {
	Talk(String Brand, String Name, String Model, double Price, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Battery = Battery;
		Method3();
	}

}

class Ring_3 extends Fire_Boltt {
	Ring_3(String Brand, String Name, String Model, double Price, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Battery = Battery;
		Method3();
	}

}

class Samsung_Watch4 extends Samsung {
	Samsung_Watch4(String Brand, String Name, String Model, double Price, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Battery = Battery;
		Method3();
	}

}

class Samsung_Watch4_Classic extends Samsung {
	Samsung_Watch4_Classic(String Brand, String Name, String Model, double Price, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Battery = Battery;
		Method3();
	}

}

class Samsung_Watch3 extends Samsung {
	Samsung_Watch3(String Brand, String Name, String Model, double Price, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Battery = Battery;
		Method3();
	}

}

class Samsung_Watch5 extends Samsung {
	Samsung_Watch5(String Brand, String Name, String Model, double Price, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Battery = Battery;
		Method3();
	}

}

class Colorfit_Icon_Buzz extends Noise {
	Colorfit_Icon_Buzz(String Brand, String Name, String Model, double Price, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Battery = Battery;
		Method3();
	}

}

class ColorfitPlus_Go_Buzz extends Noise {
	ColorfitPlus_Go_Buzz(String Brand, String Name, String Model, double Price, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Battery = Battery;
		Method3();
	}

}

class ColorFit_Pro4 extends Noise {
	ColorFit_Pro4(String Brand, String Name, String Model, double Price, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Battery = Battery;
		Method3();
	}
}

class ColorFit_Icon2 extends Noise {
	ColorFit_Icon2(String Brand, String Name, String Model, double Price, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Battery = Battery;
		Method3();
	}
}

class iwatch_Series_6 extends Apple_Watch {
	iwatch_Series_6(String Brand, String Name, String Model, double Price, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Battery = Battery;
		Method3();
	}
}

class iwatch_SE extends Apple_Watch {
	iwatch_SE(String Brand, String Name, String Model, double Price, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Battery = Battery;
		Method3();
	}
}

class iwatch_Series_4 extends Apple_Watch {
	iwatch_Series_4(String Brand, String Name, String Model, double Price, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Battery = Battery;
		Method3();
	}
}

class iwatch_Series_7 extends Apple_Watch {
	iwatch_Series_7(String Brand, String Name, String Model, double Price, String Battery) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Battery = Battery;
		Method3();
	}
}

class iwatch_Series_8 extends Apple_Watch {
	iwatch_Series_8(String Brand, String Name, String Model, double Price, String Battery) {

		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Battery = Battery;
		Method3();

	}
}

class iwatch_Series_5 extends Apple_Watch {
	iwatch_Series_5(String Brand, String Name, String Model, double Price, String Battery) {

		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Battery = Battery;
		Method3();

	}

}

class JBL_Tune_230 extends JBL {
	JBL_Tune_230(String Brand, String Name, String Model, double Price, String Battery, String Connectivity,
			String Microphone) {
		this.Brand = Brand;
		this.Name = Name;
		this.Model = Model;
		this.Price = Price;
		this.Battery = Battery;
		this.Connectivity = Connectivity;
		this.Microphone = Microphone;
		Method3();

	}

}

class JBL_Black_Wireless extends JBL {
	JBL_Black_Wireless(String Brand, String Name, String Model, double Price, String Battery, String Connectivity,
			String Microphone) {
		this.Brand = Brand;
		this.Name = Name;
		this.Model = Model;
		this.Price = Price;
		this.Battery = Battery;
		this.Connectivity = Connectivity;
		this.Microphone = Microphone;
		Method3();

	}

}

class JBL_Tune_760 extends JBL {
	JBL_Tune_760(String Brand, String Name, String Model, double Price, String Battery, String Connectivity,
			String Microphone) {
		this.Brand = Brand;
		this.Name = Name;
		this.Model = Model;
		this.Price = Price;
		this.Battery = Battery;
		this.Connectivity = Connectivity;
		this.Microphone = Microphone;
		Method3();

	}

}

class JBL_T500Bt extends JBL {
	JBL_T500Bt(String Brand, String Name, String Model, double Price, String Battery, String Connectivity,
			String Microphone) {
		this.Brand = Brand;
		this.Name = Name;
		this.Model = Model;
		this.Price = Price;
		this.Battery = Battery;
		this.Connectivity = Connectivity;
		this.Microphone = Microphone;
		Method3();

	}

}

class Mivi_2o extends Mivi {
	Mivi_2o(String Brand, String Name, String Model, double Price, String Battery, String Connectivity,
			String Microphone) {
		this.Brand = Brand;
		this.Name = Name;
		this.Model = Model;
		this.Price = Price;
		this.Battery = Battery;
		this.Connectivity = Connectivity;
		this.Microphone = Microphone;
		Method3();

	}

}

class Mivi_Duopod_A25 extends Mivi {
	Mivi_Duopod_A25(String Brand, String Name, String Model, double Price, String Battery, String Connectivity,
			String Microphone) {
		this.Brand = Brand;
		this.Name = Name;
		this.Model = Model;
		this.Price = Price;
		this.Battery = Battery;
		this.Connectivity = Connectivity;
		this.Microphone = Microphone;
		Method3();

	}

}

class Mivi_collar_flash extends Mivi {
	Mivi_collar_flash(String Brand, String Name, String Model, double Price, String Battery, String Connectivity,
			String Microphone) {
		this.Brand = Brand;
		this.Name = Name;
		this.Model = Model;
		this.Price = Price;
		this.Battery = Battery;
		this.Connectivity = Connectivity;
		this.Microphone = Microphone;
		Method3();

	}

}

class Mivi_Duopod_F30 extends Mivi {
	Mivi_Duopod_F30(String Brand, String Name, String Model, double Price, String Battery, String Connectivity,
			String Microphone) {
		this.Brand = Brand;
		this.Name = Name;
		this.Model = Model;
		this.Price = Price;
		this.Battery = Battery;
		this.Connectivity = Connectivity;
		this.Microphone = Microphone;
		Method3();

	}

}

class Hammer_KO_2 extends Hammer {
	Hammer_KO_2(String Brand, String Name, String Model, double Price, String Battery, String Connectivity,
			String Microphone) {
		this.Brand = Brand;
		this.Name = Name;
		this.Model = Model;
		this.Price = Price;
		this.Battery = Battery;
		this.Connectivity = Connectivity;
		this.Microphone = Microphone;
		Method3();

	}

}

class Hammer_sting_3 extends Hammer {
	Hammer_sting_3(String Brand, String Name, String Model, double Price, String Battery, String Connectivity,
			String Microphone) {
		this.Brand = Brand;
		this.Name = Name;
		this.Model = Model;
		this.Price = Price;
		this.Battery = Battery;
		this.Connectivity = Connectivity;
		this.Microphone = Microphone;
		Method3();

	}

}

class Hammer_solid_Airflow_2 extends Hammer {
	Hammer_solid_Airflow_2(String Brand, String Name, String Model, double Price, String Battery, String Connectivity,
			String Microphone) {
		this.Brand = Brand;
		this.Name = Name;
		this.Model = Model;
		this.Price = Price;
		this.Battery = Battery;
		this.Connectivity = Connectivity;
		this.Microphone = Microphone;
		Method3();

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                         Sports and Fitness Equipment Shop CLASS (SUB-CLASS 0F JMART)
//
//
//______________________________________________________________________________________________________________________________________________________________________________________



class Sports_Gym extends Jmart {

	public String Brand;
	public String Color;
	public String Material;
	public String Product_Type;
	public String Quantity;

	public void Sports_Gym() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println(
				"                                                                     Sports and Fitness Equipment Shop                                                                    ");
		System.out.println(
				"===============================================================================================================================================================================================================================================");
		System.out.println("Press 1 For Sports Equipment");
		System.out.println("Press 2 For Fitness Equipment & Accessories");
		System.out.println(" ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number : ");

		Scanner sk = new Scanner(System.in);

		String c2 = sk.next();
		switch (c2) {
		case "1":
			(new Sports_Equipment()).Sports_Equipment();
			break;

		case "2":
			(new Fitness_Equipments()).Fitness_Equipments();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**********************************************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"**************************************************************************************************************************************************************************************************************************************");

			Sports_Gym();
			break;
		}

		choose();
	}

	public void choose() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                       Choose                                                           ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println("Enter 1 For Confirm Order");
		System.out.println("Enter 2 For Main menu ");
		System.out.println("Enter 3 For Sports & Fitness Equipment Menu ");
		System.out.println("Enter 4 For Cancellation ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		;
		Scanner sk = new Scanner(System.in);
		buy b1 = new buy();
		String c1 = sk.next();
		switch (c1) {
		case "1":
			b1.buy();
			break;

		case "2":
			Jmart();
			break;

		case "3":
			Sports_Gym();
			break;

		case "4":
			Cancel();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			choose();

		}

	}

	void method_7()

	{
		System.out.println("");

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Brand : " + Brand);
		System.out.println("Name : " + Name);
		System.out.println("Price : " + Price + " Ruppes");
		System.out.println("Color : " + Color);
		System.out.println("Quantity : " + Quantity);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("");

	}

}


//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                            Fitness_Equipments CLASS 
//
//
//______________________________________________________________________________________________________________________________________________________________________________________



class Fitness_Equipments extends Sports_Gym {
	public void Fitness_Equipments() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                       Select Your Favourite Fitness Equipment                                                                  ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For Cosco Push Up Bar - Profile");// 1080 //Grey //platic
		System.out.println("Enter 2 For Vector X Black Broad Exercise Wheel");// 990 Grey
		System.out.println("Enter 3 For Vector X Black and Green Hoola Hoop");// 699 Green and black
		System.out.println("Enter 4 For HSCo Electronic Table Top Weighing Scale");// 4999 Silver
		System.out.println("Enter 5 For Cosco Push Up Bar ");// 870 Grey
		System.out.println("Enter 6 For Cosco Resistance Tube");// 400 Grey
		System.out.println("Enter 7 For  OJS Yoga mat with carry strap for men women Gym Workout and Yoga Exercise"); // 999
																														// Grey
		System.out.println(
				"Enter 8 For Prospo Heavy Punching Bag for Men, boxing Stand with Camouflage Kit and Steel Hanging,Boxing Kit.");// 4999
																																	// Black
		System.out.println("Enter 9 For Vector X Black Nylon Skipping Rope ");// 160 black
		System.out.println(
				"Enter 10 For Prospo MMA Set,Boxing Set for Kids, Boxing Set for Men, Punching Bag,Boxing Set for Youth");// 5999
																															// Black
																															// and
																															// red
		System.out.println("Enter 11 For Vector X Violet Polyvinyl Chloride Dumbbell 1 kg ");// 3200 red
		System.out.println("Enter 12 For BOLDFIT Hand Grip Band For Gym Strengthener Hand Gripper Men  ");// 499
		System.out.println("Enter 13 For Vector X Black and White Hand Grip  ");// 199 Black
		System.out.println("Enter 14 For Prospo Multicolor Knee Support ");// 399
		System.out.println("Enter 15 For Prospo Black Mexican Stretch Hand Wraps  ");// 399 Black
		System.out.println("Enter 16 For BEACON INTERNATIONAL 8 KG ADJUSTABLE DUMBBELL SET , GYM AND FITNESS KIT  ");// 2299
																														// Black
		System.out.println("Enter 17 For BOLDFIT Stainless Steel Water Bottle 800 ml  "); // 1499 Black
		System.out.println("Enter 18 For DIABLO Black and Silver Alloy Steel Hexagonal Dumbbell 4 kg  ");// 3199 black
		System.out.println("Enter 19 For Prospo Multicolor Dumbells 3 kg ,Pack of 2  ");// 6899
		System.out.println("Enter 20 For Vector X Multicolor Aerobic Stepper  ");// 2722 Blue

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			cosco_pushUp c2 = new cosco_pushUp("Cosco", "Cosco Push Up Bar - Profile", 1080, "Grey", "1 nos");
			break;

		case "2":
			Vector_Wheel c3 = new Vector_Wheel("Vector X", "Vector X Black Broad Exercise Wheel", 990, "Grey", "2 pc");
			break;

		case "3":
			Vector_Black c4 = new Vector_Black("Vector X", "Vector X Black and Green Hoola Hoop", 699, "Grey", "1 pc");
			break;

		case "4":
			Hsco_Weighing c5 = new Hsco_Weighing("HSCo", "HSCo Electronic Table Top Weighing Scale", 870, "Grey",
					"1 nos");
			break;

		case "5":
			cosco_pushUp c6 = new cosco_pushUp("Cosco", "Cosco Push Up Bar - Profile ", 870, "Grey", "1 nos");
			break;

		case "6":
			cosco_tube c7 = new cosco_tube("Cosco", "Cosco Resistance Tube", 400, "Grey", "1 pc");
			break;

		case "7":
			OJS_Mat c8 = new OJS_Mat("OJS", "OJS Yoga mat with carry strap for men women Gym Workout and Yoga Exercise",
					999, "Grey", "1 nos");
			break;

		case "8":
			Prospo_Heavy c9 = new Prospo_Heavy("Prospo",
					"Prospo Heavy Punching Bag for Men, boxing Stand with Camouflage Kit and Steel Hanging,Boxing Kit.",
					4999, "Black", "1 nos");
			break;

		case "9":
			Vector_Rope c10 = new Vector_Rope("Vector X", "Vector X Black Nylon Skipping Rope", 160, "black", "1 pc");
			break;

		case "10":
			Prospo_Yuth c11 = new Prospo_Yuth("Prospo",
					"Prospo MMA Set,Boxing Set for Kids, Boxing Set for Men, Punching Bag,Boxing Set for Youth", 5999,
					"Black & red ", "1  nos");
			break;

		case "11":
			Vector_Dumbbell c12 = new Vector_Dumbbell("Vector", "Vector X Violet Polyvinyl Chloride Dumbbell 1 kg",
					3200, "Red", "2 nos");
			break;

		case "12":
			BOLDF_grip c13 = new BOLDF_grip("BOLDFIT", "BOLDFIT Hand Grip Band For Gym Strengthener Hand Gripper Men ",
					499, "Grey", "1 pc");
			break;

		case "13":
			Vector_Grip c14 = new Vector_Grip("Vector X", "Vector X Black and White Hand Grip ", 199, "Black", "1 nos");
			break;

		case "14":
			Prospo_knee c15 = new Prospo_knee("Prospo", "Prospo Multicolor Knee Support ", 199, "Multicolor", "2 pc");
			break;

		case "15":
			Prospo_Wraps c16 = new Prospo_Wraps("Prospo", "Prospo Black Mexican Stretch Hand Wraps ", 399, "Black",
					"1 nos");
			break;

		case "16":
			BEACON_Kit c17 = new BEACON_Kit("BEACON",
					"BEACON INTERNATIONAL 8 KG ADJUSTABLE DUMBBELL SET , GYM AND FITNESS KIT", 2999, "Black", "1 nos");
			break;

		case "17":
			BOLDFIT_bottle c18 = new BOLDFIT_bottle("BOLDFIT", "BOLDFIT Stainless Steel Water Bottle 800 ml ", 1499,
					"black", "1 pc");
			break;

		case "18":
			DIABLO_Dumbbell c19 = new DIABLO_Dumbbell("DIABLO",
					"DIABLO Black and Silver Alloy Steel Hexagonal Dumbbell 4 kg", 3199, "Black & red ", "1  nos");
			break;

		case "19":
			Prospo_Dumbells c20 = new Prospo_Dumbells("Prospo", "Prospo Multicolor Dumbells 3 kg", 6899, "Red",
					"2 nos");
			break;

		case "20":
			Vector_aerobic c21 = new Vector_aerobic("Vector X", "Vector X Multicolor Aerobic Stepper  ", 2722, "Blue",
					"1 pc");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Fitness_Equipments();
			break;

		}

	}

}



//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                          CONSTRUCTORS OF Fitness Equipment CLASS 
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class cosco_pushUp extends Fitness_Equipments {
	cosco_pushUp(String Brand, String Name, double Price, String Color, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Quantity = Quantity;
		method_7();

	}

}

class Vector_Wheel extends Fitness_Equipments {
	Vector_Wheel(String Brand, String Name, double Price, String Color, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Quantity = Quantity;
		method_7();

	}

}

class Vector_Black extends Fitness_Equipments {
	Vector_Black(String Brand, String Name, double Price, String Color, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Quantity = Quantity;
		method_7();

	}

}

class cosco_tube extends Fitness_Equipments {
	cosco_tube(String Brand, String Name, double Price, String Color, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Quantity = Quantity;
		method_7();

	}

}

class Hsco_Weighing extends Fitness_Equipments {
	Hsco_Weighing(String Brand, String Name, double Price, String Color, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Quantity = Quantity;
		method_7();

	}

}

class OJS_Mat extends Fitness_Equipments {
	OJS_Mat(String Brand, String Name, double Price, String Color, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Quantity = Quantity;
		method_7();

	}

}

class Prospo_Heavy extends Fitness_Equipments {
	Prospo_Heavy(String Brand, String Name, double Price, String Color, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Quantity = Quantity;
		method_7();

	}

}

class Vector_Rope extends Fitness_Equipments {
	Vector_Rope(String Brand, String Name, double Price, String Color, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Quantity = Quantity;
		method_7();

	}

}

class Prospo_Yuth extends Fitness_Equipments {
	Prospo_Yuth(String Brand, String Name, double Price, String Color, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Quantity = Quantity;
		method_7();

	}

}

class Vector_Dumbbell extends Fitness_Equipments {
	Vector_Dumbbell(String Brand, String Name, double Price, String Color, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Quantity = Quantity;
		method_7();

	}

}

class BOLDF_grip extends Fitness_Equipments {
	BOLDF_grip(String Brand, String Name, double Price, String Color, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Quantity = Quantity;
		method_7();

	}

}

class Vector_Grip extends Fitness_Equipments {
	Vector_Grip(String Brand, String Name, double Price, String Color, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Quantity = Quantity;
		method_7();

	}

}

class Prospo_knee extends Fitness_Equipments {
	Prospo_knee(String Brand, String Name, double Price, String Color, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Quantity = Quantity;
		method_7();

	}

}

class Prospo_Wraps extends Fitness_Equipments {
	Prospo_Wraps(String Brand, String Name, double Price, String Color, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Quantity = Quantity;
		method_7();

	}

}

class BEACON_Kit extends Fitness_Equipments {
	BEACON_Kit(String Brand, String Name, double Price, String Color, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Quantity = Quantity;
		method_7();

	}

}

class BOLDFIT_bottle extends Fitness_Equipments {
	BOLDFIT_bottle(String Brand, String Name, double Price, String Color, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Quantity = Quantity;
		method_7();

	}

}

class DIABLO_Dumbbell extends Fitness_Equipments {
	DIABLO_Dumbbell(String Brand, String Name, double Price, String Color, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Quantity = Quantity;
		method_7();

	}

}

class Prospo_Dumbells extends Fitness_Equipments {
	Prospo_Dumbells(String Brand, String Name, double Price, String Color, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Quantity = Quantity;
		method_7();

	}

}

class Vector_aerobic extends Fitness_Equipments {
	Vector_aerobic(String Brand, String Name, double Price, String Color, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Quantity = Quantity;
		method_7();

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                       SPORTS CLASS 
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class Sports_Equipment extends Sports_Gym {

	public void Sports_Equipment() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For Cricket");
		System.out.println("Enter 2 For Badminton");
		System.out.println("Enter 3 For Volleyball");
		System.out.println("Enter 4 For Football  ");

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			(new Cricket()).Cricket();
			break;

		case "2":
			(new Badminton()).Badminton();
			break;

		case "3":
			(new Volleyball()).Volleyball();
			break;

		case "4":
			(new Football()).Football();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Sports_Equipment();
			break;

		}

	}

}


//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                     CRICKET CLASS SUB-CLASS OF SPORTS CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Cricket extends Sports_Equipment {

	public void Cricket() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For ABSO SUPER Plain Tennis Cricket Bat Long Handle full Size");// 999 Bat
		System.out.println("Enter 2 For Jaspo Green Natural Rubber Synthetic Cricket Tennis Balls ");// 599 ball
		System.out.println("Enter 3 For  Cricket kit ");// 2199 Kit
		System.out.println("Enter 4 For Jaspo Red Cricket Reaction Ball For Training");// 399 Ball
		System.out.println("Enter 5 For CW Boundary Cricket Kit Leather Ball Sports Backpack Bag ");// 3149 Cricket Kit
		System.out.println("Enter 6 For Jaspo Multicolor T 20 Soft Cricket Balls ");// 499 3 balls
		System.out.println("Enter 7 For ABSO kashmiri willow Leather Cricket Bat ");// 2199 bat
		System.out.println("Enter 8 For  Jaspo Red Cricket Soft Ball  ");// 899 ball
		System.out.println("Enter 9 For RMAX Yellow Plastic Cricket Stumps Set");// 399 Stumps
		System.out.println("Enter 10 For RMAX Red Wood, Leather Cricket Ball for Practice ");// 750 Ball

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			ABSO_c c2 = new ABSO_c("ABSO ", "ABSO SUPER Plain Tennis Cricket Bat Long Handle full Size", 999, "Bat",
					"1 nos");
			break;

		case "2":
			Jaspo_ball c3 = new Jaspo_ball("Jaspo", "Jaspo Green Natural Rubber Synthetic Cricket Tennis Balls", 599,
					"Ball", "3 pc");
			break;

		case "3":
			ABSO_kit c4 = new ABSO_kit("ABSO", " ABSO Cricket kit", 2199, "Cricket Kit", "1 pc");
			break;

		case "4":
			Jaspo_b c5 = new Jaspo_b("Jaspo", "Jaspo Red Cricket Reaction Ball For Training", 399, "Ball", "1 nos");
			break;

		case "5":
			CW_k c6 = new CW_k("CW", "CW Boundary Cricket Kit Leather Ball Sports Backpack Bag", 3149, "Cricket Kit",
					"1 nos");
			break;

		case "6":
			Jaspo_ball c7 = new Jaspo_ball("Jaspo", "Jaspo Multicolor T 20 Soft Cricket Balls", 499, "Ball", "3 pc");
			break;

		case "7":
			ABSO_cr c8 = new ABSO_cr("ABSO", "ABSO kashmiri willow Leather Cricket Bat", 2199, "Cricket Bat", "1 nos");
			break;

		case "8":
			Jaspo_ball c9 = new Jaspo_ball("Jaspo", "Jaspo Red Cricket Soft Ball", 499, "ball", "3 nos");
			break;

		case "9":
			RMAX_Stumps c10 = new RMAX_Stumps("RMAX", "RMAX Yellow Plastic Cricket Stumps Set", 399, "Stumps Set",
					"1 pc");
			break;

		case "10":
			RMAX_ball c11 = new RMAX_ball("RMAX", "RMAX Red Wood, Leather Cricket Ball for Practice ", 750,
					"Leather Cricket Ball ", "1  nos");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Cricket();
			break;

		}

	}

	void method_8()

	{
		System.out.println("");

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Brand : " + Brand);
		System.out.println("Name : " + Name);
		System.out.println("Price : " + Price + " Ruppes");
		System.out.println("Product_Type :" + Product_Type);
		System.out.println("Quantity : " + Quantity);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("");

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                 CONSTRUCTORS OF CRICKET CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class ABSO_c extends Cricket {
	ABSO_c(String Brand, String Name, double Price, String Product_Type, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Product_Type = Product_Type;
		this.Quantity = Quantity;
		method_8();

	}

}

class Jaspo_ball extends Cricket {
	Jaspo_ball(String Brand, String Name, double Price, String Product_Type, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Product_Type = Product_Type;
		this.Quantity = Quantity;
		method_8();

	}

}

class ABSO_kit extends Cricket {
	ABSO_kit(String Brand, String Name, double Price, String Product_Type, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Product_Type = Product_Type;
		this.Quantity = Quantity;
		method_8();

	}

}

class Jaspo_b extends Cricket {
	Jaspo_b(String Brand, String Name, double Price, String Product_Type, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Product_Type = Product_Type;
		this.Quantity = Quantity;
		method_8();

	}

}

class CW_k extends Cricket {
	CW_k(String Brand, String Name, double Price, String Product_Type, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Product_Type = Product_Type;
		this.Quantity = Quantity;
		method_8();

	}

}

class ABSO_cr extends Cricket {
	ABSO_cr(String Brand, String Name, double Price, String Product_Type, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Product_Type = Product_Type;
		this.Quantity = Quantity;
		method_8();

	}

}

class RMAX_Stumps extends Cricket {
	RMAX_Stumps(String Brand, String Name, double Price, String Product_Type, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Product_Type = Product_Type;
		this.Quantity = Quantity;
		method_8();

	}

}

class RMAX_ball extends Cricket {
	RMAX_ball(String Brand, String Name, double Price, String Product_Type, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Product_Type = Product_Type;
		this.Quantity = Quantity;
		method_8();

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                BADMINTON CLASS 
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Badminton extends Sports_Equipment {

	public void Badminton() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For Jaspo Black Style Badminton Set");// 699 Badminton set Black
		System.out.println("Enter 2 For Jaspo Green Pursuit Plastic Shuttlecock ");// 699 Shuttlecock 6 yellow
		System.out.println("Enter 3 For Jaspo Multicolor Badminton Combo Set  ");// 999 Kit Multicolor
		System.out.println("Enter 4 For Jaspo Yellow Pro Tech 300 Nylon Shuttle Cork ,pack Of 6");// 399 Shuttle Cork
																									// yellow
		System.out.println("Enter 5 For Jaspo White Gta 100 Feather Shuttlecocks ");// 389 Shuttlecocks ,pack Of 5 white
		System.out.println("Enter 6 For whackk Whizz Black Green Running Bag");// 1999 black bag 1
		System.out.println("Enter 7 For Vector X Multicolor Aluminum Badminton Racquet");// 999 Bdaminton racket white

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			Jaspo_set c2 = new Jaspo_set("Jaspo ", "Jaspo Black Style Badminton Set", 699, "Badminton Set", "1 nos",
					"Black");
			break;

		case "2":
			Jaspo_Shuttlecock c3 = new Jaspo_Shuttlecock("Jaspo", "Jaspo Green Pursuit Plastic Shuttlecock", 699,
					"Shuttlecock", "6 pc", "Yellow");
			break;

		case "3":
			Jaspo_Kit c4 = new Jaspo_Kit("ABSO", "Jaspo Multicolor Badminton Combo Set ", 999, "Badminton Set", "1 pc",
					"Multicolor");
			break;

		case "4":
			Jaspo_Shuttlecock c5 = new Jaspo_Shuttlecock("Jaspo", "Jaspo Yellow Pro Tech 300 Nylon Shuttle Cork ", 999,
					"Shuttle Cork", "pack Of 6", "Multicolor");
			break;

		case "5":
			Jaspo_Sh c6 = new Jaspo_Sh("Jaspo", "Jaspo White Gta 100 Feather Shuttlecocks ", 1999, "Shuttlecocks",
					"Pack of 5", "White");
			break;

		case "6":
			whackk_Bag c7 = new whackk_Bag("whackk Whizz", "whackk Whizz Black Green Running Bag", 199, "Bag", "1 pc",
					"Black");
			break;

		case "7":
			Vector_ra c8 = new Vector_ra("Vector X", "Vector X Multicolor Aluminum Badminton Racquet", 999,
					"Badminton Racquet", "1 nos", "White");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Badminton();
			break;

		}

	}

	void method_9()

	{
		System.out.println("");

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Brand : " + Brand);
		System.out.println("Name : " + Name);
		System.out.println("Price : " + Price + " Ruppes");
		System.out.println("Product_Type : " + Product_Type);
		System.out.println("Quantity : " + Quantity);
		System.out.println("Color : " + Color);

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("");

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                              CONSTRUCTORS OF BADMINTON CLASS 
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Jaspo_set extends Badminton {
	Jaspo_set(String Brand, String Name, double Price, String Product_Type, String Quantity, String Color) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Product_Type = Product_Type;
		this.Quantity = Quantity;
		this.Color = Color;
		method_9();

	}

}

class Jaspo_Shuttlecock extends Badminton {
	Jaspo_Shuttlecock(String Brand, String Name, double Price, String Product_Type, String Quantity, String Color) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Product_Type = Product_Type;
		this.Quantity = Quantity;
		this.Color = Color;
		method_9();

	}

}

class Jaspo_Kit extends Badminton {
	Jaspo_Kit(String Brand, String Name, double Price, String Product_Type, String Quantity, String Color) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Product_Type = Product_Type;
		this.Quantity = Quantity;
		this.Color = Color;
		method_9();

	}

}

class Jaspo_Sh extends Badminton {
	Jaspo_Sh(String Brand, String Name, double Price, String Product_Type, String Quantity, String Color) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Product_Type = Product_Type;
		this.Quantity = Quantity;
		this.Color = Color;
		method_9();

	}

}

class whackk_Bag extends Badminton {
	whackk_Bag(String Brand, String Name, double Price, String Product_Type, String Quantity, String Color) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Product_Type = Product_Type;
		this.Quantity = Quantity;
		this.Color = Color;
		method_9();

	}

}

class Vector_ra extends Badminton {
	Vector_ra(String Brand, String Name, double Price, String Product_Type, String Quantity, String Color) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Product_Type = Product_Type;
		this.Quantity = Quantity;
		this.Color = Color;
		method_9();

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                            VOLLEYBALL CLASS 
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Volleyball extends Sports_Equipment {

	public void Volleyball() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For Life Hub PU Smash Volleyball ");// 999 volleyball
		System.out.println("Enter 2 For Vector X Speed PVC Hand Stitched 18 Panel Volleyball ");// 630 Shuttlecock 6
																								// yellow
		System.out.println("Enter 3 For CHROMOTO Single Barrel Steel Body Foot Pump for Cycle  ");// 2299

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			Life_s c2 = new Life_s("Life Hub ", "Life Hub PU Smash Volleyball ", 630, "Volleyball ", "1 nos");
			break;

		case "2":
			Vector_Xk c3 = new Vector_Xk("Vector X", "Vector X Speed PVC Hand Stitched 18 Panel Volleyball", 630,
					"Volleyball", "1 pc");
			break;

		case "3":
			CHROMOTO_k c4 = new CHROMOTO_k("CHROMOTO", "CHROMOTO Single Barrel Steel Body Foot Pump for Cycle", 1999,
					"pump", "1 pc");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Volleyball();
			break;

		}

	}

	void method_1()

	{
		System.out.println("");

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Brand : " + Brand);
		System.out.println("Name : " + Name);
		System.out.println("Price : " + Price + " Ruppes");
		System.out.println("Product_Type : + Product_Type");
		System.out.println("Quantity : + Quantity");

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("");

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                          CONSTRUCTORS OF VOLLEYBALL CLASS 
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Life_s extends Volleyball {
	Life_s(String Brand, String Name, double Price, String Product_Type, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Product_Type = Product_Type;
		this.Quantity = Quantity;
		method_1();

	}

}

class Vector_Xk extends Volleyball {
	Vector_Xk(String Brand, String Name, double Price, String Product_Type, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Product_Type = Product_Type;
		this.Quantity = Quantity;
		method_1();

	}

}

class CHROMOTO_k extends Volleyball {
	CHROMOTO_k(String Brand, String Name, double Price, String Product_Type, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Product_Type = Product_Type;
		this.Quantity = Quantity;
		method_1();

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                        FOOTBALL CLASS 
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Football extends Sports_Equipment {

	public void Football() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For Nivia Fb-292 Shining Star Football ");// 1290 Football
		System.out.println("Enter 2 For NIVIA Dominator 3.0 Football ");// 1599 Shuttlecock 6 yellow
		System.out.println("Enter 3 For VECTOR X OZONE FOOTBALL STUD ");// 809
		System.out.println("Enter 4 For Nivia Web Goalkeeping Gloves");// 530 Football
		System.out.println("Enter 5 For Vector X Gravity Football Shoes ");// 949 shoes
		System.out.println("Enter 6 For Airavat Silicone Shin Guard ");// 299
		System.out.println("Enter 7 For Nivia Web Goalkeeping Gloves");// 530 Football
		System.out.println("Enter 8 For Airavat Silicone Shin Guard ");// 299

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			Nivia_foot c2 = new Nivia_foot("Nivia ", "Nivia Fb-292 Shining Star Football ", 1290, "Football ", "1 nos");
			break;

		case "2":
			Nivia_foot c3 = new Nivia_foot("NIVIA", " NIVIA Dominator 3.0 Football", 1599, "Football", "1 pc");
			break;

		case "3":
			VECTOR_x c4 = new VECTOR_x("VECTOR X ", "VECTOR X OZONE FOOTBALL STUD", 809, "FOOTBALL STUD ", "1 pc");
			break;

		case "4":
			Nivia_Gloves c5 = new Nivia_Gloves("Nivia ", "Nivia Web Goalkeeping Gloves", 530, "Goalkeeping Gloves ",
					"1 nos");
			break;

		case "5":
			VECTOR_Shoes c6 = new VECTOR_Shoes("VECTOR X ", "Vector X Gravity Football Shoes", 949, "Football Shoes",
					"1 pc");
			break;

		case "6":
			Airavat_a c7 = new Airavat_a("Airavat ", "Airavat Silicone Shin Guard ", 299, "Shin Guard ", "1 pc");
			break;

		case "7":
			Nivia_Gloves c8 = new Nivia_Gloves("Nivia ", "Nivia Web Goalkeeping Gloves", 530, "Goalkeeping Gloves ",
					"1 nos");
			break;

		case "9":
			Airavat_a c10 = new Airavat_a("Airavat ", "Airavat Silicone Shin Guard ", 809, "Shin Guard ", "1 pc");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Football();
			break;

		}

	}

	void method_2()

	{
		System.out.println("");

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Brand : " + Brand);
		System.out.println("Name : " + Name);
		System.out.println("Price : " + Price + " Ruppes");
		System.out.println("Product_Type : + Product_Type");
		System.out.println("Quantity : + Quantity");

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("");

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                      CONSTRUCTORS OF FOOTBALL CLASS 
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Nivia_foot extends Volleyball {
	Nivia_foot(String Brand, String Name, double Price, String Product_Type, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Product_Type = Product_Type;
		this.Quantity = Quantity;
		method_1();

	}

}

class VECTOR_x extends Volleyball {
	VECTOR_x(String Brand, String Name, double Price, String Product_Type, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Product_Type = Product_Type;
		this.Quantity = Quantity;
		method_1();

	}

}

class Nivia_Gloves extends Volleyball {
	Nivia_Gloves(String Brand, String Name, double Price, String Product_Type, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Product_Type = Product_Type;
		this.Quantity = Quantity;
		method_1();

	}

}

class VECTOR_Shoes extends Volleyball {
	VECTOR_Shoes(String Brand, String Name, double Price, String Product_Type, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Product_Type = Product_Type;
		this.Quantity = Quantity;
		method_1();

	}

}

class Airavat_a extends Volleyball {
	Airavat_a(String Brand, String Name, double Price, String Product_Type, String Quantity) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Product_Type = Product_Type;
		this.Quantity = Quantity;
		method_1();

	}

}


//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                   
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                         GROCERY CLASS  SUB-CLASS OF JMART
// 
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Grocery extends Jmart {
	public String Quantity;
	public String Brand;
	public String Food_Preference;
	public String Product_Type;

	
	
	public void finalize() {
		System.out.println("cleanup Activity");
	}


	
	public void Grocery() {
		System.gc();
/*___________________________________________________________________________________________________________________________________________________________________________________________
 * 		                       
 *  GARBAGE COLLECTION (by using System.gc)
 * ___________________________________________________________________________________________________________________________________________________________________________________________
 */
		
		
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select The GRocery Items                                                            ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println("Enter 1 For Snacks");
		System.out.println("Enter 2 For  Beverage ");
		System.out.println("Enter 3 For  Fruits & Vegetables");
		System.out.println("Enter 4 For Dairy & Bakery");
		System.out.println("Enter 5 For Cooking Needs ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Snacks s1 = new Snacks();
		Beverage b1 = new Beverage();
		Fruit_vegetables f1 = new Fruit_vegetables();
		Dairy_Bakery d1 = new Dairy_Bakery();
		Cooking_Needs ck = new Cooking_Needs();
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			s1.Snacks();
			break;

		case "2":
			b1.Beverage();
			break;

		case "3":
			f1.Fruit_vegetables();
			break;

		case "4":
			d1.Dairy_Bakery();
			break;

		case "5":
			ck.Cooking_Needs();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Grocery();
			break;
		}

		choose();
	}

	public void choose() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                       Choose                                                           ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println("Enter 1 For Confirm Order");
		System.out.println("Enter 2 For Main menu ");
		System.out.println("Enter 3 For Grocery Menu ");
		System.out.println("Enter 4 For Cancellation ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		;
		Scanner sk = new Scanner(System.in);
		buy b1 = new buy();
		String c1 = sk.next();
		switch (c1) {
		case "1":
			b1.buy();
			break;

		case "2":
			Jmart();
			break;

		case "3":
			Grocery();
			break;

		case "4":
			Cancel();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			choose();

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                            SNACKS CLASS  
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class Snacks extends Grocery {

	void method_7()

	{
		System.out.println("");

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Brand:" + Brand);
		System.out.println("Name:" + Name);
		System.out.println("Price:" + Price + " Ruppes");
		System.out.println("Quantity:" + Quantity);
		System.out.println("Food_Preference:" + Food_Preference);

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("");

	}

	public void Snacks() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite Snacks                                                                 ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For Namkeen");
		System.out.println("Enter 2 For Chocolates");
		System.out.println("Enter 3 For  Cookies ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Chocolates c2 = new Chocolates();
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			(new Namkeen()).Namkeen();
			break;

		case "2":
			(new Chocolates()).Chocolates();
			break;

		case "3":
			(new Cookies()).Cookies();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Snacks();
			break;

		}

	}

}



//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                          NAMKEEN CLASS  
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class Namkeen extends Snacks {

	public void Namkeen() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite Namkeen                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For KURKURE MASALA MUNCH");
		System.out.println("Enter 2 For Haldiram Mixture");
		System.out.println("Enter 3 For Haldiram Moong Daal");
		System.out.println("Enter 4 For Haldiram Bhakarwadi");
		System.out.println("Enter 5 For Haldiram Salted Peanutes  ");
		System.out.println("Enter 6 For Bikaji Bikaneri Bhujia ");
		System.out.println("Enter 7 For Balaji Farali Chivdo");
		System.out.println("Enter 8 For Garden Mumbai Special Diet Bhel");
		System.out.println("Enter 9 For Chitle Bandhu Bhakarwad ");

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			Kurkure_Masala_Munch k1 = new Kurkure_Masala_Munch("Kurkure", "KURKURE MASALA MUNCH", 20, "85.5gm", "veg");
			break;

		case "2":
			Haldiram_mixture h1 = new Haldiram_mixture("Haldiram", "Haldiram Mixture", 75, "350gm", "veg");
			break;

		case "3":
			Haldiram_moong_dal h2 = new Haldiram_moong_dal("Haldiram", "Haldiram Moong Daal", 100, "400gm", "veg");
			break;

		case "4":
			Haldiram_Bhakarvadi h3 = new Haldiram_Bhakarvadi("Haldiram", "Haldiram Bhakarwadi", 65, "200gm", "veg");
			break;

		case "5":
			Haldiram_Salted_Peanutes h4 = new Haldiram_Salted_Peanutes("Haldiram", "Haldiram Salted Peanutes", 50,
					"200gm", "veg");
			break;

		case "6":
			Bikaji_Bhujia b1 = new Bikaji_Bhujia("Bikaji", "Bikaji Bikaneri Bhujia", 49, "200gm", "veg");
			break;

		case "7":
			Balaji_faral b2 = new Balaji_faral("Balaji", "Balaji Farali Chivdo", 90, "450gm", "veg");
			break;

		case "8":
			Garden_Bhel g1 = new Garden_Bhel("Garden", "Garden Mumbai Special Diet Bhel", 55, "150gm", "veg");
			break;

		case "9":
			Chitle_Bhakarvadi c2 = new Chitle_Bhakarvadi("Chitle", "Chitle Bandhu Bhakarwadi", 80, "150gm", "veg");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Namkeen();
			break;

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                     CONSTRUCTORS OF NAMKEEN CLASS  
//
//
//______________________________________________________________________________________________________________________________________________________________________________________



class Kurkure_Masala_Munch extends Namkeen {
	Kurkure_Masala_Munch(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Haldiram_mixture extends Namkeen {
	Haldiram_mixture(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Haldiram_moong_dal extends Namkeen {
	Haldiram_moong_dal(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Haldiram_Bhakarvadi extends Namkeen {
	Haldiram_Bhakarvadi(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}
}

class Haldiram_Salted_Peanutes extends Namkeen {
	Haldiram_Salted_Peanutes(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Bikaji_Bhujia extends Namkeen {
	Bikaji_Bhujia(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Balaji_faral extends Namkeen {
	
	{
		System.out.println("You are selecting Balaji Faral");
	}
	
	Balaji_faral(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Garden_Bhel extends Namkeen {
	Garden_Bhel(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Chitle_Bhakarvadi extends Namkeen {
	Chitle_Bhakarvadi(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                   CHOCOLATES CLASS  
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class Chocolates extends Snacks {
	public void Chocolates() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite Chocolate                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For Cadbury 5 Star Bites");
		System.out.println("Enter 2 For Cadbury Dairy Milk Fruit & Nut");
		System.out.println("Enter 3 For Kitkat Chocolates");
		System.out.println("Enter 4 For Snickers Chocalte");
		System.out.println("Enter 5 For  Lotee Rich Cocao Choco   ");
		System.out.println("Enter 6 For Kinder Joy Pink edition");
		System.out.println("Enter 7 For  Ferro Rocher Chocaltes Balls ");
		System.out.println("Enter 8 For Hershey's Exotic Dark Bluberry Chocalate");

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		var sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			Cadbury_5Star_Bites c2 = new Cadbury_5Star_Bites("Cadbury", "Cadbury 5 Star Bites", 149, "200gm", "veg");
			break;

		case "2":
			Cadbury_Dairymilk_Fruit_Nut c3 = new Cadbury_Dairymilk_Fruit_Nut("Cadbury",
					"Cadbury Dairy Milk Fruit & Nut ", 40, "36gm", "veg");
			break;

		case "3":
			Kitkat_Chocalates k1 = new Kitkat_Chocalates("Kitkat", "Kitkat Chocolates", 40, "37.3gm", "veg");
			break;

		case "4":
			Snickers_Chocalte s1 = new Snickers_Chocalte("Snickers", "Snickers Chocalte", 50, "50gm", "veg");
			break;

		case "5":
			Lotte_Rich r1 = new Lotte_Rich("Lotee", "Lotee Rich Cocao Choco ", 180, "28g x 12pcs ", "veg");
			break;

		case "6":
			Kinder_joy k2 = new Kinder_joy("Kinder", "Kinder Joy Pink edition", 45, "20gm", "veg");
			break;

		case "7":

			Ferro_Roccher f1 = new Ferro_Roccher("Ferro", "Ferro Rocher Chocaltes Balls ", 529, "200gm", "veg");
			break;

		case "8":
			Hersheys_Exotic h1 = new Hersheys_Exotic("BrookSide", "Hershey's Exotic Dark Bluberry Chocalate", 150,
					"100gm", "veg");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Chocolates();
			break;

		}
	}
}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                            CONSTRUCTORS OF CHOCOLATES CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Cadbury_5Star_Bites extends Chocolates {
	Cadbury_5Star_Bites(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Cadbury_Dairymilk_Fruit_Nut extends Chocolates {
	Cadbury_Dairymilk_Fruit_Nut(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Kitkat_Chocalates extends Chocolates {
	Kitkat_Chocalates(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Snickers_Chocalte extends Chocolates {
	Snickers_Chocalte(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Lotte_Rich extends Chocolates {
	Lotte_Rich(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Kinder_joy extends Chocolates {
	Kinder_joy(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Ferro_Roccher extends Chocolates {
	Ferro_Roccher(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Hersheys_Exotic extends Chocolates {
	Hersheys_Exotic(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                          COOKIES CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Cookies extends Snacks {
	public void Cookies() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite Cookies                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For Parle 20-20 Gold Cashew cookies");
		System.out.println("Enter 2 For Oreo Choco Creame Biscuits");
		System.out.println("Enter 3 For Unibic Assorted Cookies");
		System.out.println("Enter 4 For Karachi Bakery Fruit Biscuit Family Pack");
		System.out.println("Enter 5 For Britannia Good Day Butter Cookies");
		System.out.println("Enter 6 For Sunfest Mom's Magic Rich Butter Cookies");
		System.out.println("Enter 7 For  Amul Cheese Cookies");
		System.out.println("Enter 8 For Parle Hide & Seek");
		System.out.println("Enter 9 For Cadbury Bournvita Biscuits");
		System.out.println("Enter 10 Domino's Chocolate Cookies ");
		System.out.println("Enter 11 For Parle Hide & Seek");

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			Parle_gold p1 = new Parle_gold("Parle", "Parle 20-20 Gold Cashew cookies", 190, "600gm", "veg");
			break;

		case "2":
			Oreo_choco o1 = new Oreo_choco("Oreo", "Oreo Choco Creame Biscuits", 85, "300gm", "veg");
			break;

		case "3":
			Unibic u1 = new Unibic("Unibic", "Unibic Assorted Cookies", 150, "75gm", "veg");
			break;

		case "4":
			Karachi_bakery k1 = new Karachi_bakery("Karachi", "Karachi Bakery Fruit Biscuit Family Pack", 560, "800gm",
					"veg");
			break;

		case "5":
			Britania_Good_day b1 = new Britania_Good_day("Britannia", "Britannia Good Day Butter Cookies", 50, "300gm",
					"veg");
			break;

		case "6":
			Sunfest_Moms_magic s2 = new Sunfest_Moms_magic("Sunfest", "Sunfest Mom's Magic Rich Butter Cookies", 30,
					"150gm", "veg");
			break;

		case "7":
			Amul a1 = new Amul("Amul", "Amul Cheese Cookies", 20, "50gm", "veg");
			break;

		case "8":
			Parle_Hide h3 = new Parle_Hide("Parle", "Parle Hide & Seek", 30, "100gm", "veg");
			break;

		case "9":
			Cadbury_Bornvita_buiscuits h1 = new Cadbury_Bornvita_buiscuits("Cadbury", "Cadbury Bournvita Biscuits", 99,
					"400gm", "veg");
			break;

		case "10":
			Dominos_ch d1 = new Dominos_ch("Express Foods", "Domino's Chocolate Cookies ", 150, "200gm", "veg");
			break;

		case "11":
			cadbury_choco c4 = new cadbury_choco("Cadbury", "Cadbury Choco Bakes ", 50, "75gm", "veg");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Cookies();
			break;

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                       CONSTRUCTORS OF  COOKIES CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Parle_gold extends Cookies {
	Parle_gold(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Oreo_choco extends Cookies {
	Oreo_choco(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Unibic extends Cookies {
	Unibic(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Karachi_bakery extends Cookies {
	Karachi_bakery(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Britania_Good_day extends Cookies {
	Britania_Good_day(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Sunfest_Moms_magic extends Cookies {
	Sunfest_Moms_magic(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Amul extends Cookies {
	Amul(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Parle_Hide extends Cookies {
	Parle_Hide(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Cadbury_Bornvita_buiscuits extends Cookies {
	Cadbury_Bornvita_buiscuits(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Dominos_ch extends Cookies {
	Dominos_ch(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class cadbury_choco extends Cookies {
	cadbury_choco(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                      BEVERAGE CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Beverage extends Grocery {
	void method_7()

	{
		System.out.println("");

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Brand:" + Brand);
		System.out.println("Name:" + Name);
		System.out.println("Price:" + Price + " Ruppes");
		System.out.println("Quantity:" + Quantity);
		System.out.println("Food_Preference:" + Food_Preference);

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("");

	}

	public void Beverage()

	{

		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite Beverage                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For Cold Drinks");
		System.out.println("Enter 2 For Energy Drink");
		System.out.println("Enter 3 For Health Drinks & Suplement");
		System.out.println("Enter 4 For Juices");

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {

		case "1":
			(new Cold_Drinks()).Cold_Drinks();
			break;

		case "2":
			(new Energy_Drink()).Energy_Drink();
			break;

		case "3":
			(new Health_Drink()).Health_Drink();
			break;

		case "4":
			(new Juices()).Juices();
			break;
		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Beverage();
			break;

		}

	}

}


//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                    COLD DRINKS CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class Cold_Drinks extends Beverage {

	public void Cold_Drinks() {

		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite  Cold Drinks                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For Mirinda Orange");
		System.out.println("Enter 2 For 7 Up ");
		System.out.println("Enter 3 For Sprite 1.75L");
		System.out.println("Enter 4 For Sprite 600ml");
		System.out.println("Enter 5 For Thums Up 1.75L");
		System.out.println("Enter 6 For Pepsi 750ml");
		System.out.println("Enter 7 For Coca Cola Zero Sugar");
		System.out.println("Enter 8 For Limca ");
		System.out.println("Enter 9 For Bisleri Limonata");

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			Mirinda_Orange m1 = new Mirinda_Orange("Mirinda", "Mirinda Orange ", 99, "2.25L", "vegetarian");
			break;

		case "2":
			up n = new up("7 UP", "7 Up ", 99, "2.25L", "vegetarian");
			break;

		case "3":
			Sprite s1 = new Sprite("Coca-Cola", "Sprite", 69, "1.75L", "vegetarian");
			break;

		case "4":
			Sprite s2 = new Sprite("Coca-Cola", "Sprite", 38, "600ml", "vegetarian");
			break;

		case "5":
			ThumsUp s5 = new ThumsUp(" Thums Up", "Thums Up", 59, "1.75L", "vegetarian");
			break;

		case "6":
			Pepsi p1 = new Pepsi("Pepsi", "Pepsi", 37, "750ml", "vegetarian");
			break;

		case "7":
			Coca_Cola c3 = new Coca_Cola("Coca Cola", "Coca Cola Zero Sugar", 40, "300ml", "vegetarian");
			break;

		case "8":
			Limca l1 = new Limca("Limca", "Limca ", 99, "2.25L", "vegetarian");
			break;

		case "9":
			Bisleri b1 = new Bisleri("Bisleri", "Bisleri Limonata ", 40, "600ml", "vegetarian");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Cold_Drinks();
			break;

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                    CONSTRUCTORS OF  CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Mirinda_Orange extends Cold_Drinks {
	Mirinda_Orange(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class up extends Cold_Drinks {
	up(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Sprite extends Cold_Drinks {
	Sprite(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class ThumsUp extends Cold_Drinks {
	ThumsUp(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Pepsi extends Cold_Drinks {
	Pepsi(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Coca_Cola extends Cold_Drinks {
	Coca_Cola(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Limca extends Cold_Drinks {
	Limca(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Bisleri extends Cold_Drinks {
	Bisleri(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                  ENERGY DRINK CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Energy_Drink extends Beverage {

	public void Energy_Drink() {

		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite  Energy Drink                                                                  ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For Monster Energy Drink");
		System.out.println("Enter 2 For Red Bull Energy Drink (4pcs) ");
		System.out.println("Enter 3 For Hell Classic Energy Drink ");
		System.out.println("Enter 4 For Red Bull Energy Drink ");

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			Monster_Energy m1 = new Monster_Energy("Monster", "Monster Energy Drink ", 110, "350ml", "vegetarian");
			break;

		case "2":
			Red_Bull r1 = new Red_Bull("Red Bull", "Red Bull Energy Drink  ", 399, "25ml x 4pcs", "vegetarian");
			break;

		case "3":
			Hell h1 = new Hell("Hell", "Hell Classic Energy Drink  ", 50, "250ml", "vegetarian");
			break;

		case "4":
			Red_Bull r3 = new Red_Bull("Red Bull", "Red Bull Energy Drink  ", 112, "25ml", "vegetarian");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Energy_Drink();
			break;

		}
	}
}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                               CONSTRUCTORS ENERGY DRINK CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Monster_Energy extends Energy_Drink {
	Monster_Energy(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Red_Bull extends Energy_Drink {
	Red_Bull(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Hell extends Energy_Drink {
	Hell(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                               HEALTH DRINK CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class Health_Drink extends Beverage {

	public void Health_Drink() {

		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite  Health_Drink                                                                   ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For Bournvita 750gm");
		System.out.println("Enter 2 For Horlicks Chocolate Delight 750 gm ");
		System.out.println("Enter 3 For Horlicks Classic Malt 750 gm");
		System.out.println("Enter 4 For Amul Pro Whey Protein Drink 500 gm");
		System.out.println("Enter 5 For Protinex Tasty Chocolate 400 gm");
		System.out.println("Enter 6 For Complan Royal Chocolate 500 gm");
		System.out.println("Enter 7 For Women's Horlicks Chocolate 400 gm");

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			Bournvita m1 = new Bournvita("Bournvita", "Bournvita 750gm", 320, "750gm", "vegetarian");
			break;

		case "2":
			Horlicks d1 = new Horlicks("Horlicks", "Horlicks Chocolate Delight 750 gm", 225, "750gm", "vegetarian");
			break;

		case "3":
			Horlicks_M h1 = new Horlicks_M("Horlicks", "Horlicks Classic Malt 750 gm", 359, "750gm", "vegetarian");
			break;

		case "4":
			Amul_Pro a1 = new Amul_Pro("Amul", "Amul Pro Whey Protein Drink 500 gm", 180, "500gm", "vegetarian");
			break;

		case "5":
			Protinex a2 = new Protinex("Protinex", "Protinex Tasty Chocolate 400 gm", 625, "400gm", "vegetarian");
			break;

		case "6":
			Complan a3 = new Complan("Complan", "Complan Royal Chocolate 500 gm", 289, "500gm", "vegetarian");
			break;

		case "7":
			Women2 a4 = new Women2("Horlicks", "Women's Horlicks Chocolate 400 gm", 345, "400gm", "vegetarian");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Health_Drink();
			break;

		}
	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                             CONSTRUCTORS HEALTH DRINK CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Bournvita extends Health_Drink {
	Bournvita(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Horlicks extends Health_Drink {
	Horlicks(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Horlicks_M extends Health_Drink {
	Horlicks_M(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Amul_Pro extends Health_Drink {
	Amul_Pro(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Protinex extends Health_Drink {
	Protinex(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Complan extends Health_Drink {
	Complan(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Women2 extends Health_Drink {
	Women2(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}
//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                           JUICES  CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Juices extends Beverage {

	public void Juices() {

		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite  Juices                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For Maaza Mango Drink 1.2 L");
		System.out.println("Enter 2 For B Natural Mixed Fruit Juice 1 L ");
		System.out.println("Enter 3 For Tropicano Slice Mango Drink 1.75 L");
		System.out.println("Enter 4 For Paper Boat Coconut Water 200 ml");
		System.out.println("Enter 5 For Frooti Mango Drink 1.8 L");
		System.out.println("Enter 6 For Real Fruit Power Mixed Fruit Juice 1 L");// 65
		System.out.println("Enter 7 For B Natural Apple Juice 1 L");
		System.out.println("Enter 8 For B Natural Guava Gush Juice 1 L");// 65
		System.out.println("Enter 9 For Real Activ Apple Juice 1 L");// 148
		System.out.println("Enter 10 For Paper Boat Swing Fizz Guava Drink 600 ml");// 40
		System.out.println("Enter 11 For Paperboat Jaljeera 200 ml");// 35
		System.out.println("Enter 12 For Alo Frut Kiwi + AloeVera Fruit Juice 1 L");// 35

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			Mazha_mango m1 = new Mazha_mango("Maaza", "Maaza Mango Drink 1.2 L", 75, "1.2 L", "vegetarian");
			break;

		case "2":
			B_Natural b1 = new B_Natural("B Natural", "B Natural Mixed Fruit Juice 1 L", 130, "1 L", "vegetarian");
			break;

		case "3":
			Tropicano b3 = new Tropicano("Tropicano", "B Natural Mixed Fruit Juice 1 L", 105, "1 L", "vegetarian");
			break;

		case "4":
			Paper b4 = new Paper("Paper Boat", "Paper Boat Coconut Water 200 ml", 60, "200ml", "vegetarian");
			break;

		case "5":
			Frooti b5 = new Frooti("Frooti", "Frooti Mango Drink 1.8 L", 100, "1.8 L", "vegetarian");
			break;

		case "6":
			rEAL b6 = new rEAL("Real Fruit", " Real Fruit Power Mixed Fruit Juice 1 L", 95, "1L", "vegetarian");
			break;

		case "7":
			B_Natural b7 = new B_Natural("B Natural", "B Natural Apple Juice", 130, "1 L", "vegetarian");
			break;

		case "8":
			B_Natural b8 = new B_Natural("B Natural", "B Natural Guava Gush Juice 1 L", 130, "1 L", "vegetarian");
			break;

		case "9":
			rEAL b9 = new rEAL("Real Fruit", " Real Activ Apple Juice 1 L", 148, "1L", "vegetarian");
			break;

		case "10":
			Paper b10 = new Paper("Paper Boat", "Paper Boat Swing Fizz Guava Drink 600 ml", 60, "600 ml", "vegetarian");
			break;

		case "11":
			Paper b11 = new Paper("Paper Boat", "Paperboat Jaljeera 200 ml", 30, "200 ml", "vegetarian");
			break;

		case "12":
			Alo_Frut b12 = new Alo_Frut("Alo Frut", "Alo Fruit Kiwi + AloeVera Fruit Juice 1 L", 60, "1 L",
					"vegetarian");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Juices();
			break;

		}
	}
}
//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                           CONSTRUCTORS JUICES CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Mazha_mango extends Juices {
	Mazha_mango(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class B_Natural extends Juices {
	B_Natural(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Tropicano extends Juices {
	Tropicano(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Paper extends Juices {
	Paper(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Frooti extends Juices {
	Frooti(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}
}

class rEAL extends Juices {
	rEAL(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

class Alo_Frut extends Juices {
	Alo_Frut(String Brand, String Name, double Price, String Quantity, String Food_Preference) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Food_Preference = Food_Preference;
		method_7();
	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                              FRUITS_VEGETABLES CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Fruit_vegetables extends Grocery {
	
	public void method_8()

	{

		System.out.println("");

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Name : " + Name);
		System.out.println("Price : " + Price + " Ruppes");
		System.out.println("Quantity : " + Quantity);
		System.out.println(" Product Type : " + Product_Type);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("");

	}

	public void Fruit_vegetables() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select The GRocary Items                                                            ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println("Enter 1 For Fruits");
		System.out.println("Enter 2 For  Vegetables ");
		System.out.println("Enter 3 For  Herbs & Seasoning");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Snacks s1 = new Snacks();
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			(new Fruits()).Fruits();
			break;

		case "2":
			(new Vegetables()).Vegetables();
			break;

		case "3":
			(new Herb_Seasoning()).Herb_Seasoning();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Fruit_vegetables();
			break;

		}
	}
}



//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                            FRUITS CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Fruits extends Fruit_vegetables {

	void Fruits() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select The GRocary Items                                                            ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println("Enter 1 For Berries");
		System.out.println("Enter 2 For  Citrus Fruits ");
		System.out.println("Enter 3 For  Other Fruits");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Snacks s1 = new Snacks();
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			(new Berries()).Berries();
			break;

		case "2":
			(new Citrus_Fruits()).Citrus_Fruits();
			break;

		case "3":
			(new Other_Fruits()).Other_Fruits();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Fruits();
			break;

		}

	}

}



//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                            BERRIES CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Berries extends Fruits {
	void Berries() {

		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select The GRocary Items                                                            ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println("Enter 1 For Blue Berry ");
		System.out.println("Enter 2 For  Strawberry  ");
		System.out.println("Enter 3 For Dried Cranberries ");
		System.out.println("Enter 3 For Mixed Berries ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			Blue_Berry m1 = new Blue_Berry("Reliance", "Blue Berry ", 199, "125gm ", "BlueBerry ");
			break;

		case "2":
			Strawberry m2s = new Strawberry("Reliance", "Strawberry ", 199, "125gm ", "Strawberry ");
			break;

		case "3":
			Cranberries m3 = new Cranberries("TheBerryPeople", "Dried Cranberries", 999, "400gm ", "Cranberries ");
			break;

		case "4":
			Mixberries m4 = new Mixberries("TheBerryPeople", "Mixed Berries", 999, "400gm ", "Mixed");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Berries();
			break;

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                         CONSTRUCTORS OF BERRIES CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Blue_Berry extends Berries {
	Blue_Berry(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Strawberry extends Berries {
	Strawberry(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Cranberries extends Berries {
	Cranberries(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Mixberries extends Berries {
	Mixberries(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                       CITRUS FRUITS CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class Citrus_Fruits extends Fruits {
	void Citrus_Fruits() {

		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select The GRocary Items                                                            ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println("Enter 1 For Pineapple ");
		System.out.println("Enter 2 For  Kinoo Orange 1 kg");

		System.out.println("Enter 3 For Mosambi 1 kg");

		System.out.println("Enter 4 For Orange 6 pcs ");
		System.out.println("Enter 5 For Orange Mandarin Pack");

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");

		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			Pineapple m1 = new Pineapple("Private Label", "Pineapple", 60, "1 pc ", "Pineapple ");
			break;

		case "2":
			Orange m2s = new Orange("Private Label", "Kinoo Orange", 99, "1 KG ", "Orange ");
			break;

		case "3":
			Mosambi m3 = new Mosambi("Private Label", "Mosambi", 99, "1 KG ", "Mosambi ");
			break;

		case "4":
			Orange m4 = new Orange("Private Label", "Orange 6 pcs (Pack)", 69, "(Approx 700gm-900gm) ", "Orange");
			break;

		case "5":
			Orange m5 = new Orange("Private Label", "Orange Mandarin Pack", 259, "(Approx 480gm-550gm) ", "Orange");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Citrus_Fruits();
			break;

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                       CONSTRUCTORS OF CITRUS FRUITS CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Pineapple extends Citrus_Fruits {
	Pineapple(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Orange extends Citrus_Fruits {
	Orange(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Mosambi extends Citrus_Fruits {
	Mosambi(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                       OTHER FRUITS CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class Other_Fruits extends Fruits {
	void Other_Fruits() {

		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select The GRocary Items                                                            ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println("Enter 1 For Tender Coconut Cling Wrapped ");
		System.out.println("Enter 2 For  Banana Red (Box) ");

		System.out.println("Enter 3 For Dates Imported ");

		System.out.println("Enter 4 For Apple Indian 6 pcs (Pack)");
		System.out.println("Enter 5 For Papaya  ");
		System.out.println("Enter 6 For Sweet Tamarind ");
		System.out.println("Enter 7 For Pomegranate  6 pcs ");
		System.out.println("Enter 8 For Pears Green Imported 3 pcs ");

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");

		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			Tender m1 = new Tender("Private Label", "Tender Coconut Cling Wrapped", 52, "1 pc ", "Coconut ");
			break;

		case "2":
			Banana m2s = new Banana("Private Label", "Banana Red ", 129, "(Approx 800 g - 1000 g) ", "Banana ");
			break;

		case "3":
			Dates m3 = new Dates("Private Label", "Dates", 179, "(Approx 400 g - 500 g)", "Dates ");
			break;

		case "4":
			Apple m4 = new Apple("Private Label", "Apple Indian 6 pcs", 129, "6 pc", "Apple");
			break;

		case "5":
			Papaya m5 = new Papaya("Private Label", "Papaya", 75, "(Approx. 800 g - 1600 g)", "Papaya");
			break;

		case "6":
			Sweet m6 = new Sweet("Private Label", "Sweet Tamarind", 129, "(Approx. 240 g - 260 g)", "Sweet Tamarind");
			break;

		case "7":
			Pomegranate m7 = new Pomegranate("Private Label", "Pomegranate", 159, "6 pcs ", "Pomegranate");
			break;

		case "8":
			Pears m8 = new Pears("Private Label", "Pears Green", 99, "3 pcs", "Sweet Tamarind");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Other_Fruits();
			break;

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                       CONSTRUCTORS OF OTHER FRUITS CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class Tender extends Other_Fruits {
	Tender(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Banana extends Other_Fruits {
	Banana(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Dates extends Other_Fruits {
	Dates(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Apple extends Other_Fruits {
	Apple(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Papaya extends Other_Fruits {
	Papaya(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Sweet extends Other_Fruits {
	Sweet(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Pomegranate extends Other_Fruits {
	Pomegranate(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Pears extends Other_Fruits {
	Pears(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                       VEGETABLES CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Vegetables extends Fruit_vegetables {

	void method9() {

		System.out.println("");

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Brand: " + Brand);
		System.out.println("Name : " + Name);
		System.out.println("Price : " + Price + " Ruppes");
		System.out.println("Quantity : " + Quantity);
		System.out.println(" Product Type : " + Product_Type);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("");

	}

	public void Vegetables() {
		{
			System.out.println("");
			System.out.println("");
			System.out.println(
					"===========================================================================================================================================================================================================================================");

			System.out.println(
					"                                                                        Select The GRocary Items                                                            ");
			System.out.println(
					"===========================================================================================================================================================================================================================================");
			System.out.println("Enter 1 For Potato 1 KG ");
			System.out.println("Enter 2 For  Sweet corn ");// 15
			System.out.println("Enter 3 For  Onion 1 kg"); // 30
			System.out.println("Enter 4 For Potato 500gm ");//
			System.out.println("Enter 5 For  Tomato  1Kg");// 20
			System.out.println("Enter 6 For  Cucumber Madras 1Kg"); // 55
			System.out.println("Enter 7 For  Lauki 1 KG ");// 30
			System.out.println("Enter 8 For  Green Capsicum 500gm ");// 25
			System.out.println("Enter 9 For  Cauliflower 1pc");// 15
			System.out.println("Enter 10 For  bhendi  250gm");// 20
			System.out.println("Enter 11 For  Curry Leaves 20gm"); // 10
			System.out.println("Enter 12 For Cucumber 500gm");// 25
			System.out.println("Enter 13 For  Betroot 500gm  ");
			System.out.println("Enter 14 For  Carrot 500gm");// 50

			System.out.println("Enter 15 For  Brinjal Black 500gm ");// 30
			System.out.println("Enter 16 For  Amla 250gm");// 20
			System.out.println("Enter 17 For  Cluster Beans 250gm");// 20
			System.out.println("Enter 18 For  Sweet potato 500gm");// 30
			System.out.println("Enter 19 For  French Beans 500gm  ");// 20
			System.out.println("Enter 20 For  Bitter Gourd 500gm"); // 25
			System.out.println("Enter 21 For  Cabbage  1pc "); // 20

			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.print("Enter Number: ");
			Scanner sk = new Scanner(System.in);
			String c1 = sk.next();
			switch (c1) {
			case "1":
				Potato m1 = new Potato("Potato", 31, " 1kg ", "Potato ");
				break;

			case "2":
				Sweet_corn m2s = new Sweet_corn("Sweet corn  ", 15, "1pc", "Sweet_corn ");
				break;

			case "3":
				Onion m3 = new Onion("Onion", 30, "1kg", "Onion ");
				break;

			case "4":
				Potato m4 = new Potato("Potato 500gm", 16, "500gm", "Potato");
				break;

			case "5":
				Tomato m5 = new Tomato("Tomato", 20, "1 kg", "Tomato");
				break;

			case "6":
				Cucumber m6 = new Cucumber("Cucumber Madras", 55, "1 kg", "Cucumber");
				break;

			case "7":
				Lauki m7 = new Lauki("Lauki", 30, "1kg ", "Lauki");
				break;

			case "8":
				Capsicum m8 = new Capsicum("Green Capsicum", 99, "3 pcs", "Capsicum");
				break;

			case "9":
				Cauliflower m9 = new Cauliflower("Cauliflower", 15, " 1 pc ", "Cauliflower ");
				break;

			case "10":
				bhendi m24 = new bhendi("bhendi", 20, "250gm", "bhendi ");
				break;

			case "11":
				Leaves m31 = new Leaves("Curry Leaves", 30, "1kg", "Curry Leaves ");
				break;

			case "12":
				Cucumber m41 = new Cucumber("Cucumber 500gm", 25, "500gm", "Cucumber");
				break;

			case "13":
				Betroot m51 = new Betroot("Betroot", 30, "500 gm", "Betroot");
				break;

			case "14":
				Carrot m511 = new Carrot("Carrot", 30, "500 gm", "Carrot");
				break;

			case "15":
				Brinjal m61 = new Brinjal("Brinjal Black", 55, "1 kg", "Brinjal");
				break;

			case "16":
				Amla m71 = new Amla("Amla", 20, "250gm", "Amla");
				break;

			case "17":
				Beans m81 = new Beans("Cluster Beans", 20, "250gm", "Cluster Beans");
				break;

			case "18":
				Sweet_potato m411 = new Sweet_potato("Sweet potato", 30, "500gm", "Sweet potato");
				break;

			case "19":
				French_Beans m58 = new French_Beans("French Beans", 30, "500 gm", "French Beans");
				break;

			case "20":
				Bitter_Gourd m612 = new Bitter_Gourd("Bitter Gourd", 25, "500 gm", "Bitter Gourd");
				break;

			case "21":
				Cabbage m82 = new Cabbage(" Cabbage", 20, "1 pc", "Cabbage");
				break;

			default:
				System.out.println("");

				System.out.println("");
				System.out.println(
						"**************************************************************************************************************************************************************************************************");
				System.out.println(
						"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
				System.out.println(
						"************************************************************************************************************************************************************************************************");
				Vegetables();
				break;

			}

		}

	}
}


//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                       CONSTRUCTORS OF VEGETABLES CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class Potato extends Vegetables {
	Potato(String Name, double Price, String Quantity, String Product_Type) {

		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method9();
	}

}

class Sweet_corn extends Vegetables {
	Sweet_corn(String Name, double Price, String Quantity, String Product_Type) {

		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method9();
	}

}

class Onion extends Vegetables {
	Onion(String Name, double Price, String Quantity, String Product_Type) {

		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method9();
	}

}

class Tomato extends Vegetables {
	Tomato(String Name, double Price, String Quantity, String Product_Type) {

		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method9();
	}

}

class Cucumber extends Vegetables {
	Cucumber(String Name, double Price, String Quantity, String Product_Type) {

		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method9();
	}

}

class Lauki extends Vegetables {
	Lauki(String Name, double Price, String Quantity, String Product_Type) {

		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method9();
	}

}

class Capsicum extends Vegetables {
	Capsicum(String Name, double Price, String Quantity, String Product_Type) {

		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method9();
	}

}

class Cauliflower extends Vegetables {
	Cauliflower(String Name, double Price, String Quantity, String Product_Type) {

		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method9();
	}

}

class bhendi extends Vegetables {
	bhendi(String Name, double Price, String Quantity, String Product_Type) {

		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method9();
	}

}

class Leaves extends Vegetables {
	Leaves(String Name, double Price, String Quantity, String Product_Type) {

		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method9();
	}

}

class Betroot extends Vegetables {
	Betroot(String Name, double Price, String Quantity, String Product_Type) {

		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method9();
	}

}

class Brinjal extends Vegetables {
	Brinjal(String Name, double Price, String Quantity, String Product_Type) {

		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method9();
	}

}

class Amla extends Vegetables {
	Amla(String Name, double Price, String Quantity, String Product_Type) {

		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method9();
	}

}

class Beans extends Vegetables {
	Beans(String Name, double Price, String Quantity, String Product_Type) {

		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method9();
	}

}

class Carrot extends Vegetables {
	Carrot(String Name, double Price, String Quantity, String Product_Type) {

		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method9();
	}

}

class Sweet_potato extends Vegetables {
	Sweet_potato(String Name, double Price, String Quantity, String Product_Type) {

		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method9();
	}

}

class French_Beans extends Vegetables {
	French_Beans(String Name, double Price, String Quantity, String Product_Type) {

		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method9();
	}

}

class Bitter_Gourd extends Vegetables {
	Bitter_Gourd(String Name, double Price, String Quantity, String Product_Type) {

		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method9();
	}

}

class Cabbage extends Vegetables {
	Cabbage(String Name, double Price, String Quantity, String Product_Type) {

		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method9();
	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                     HERBS & SEASONING CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class Herb_Seasoning extends Fruit_vegetables {
	void method9() {

		System.out.println("");

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Brand: " + Brand);
		System.out.println("Name : " + Name);
		System.out.println("Price : " + Price + " Ruppes");
		System.out.println("Quantity : " + Quantity);
		System.out.println(" Product Type : " + Product_Type);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("");

	}

	public void Herb_Seasoning() {
		{
			System.out.println("");
			System.out.println("");
			System.out.println(
					"===========================================================================================================================================================================================================================================");

			System.out.println(
					"                                                                        Select The GRocary Items                                                            ");
			System.out.println(
					"===========================================================================================================================================================================================================================================");
			System.out.println("Enter 1 For Ginger Indian 200 g");
			System.out.println("Enter 2 For Green Chilli 200 g");// 15
			System.out.println("Enter 3 For  Indian Garlic 200 g"); // 30
			System.out.println("Enter 4 For Garlic Peeled ");//
			System.out.println("Enter 5 For  Thai Ginger ");// 20
			System.out.println("Enter 6 For  Peeled Garlic"); // 55
			System.out.println("Enter 7 For  NIMBOO RAS pack  ");// 25

			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.print("Enter Number: ");
			Scanner sk = new Scanner(System.in);
			String c1 = sk.next();
			switch (c1) {
			case "1":
				Ginger m1 = new Ginger("Ginger Indian 200 gm", 17, " 200gm ", "Ginger ");
				break;

			case "2":
				Green_Chilli m2s = new Green_Chilli("Green Chilli ", 20, "200gm", "Green Chilli ");
				break;

			case "3":
				Indian_Garlic m3 = new Indian_Garlic("Indian Garlic", 23, "200gm", " Garlic ");
				break;

			case "4":
				Indian_Garlic m4 = new Indian_Garlic("Garlic Peeled 1 Pack ", 30, "(Approx 80 g - 150 g)", "Garlic");
				break;

			case "5":
				Ginger m5 = new Ginger("Thai Ginger", 39, "100gm", " Ginger");
				break;

			case "6":
				Indian_Garlic m6 = new Indian_Garlic("Peeled Garlic ", 299, "600gm", "Garlic");
				break;

			case "7":
				NIMBOO m7 = new NIMBOO("NIMBOO RAS ", 150, "6 pc ", "NIMBOO RAS ");
				break;

			default:
				System.out.println("");

				System.out.println("");
				System.out.println(
						"**************************************************************************************************************************************************************************************************");
				System.out.println(
						"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
				System.out.println(
						"************************************************************************************************************************************************************************************************");
				Herb_Seasoning();
				break;

			}

		}

	}
}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                  CONSTRUCTORS OF  HERBS & SEASONING CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Ginger extends Herb_Seasoning {
	Ginger(String Name, double Price, String Quantity, String Product_Type) {

		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method9();
	}

}

class Green_Chilli extends Herb_Seasoning {
	Green_Chilli(String Name, double Price, String Quantity, String Product_Type) {

		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method9();
	}

}

class Indian_Garlic extends Herb_Seasoning {
	Indian_Garlic(String Name, double Price, String Quantity, String Product_Type) {

		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method9();
	}

}

class NIMBOO extends Herb_Seasoning {
	NIMBOO(String Name, double Price, String Quantity, String Product_Type) {

		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method9();
	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                   DAIRY & BAKERY CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class Dairy_Bakery extends Fruit_vegetables {
	void method9() {

		System.out.println("");

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Brand: " + Brand);
		System.out.println("Name : " + Name);
		System.out.println("Price : " + Price + " Ruppes");
		System.out.println("Quantity : " + Quantity);
		System.out.println(" Product Type : " + Product_Type);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("");

	}

	public void Dairy_Bakery() {
		{
			System.out.println("");
			System.out.println("");
			System.out.println(
					"===========================================================================================================================================================================================================================================");

			System.out.println(
					"                                                                        Select The GRocery Items                                                            ");
			System.out.println(
					"===========================================================================================================================================================================================================================================");
			System.out.println("Enter 1 For Amul Butter 110gm ");// (52)
			System.out.println("Enter 2 For Amul Taaza  ");// (70)
			System.out.println("Enter 3 For  Gowardhan Pure Cow Ghee "); // 600
			System.out.println("Enter 4 For Nandini Pure cow Ghee");// 600
			System.out.println("Enter 5 For  Parle Real Elaichi Premium Rusk ");// 50
			System.out.println("Enter 6 For Patanjali Cow Ghee 1 L  "); // 650
			System.out.println("Enter 7 For Britannia Toastea Premium Bake Rusk 400 g  ");// 80
			System.out.println("Enter 8 For Milky Mist Paneer 200 g   ");// 120
			System.out.println("Enter 9 For Britannia 100% Whole Wheat Bread 450 g ");// 50
			System.out.println("Enter 10 For Britannia Healthy Slice Bread 450 g  ");// 40
			System.out.println("Enter  11 For Amulya Dairy Milk 1 L");// 65
			System.out.println("Enter 12  Amul Elaichi Shrikhand 500 g ");// 175
			System.out.println("Enter 13 For Amul Fresh Paneer 1 kg (Pack) ");// 375
			System.out.println("Enter 14 For Amul Masti Dahi 200 g   ");// 20

			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.print("Enter Number: ");
			Scanner sk = new Scanner(System.in);
			String c1 = sk.next();
			switch (c1) {
			case "1":
				Amul_Butter m1 = new Amul_Butter("Amul", "Amul Butter", 52, " 110gm ", "Butter ");
				break;

			case "2":
				Amul_Tazza m2 = new Amul_Tazza("Amul", "Amul Taaza", 70, " 1 L ", "Milk ");
				break;

			case "3":
				Gowardhan_Ghee m3 = new Gowardhan_Ghee("Gowardhan", " Gowardhan Pure Cow Ghee ", 600, " 1 L ", "Ghee ");
				break;

			case "4":
				Nandini_Ghee m4 = new Nandini_Ghee("Nandini", "Nandini Pure cow Ghee", 600, " 1 Kg ", "Ghee ");
				break;

			case "5":
				Parle_Real m5 = new Parle_Real("Parle", "Parle Real Elaichi Premium Rusk ", 50, " 200gm ", "Toast ");
				break;

			case "6":
				Patanjali_C m6 = new Patanjali_C("Patanjali", "Patanjali Cow Ghee", 600, " 1 L ", "Ghee ");
				break;

			case "7":
				Britannia_t m7 = new Britannia_t("Britannia", "Britannia Toastea Premium Bake Rusk ", 80, " 400gm ",
						"Toast ");
				break;

			case "8":
				Milky_k m8 = new Milky_k("Milky", "Milky Mist Paneer", 120, " 200gm ", "Paneer ");
				break;

			case "9":
				Britannia_S m9 = new Britannia_S("Britannia", "Britannia Healthy Slice Bread", 40, " 450 gm", "Bread ");
				break;

			case "10":
				Gowardhan_Ghee m10 = new Gowardhan_Ghee("Britannia", " Britannia Healthy Slice Bread ", 40, "450 gm",
						"Bread ");
				break;

			case "11":
				Amulya_m m11 = new Amulya_m("Amulya", "Amulya Dairy Whitener", 65, " 1 L ", "Milk ");
				break;

			case "12":
				Amul_S m12 = new Amul_S("Amul", "Amul Elaichi Shrikhand 500 g", 175, " 500 g ", "Shrikhand ");
				break;

			case "13":
				Amul_p m13 = new Amul_p("Amul", "Amul Fresh Paneer  ", 600, "1 kg ", "Paneer ");
				break;

			case "14":
				Amul_D m14 = new Amul_D("Amul", " Amul Masti Dahi  ", 20, " 200 g ", "Dahi ");
				break;

			default:
				System.out.println("");

				System.out.println("");
				System.out.println(
						"**************************************************************************************************************************************************************************************************");
				System.out.println(
						"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
				System.out.println(
						"************************************************************************************************************************************************************************************************");
				Dairy_Bakery();
				break;

			}

		}

	}
}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                              CONSTRUCTORS OF DAIRY & BAKERY CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class Amul_Butter extends Dairy_Bakery {
	Amul_Butter(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Amul_Tazza extends Dairy_Bakery {
	Amul_Tazza(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Gowardhan_Ghee extends Dairy_Bakery {
	Gowardhan_Ghee(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Nandini_Ghee extends Dairy_Bakery {
	Nandini_Ghee(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Parle_Real extends Dairy_Bakery {
	Parle_Real(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Patanjali_C extends Dairy_Bakery {
	Patanjali_C(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Britannia_t extends Dairy_Bakery {
	Britannia_t(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Milky_k extends Dairy_Bakery {
	Milky_k(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Britannia_S extends Dairy_Bakery {
	Britannia_S(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Amulya_m extends Dairy_Bakery {
	Amulya_m(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Amul_S extends Dairy_Bakery {
	Amul_S(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Amul_p extends Dairy_Bakery {
	Amul_p(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Amul_D extends Dairy_Bakery {
	Amul_D(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                COOKING NEEDS CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class Cooking_Needs extends Fruit_vegetables {
	void method9() {

		System.out.println("");

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Brand: " + Brand);
		System.out.println("Name : " + Name);
		System.out.println("Price : " + Price + " Ruppes");
		System.out.println("Quantity : " + Quantity);
		System.out.println(" Product Type : " + Product_Type);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("");

	}

	void Cooking_Needs() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select                                                           ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println("Enter 1 For Atta, Flours & Sooji");
		System.out.println("Enter 2 For  Dals & Pulses ");
		System.out.println("Enter 3 For  Rice & Rice Products");
		System.out.println("Enter 4 For Edible Oils");
		System.out.println("Enter 5 For  Masalas & Spices ");
		System.out.println("Enter 6 For  Other");

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Snacks s1 = new Snacks();
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			(new Atta()).Atta();
			break;

		case "2":
			(new Dals()).Dals();
			break;

		case "3":
			(new Rice()).Rice();
			break;

		case "4":
			(new Oils()).Oils();
			break;

		case "5":
			(new Masala()).Masala();
			break;

		case "6":
			(new Other()).Other();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Cooking_Needs();
			break;

		}

	}

}


//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                       ATTA CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Atta extends Cooking_Needs {

	public void Atta()

	{
		{
			System.out.println("");
			System.out.println("");
			System.out.println(
					"===========================================================================================================================================================================================================================================");

			System.out.println(
					"                                                                        Select The Items                                                            ");
			System.out.println(
					"===========================================================================================================================================================================================================================================");
			System.out.println("Enter 1 For Aashirvaad Superior MP Whole Wheat Atta 10 kg ");// 475
			System.out.println("Enter 2 For Aashirvaad Multigrain Atta 5 kg  ");// 300
			System.out.println("Enter 3 For  Suji / Rawa 500 g "); // 50
			System.out.println("Enter 4 For Besan 500 g");// 65
			System.out.println("Enter 5 For  Maida 1 kg ");// 90
			System.out.println("Enter 6 For Rajdhani Chana Sattu 500 g "); // 60
			System.out.println("Enter 7 For Satyam Idli Rawa 500 g  ");// 34

			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.print("Enter Number: ");
			Scanner sk = new Scanner(System.in);
			String c1 = sk.next();
			switch (c1) {
			case "1":
				Aashirvaad_s m1 = new Aashirvaad_s("Aashirvaad", "Aashirvaad Superior MP Whole Wheat Atta", 500,
						"10 kg", "Atta ");
				break;

			case "2":
				Aashirvaad_s m2 = new Aashirvaad_s("Aashirvaad", "Aashirvaad Multigrain Atta", 300, "5 kg", "Atta ");
				break;

			case "3":
				Suji_r m3 = new Suji_r("Private Label", " Suji / Rawa ", 50, " 500 g  ", "Suji ");
				break;

			case "4":
				Besan_s m4 = new Besan_s("Private Label", "Besan", 65, "500 g ", "Besan ");
				break;

			case "5":
				Maida_m m5 = new Maida_m("Private Label", " Maida  ", 90, " 1 kg ", " Maida  ");
				break;

			case "6":
				Rajdhani_c m6 = new Rajdhani_c("Rajdhani ", "Rajdhani Chana Sattu   ", 60, " 500gm", "Chana Sattu  ");
				break;

			case "7":
				Idli_r m7 = new Idli_r("Satyam", "Satyam Idli Rawa", 80, " 400gm ", "Idli ");
				break;

			default:
				System.out.println("");

				System.out.println("");
				System.out.println(
						"**************************************************************************************************************************************************************************************************");
				System.out.println(
						"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
				System.out.println(
						"************************************************************************************************************************************************************************************************");
				Atta();
				break;

			}

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                              CONSTRUCTORS OF ATTA CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Aashirvaad_s extends Atta {
	Aashirvaad_s(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Suji_r extends Atta {
	Suji_r(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Besan_s extends Atta {
	Besan_s(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Maida_m extends Atta {
	Maida_m(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Rajdhani_c extends Atta {
	Rajdhani_c(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Idli_r extends Atta {
	Idli_r(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                              DAL CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Dals extends Cooking_Needs {

	public void Dals()

	{
		{
			System.out.println("");
			System.out.println("");
			System.out.println(
					"===========================================================================================================================================================================================================================================");

			System.out.println(
					"                                                                        Select The Items                                                            ");
			System.out.println(
					"===========================================================================================================================================================================================================================================");
			System.out.println("Enter 1 For Good Life Raw Peanuts 500gm ");// 120
			System.out.println("Enter 2 For Tur / Arhar Dal 2 kg"); // 300
			System.out.println("Enter 3 For  Tata Sampann Unpolished Tur / Arhar Dal 1 kg");// 189
			System.out.println("Enter 4 For Moong Dal 2 Kg");// 270
			System.out.println("Enter 5 For Good Life Kabuli Chana 500gm ");// 90
			System.out.println("Enter 6 For Tata Sampann Unpolished Chana"); // 60
			System.out.println("Enter 7 For Good Life Masoor DAl 500gm  ");// 70
			System.out.println("Enter 8 For Tata Sampann Unpolished Moong "); // 60
			System.out.println("Enter 9 For Good Life Urad DAl 500gm  ");// 70
			System.out.println("Enter 10 For Fortune Soya Wadi / Chunks 200 g");// 60

			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.print("Enter Number: ");
			Scanner sk = new Scanner(System.in);
			String c1 = sk.next();
			switch (c1) {
			case "1":
				Good_Peanuts m1 = new Good_Peanuts("Good Life", "Good Life Raw Peanuts", 120, "500gm", "Peanuts ");
				break;

			case "2":
				Tur_p m2 = new Tur_p("Private Label", "Tur / Arhar Dal", 300, "2 kg", "Dal");
				break;

			case "3":
				Tur_r m3 = new Tur_r(" Tata", "  Tata Sampann Unpolished Tur / Arhar Dal ", 190, " 1 kg  ", "Dal ");
				break;

			case "4":
				Dal_m m4 = new Dal_m("Private Label", "Moong Dal", 270, " 2 Kg ", "Dal ");
				break;

			case "5":
				Kabuli_g m5 = new Kabuli_g("Good Life ", " Good Life Kabuli Chana ", 90, "500 gm", "Kabuli Chana ");
				break;

			case "6":
				Chana m6 = new Chana("Tata ", "Tata Sampann Unpolished Chana", 90, " 500gm", "Chana");
				break;

			case "7":
				Masoor_m m7 = new Masoor_m("Good Life", "Good Life Masoor DAl", 70, " 500gm ", "DAl ");
				break;

			case "8":
				Moong_m m8 = new Moong_m("Tata ", "Tata Sampann Unpolished Moong", 90, "500 gm", "Dal");
				break;

			case "9":
				Urad_d m9 = new Urad_d("Tata ", "Good Life Urad DAl", 70, " 500gm", "DAl  ");
				break;

			case "10":
				Fortune_s m10 = new Fortune_s("Fortune", "Fortune Soya Wadi / Chunks", 60, " 200gm ", "Chunks ");
				break;

			default:
				System.out.println("");

				System.out.println("");
				System.out.println(
						"**************************************************************************************************************************************************************************************************");
				System.out.println(
						"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
				System.out.println(
						"************************************************************************************************************************************************************************************************");
				Dals();
				break;

			}

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                              CONSTRUCTORS OF DALS CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Good_Peanuts extends Dals {
	Good_Peanuts(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Tur_p extends Dals {
	Tur_p(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Tur_r extends Dals {
	Tur_r(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Dal_m extends Dals {
	Dal_m(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Kabuli_g extends Dals {
	Kabuli_g(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Moong_m extends Dals {
	Moong_m(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Masoor_m extends Dals {
	Masoor_m(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Chana extends Dals {
	Chana(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Urad_d extends Dals {
	Urad_d(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Fortune_s extends Dals {
	Fortune_s(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                     RICE CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Rice extends Cooking_Needs {

	public void Rice()

	{
		{
			System.out.println("");
			System.out.println("");
			System.out.println(
					"===========================================================================================================================================================================================================================================");

			System.out.println(
					"                                                                        Select The Item                                                           ");
			System.out.println(
					"===========================================================================================================================================================================================================================================");
			System.out.println("Enter 1 For Fortune Biryani Special Basmati Rice 1 kg ");// 210
			System.out.println("Enter 2 For Elina Long Grain Rice 1 kg"); // 160
			System.out.println("Enter 3 For Tata Sampann White Poha 500 g");// 46
			System.out.println("Enter 4 For Daawat Super Basmati Rice 1 kg");// 199
			System.out.println("Enter 5 For Daawat Devaaya Biryani Basmati Rice 1 kg ");// 215
			System.out.println("Enter 6 For Daawat Devaaya Basmati Rice 5 kg"); // 665
			System.out.println("Enter 7 For India Gate Mini Mogra-II Basmati Rice 10 kg ");// 465
			System.out.println("Enter 8 For India Gate Mogra Basmati Rice 10 kg");// 800
			System.out.println("Enter 9 For Good Life Dosa Rice 1 kg");// 70
			System.out.println("Enter 10 For Daawat Hyderabadi Biryani Kit 334 g"); // 149

			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.print("Enter Number: ");
			Scanner sk = new Scanner(System.in);
			String c1 = sk.next();
			switch (c1) {
			case "1":
				Fortune_B m1 = new Fortune_B("Fortune", "Fortune Biryani Special Basmati Rice", 210, "1 kg", "Rice ");
				break;

			case "2":
				Elina_L m2 = new Elina_L("Elina", " Elina Long Grain Rice", 300, " 1 kg", "Rice");
				break;

			case "3":
				Tata_poha m3 = new Tata_poha(" Tata", " Tata Sampann White Poha", 19460, "500 gm", "Poha ");
				break;

			case "4":
				Daawat_R m4 = new Daawat_R("Daawat", "Daawat Super Basmati Rice", 199, " 1 Kg ", "Rice");
				break;

			case "5":
				Daawat_R m5 = new Daawat_R("Daawat", " Daawat Devaaya Biryani Basmati Rice", 215, "1 kg", "Rice");
				break;

			case "6":
				Daawat_R m6 = new Daawat_R("Daawat", " Daawat Devaaya Biryani Basmati Rice", 665, "5 kg", "Rice");
				break;

			case "7":
				India_r m7 = new India_r("India Gate", "India Gate Mini Mogra-II Basmati Rice ", 465, " 10 kg ",
						"Rice ");
				break;

			case "8":
				India_r m8 = new India_r("India Gate ", "India Gate Mogra Basmati Rice", 800, " 10 kg", "Rice");
				break;

			case "9":
				Rice_G m9 = new Rice_G("Good Life", "Good Life Dosa Rice", 70, " 1 kg", "Rice  ");
				break;

			case "10":
				Daawat_H m10 = new Daawat_H("Daawat", "Daawat Hyderabadi Biryani Kit ", 149, "334 g", "Mix ");
				break;

			default:
				System.out.println("");

				System.out.println("");
				System.out.println(
						"**************************************************************************************************************************************************************************************************");
				System.out.println(
						"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
				System.out.println(
						"************************************************************************************************************************************************************************************************");
				Rice();
				break;

			}

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                 CONSTRUCTORS OF   RICE CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Fortune_B extends Rice {
	Fortune_B(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Elina_L extends Rice {
	Elina_L(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Tata_poha extends Rice {
	Tata_poha(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Daawat_R extends Rice {
	Daawat_R(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class India_r extends Rice {
	India_r(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Rice_G extends Rice {
	Rice_G(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Daawat_H extends Rice {
	Daawat_H(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                   OILS CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Oils extends Cooking_Needs {

	public void Oils()

	{
		{
			System.out.println("");
			System.out.println("");
			System.out.println(
					"===========================================================================================================================================================================================================================================");

			System.out.println(
					"                                                                        Select The Item                                                       ");
			System.out.println(
					"===========================================================================================================================================================================================================================================");
			System.out.println("Enter 1 For Gemini Refined Sunflower Oil 1 L");// 230
			System.out.println("Enter 2 For Saffola Active Pro Weight Watchers RiceBran Based Blended Oil 1 L ");// 199
			System.out.println("Enter 3 For Fortune Kachi Ghani Pure"); // 224
			System.out.println("Enter 4 For Dhara Kachi Ghani Mustard Oil 1 L");// 195
			System.out.println("Enter 5 For Fortune Sunlite Refined Oil  5 L");// 1145
			System.out.println("Enter 6 For Saffola Gold Pro Healthy Lifestyle RiceBran Based Blended Oil "); // 199
			System.out.println("Enter 7 For Gulab Sungold Refined Sunflower Oil 15 L");// 3303

			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.print("Enter Number: ");
			Scanner sk = new Scanner(System.in);
			String c1 = sk.next();
			switch (c1) {
			case "1":
				Gemini_o m1 = new Gemini_o("Gemini", "Gemini Refined Sunflower Oil", 230, "1 L", "Oil ");
				break;

			case "2":
				Saffola_a m2 = new Saffola_a("Saffola",
						"Saffola Active Pro Weight Watchers RiceBran Based Blended Oil ", 199, "1 L", "Oil ");
				break;

			case "3":
				Fortune_o m3 = new Fortune_o("Fortune", "Fortune Kachi Ghani Pure Oil", 224, " 1 L ", "Oil ");
				break;

			case "4":
				Dhara_o m4 = new Dhara_o("Dhara", "Dhara Kachi Ghani Mustard Oil", 195, "1 L", "Oil ");
				break;

			case "5":
				Fortune_o m5 = new Fortune_o("Fortune", " Fortune Sunlite Refined Oil  ", 1145, " 5 L ", " Oil  ");
				break;

			case "6":
				Saffola_a m6 = new Saffola_a("Saffola Gold ",
						"Saffola Gold Pro Healthy Lifestyle RiceBran Based Blended Oil", 199, " 1 L", "Oil");
				break;

			case "7":
				Gulab_Sungold m7 = new Gulab_Sungold("Gulab Sungold", "Gulab Sungold Refined Sunflower Oil ", 3303,
						" 15 L ", "Oil");
				break;

			default:
				System.out.println("");

				System.out.println("");
				System.out.println(
						"**************************************************************************************************************************************************************************************************");
				System.out.println(
						"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
				System.out.println(
						"************************************************************************************************************************************************************************************************");
				Oils();
				break;

			}

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                   CONSTRUCTORS OF OILS CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Gemini_o extends Oils {
	Gemini_o(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Saffola_a extends Oils {
	Saffola_a(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Fortune_o extends Oils {
	Fortune_o(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Dhara_o extends Oils {
	Dhara_o(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Gulab_Sungold extends Oils {
	Gulab_Sungold(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                   MASALA CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Masala extends Cooking_Needs {

	public void Masala()

	{
		{
			System.out.println("");
			System.out.println("");
			System.out.println(
					"===========================================================================================================================================================================================================================================");

			System.out.println(
					"                                                                        Select The Item                                                       ");
			System.out.println(
					"===========================================================================================================================================================================================================================================");
			System.out.println("Enter 1 For Good Life Jeera 100 gm");// 32
			System.out.println("Enter 2 For Good Life Big Mustard 100 g ");// 32
			System.out.println("Enter 3 For Everest Hingraj Powder 50 g"); // 130
			System.out.println("Enter 4 For Catch Kitchen King Masala 100 g");// 80
			System.out.println("Enter 5 For Catch Sabzi Masala 100 g");// 65
			System.out.println("Enter 6 For Smith & Jones Pasta Masala 108 gm "); // 70
			System.out.println("Enter 7 For Everest Coriander Powder 100 gm");// 49
			System.out.println("Enter 6 For Smith & Jones Pasta Masala 108 gm "); // 70
			System.out.println("Enter 7 For Everest Coriander Powder 100 gm");// 49
			System.out.println("Enter 8 For Everest Turmeric Powder 100 g "); // 70
			System.out.println("Enter 9 For Everest Black Pepper Powder 50 g");// 70

			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.print("Enter Number: ");
			Scanner sk = new Scanner(System.in);
			String c1 = sk.next();
			switch (c1) {
			case "1":
				Good_j m1 = new Good_j("Good Life", "Good Life Jeera ", 32, "100 gm", "Jeera ");
				break;

			case "2":
				Good_M m2 = new Good_M("Good Life", "Good Life Big Mustard ", 199, "100 gm", "Mustard ");
				break;

			case "3":
				Everest_H m3 = new Everest_H("Everest", "Everest Hingraj Powder", 224, " 50 gm", "Hingraj Powder ");
				break;

			case "4":
				Catch_M m4 = new Catch_M("Catch", "Catch Kitchen King Masala  ", 80, "100 gm", "Masala ");
				break;

			case "5":
				Catch_M m5 = new Catch_M("Catch", " Catch Sabzi Masala ", 80, "100 g ", "Sabzi Masala  ");
				break;

			case "6":
				Smith_P m6 = new Smith_P("Smith & Jones", "Smith & Jones Pasta Masala ", 70, "108 gm", "Pasta Masala");
				break;

			case "7":
				Everest_C m7 = new Everest_C("Everest", "Everest Coriander Powder  ", 49, " 100 gm",
						"Coriander Powder");
				break;

			case "8":
				Everest_T m8 = new Everest_T("Everest", "Everest Turmeric Powder  ", 70, "100 gm", "Turmeric Powder");
				break;

			case "9":
				Everest_B m9 = new Everest_B("Everest", "Everest Black Pepper Powder ", 70, " 50 g",
						"Black Pepper Powder");
				break;

			default:
				System.out.println("");

				System.out.println("");
				System.out.println(
						"**************************************************************************************************************************************************************************************************");
				System.out.println(
						"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
				System.out.println(
						"************************************************************************************************************************************************************************************************");
				Masala();
				break;

			}

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                   CONSTRUCTORS OF MASALA CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Good_j extends Masala {
	Good_j(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Good_M extends Masala {
	Good_M(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Everest_H extends Masala {
	Everest_H(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Catch_M extends Masala {
	Catch_M(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Smith_P extends Masala {
	Smith_P(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Everest_C extends Masala {
	Everest_C(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Everest_T extends Masala {
	Everest_T(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Everest_B extends Masala {
	Everest_B(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                   OTHER CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Other extends Cooking_Needs {

	public void Other()

	{
		{
			System.out.println("");
			System.out.println("");
			System.out.println(
					"===========================================================================================================================================================================================================================================");

			System.out.println(
					"                                                                        Select The Item                                                       ");
			System.out.println(
					"===========================================================================================================================================================================================================================================");
			System.out.println("Enter 1 For Good Life Pure Crystal Sugar 5 kg");// 275
			System.out.println("Enter 2 For Tata Iodised Salt 1 kg");// 25
			System.out.println("Enter 3 For Sugar Free Gold 300 Pellets"); // 190
			System.out.println("Enter 4 For Natural Tattva Himalayan Pink Salt 500 g");// 60
			System.out.println("Enter 5 For Tata Rock Salt With Crusher 100 g");// 45
			System.out.println("Enter 6 For Pro Nature Organic Brown Sugar 1 kg "); // 149
			System.out.println("Enter 7 For Good Life Cashews 500 gm");// 500
			System.out.println("Enter 8 For Good Life Yellow Kishmish 500 gm"); // 149
			System.out.println("Enter 9 For Good Life Phool Makhana 100 gm");// 80
			System.out.println("Enter 10 For Wonderland Foods Premium Roasted & Salted Almonds 200 g "); // 615
			System.out.println("Enter 11 For Good Life  Dates 500 gm");// 189

			System.out.println("Enter 12 For Shree Dry Coconut 200 g "); // 90
			System.out.println("Enter 13 For Kokan Gem Premium Goa Cashews 500 g");// 600
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.print("Enter Number: ");
			Scanner sk = new Scanner(System.in);
			String c1 = sk.next();
			switch (c1) {
			case "1":
				Good_Sugar m1 = new Good_Sugar("Good Life", "Good Life Pure Crystal Sugar ", 275, "5 kg", "Sugar ");
				break;

			case "2":
				Tata_Salt m2 = new Tata_Salt("Tata", "Tata Iodised Salt ", 199, "1 kg", "Salt ");
				break;

			case "3":
				Sugar_Free m3 = new Sugar_Free("Sugar Free", "Sugar Free Gold 300 Pellets", 190, "300 Pellets",
						"Suger Free Pellets");
				break;

			case "4":
				Natural_Tattva m4 = new Natural_Tattva("Natural Tattva", "Natural Tattva Himalayan Pink Salt  ", 60,
						"500 g", "Pink Salt ");
				break;

			case "5":
				Tata_R m5 = new Tata_R("Tata", "Tata Rock Salt With Crusher ", 45, "100 g ", "Rock Salt ");
				break;

			case "6":
				Pro_Nature m6 = new Pro_Nature("Pro Nature", "Pro Nature Organic Brown Sugar  ", 149, "1 kg",
						"Brown Sugar");
				break;

			case "7":
				Good_Cashews m7 = new Good_Cashews("Good Life", "Good Life Cashews 500 gm", 500, "  500 gm", "Cashews");
				break;

			case "8":
				Good_Kishmish m8 = new Good_Kishmish("Good Life", "Good Life Yellow Kishmish 500 gm", 149, "500 gm",
						"Kishmish");
				break;

			case "9":
				Good_Makhana m9 = new Good_Makhana("Good Life", "Good Life Phool Makhana 100 gm", 80, "100 gm",
						"Makhana");
				break;

			case "10":
				Wonderland_A m10 = new Wonderland_A("Wonderland",
						"Wonderland Foods Premium Roasted & Salted Almonds   ", 615, "200 gm", "Almonds");
				break;

			case "11":
				Good_Dates m11 = new Good_Dates("Good Life", "Good Life  Dates ", 190, "500 gm", "Dates");
				break;

			case "12":
				Shree_K m12 = new Shree_K("Shree", "Shree Dry Coconut ", 90, "  200 g", " Dry Coconut ");
				break;

			case "13":
				Kokan_C m13 = new Kokan_C("Kokan", " Kokan Gem Premium Goa Cashews ", 600, " 500 g", "Cashews");
				break;

			default:
				System.out.println("");

				System.out.println("");
				System.out.println(
						"**************************************************************************************************************************************************************************************************");
				System.out.println(
						"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
				System.out.println(
						"************************************************************************************************************************************************************************************************");
				Other();
				break;

			}

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                   CONSTRUCTORS OF OTHER CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Good_Sugar extends Other {
	Good_Sugar(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Tata_Salt extends Other {
	Tata_Salt(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Sugar_Free extends Other {
	Sugar_Free(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Natural_Tattva extends Other {
	Natural_Tattva(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Tata_R extends Other {
	Tata_R(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Pro_Nature extends Other {
	Pro_Nature(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Good_Cashews extends Other {
	Good_Cashews(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Good_Kishmish extends Other {
	Good_Kishmish(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Good_Makhana extends Other {
	Good_Makhana(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Wonderland_A extends Other {
	Wonderland_A(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Good_Dates extends Other {
	Good_Dates(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Shree_K extends Other {
	Shree_K(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}

class Kokan_C extends Other {
	Kokan_C(String Brand, String Name, double Price, String Quantity, String Product_Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Product_Type = Product_Type;
		method_8();
	}

}


//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                     
//
//
//______________________________________________________________________________________________________________________________________________________________________________________







//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                 FASHION CLASS SUB CLASS JMART CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Fashion extends Jmart // Sub-Class 5 (1.Men 2.Women 3.Kids)
{
	public String Brand;
	public String Color;
	public String Size;
	public String Fabric;
	public String Type;

	public void Fashion() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println(
				"                                                                      Fashion Shop                                                                           ");
		System.out.println(
				"===============================================================================================================================================================================================================================================");
		System.out.println("Press 1 For Men ");
		System.out.println("Press 2 For Women");

		System.out.println(" ");

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number : ");

		Scanner sk = new Scanner(System.in);

		String c2 = sk.next();
		switch (c2) {
		case "1":

			(new Men()).Men();
			break;

		case "2":
			(new Women()).Women();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**********************************************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"**************************************************************************************************************************************************************************************************************************************");
			Fashion();
			break;
		}

		choose();
	}

	public void choose() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                       Choose                                                           ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println("Enter 1 For Confirm Order");
		System.out.println("Enter 2 For Main menu ");
		System.out.println("Enter 3 For Fashion Shop Menu ");
		System.out.println("Enter 4 For Cancellation ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		;
		Scanner sk = new Scanner(System.in);
		buy b1 = new buy();
		String c1 = sk.next();

		switch (c1) {
		case "1":
			b1.buy();
			break;
		case "2":
			Jmart();
			break;

		case "3":
			Fashion();
			break;

		case "4":
			Cancel();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			choose();

		}

	}

	void method_7()

	{
		System.out.println("");

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Brand : " + Brand);
		System.out.println("Name : " + Name);
		System.out.println("Price : " + Price + " Ruppes");
		System.out.println("Color :  " + Color);
		System.out.println("Size  :  " + Size);
		System.out.println("Fabric :  " + Fabric);

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("");

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                             MEN CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Men extends Fashion {

	public void Men()

	{
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select                                                                 ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println("Enter 1 For TopWear");
		System.out.println("Enter 2 For BootomWear");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			(new TopWear()).TopWear();
			break;

		case "2":
			(new Bottomwear()).Bottomwear();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Men();
			break;

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                         TOPWEAR CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class TopWear extends Men {
	public void TopWear()

	{
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite Topwear                                                                ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println("Enter 1 For T-shirts");
		System.out.println("Enter 2 For Shirts");
		System.out.println("Enter 3 For Other TOpWear");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Chocolates c2 = new Chocolates();
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			(new T_Shirt()).T_Shirt();
			break;

		case "2":
			(new Shirt()).Shirt();
			break;

		case "3":
			(new Others()).Others();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			TopWear();
			break;

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                             T-SHIRTS CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class T_Shirt extends TopWear {

	public void T_Shirt() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite T-Shirt                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For Roadster Men's White Pure Cotton T-shirt");// 499 white 100% Cotton L
		System.out.println("Enter 2 For HRX Men Teal Blue Printed Pure Cotton T-shirt");// 699 Geometric Print 100%
																						// Cotton L
		System.out.println("Enter 3 For Levis Men White Typography Printed Pure Cotton T-shirt");// 1099
		System.out.println(
				"Enter 4 For Louis Philippe Jeans Men Black Graphic Printed Pure Cotton Slim Fit Casual T-shirt");// 1049
		System.out.println("Enter 5 For WROGN Men Teal Green Solid Polo Collar T-shirt ");// 1399
		System.out.println("Enter 6 For Puma Men White ACTIVE Big Logo Printed dryCELL Round Neck T-shirt ");// 1799
		System.out.println("Enter 7 For Tommy Hilfiger Men Navy Blue & Off White Pure Cotton T-shirt");// 2299
		System.out.println(
				"Enter 8 For U.S. Polo Assn. Men White & Red Striped Polo Collar Pure Cotton Slim Fit T-shirt");// 1799
		System.out.println("Enter 9 For U.S. Polo Assn. Men Red Striped Polo Collar Pure Cotton Slim Fit T-shirt");// 1799
		System.out.println("Enter 10 ForU.S. Polo Assn. Men Grey Melange Printed Lounge T-shirt");// 1000

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			Roadster_m k1 = new Roadster_m("Roadster", "Roadster Men's White Pure Cotton T-shirt", 499, "White", "L",
					"Pure Cotton");
			break;

		case "2":
			HRX_tshirt k2 = new HRX_tshirt("HRX", "HRX Men Teal Blue Printed Pure Cotton T-shirt", 699, "HRX", "L",
					"Pure Cotton");
			break;

		case "3":
			Levis_tshirt k3 = new Levis_tshirt("Levis", "Levis Men White Typography Printed Pure Cotton T-shirt", 1099,
					"White Typography Printed", "L", "Pure Cotton");
			break;

		case "4":
			LP_tshirt k4 = new LP_tshirt("Louis Philippe",
					"Louis Philippe Jeans Men Black Graphic Printed Pure Cotton Slim Fit Casual T-shirt", 1049,
					"Black Graphic Printed", "L", "Pure Cotton");
			break;

		case "5":
			Roadster_tshirt k5 = new Roadster_tshirt("WROGN", "WROGN Men Teal Green Solid Polo Collar T-shirt ", 1399,
					"Teal Green", "L", "Pure Cotton");
			break;

		case "6":
			Puma_tshirt k6 = new Puma_tshirt("Puma",
					"Puma Men White ACTIVE Big Logo Printed dryCELL Round Neck T-shirt ", 1799, "White", "L",
					"Pure Cotton");
			break;

		case "7":
			Tommy_Hilfiger_tshirt k7 = new Tommy_Hilfiger_tshirt("Tommy Hilfiger",
					"Tommy Hilfiger Men Navy Blue & Off White Pure Cotton T-shirt", 2299, "Navy Blue & Off White", "L",
					"Pure Cotton");
			break;

		case "8":
			US_tshirt k8 = new US_tshirt("U S Polo Assn Men",
					"U S Polo Assn Men White & Red Striped Polo Collar Pure Cotton Slim Fit T-shirt", 1799,
					" White & Red Striped", "L", "Pure Cotton");
			break;

		case "9":
			US_tshirt2 k9 = new US_tshirt2("U S Polo Assn Men",
					" U.S. Polo Assn. Men Red Striped Polo Collar Pure Cotton Slim Fit T-shirt", 1799, "Red Striped",
					"L", "Pure Cotton");
			break;

		case "10":
			US_tshirt3 k10 = new US_tshirt3("U S Polo Assn Men", "Roadster Men's White Pure Cotton T-shirt", 1799,
					"White", "L", "Pure Cotton");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			T_Shirt();
			break;

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                      CONSTRUCTORS OF TSHIRT  CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Roadster_m extends T_Shirt {
	Roadster_m(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class HRX_tshirt extends T_Shirt {
	HRX_tshirt(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Levis_tshirt extends T_Shirt {
	Levis_tshirt(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class LP_tshirt extends T_Shirt {
	LP_tshirt(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Roadster_tshirt extends T_Shirt {
	Roadster_tshirt(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Puma_tshirt extends T_Shirt {
	Puma_tshirt(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Tommy_Hilfiger_tshirt extends T_Shirt {
	Tommy_Hilfiger_tshirt(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class US_tshirt extends T_Shirt {
	US_tshirt(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class US_tshirt2 extends T_Shirt {
	US_tshirt2(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class US_tshirt3 extends T_Shirt {
	US_tshirt3(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}
//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                                SHIRT  CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Shirt extends TopWear {

	public void Shirt() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite Shirt                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For Allen Solly Men White Modern Fit Self Design Casual Shirt");// 1599
		System.out.println(
				"Enter 2 For Louis Philippe Sport Men Grey & White Striped Pure Cotton Super Slim Fit Casual Shirt");// 2849
																														// Geometric
																														// Print
																														// 100%
																														// Cotton
																														// L
		System.out.println("Enter 3 For HIGHLANDER Men Green & White Slim Fit Printed Casual Shirt");// 1049
		System.out.println("Enter 4 For Calvin Klein Jeans Men White Solid Smart Slim Fit Casual Shirt");// 5499
		System.out.println(
				"Enter 5 For Flying Machine Men Navy Blue Slim Fit Brand Logo Printed Applique Pure Cotton Casual Shirt ");// 1999
		System.out.println("Enter 6 For Roadster Men Maroon & Black Checked Pure Cotton Sustainable Casual Shirt");// 1299
		System.out.println("Enter 7 For U.S. Polo Assn. Men Tailored Fit Colourblocked Pure Cotton Casual Shirt");// 2799
		System.out
				.println("Enter 8 For Louis Philippe Sport Men White & Blue Slim Fit Striped Pure Cotton Casual Shirt");// 2849
		System.out
				.println("Enter 9 For Flying Machine Men Off White Standard Slim Fit Printed Pure Cotton Casual Shirt");// 1799
		System.out.println("Enter 10 For Calvin Klein Jeans Men Black Solid Boxy Casual Shirt");// 5999

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			Allen_Solly_shirt k1 = new Allen_Solly_shirt("Allen Solly",
					"Allen Solly Men White Modern Fit Self Design Casual Shirt", 1599, "White", "L", "Pure Cotton");
			break;

		case "2":
			Lp_Shirt k2 = new Lp_Shirt("Louis Philippe",
					"Louis Philippe Sport Men Grey & White Striped Pure Cotton Super Slim Fit Casual Shirt", 2849,
					"Grey & White Striped", "L", "Pure Cotton");
			break;

		case "3":
			HIGHLANDER_shirt k3 = new HIGHLANDER_shirt("HIGHLANDER",
					"HIGHLANDER Men Green & White Slim Fit Printed Casual Shirt", 1049,
					"Green & White Slim Fit Printed ", "L", "Pure Cotton");
			break;

		case "4":
			Ck_shirts k4 = new Ck_shirts("Calvin Klein Jeans",
					"Calvin Klein Jeans Men White Solid Smart Slim Fit Casual Shirt", 5499, "White", "L",
					"Pure Cotton");
			break;

		case "5":
			FM_shirt k5 = new FM_shirt("Flying Machine",
					"Flying Machine Men Navy Blue Slim Fit Brand Logo Printed Applique Pure Cotton Casual Shirt ", 1999,
					"Navy Blue", "L", "Pure Cotton");
			break;

		case "6":
			Roadster_shirt k6 = new Roadster_shirt("Roadster",
					"Roadster Men Maroon & Black Checked Pure Cotton Sustainable Casual Shirt", 1299, "Maroon & Black",
					"L", "Pure Cotton");
			break;

		case "7":
			US_shirt k7 = new US_shirt("U.S. Polo Assn",
					"U.S. Polo Assn. Men Tailored Fit Colourblocked Pure Cotton Casual Shirt", 2799,
					"Tailored Fit Colourblocked", "L", "Pure Cotton");
			break;

		case "8":
			LP_shirt k8 = new LP_shirt("Louis Philippe Sport",
					"Louis Philippe Sport Men White & Blue Slim Fit Striped Pure Cotton Casual Shirt", 2849,
					" White & Blue ", "L", "Pure Cotton");
			break;

		case "9":
			FM_shirts k9 = new FM_shirts("Flying Machine",
					"Flying Machine Men Off White Standard Slim Fit Printed Pure Cotton Casual Shirt", 1799,
					"Off White", "L", "Pure Cotton");
			break;

		case "10":
			CK_shirts k10 = new CK_shirts("Calvin Klein Jeans", "Calvin Klein Jeans Men Black Solid Boxy Casual Shirt",
					5999, " Black Solid", "L", "Pure Cotton");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Shirt();
			break;

		}

	}

}
//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                           CONSTRUCTORS OF SHIRT  CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Allen_Solly_shirt extends Shirt {
	Allen_Solly_shirt(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Lp_Shirt extends Shirt {
	Lp_Shirt(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class HIGHLANDER_shirt extends Shirt {
	HIGHLANDER_shirt(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Ck_shirts extends Shirt {
	Ck_shirts(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Roadster_shirt extends Shirt {
	Roadster_shirt(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class FM_shirt extends Shirt {
	FM_shirt(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class US_shirt extends Shirt {
	US_shirt(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class LP_shirt extends Shirt {
	LP_shirt(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class FM_shirts extends Shirt {
	FM_shirts(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class CK_shirts extends Shirt {
	CK_shirts(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}
//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                           OTHER  CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Others extends TopWear {

	void method_3()

	{
		System.out.println("");

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Brand : " + Brand);
		System.out.println("Name : " + Name);
		System.out.println("Price : " + Price + " Ruppes");
		System.out.println("Color :" + Color);
		System.out.println("Size  : " + Size);
		System.out.println("Type :" + Type);

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("");

	}

	public void Others() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite Topwear                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For HRX n Men Navy Blue Solid Padded Jacket");// 1799
		System.out.println("Enter 2 For H&M Men Beige Regular Fit Faux Shearling Jacket");// 2299 Geometric Print 100%
																							// Cotton L
		System.out.println("Enter 3 For H&M Men Relaxed Fit Hoodie");// 1499
		System.out.println("Enter 4 For Louis Philippe Men White Zip Detail Front Open Puffer Jacket");// 6499
		System.out.println("Enter 5 For Allen Solly Men Navy Blue Solid Slim-Fit Three Piece Suit ");// 19999
		System.out.println("Enter 6 For HRX  Men Grey Solid Hooded Bomber Jacket");// 3999
		System.out.println("Enter 7 For Puma Men White & Black Colourblocked Power Full-Zip Hoodie Sporty Jacket");// 3999
		System.out.println("Enter 8 For U.S. Polo Assn. Men Navy Blue Solid Gilet Padded Jacket");// 4496
		System.out.println("Enter 9 For Arrow Men Navy Blue Checked Tailored Fit Single-Breasted Formal Suit");// 11000-
		System.out.println("Enter 10 For Louis Philippe Men Grey Self-Design Slim-Fit Single-Breasted Formal Suit");// 10999
		System.out.println("Enter 11 For Roadster Men Navy Solid Bomber");// 3999
		System.out.println("Enter 12 For INVICTUS Men Beige Solid Single-Breasted Slim Fit Smart Casual Blazer");// 4999

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			HRX_Jacket k1 = new HRX_Jacket("HRX", "HRX n Men Navy Blue Solid Padded Jacket", 1799, "Navy Blue ", "L",
					"Jacket");
			break;

		case "2":
			HM_jacket k2 = new HM_jacket("H&M", "H&M Men Beige Regular Fit Faux Shearling Jacket", 2849,
					"White Striped", "L", "Jacket");
			break;

		case "3":
			HM_Hoddie k3 = new HM_Hoddie("H&M ", "H&M Men Relaxed Fit Hoodie", 1499, " White Slim Fit Printed ", "L",
					" Hoodie");
			break;

		case "4":
			Lp_jacket k4 = new Lp_jacket("Louis Philippe",
					"Louis Philippe Men White Zip Detail Front Open Puffer Jacket", 5499,
					" White Zip Detail Front Open ", "L", "Jacket");
			break;

		case "5":
			AS_suit k5 = new AS_suit("Allen Solly", "Allen Solly Men Navy Blue Solid Slim-Fit Three Piece Suit", 19999,
					"Navy Blue", "L", "Three Piece Suit");
			break;

		case "6":
			HM_jacket2 k6 = new HM_jacket2("HRX", "HRX  Men Grey Solid Hooded Bomber Jacket", 3999, "Grey Solid Hooded",
					"L", "Jacket");
			break;

		case "7":
			puma_jacket k7 = new puma_jacket("Puma",
					"Puma Men White & Black Colourblocked Power Full-Zip Hoodie Sporty Jacket", 3999,
					"White & Black Colourblocked ", "L", " Hoodie Sporty Jacket");
			break;

		case "8":
			US_jacket k8 = new US_jacket("U.S. Polo Assn.", "U.S. Polo Assn. Men Navy Blue Solid Gilet Padded Jacket",
					4499, "Navy Blue Solid Gilet", "L", "Jacket");
			break;

		case "9":
			Arrow_suits k9 = new Arrow_suits("Arrow",
					"Arrow Men Navy Blue Checked Tailored Fit Single-Breasted Formal Suit", 11000, "Navy Blue ", "L",
					"Formal Suit");
			break;

		case "10":
			Lp_suits k10 = new Lp_suits("Louis Philippe Men",
					"Louis Philippe Men Grey Self-Design Slim-Fit Single-Breasted Formal Suit", 10999, "Grey", "L",
					"Formal Suit");
			break;

		case "11":
			Roadster_jacket k11 = new Roadster_jacket("Roadster", "Roadster Men Navy Solid Bomber", 3999, " Navy  ",
					"L", "Bomber");
			break;

		case "12":
			blazer k12 = new blazer("INVICTUS", "INVICTUS Men Beige Solid Single-Breasted Slim Fit Smart Casual Blazer",
					5999, " Black Solid", "L", "Blazer");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Others();
			break;

		}

	}

}
//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                           CONSTRUCTORS OF OTHERS  CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class HRX_Jacket extends Others {
	HRX_Jacket(String Brand, String Name, double Price, String Color, String Size, String Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Type = Type;
		method_3();

	}

}

class HM_jacket extends Others {
	HM_jacket(String Brand, String Name, double Price, String Color, String Size, String Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Type = Type;
		method_3();

	}

}

class HM_Hoddie extends Others {
	HM_Hoddie(String Brand, String Name, double Price, String Color, String Size, String Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Type = Type;
		method_3();

	}

}

class Lp_jacket extends Others {
	Lp_jacket(String Brand, String Name, double Price, String Color, String Size, String Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Type = Type;
		method_3();

	}

}

class AS_suit extends Others {
	AS_suit(String Brand, String Name, double Price, String Color, String Size, String Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Type = Type;
		method_3();

	}

}

class HM_jacket2 extends Others {
	HM_jacket2(String Brand, String Name, double Price, String Color, String Size, String Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Type = Type;
		method_3();

	}

}

class puma_jacket extends Others {
	puma_jacket(String Brand, String Name, double Price, String Color, String Size, String Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Type = Type;
		method_3();

	}

}

class US_jacket extends Others {
	US_jacket(String Brand, String Name, double Price, String Color, String Size, String Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Type = Type;
		method_3();

	}

}

class Arrow_suits extends Others {
	Arrow_suits(String Brand, String Name, double Price, String Color, String Size, String Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Type = Type;
		method_3();

	}

}

class Lp_suits extends Others {
	Lp_suits(String Brand, String Name, double Price, String Color, String Size, String Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Type = Type;
		method_3();

	}

}

class Roadster_jacket extends Others {
	Roadster_jacket(String Brand, String Name, double Price, String Color, String Size, String Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Type = Type;
		method_3();

	}

}

class blazer extends Others {
	blazer(String Brand, String Name, double Price, String Color, String Size, String Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Type = Type;
		method_3();

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                           BOTTOMWEAR CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Bottomwear extends Men {
	public void Bottomwear()

	{
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite Bottomwear                                                               ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println("Enter 1 For Jeans");
		System.out.println("Enter 2 For  Trousers");
		System.out.println("Enter 3 For Other Bottomwear");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Chocolates c2 = new Chocolates();
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			(new Jeans()).Jeans();
			break;

		case "2":
			(new Trousers()).Trousers();
			break;

		case "3":
			(new Others_B()).Others_B();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Bottomwear();
			break;

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                            JEANS CLASS
//    
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Jeans extends Bottomwear {

	public void Jeans() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite Jeans                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For HIGHLANDER Men Black Tapered Fit Mid-Rise Clean Look Stretchable Jeans");
		System.out.println("Enter 2 For SPYKAR Men Blue Kano Slim Fit Mid Rise Light Fade Stretchable Jeans");
		System.out.println("Enter 3 For Roadster Men Navy Blue Slim Fit Mid-Rise Clean Look Stretchable Jeans");
		System.out.println("Enter 4 For Levis Men Blue 512 Tapered Fit Heavy Fade Stretchable Jeans");
		System.out
				.println("Enter 5 For Louis Philippe Jeans Men Black Slim Fit Mid-Rise Clean Look Stretchable Jeans ");
		System.out.println(
				"Enter 6 For U S Polo Assn Denim Co Men Blue Regallo Skinny Fit Light Fade Stretchable Jeans ");
		System.out.println("Enter 7 For Levis Men Grey 511 Slim Fit Mid Rise Light Fade Stretchable Jeans");
		System.out.println("Enter 8 For Pepe Jeans Men Blue Regular Fit Mid-Rise Clean Look Jeans");
		System.out.println("Enter 9 For SPYKAR Men Navy Blue Kano Slim Fit Tapered Leg Ankle Length Stretchable Jeans");
		System.out.println("Enter 10 For Flying Machine Men Black Slim Fit Mid-Rise Stretchable Jeans ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			HIGHLANDER_jeans k1 = new HIGHLANDER_jeans("HIGHLANDER",
					"HIGHLANDER Men Black Tapered Fit Mid-Rise Clean Look Stretchable Jeans", 1299, "Black", "L",
					"Jeans");
			break;

		case "2":
			SPYKAR_jeans k2 = new SPYKAR_jeans("SPYKAR",
					"SPYKAR Men Blue Kano Slim Fit Mid Rise Light Fade Stretchable Jeans", 3399, "Blue", "L", "Jeans");
			break;

		case "3":
			Roadster_jeans k3 = new Roadster_jeans("Roadster",
					"Roadster Men Navy Blue Slim Fit Mid-Rise Clean Look Stretchable Jeans", 1499, "Navy Blue", "L",
					"Jeans");
			break;

		case "4":
			Levis_jeans k4 = new Levis_jeans("Levis", "Levis Men Blue 512 Tapered Fit Heavy Fade Stretchable Jeans",
					1049, "Blue", "L", "Jeans");
			break;

		case "5":
			LP_jeans k5 = new LP_jeans("Louis Philippe Jeans",
					"Louis Philippe Jeans Men Black Slim Fit Mid-Rise Clean Look Stretchable Jeans ", 2999, " Black",
					"L", "Jeans");
			break;

		case "6":
			US_jeans k6 = new US_jeans("U S Polo Assn Denim",
					"U S Polo Assn Denim Co Men Blue Regallo Skinny Fit Light Fade Stretchable Jeans", 2399, "Blue",
					"L", "Jeans");
			break;

		case "7":
			Levis_jeans k7 = new Levis_jeans("Levis",
					"Levis Men Grey 511 Slim Fit Mid Rise Light Fade Stretchable Jeans", 2899, "Grey", "L", "Jeans");
			break;

		case "8":
			Pepe_jeans k8 = new Pepe_jeans("Pepe Jeans", "Pepe Jeans Men Blue Regular Fit Mid-Rise Clean Look Jeans",
					2799, "Blue", "L", "Jeans");
			break;

		case "9":
			SPYKAR_jeans k9 = new SPYKAR_jeans("SPYKAR",
					"SPYKAR Men Navy Blue Kano Slim Fit Tapered Leg Ankle Length Stretchable Jeans", 3199, "Navy Blue",
					"L", "Jeans");
			break;

		case "10":
			FM_jeans k10 = new FM_jeans("Flying Machine",
					"Flying Machine Men Black Slim Fit Mid-Rise Stretchable Jeans", 2399, "Black", "L", "Jeans");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Jeans();
			break;

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                        CONSTRUCTORS OF JEANS CLASS
//  
//
//______________________________________________________________________________________________________________________________________________________________________________________

class HIGHLANDER_jeans extends Jeans {
	HIGHLANDER_jeans(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class SPYKAR_jeans extends Jeans {
	SPYKAR_jeans(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Roadster_jeans extends Jeans {
	Roadster_jeans(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Levis_jeans extends Jeans {
	Levis_jeans(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class LP_jeans extends Jeans {
	LP_jeans(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class US_jeans extends Jeans {
	US_jeans(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Pepe_jeans extends Jeans {
	Pepe_jeans(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class FM_jeans extends Jeans {
	FM_jeans(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                          TROUSERS CLASS
//  
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Trousers extends Bottomwear {

	public void Trousers() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite Trousers                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For Roadster Men Navy Blue Solid Mid-Rise Woven Pure Cotten Cargo Trousers");// 2399
		System.out.println("Enter 2 For Louis Philippe Sport Men Cream-Coloured Slim Fit Chinos Trouse");// 1999
																											// Geometric
																											// Print
																											// 100%
																											// Cotton L
		System.out.println("Enter 3 For Arrow Sport Men Black Slim Fit Chinos");// 2499
		System.out.println("Enter 4 For Allen Solly Men Grey Textured Slim Fit Casual Trousers");// 2799
		System.out.println("Enter 5 For Peter England Casuals Men Grey Slim Fit Trousers ");// 1799
		System.out.println("Enter 6 For Blackberrys Men Navy Blue Skinny Fit Chinos Trousers");// 2395
		System.out.println("Enter 7 For Louis Philippe Sport Men Black Textured Slim Fit Regular Trousers");// 2999
		System.out.println("Enter 8 For Blackberrys Men Grey Checked B-95 Slim Fit Trousers");// 2795

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			Roadster_trouser k1 = new Roadster_trouser("Roadster",
					"Roadster Men Navy Blue Solid Mid-Rise Woven Pure Cotten Cargo Trousers", 2399, "Navy Blue", "L",
					"Pure Cotton");
			break;

		case "2":
			Lp_trouser k2 = new Lp_trouser("Louis Philippe",
					"Louis Philippe Sport Men Cream-Coloured Slim Fit Chinos Trouse", 1999, "Cream-Coloured", "L",
					"Pure Cotton");
			break;

		case "3":
			Arrow_chinos k3 = new Arrow_chinos("Arrow", "Arrow Sport Men Black Slim Fit Chinos", 2499, "Black", "L",
					"Pure Cotton");
			break;

		case "4":
			As_trouser k4 = new As_trouser("Allen Solly", "Allen Solly Men Grey Textured Slim Fit Casual Trousers",
					2799, "Grey Textured", "L", "Pure Cotton");
			break;

		case "5":
			PE_trouser k5 = new PE_trouser("Peter England", "Peter England Casuals Men Grey Slim Fit Trousers", 1799,
					"Grey", "L", "Pure Cotton");
			break;

		case "6":
			Blackberrys_trouser k6 = new Blackberrys_trouser("Blackberrys",
					"Blackberrys Men Navy Blue Skinny Fit Chinos Trousers", 2395, "Navy Blue", "L", "Pure Cotton");
			break;

		case "7":
			LP_trouser k7 = new LP_trouser("Louis Philippe Sport",
					"Louis Philippe Sport Men Black Textured Slim Fit Regular Trousers", 2999, "Black", "L",
					"Pure Cotton");
			break;

		case "8":
			Blackberrys_trouser2 k8 = new Blackberrys_trouser2("Blackberrys",
					"Blackberrys Men Grey Checked B-95 Slim Fit Trousers", 2849, "Grey", "L", "Pure Cotton");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Trousers();
			break;

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                       CONSTRUCTORS OF TROUSER  CLASS
//  
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Roadster_trouser extends Trousers {
	Roadster_trouser(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Lp_trouser extends Trousers {
	Lp_trouser(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Arrow_chinos extends Trousers {
	Arrow_chinos(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class As_trouser extends Trousers {
	As_trouser(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class PE_trouser extends Trousers {
	PE_trouser(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Blackberrys_trouser extends Trousers {
	Blackberrys_trouser(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class LP_trouser extends Trousers {
	LP_trouser(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Blackberrys_trouser2 extends Trousers {
	Blackberrys_trouser2(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                     OTHERS_B  CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Others_B extends Bottomwear {

	void method_4()

	{
		System.out.println("");

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Brand : " + Brand);
		System.out.println("Name : " + Name);
		System.out.println("Price : " + Price + " Ruppes");
		System.out.println("Color :" + Color);
		System.out.println("Size  : " + Size);
		System.out.println("Type : " + Type);

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("");

	}

	public void Others_B() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite Bottomwear                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For Puma Men Printed Training dryCELL Sports Shorts");// 1199
		System.out.println("Enter 2 For Allen Solly Men Blue Slim Fit Shorts");// 1499 Geometric Print 100% Cotton L
		System.out.println("Enter 3 For ADIDAS Men White & Black Club Brand Logo Printed Tennis Sports Shorts");// 1999
		System.out.println("Enter 4 For Puma Men Navy Blue Solid Regular Fit PERFORMANCE WOVEN 5\" Sports Shorts");// 1799
		System.out.println("Enter 5 For HRX by Hrithik Roshan Men Black Solid Rapid Dry Running Joggers");// 1189
		System.out.println("Enter 6 For ADIDAS Men Black Solid Track Pants");// 1999
		System.out.println("Enter 7 For Jockey Men Navy Blue Solid Regular Fit Track Pants");// 999
		System.out.println("Enter 8 For HRX Active by Hrithik Roshan Men Black Active Track Pants");// 1899

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			Puma_Shorts k1 = new Puma_Shorts("Puma", "Puma Men Printed Training dryCELL Sports Shorts", 1299,
					"White Printed ", "L", "Shorts");
			break;

		case "2":
			AS_shorts k2 = new AS_shorts("Allen Solly", "Allen Solly Men Blue Slim Fit Shorts", 1149, "Blue ", "L",
					"Shorts");
			break;

		case "3":
			ADIDAS_shorts k3 = new ADIDAS_shorts("ADIDAS",
					"ADIDAS Men White & Black Club Brand Logo Printed Tennis Sports Shorts", 1499, "White & Black", "L",
					"Sports Shorts");
			break;

		case "4":
			Puma_shorts k4 = new Puma_shorts("Puma",
					"Puma Men Navy Blue Solid Regular Fit PERFORMANCE WOVEN Sports Shorts", 1999, "Navy Blue ", "L",
					"Sports Shorts");
			break;

		case "5":
			HRX_joggers k5 = new HRX_joggers("HRX", "HRX by Hrithik Roshan Men Black Solid Rapid Dry Running Joggers",
					1999, "Black", "L", "Joggers");
			break;

		case "6":
			ADIDAS_track k6 = new ADIDAS_track("ADIDAS", "ADIDAS Men Black Solid Track Pants", 1999, "Black", "L",
					"Track Pants");
			break;

		case "7":
			Jockey_track k7 = new Jockey_track("Jockey", "Jockey Men Navy Blue Solid Regular Fit Track Pants", 999,
					" Navy Blue", "L", "Track Pants");
			break;

		case "8":
			HRX_track k8 = new HRX_track("HRX", "HRX Active by Hrithik Roshan Men Black Active Track Pants", 1999,
					"Black", "L", "Track Pants");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Others_B();
			break;

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                   	CONSTRUCTORS OF OTHERS_B  CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Puma_Shorts extends Others_B {
	Puma_Shorts(String Brand, String Name, double Price, String Color, String Size, String Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Type = Type;
		method_4();

	}

}

class AS_shorts extends Others_B {
	AS_shorts(String Brand, String Name, double Price, String Color, String Size, String Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Type = Type;
		method_4();

	}

}

class ADIDAS_shorts extends Others_B {
	ADIDAS_shorts(String Brand, String Name, double Price, String Color, String Size, String Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Type = Type;
		method_4();

	}

}

class Puma_shorts extends Others_B {
	Puma_shorts(String Brand, String Name, double Price, String Color, String Size, String Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Type = Type;
		method_4();

	}

}

class HRX_joggers extends Others_B {
	HRX_joggers(String Brand, String Name, double Price, String Color, String Size, String Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Type = Type;
		method_4();

	}

}

class ADIDAS_track extends Others_B {
	ADIDAS_track(String Brand, String Name, double Price, String Color, String Size, String Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Type = Type;
		method_4();

	}

}

class Jockey_track extends Others_B {
	Jockey_track(String Brand, String Name, double Price, String Color, String Size, String Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Type = Type;
		method_4();

	}

}

class HRX_track extends Others_B {
	HRX_track(String Brand, String Name, double Price, String Color, String Size, String Type) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Type = Type;
		method_4();

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                       	WOMEN CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Women extends Fashion {

	public void Women()

	{
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select                                                                 ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println("Enter 1 For Indian & Fusion Wear");
		System.out.println("Enter 2 For Western Wear");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			(new Indian_wear()).Indian_wear();
			break;

		case "2":
			(new Western_wear()).Western_wear();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Women();
			break;

		}

	}

}

class Indian_wear extends Women {
	public void Indian_wear()

	{
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite Indian wear                                                                ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println("Enter 1 For Kurtis");
		System.out.println("Enter 2 For Sarees");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Chocolates c2 = new Chocolates();
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			(new Kurtis()).Kurtis();
			break;

		case "2":
			(new Sarees()).Sarees();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Indian_wear();
			break;

		}

	}

}

class Sarees extends Indian_wear {

	public void Sarees() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite Sarees                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out
				.println("Enter 1 For MOKSHA DESIGNS Turquoise Blue & Blue Woven Design Zari Pure Silk Banarasi Saree");
																														
																														
		System.out.println("Enter 2 For Inddus Women Ivory Floral Embroidered Silk Blend Saree with Blouse Piece");
																													
		System.out.println("Enter 3 For Sangria Black Floral Gotta Patti Velvet Saree");
		System.out.println("Enter 4 For Inddus Yellow & White Solid Embroidered Net Saree");
		System.out.println("Enter 5 For kasee Pink & Red Floral Embroidered Net Heavy Work Saree ");
		System.out.println("Enter 6 For MABISH  Green Belted  Frilled Saree");
		System.out.println("Enter 7 For Jinax Green & Gold-Toned Ethnic Motifs Zari Pure Silk Banarasi Saree");

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			MOKSHA_sarees k1 = new MOKSHA_sarees("MOKSHA",
					"MOKSHA DESIGNS Turquoise Blue & Blue Woven Design Zari Pure Silk Banarasi Saree", 20100,
					" Turquoise Blue", "L", "Silk Banarasi Saree");
			break;

		case "2":
			Inddus_saree k2 = new Inddus_saree("Inddus",
					"Inddus Women Ivory Floral Embroidered Silk Blend Saree with Blouse Piece", 4499, "Ivory Floral ",
					"L", "Silk Blend Saree ");
			break;

		case "3":
			Sangria_saree k3 = new Sangria_saree("Sangria", "Sangria Black Floral Gotta Patti Velvet Saree", 3999,
					"Black Floral", "L", "Velvet Saree");
			break;

		case "4":
			Inddus_y_saree k4 = new Inddus_y_saree("Inddus", "Inddus Yellow & White Solid Embroidered Net Saree", 3499,
					"Yellow & White", "L", " Net Saree");
			break;

		case "5":
			kasee_Saree k5 = new kasee_Saree("kasee", "kasee Pink & Red Floral Embroidered Net Heavy Work Saree", 6999,
					"Pink & Red ", "L", " Net Heavy Work Saree");
			break;

		case "6":
			MABISH_saree k6 = new MABISH_saree("MABISH", "MABISH  Green Belted  Frilled Saree", 4099, " Green Belted",
					"L", "Frilled Saree");
			break;

		case "7":
			Jinax_saree k7 = new Jinax_saree("Jinax",
					"Jinax Green & Gold-Toned Ethnic Motifs Zari Pure Silk Banarasi Saree", 5999, "Green & Gold-Toned",
					"L", "Pure Silk Banarasi Saree");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Sarees();
			break;

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                             CONSTRUCTORS OF SAREES
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class MOKSHA_sarees extends Sarees {
	MOKSHA_sarees(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Inddus_saree extends Sarees {
	Inddus_saree(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Sangria_saree extends Sarees {
	Sangria_saree(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Inddus_y_saree extends Sarees {
	Inddus_y_saree(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class kasee_Saree extends Sarees {
	kasee_Saree(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class MABISH_saree extends Sarees {
	MABISH_saree(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Jinax_saree extends Sarees {
	Jinax_saree(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                             CLASS KURTIS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class Kurtis extends Indian_wear {

	public void Kurtis() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite Kurtis                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"Enter 1 For KALINI Women Beige Floral Yoke Design Straight Kurta with Trousers & With Dupatta");// 3699
																													// white
																													// 100%
																													// Cotton
																													// L
		System.out.println("Enter 2 For Varanga Women Maroon Embroidered Yoke Design Kurta with Trousers & Dupatta");// 5999
																														// Geometric
																														// Print
																														// 100%
																														// Cotton
																														// L
		System.out.println("Enter 3 For KALINI Women Pink Floral Printed Kurta with Trousers & With Dupatta");// 3499
		System.out.println("Enter 4 For Anouk Women Navy Blue & Beige Printed Kurta with Palazzos");// 2699
		System.out.println(
				"Enter 5 For Indo Era Beige & Maroon Zari Embroidered Straight Kurta Palazzo With Dupatta Set ");// 6999
		System.out.println("Enter 6 For Varanga Women Off White & Golden Ethnic Motifs Printed Kurta ");// 6099
		System.out.println("Enter 7 For Sangria Floral Printed Pure Cotton Kurta with Palazzos & With Dupatta");// 6599

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			KALINI_kurti k1 = new KALINI_kurti("KALINI",
					"KALINI Women Beige Floral Yoke Design Straight Kurta with Trousers & With Dupatta", 3699,
					"Beige Floral Yoke Design ", "L", "Pure Cotton");
			break;

		case "2":
			Varanga_kurti k2 = new Varanga_kurti("Varanga Women",
					"Varanga Women Maroon Embroidered Yoke Design Kurta with Trousers & Dupatta", 5999,
					"Maroon Embroidered Yoke Design", "L", "Pure Cotton");
			break;

		case "3":
			KALINI_kurti2 k3 = new KALINI_kurti2("KALINI",
					"KALINI Women Pink Floral Printed Kurta with Trousers & With Dupatta", 3499,
					"Pink Floral Printed Kurta", "L", "Pure Cotton");
			break;

		case "4":
			Anouk_kurti k4 = new Anouk_kurti("Anouk", "Anouk Women Navy Blue & Beige Printed Kurta with Palazzos", 2699,
					"Navy Blue & Beige Printed", "L", "Pure Cotton");
			break;

		case "5":
			Indo_Era_kurti k5 = new Indo_Era_kurti("Indo Era",
					"Indo Era Beige & Maroon Zari Embroidered Straight Kurta Palazzo With Dupatta Set", 6999,
					"Beige & Maroon Zari ", "L", "Pure Cotton");
			break;

		case "6":
			Varanga_kurti2 k6 = new Varanga_kurti2("Varanga",
					"Varanga Women Off White & Golden Ethnic Motifs Printed Kurta ", 6099, "Off White & Golden", "L",
					"Pure Cotton");
			break;

		case "7":
			Sangria_kurti k7 = new Sangria_kurti("Sangria",
					"Sangria Floral Printed Pure Cotton Kurta with Palazzos & With Dupatta", 6599, "Floral Printed",
					"L", "Pure Cotton");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Kurtis();
			break;

		}

	}

}


//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                        CONSTRUCTORS OF CLASS KURTIS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class KALINI_kurti extends Kurtis {
	KALINI_kurti(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Varanga_kurti extends Kurtis {
	Varanga_kurti(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class KALINI_kurti2 extends Kurtis {
	KALINI_kurti2(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Anouk_kurti extends Kurtis {
	Anouk_kurti(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Indo_Era_kurti extends Kurtis {
	Indo_Era_kurti(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Varanga_kurti2 extends Kurtis {
	Varanga_kurti2(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Sangria_kurti extends Kurtis {
	Sangria_kurti(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                            KURTIS  WESTERNWEAR
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class Western_wear extends Women {
	public void Western_wear()

	{
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite Westerns wear                                                                ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");
		System.out.println("Enter 1 For Dress");
		System.out.println("Enter 2 For T-shirts");
		System.out.println("Enter 3 For Jeans");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Chocolates c2 = new Chocolates();
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			(new Dress()).Dress();
			break;

		case "2":
			(new W_T_Shirt()).W_T_Shirt();
			break;

		case "3":
			(new W_Jeans()).W_Jeans();
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Western_wear();
			break;

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                         DRESS CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class Dress extends Indian_wear {

	public void Dress() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite Kurtis                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println("Enter 1 For H&M Women Pink Sequined Dress");// 2999 white 100% Cotton L
		System.out.println("Enter 2 For DressBerry Black Ribbed Jumper Dress");// 2649 Geometric Print 100% Cotton L
		System.out.println(
				"Enter 3 For Antheaa Black & Rust Orange Floral Print Tiered Midi Fit & Flare Dress with Ruffles");// 2459
		System.out.println("Enter 4 For H&M Women Black Glittery wrap dress");// 1499
		System.out.println("Enter 5 For Styli White Mock Neck Puff Sleeves Tie-Ups Detailed Flounce Maxi Dress");// 1899

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			HM_dress k1 = new HM_dress("H&M", "H&M Women Pink Sequined Dress", 3699, "Pink", "L", "Sequined Dress");
			break;

		case "2":
			DressBerry_dress k2 = new DressBerry_dress("DressBerry", "DressBerry Black Ribbed Jumper Dress", 5999,
					"Black ", "L", "Jumper Dress");
			break;

		case "3":
			Antheaa_dress k3 = new Antheaa_dress("Antheaa",
					"Antheaa Black & Rust Orange Floral Print Tiered Midi Fit & Flare Dress with Ruffles", 3499,
					"Black & Rust Orange", "L", "Flare Dress");
			break;

		case "4":
			HM_dress k4 = new HM_dress("H&M", "H&M Women Black Glittery wrap dress", 2699, "Black", "L", "wrap dress");
			break;

		case "5":
			Styli_dress k5 = new Styli_dress("Styli",
					"Styli White Mock Neck Puff Sleeves Tie-Ups Detailed Flounce Maxi Dress", 6999, "White", "L",
					" Flounce Maxi Dress");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			Dress();
			break;

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                          CONSTRUCTORS OF DRESS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________

class HM_dress extends Dress {
	HM_dress(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class DressBerry_dress extends Dress {
	DressBerry_dress(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Antheaa_dress extends Dress {
	Antheaa_dress(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Styli_dress extends Dress {
	Styli_dress(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                        WOMEN T SHIRT CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class W_T_Shirt extends TopWear {

	public void W_T_Shirt() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite T-Shirt                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"Enter 1 For Calvin Klein Jeans Women Brand Logo Printed Pure Cotton Applique Slim Fit T-shirt");// 2999
																													
																													// L
		System.out.println("Enter 2 For Tommy Hilfiger Women Black & White Brand Logo Printed Pure Cotton T-shirt");// 1999
																													
		System.out.println("Enter 3 For Anta Women Black & White Colourblocked Cotton T-shirt");// 2079
		System.out.println("Enter 4 For ADIDAS Women Pink & White BLUV Q3 T B Brand Logo Print Pure Cotton T-shirt");// 1999
		System.out.println("Enter 5 For Levis Women White Drop-Shoulder Sleeves Pure Cotton Boxy T-shirt");// 2899
		System.out.println("Enter 6 For Puma Women Pink Cloudspun Long Sleeve Running T-Shirt ");// 3499

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			Ck_w_tshirt k1 = new Ck_w_tshirt("Calvin Klein Jeans",
					"Calvin Klein Jeans Women Brand Logo Printed Pure Cotton Applique Slim Fit T-shirt", 2999, "White",
					"L", "Pure Cotton");
			break;

		case "2":
			TH_t_shirt k2 = new TH_t_shirt("Tommy Hilfiger",
					"Tommy Hilfiger Women Black & White Brand Logo Printed Pure Cotton T-shirt", 1999, "Black & White ",
					"L", "Pure Cotton");
			break;

		case "3":
			Anta_tshirt k3 = new Anta_tshirt("Anta", "Anta Women Black & White Colourblocked Cotton T-shirt", 2079,
					"Black & White", "L", "Pure Cotton");
			break;

		case "4":
			ADIDAS_w_tshirt k4 = new ADIDAS_w_tshirt("ADIDAS",
					"ADIDAS Women Pink & White BLUV Q3 T B Brand Logo Print Pure Cotton T-shirt", 2999, "Pink & White",
					"L", "Pure Cotton");
			break;

		case "5":
			Levis_w_tshirt k5 = new Levis_w_tshirt("Levis",
					"Levis Women White Drop-Shoulder Sleeves Pure Cotton Boxy T-shirt", 2899, "White", "L",
					"Pure Cotton");
			break;

		case "6":
			Puma_w_tshirt k6 = new Puma_w_tshirt("Puma", "Puma Women Pink Cloudspun Long Sleeve Running T-Shirt ", 1799,
					"Pink Cloudspun", "L", "Pure Cotton");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			W_T_Shirt();
			break;

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                        CONSTRUCTORS OF wOMEN T SHIRT
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class Ck_w_tshirt extends W_T_Shirt {
	Ck_w_tshirt(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class TH_t_shirt extends W_T_Shirt {
	TH_t_shirt(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Anta_tshirt extends W_T_Shirt {
	Anta_tshirt(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class ADIDAS_w_tshirt extends W_T_Shirt {
	ADIDAS_w_tshirt(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Levis_w_tshirt extends W_T_Shirt {
	Levis_w_tshirt(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Puma_w_tshirt extends W_T_Shirt {
	Puma_w_tshirt(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                        JEANS CLASS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class W_Jeans extends Bottomwear {

	public void W_Jeans() {
		System.out.println("");
		System.out.println("");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"                                                                        Select Your Favourite Jeans                                                                    ");
		System.out.println(
				"===========================================================================================================================================================================================================================================");

		System.out.println(
				"Enter 1 For Tommy Hilfiger Women Grey High-Rise Mildly Distressed Light Fade Stretchable Jeans");// 6999
																													// white
																													// 100%
																													// Cotton
																													// L
		System.out.println("Enter 2 For Roadster Women Navy Blue Skinny Fit High-Rise Jeans");// 1299 Geometric Print
																								// 100% Cotton L
		System.out.println(
				"Enter 3 For Flying Machine Women Blue Twiggy Super Skinny Fit Mid-Rise Heavy Fade Stretchable Jeans");// 2199
		System.out.println("Enter 4 For Levis Women Navy Blue 715 Bootcut Mid-Rise Clean look Stretchable Jeans");// 3799
		System.out.println(
				"Enter 5 For Calvin Klein Jeans Women Blue Slim Boot Fit High-Rise Light Fade Stretchable Jeans");// 7999
		System.out.println("Enter 6 For GANT Women Off White Slim Fit Jeans");// 2399

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Enter Number: ");
		Scanner sk = new Scanner(System.in);
		String c1 = sk.next();
		switch (c1) {
		case "1":
			TH_w_jeans k1 = new TH_w_jeans("Tommy Hilfiger",
					"Tommy Hilfiger Women Grey High-Rise Mildly Distressed Light Fade Stretchable Jeans", 6999, "Grey ",
					"L", "Jeans");
			break;

		case "2":
			Roadster_w_jeans k2 = new Roadster_w_jeans("Roadster",
					"Roadster Women Navy Blue Skinny Fit High-Rise Jeans", 1299, "Navy Blue", "L", "Jeans");
			break;

		case "3":
			FM_w_jeans k3 = new FM_w_jeans("Flying Machine",
					"Flying Machine Women Blue Twiggy Super Skinny Fit Mid-Rise Heavy Fade Stretchable Jeans", 2199,
					"Blue", "L", "Jeans");
			break;

		case "4":
			Levis_w_jeans k4 = new Levis_w_jeans("Levis",
					"Levis Women Navy Blue 715 Bootcut Mid-Rise Clean look Stretchable Jeans", 4999, "Blue", "L",
					"Jeans");
			break;

		case "5":
			CK_w_jeans k5 = new CK_w_jeans("Calvin Klein Jeans",
					"Calvin Klein Jeans Women Blue Slim Boot Fit High-Rise Light Fade Stretchable Jeans", 6999, "Blue",
					"L", "Jeans");
			break;

		case "6":
			GANT_w_jeans k6 = new GANT_w_jeans("GANT", "GANT Women Off White Slim Fit Jeans", 5999, "Off White", "L",
					"Jeans");
			break;

		default:
			System.out.println("");

			System.out.println("");
			System.out.println(
					"**************************************************************************************************************************************************************************************************");
			System.out.println(
					"                                                !!!!!!Enter Valid Input!!!!!!                                   ");
			System.out.println(
					"************************************************************************************************************************************************************************************************");
			W_Jeans();
			break;

		}

	}

}

//______________________________________________________________________________________________________________________________________________________________________________________
//
//
//
//                                                        CONSTRUCTORS OF JEANS
//
//
//______________________________________________________________________________________________________________________________________________________________________________________


class TH_w_jeans extends W_Jeans {
	TH_w_jeans(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Roadster_w_jeans extends W_Jeans {
	Roadster_w_jeans(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class FM_w_jeans extends W_Jeans {
	FM_w_jeans(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class Levis_w_jeans extends W_Jeans {
	Levis_w_jeans(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class CK_w_jeans extends W_Jeans {
	CK_w_jeans(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

class GANT_w_jeans extends W_Jeans {
	GANT_w_jeans(String Brand, String Name, double Price, String Color, String Size, String Fabric) {
		this.Brand = Brand;
		this.Name = Name;
		this.Price = Price;
		this.Color = Color;
		this.Size = Size;
		this.Fabric = Fabric;
		method_7();

	}

}

/*______________________________________________________________________________________________________________________________________________________________________________________
//
//
//														   PROJECT NAME:- QMART/JMART
// 														   NAME :- SUSHANT BABAN PATIL
//                                                         BRANCH :- MECHANICAL 
//                                                         COURSE :- BECHELOR'S OF ENGINEERING  
 * 														         ****JMART*****
 * 										 1)ELECTRONICS   2)GROCERY    3)FASHION    4)GOOD SPORTS & FITNESS EQUIPMENT                                            
//														
//
//* ______________________________________________________________________________________________________________________________________________________________________________________
 */
 



