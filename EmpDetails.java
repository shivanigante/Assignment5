import java.util.Scanner;
abstract class EmpDe
  {
      String name,desig;
      int age,sal;
       
      Scanner sc=new Scanner(System.in);
      
      public EmpDe()
      {
          System.out.println("Enter name");
          name=sc.next();
          System.out.println("Enter age");
          age=sc.nextInt();
      }
      public void disp()
      {
          System.out.println("Name : "+name);
          System.out.println("Age : "+age);
          System.out.println("Salary : "+sal);
          System.out.println("Designation : "+desig);
      }
      public abstract void raise();
   }
   final class Clerk extends EmpDe
   {
              public Clerk()
                   {
                     sal=10000;
                     desig="Clerk";
                   }
             public void raise()
                  {
                     sal+=1000;
                     System.out.println("salary raised........");
                  }
   }
   final class Programmer extends EmpDe
   { 
                public Programmer()
                   {
                     sal=20000;
                     desig="Programmer";
                   }
             public void raise()
                  {
                     sal+=2000;
                     System.out.println("salary raised........");
                  }
   }
   final class Manager extends EmpDe
   {
                  public Manager()
                   {
                     sal=30000;
                     desig="Manager";
                   }
             public void raise()
                  {
                     sal+=3000;
                     System.out.println("salary raised........");
                  }
   }
public class EmpDetails
 {
        public static void main(String args[])
           {
                 Scanner sc=new Scanner(System.in);
                 EmpDe[] e=new EmpDe[10];
                 int c1=0,c2=0,i=0;
                 do
                 {
                   System.out.println("1. Create");
                   System.out.println("2. Display");
	           System.out.println("3. RaiseSalary");
                   System.out.println("4. Exit");
                   System.out.println("Enter your choice");
                   c1=sc.nextInt();
                   switch(c1)
                   {
                      case 1:    do
                                  {
                                   System.out.println("1. Clerk");
                                   System.out.println("2. Programmer");
	                           System.out.println("3. Manager");
                                   System.out.println("4. Exit");
                                   System.out.println("Enter your choice");
                                   c2=sc.nextInt();
                                   switch(c2)
                                   {
                                      case 1 : e[i]=new Clerk();
                                               i++;
                                               break;
                                      case 2 : e[i]=new Programmer();
                                               i++;
                                               break;
                                      case 3 : e[i]=new Manager();
                                               i++;
                                               break;
                                   }
                             }while(c2!=4);
                          break;
                     case 2 : try
                               {
                                      for(EmpDe x:e)
                                        {
                                            if(x!=null)
                                            x.disp();
                                        }
                                }
                               catch(Exception ex){
                                  System.out.println("No records found...........");
                               }
                            break;
                       case 3 : try
                               {
                                      for(EmpDe x:e)
                                        {
                                            if(x!=null)
                                            x.raise();
                                        }
                                }
                               catch(Exception ex){
                                  System.out.println("No records found...........");
                               }
                            break;
                       case 4 :  System.out.println("Exiting.........");
                        break;
                       default: System.out.println("Invalid choice.........");
                }
          }while(c1!=4);
      }
  }
















