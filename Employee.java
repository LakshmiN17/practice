class Employee
{
	String empName;
	int empNo;
	float salary;
	String empDesg;
	byte expYrs;
	
	void setemployee(String Name,int no,float sal,String des,byte ex)
	{
		empName=Name;
		empNo=no;
		salary=sal;
		empDesg= des;
		expYrs=ex;
	}
	void getempolyee()
	{
		System.out.println(empName+"\t"+empNo+"\t"+salary+"\t"+empDesg+"\t"+expYrs);
	}
}
class demoEmpolyee
{
	public static void main(String[] args)
	{
		employee rahul=new empolyee();
		rahul.setemployee("rahul",128966,9999.of,"PM",(byte)20);
		System.out.println("empName\tempNo\tsalary\tempDesg\texpYrs\n");
		rahul.getempolyee();
		employee rakesh=new employee();
		rakesh.empName="rakesh batra";
		rakesh.empNo=785412;
		rakesh.empDesg="project leader";
		rakesh.expYrs=(byte)10;
		rakesh.salary=894576.of;
		rakesh.getempolyee();
	}
}