import java.io.*;
class Copier
{
public static void main(String arr[])
{
try{
FileInputStream src=new FileInputStream(arr[0]);
FileOutputStream target=new FileOutputStream(arr[1]);
while(true)
{
int ch=src.read();
if(ch==-1)
break;
target.write(ch);
}
target.close();
}
catch(Exception e)
{
System.out.println("IOException");
}
System.out.println("Successfully copied");
}

}