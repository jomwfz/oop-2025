import java.util.Arrays;
public class Check {
	public static void main(String[] args) {
		int[] arrs = { 1, 3, 5, 0, 0};
		int pos = 0;
		int last = 3;
		int newVal = 4;
		for (int i = 0; i < last; i++) {
			if (arrs[i] > newVal) {
				pos = i;
				break;
			}
		}
		System.out.println(pos);
		for (int i = last; i > pos; i--) {
			arrs[i] = arrs[i-1];
		}
		System.out.println(Arrays.toString(arrs));
		arrs[pos]=newVal;
		System.out.println(Arrays.toString(arrs));
	}
}
