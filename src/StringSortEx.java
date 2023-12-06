import java.util.Arrays;

public class StringSortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[] str= {"linked","doubly","linked","circular"};
	int size=str.length;
	for(int i=0;i<size-1;i++) {
		for(int j=i+1;j<str.length;j++) {
			if(str[i].compareTo(str[j])>0) {
				String temp=str[i];
				str[i]=str[j];
				str[j]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(str));
}}