public class exception {
	public static void main(String[] args) {
		try {
			try {
				try {
					try {
					String s="ewe";
					int i=Integer.parseInt(s);
					System.out.println(i);
				}
				catch (Exception e) {
					System.out.println(e);
				}
				String s =null;
				System.out.println(s.length);
				}
			catch (Exception e) {
				System.out.println(e);
			}
			
				 int i=10/0;
				 System.out.println(i);
				
			}
			catch (Exception e) {
				System.out.println(e);
				
			}
			int arr[]=new int[3];
			arr[4]=23;
			System.out.println(arr[4]);
		}
	catch (Exception e) {
		System.out.println(e);	
	}
}

}