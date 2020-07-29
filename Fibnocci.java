
public class Fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =8, c=0, b=1;
        for (int i =1;i<=n;i++)
        {
            int sum = c+b;
            c = b;
            b= sum;
			System.out.println(c);
        }

	}

}
