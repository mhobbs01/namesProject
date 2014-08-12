
public class Names
{
	void print_names() 
	{
		System.out.println("Alfred Nicholas Tinsley");
		System.out.println("Michael Richard Hobbs");
		System.out.println("Mark Robert Mahoney");
	}
	
	public static void main(String args[]){
		//to print out my full name from the system line
        //System.out.println("Alfred Nicholas Tinsley");

        //print from method within the Names class
        //printNickTinsley();

        //print from new class called nick tinsley
        NickTinsley nick = new NickTinsley();
		Name name1 = new Name();
		//name1.print_names();
		//Name name2 = new Name();	
	}
}