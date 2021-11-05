package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeDemo1
{
	public ActiTimeDemo1(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//User Name WebElement
		private WebElement username;
		public WebElement getUserName()
		{
			return username;
		}
		
		//Password WebElement
		private WebElement pwd;
		public WebElement getPassword()
		{
			return pwd;
		}
		
		//Login button WebElement
		@FindBy(xpath="//div[text()='Login ']")
		private WebElement oLogin;
		public WebElement getLogin()
		{
			return oLogin;
		}
		
		//Minimize flyOut Window
		private WebElement gettingStartedShortcutsPanelId;
		public WebElement getFlyOutWindow()
		{
			return gettingStartedShortcutsPanelId;
		}
		
		//createuser
		@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")
		private WebElement createuser;
		public WebElement getuser()
		{
			return createuser;
		}
		
		
		//adduser
		@FindBy(xpath="//div[text()='Add User']")
		private WebElement adduser;
		public WebElement getadduser()
		{
			return adduser;
		}
		
		//firstname
		private WebElement firstName;
		public WebElement getfname()
		{
			return firstName;
		}
		//lastname
		private WebElement lastName;
		public WebElement getlname()
		{
			return lastName;
		}
		//email
		private WebElement email;
		public WebElement getemail()
		{
			return email;
		}
		//username
		private WebElement userDataLightBox_usernameField;
		public WebElement getusername()
		{
			return userDataLightBox_usernameField;
		}
		//password
		private WebElement password;
		public WebElement getpassword()
		{
			return password;
		}
		//retypePassword
		private WebElement passwordCopy;
		public WebElement getretypepassword()
		{
			return passwordCopy;
		}
		//clickbuttonOnuser
		@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']")
		private WebElement click;
		public WebElement getclick()
		{
			return click;
		}
		
		//clickOnUserAgainfordelete
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table")
		private WebElement clickonuser;
		public WebElement getuser1()
		{
			return clickonuser;
		}
		
		//deletebutton
		@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
		private WebElement deleteuser;
		public WebElement getdeleteuser()
		{
			return deleteuser;
		}
		//logoutbuttonclick
		@FindBy(linkText="Logout")
		private WebElement oLogout;
		public WebElement getLogout()
		{
			return oLogout;
		}
		//createCustomer
		@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")
		private WebElement createcustomer;
		public WebElement getcreatecustomer()
		{
			return createcustomer;
		}
		//addcustomer
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
		private WebElement addnew;
		public WebElement getaddnew()
		{
			return addnew;
		}
		
		//clickonaddcustomer
		@FindBy(xpath="/html/body/div[14]/div[1]")
		private WebElement customer;
		public WebElement getcustomer()
		{
			return customer;
		}
		//clickCustomerForclear
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[1]")
		private WebElement clearcustomer;
		public WebElement getclearcustomer() {
			
			return clearcustomer;
		}
		//clickCustomerclearinput
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[2]/input")
		private WebElement clearcustomerclear;
		public WebElement getclearcustomerclear() 
		{
			return clearcustomerclear;
		}
		
		//enterCreateCustomer
		private WebElement customerLightBox_nameField;
		public WebElement getwritecustomername()
		{
			return customerLightBox_nameField;
		}
		//closebuttonforcustomermodify
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[1]")
		private WebElement closecustomerbutton;
		public WebElement getclosecustomerbutton()
		{
			return closecustomerbutton;
		}
		
		
		//createcustomerclosebutton
		@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']")
		private WebElement clickcustomer;
		public WebElement getclickcustomer()
		{
			return clickcustomer;
		}
		
		//settingbuttonclickformodifyOrdelete
		@FindBy(xpath="//div[@class='editButton available']")
		private WebElement clickcustomeruser;
		public WebElement getclickcustomeruser()
		{
			return clickcustomeruser;
		}
		//deletecustmerclick
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")
		private WebElement customeruser;
		public WebElement getcustomeruser()
		{
			return customeruser;
		}
		//DeleteCustomer
		@FindBy(xpath="//div[text()='Delete']")
		private WebElement deletecustomer;
		public WebElement getdeletecustomer()
		{
			return deletecustomer;
		}
		//DeleteCustomerPermanently
		@FindBy(xpath="//span[text()='Delete permanently']")
		private WebElement deletecustomerpermanently;
		public WebElement getdeletecustomerpermanently()
		{
			return deletecustomerpermanently;
		}
		
		//NewProjectClick
		@FindBy(xpath="/html/body/div[14]/div[2]")
		private WebElement newproject;
		public WebElement getnewproject()
		{
			return newproject;
		}
		//CreateProjectName
		private WebElement projectPopup_projectNameField;
		public WebElement getprojectPopup_projectNameField()
		{
			return projectPopup_projectNameField;
		}
		//clickonprojectcreatebutton
		@FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']/div/span")
		private WebElement createproject;
		public WebElement getcreateproject()
		{
			return createproject;
		}
		//editButton
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
		private WebElement editButtonProject;
		public WebElement geteditButtonProject()
		{
			return editButtonProject;
		}
		
		//ActionButton
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")
		private WebElement actionbuttonproject;
		public WebElement getactionbuttonproject()
		{
			return actionbuttonproject;
		}

		//Deleteproject
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
		private WebElement deletebutton;
		public WebElement getdeletebutton()
		{
			return deletebutton;
		}
		//Deletepermentlyproject
		@FindBy(xpath="//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")
		private WebElement deletepermanently;
		public WebElement getdeletepermanently()
		{
			return deletepermanently;
		}
		
		
		//modifyproject
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[2]/div/div[1]")
		private WebElement modifyProject;
		public WebElement getmodifyproject() 
		{
			return modifyProject;
		}
		//modifyProjectentername
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
		private WebElement modifyProjectname;
		public WebElement getmodifyProjectname()
		{
			return modifyProjectname;
		}
		
		//closebuttonforprojectmodify
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[1]")
		private WebElement closebutton;
		public WebElement getclosebutton()
		{
			return closebutton;
		}
		
		
		
		

		//Add New TAsk
		
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")
		private WebElement addnewtask;
		public WebElement getaddnewtask()
		{
			return addnewtask;
		}
		
		//create a new task
		@FindBy(xpath="/html/body/div[13]/div[1]")
		private WebElement createtask;
		public WebElement getcreatetask()
		{
			return createtask;
		}
		//Enter Task1
		@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
		private WebElement inputFieldWithPlaceholder;
		public WebElement getentertask1()
		{
			return inputFieldWithPlaceholder;
		}
		
		//Enter Task2
		@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[2]/td[1]/input")
		private WebElement inputFieldWithPlaceholder1;
		public WebElement getentertask2()
		{
			return inputFieldWithPlaceholder1;
		}
		//Enter Task3
		@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[3]/td[1]/input")
		private WebElement inputFieldWithPlaceholder2;
		public WebElement getentertask3()
		{
			return inputFieldWithPlaceholder2;
		}
		//Enter Task4
		@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[4]/td[1]/input")
		private WebElement inputFieldWithPlaceholder3;
		public WebElement getentertask4()
		{
			return inputFieldWithPlaceholder3;
		}
		//Enter Task5
		@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[5]/td[1]/input")
		private WebElement inputFieldWithPlaceholder4;
		public WebElement getentertask5()
		{
			return inputFieldWithPlaceholder4;
		}
		//Enter createtask
		@FindBy(xpath="//*[@id=\'createTasksPopup_commitBtn\']/div/span")
		private WebElement createbuttontask;
		public WebElement getcreatebuttontask() {
			
			return createbuttontask;
		}
		//deletetask1
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div")
		private WebElement deletetask1;
		public WebElement getdeletetask1()
		{
			return deletetask1;
		}
		@FindBy(xpath="//*[@id=\'taskPanel_deleteConfirm_submitTitle\']")
		private WebElement deletetask1actiondeletepermanentlyclick;
		public WebElement getdeletetask1actiondeletepermanentlyclick()
		{
			return  deletetask1actiondeletepermanentlyclick;
		}
	
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div")
		private WebElement deletetask1actionclick;
		public WebElement getdeletetask1actionclick() {
			// TODO Auto-generated method stub
			return deletetask1actionclick;
		}
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
		private WebElement deletetask1actiondeleteclick;
		public WebElement getdeletetask1actiondeleteclick() {
			// TODO Auto-generated method stub
			return deletetask1actiondeleteclick;
		}
		
		
		
		
		//deletetask2
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr[2]/td[2]/div/div[2]")
		private WebElement deletetask2;
		public WebElement getdeletetask2()
		{
			return deletetask1;
		}
		
		//deletetask3
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr[1]/td[3]/div/div[2]")
		private WebElement deletetask3;
		public WebElement getdeletetask3()
		{
			return deletetask3;
		}
		
		//deletetask4
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr[1]/td[4]/div/div[2]")
		private WebElement deletetask4;
		public WebElement getdeletetask4()
		{
			return deletetask4;
		}
		
		//deletetask5
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr[1]/td[5]/div/div[2]")
		private WebElement deletetask5;
		public WebElement getdeletetask5()
		{
			return deletetask5;
		}
		
		//deletetaskaction
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
		private WebElement deletetaskaction;
		public WebElement getdeletetaskaction()
		{
			return deletetaskaction;
		}
				
		
		//deletePermanentlytask
		@FindBy(xpath="//*[@id=\'deleteTaskPopup_deleteConfirm_submitTitle\']")
		private WebElement deletebuttonpermanentlytask;
		public WebElement getdeletebuttonpermanentlytask()
		{
			return deletebuttonpermanentlytask;
		}
		//deletetaskstep1
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[3]/div/div/div[4]")
		private WebElement deletebuttontask;
		public WebElement getdeletebuttontask() 
		{
			return deletebuttontask;
		}
		
		//welcomeWindow
		@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div")
		private WebElement welcomewindow;
		public WebElement getweelcomewindow() {
			// TODO Auto-generated method stub
			return welcomewindow;
		}
		
		
		
		//ModifyUser1
		@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table")
		private WebElement modifyuser1;
		public WebElement getmodifyuser1() {
			
			return modifyuser1;
		}
		
		
		
		//ModifyUser2
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table")
		private WebElement modifyuser2;
		public WebElement getmodifyuser2() 
		{
			return modifyuser2;
		}
		//*[@id="userListTableContainer"]/table/tbody/tr[2]/td[1]/table
		
				
		//ModifyUser3
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table")
		private WebElement modifyuser3;
		public WebElement getmodifyuser3() {
			
			return modifyuser3;
		}
		
		//welcome windowforusers
		@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div")
		private WebElement welcomescreenbox;
		public WebElement getwelcomescreenbox() {
			
			return welcomescreenbox;
		}
		//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]
		//*[@id="welcomeScreenBoxId"]/div[3]/div
		
		
		//DeleteProject
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
		private WebElement deleteeditproject;
		public WebElement getdeleteeditproject()
		{
			return deleteeditproject;
		}
		//deleteprojectactionbutton
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")
		private WebElement deleteprojectaction;
		public WebElement getdeleteprojectaction()
		{
			return deleteprojectaction;
		}
		//deleteprojectbutton
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
		private WebElement deleteprojectbutton;
		public WebElement getdeleteprojectbutton()
		{
			return deleteprojectbutton;
		}
		
	
		
		

}
