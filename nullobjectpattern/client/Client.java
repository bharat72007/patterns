package com.java.nullobjectpattern.client;

import com.java.nullobjectpattern.AppUser;
import com.java.nullobjectpattern.NullUser;
import com.java.nullobjectpattern.User;

/*
 * Description : In case Object is heavily Used @ Client and also there are chances that
 * Business Logic may return null, then In Place of Sending null, Business Logic will return 
 * FAKE Object.
 * Advantage: 
 * Client Code don't need to handle null checks of User Object,
 * hence it code remain clean and error free(which could rise due to If-Else Jungle)
 * The Below Code, will handle both situation, FAKE and REAL object.
 * 
 * Another aspect, is in Collection: Instead of returning NULL, return Collections.emptyList():Then Check
 * for Size If gt 0, then Only access its Elements.If you don't provide check for Size, it will throw 
 * Index OUT OF Bound Exception.
 * So Two Observations :
 *  ==>Firstly NPE is resolved, even on returning Empty Collection, But from this we would be able to invoke 
 *     Control methods in Collection viz: isEmpty(), size() etc;
 *  ==>NULL Object Pattern is used to avoid NPE.
 * 
 */

public class Client {
	
	public static void main(String args[]){
		User user = getUser();
		
		//We need to Write Code surrounded By If Condition for NULL Check.
		//Else it will Throw NPE Exception.
		/*if(user != null){
			user.authentic();
			user.getAge();
			user.getId();
			user.getName();
			System.out.println("Is auth :" + user.authentic());
			System.out.println("Age :" + user.getAge());
			System.out.println("Id :" + user.getId());
			System.out.println("Name :" + user.getName());
		}*/
		
		//But If we use Null Object For User, using Null Object Pattern, then Client Code
		//Remains the same, and we don't need to write code surrounded by If Condition for NULL Checks.
		//Client without any Hesitation can use it. and its Client Code will not Blow Up.
		user.authentic();
		user.getAge();
		user.getId();
		user.getName();
		user.skills();
		
		System.out.println("Is auth :" + user.authentic());
		System.out.println("Age :" + user.getAge());
		System.out.println("Id :" + user.getId());
		System.out.println("Name :" + user.getName());
		//This will Throw NPE, If we are returning null for Collection, Provide Proper check before accessing its Elements.
		if(user.skills().size() > 0)
			System.out.println("First Skill :" + user.skills().get(0));
	}
	
	//Business Logic : Based on the Logic, will return FAKE User Object or REAL User Object
	private static User getUser() {
		// TODO Auto-generated method stub
		return new NullUser(null,null,null);
		//return new AppUser("jaibh01","bharat",00);
		//return null; //This will leads to NPE, hence we need to apply If checks for User.
	}
}
