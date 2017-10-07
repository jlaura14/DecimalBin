package app;

public class App {

	public static void main(String[] args) {
		String res = binario(6);
		System.out.println(res);

	}
	public static String binario(int n){
		int res = n%2;
		if(n<=1){
			return ""+res;
		}else{
			return ""+binario((n-res)/2)+res;
		}
	}

}
