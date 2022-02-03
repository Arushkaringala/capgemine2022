package Day5;
import java.util.*;
public class Cipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
         String s1;
         char a[],a2[];
         System.out.println("Enter the encrypted text:");
         s1=s.nextLine();
         int i,j=0,flag=0;
         a=s1.toCharArray();
         a2=new char[a.length];
         for(i=0;i<a.length;i++)
         {
             int value=(int)a[i];
             if(value<65 || (value>90 && value<97)){
               if(value==32)
                 a2[j++]=' ';
               else
                continue;
             }
             else{
                 value=value-7;
                 if(value<97 && value>89)
                    value=value+26;
                 if(value<65)
                    value=value+26;
                    
                 a2[j++]=(char)value;
                 flag=1;
             }
         }
         if(flag!=1){
             System.out.println("No hidden message");
             System.exit(0);
         }
         System.out.println("Decrypted text:");
         for(char ch:a2){
             System.out.print(ch);
         }
     }

	

}
