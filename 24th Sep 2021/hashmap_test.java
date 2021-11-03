
import java.util.HashMap;
import java.util.Scanner;
public class hashmap_test {



        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);

            System.out.println("Enter fullname : ");
            String name=sc.nextLine();

            System.out.println("Enter phone number : ");
            String phone=sc.nextLine();

            System.out.println("Enter height : ");
            String height=sc.nextLine();

            System.out.println("Enter gender : ");
            String gender=sc.nextLine();

            System.out.println("Enter your marital status : ");
            String marital_status=sc.nextLine();

            HashMap<String, Object> personInfo=new HashMap<>();
            personInfo.put("Full_Name", name);
            personInfo.put("Phone_Number", phone);
            personInfo.put("Height", height);
            personInfo.put("Gender",gender);
            personInfo.put("Marital_Status", marital_status);

            System.out.println(personInfo);
        }

    }

