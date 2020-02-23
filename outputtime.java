import java.text.SimpleDateFormat;
import java.util.Date;
public class outputtime{
  public static void main(String[] args){
   SimpleDateFormat sdf=new SimpleDateFormat();
   sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
   Date date=new Date();
   String str=(String)sdf.format(date);
   System.out.print(str);


}


} 

