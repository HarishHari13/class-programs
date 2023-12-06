
public class DuplicateinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1 = "Wheat Chappathi";
int count;
char str[]=str1.toCharArray();
System.out.println("duplicate characters:");
for(int i=0;i<str.length;i++) {
	count=1;
	for(int j=i+1;j<str.length;j++) {
		if(str[i]==str[j]&&str[i]!=' ') {
			count++;
			str[j]=0;
			
		}
	}
	if(count>1 && str[i]!='0')
		System.out.println(str[i]);
}
		
	}

}
