function validateMentor()
{
	var firstname = document.forms["mentorRegForm"]["firstName"];     
	var lastname = document.forms["mentorRegForm"]["lastName"];     
	var age = document.forms["mentorRegForm"]["age"];     
	var email = document.forms["mentorRegForm"]["email"];     
	var phone = document.forms["mentorRegForm"]["phone"];     
	var pwd1 = document.forms["mentorRegForm"]["pwd1"];     
	var pwd2 = document.forms["mentorRegForm"]["pwd2"];     
  
	

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
else if(age.value=="")
{
window.alert("Age should not be empty");
 age.focus(); 
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