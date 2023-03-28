
 public class Abtar
{
	//create our data field of variavle
	String name;
	String app;
	String race;
	String gender;
	int age;
	//build consturcor
	/*public Abtar(String n, String app, String r,String g, int a)
	{
		 name=n;
		 app=app;
		 race= r;
	 gender= g;
		 age= a;
		
	}
	*/
/*
	public Abtar()
	{
		 name=(" JOJO");
			race=("female");
			app=(" big Musclie and big eyes");
			gender=("human");
			age=(22);
	}
	*/
	
	//create our get methods for each data field
	public String getName() 
	{
		return name;
	}
	public String getApp()
	{
		return app;
	}
	public String getRace() 
	{
		return race;
	}
	public String getGender() 
	{
		return gender;
	}
	public int getAge() 
	{
		return age;
	}
	//create setter for each data field 
	public void setName(String name)
{
		this.name = name;
	}
	public void setApp(String app)
	{
		this.app = app;
	}
	public void setRace(String race) 
	{
		this.race = race;
	}
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	public void setAge(int age)
	{
		this.age = age;
	}

}
