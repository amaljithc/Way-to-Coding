import java.util.*; 
public class big_number{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);

        System.out.print("First no : "); 
        int no1 = sc.nextInt();
        System.out.print("Second no : "); 
        int no2 = sc.nextInt();
	if(no1>no2)
	{
		System.out.println(no1); 
	}
	else
	{
		System.out.println(no2);
	}
		
        
    }
}