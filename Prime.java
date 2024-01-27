// Zeynep TANRIVERMİŞ
// 30.12.2023
public class Prime {
	public static void prime(int start, int end) {
		while(start<=end) {
			int control=0;
			for(int i=2; i<start; i++) {
				if(start%i==0) {
					control++;
					break;
				}
				else {
					continue;
				}
			}
			if(control==0) {
				System.out.println(start);
			}
			start++;
		}
	}

	public static void main(String[] args) {
		prime(3, 20);
	}

}
