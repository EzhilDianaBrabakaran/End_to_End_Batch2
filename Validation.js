function validate()
{
	var firstname = document.forms["userRegForm"]["firstName"];     
	var lastname = document.forms["userRegForm"]["lastName"];     
	var email = document.forms["userRegForm"]["email"];     
	var phone = document.forms["userRegForm"]["phone"];     
	var pwd1 = document.forms["userRegForm"]["pwd1"];     
	var pwd2 = document.forms["userRegForm"]["pwd2"];     
  
	

if(firstname.value=="")
	{
	window.alert("FirstName should not be empty");
	 firstname.focus(); 
	return false;
	}

else if(lastname.value=="")
{
window.alert("LastName should not be empty");
 lastname.focus(); 
return false;
}

else if(email.value=="")
{
window.alert("Email should not be empty");
 email.focus(); 
return false;
}
else if(phone.value=="")
{
window.alert("Phone number should not be empty");
 phone.focus(); 
return false;
}
else if(pwd1.value=="")
{
window.alert("Enter Password");
 pwd1.focus(); 
return false;
}
else if(pwd2.value=="")
{
window.alert("Enter Password");
 pwd2.focus(); 
return false;
}
else if (pwd1.value != pwd2.value) { 
    alert ("\nPassword did not match: Please try again...") 
    return false; 
} 
else
	{
	return true;
	}
}