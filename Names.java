public class Names
{
	public static void main(String args[])
	{
		System.out.println("Mark Robert Mahoney");
        //to print out my full name from the system line
        System.out.println("Alfred Nicholas Tinsley");

        //print from method within the Names class
        printNickTinsley();

        //print from new class called nick tinsley
        NickTinsley nick = new NickTinsley();
        nick.printNickTinsley();
	}

	//method to print out nick tinsley from within the Names class
	private static void printNickTinsley()
	{
		System.out.println("Alfred Nicholas Tinsley");
	}
}