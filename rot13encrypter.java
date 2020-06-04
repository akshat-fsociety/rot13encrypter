import java.io.*;
class rot13encrypter
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s,s1="";
        int l,i;
        char ch,ch1;
        System.out.println("Enter your Plaintext");
        s=br.readLine();
        s+=" ";
        l=s.length();

        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ') //||ch=='1' ||ch!='@' ||ch!='#' ||ch!='$' ||ch!='%' ||ch!='&' ||ch!='*'||ch!='.')
            {
                if(ch>='A'&&ch<='M'||ch>='a'&&ch<='m')
                {
                    int z=ch+13;
                    char a=(char)z;
                    s1+=a;
                }
                else if(ch>='N'&&ch<='Z'||ch>='n'&&ch<='z')
                {
                    int z=ch-13;
                    char a=(char)z;
                    s1+=a;  

                }
                else if(ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='0')
                { 
                    s1=s1+ch;
                }
            }
            else{ s1=s1+ch;}
        }
        System.out.println("Your Encrypted message is: " +s1);
    }
}

