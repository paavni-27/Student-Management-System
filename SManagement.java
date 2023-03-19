import java.util.*;

public class SManagement {
    private String sname, branch, cat, reg;
    private float per;
    private int enroll, year, maths, phy, chem, bee, clang, sum;

    SManagement(int enroll, String sname, String branch, int year, String cat, String reg, int maths, int phy, int chem, int bee, int clang, int sum, float per) {
        this.enroll = enroll;
        this.sname = sname;
        this.branch = branch;
        this.year = year;
        this.cat = cat;
        this.reg = reg;
        this.maths = maths;
        this.phy = phy;
        this.chem = chem;
        this.bee = bee;
        this.clang = clang;
        this.sum = sum;
        this.per = per;
    }

    public int getMaths() {
        return maths;
    }

    public int getPhy() {
        return phy;
    }

    public int getChem() {
        return chem;
    }

    public int getBee() {
        return bee;
    }

    public int getClang() {
        return clang;
    }

    public String getReg() {
        return reg;
    }

    public String getCat() {
        return cat;
    }

    public int getYear() {
        return year;
    }

    public String getBranch() {
        return branch;
    }

    public String getSname() {
        return sname;
    }

    public float getPer() {
        return per;
    }

    public int getEnroll() {
        return enroll;
    }

    public int getSum() {
        return sum;
    }
    public String toString(){
        return sname+" "+enroll+" "+branch+" "+ "\n"+ maths+" "+phy+" "+chem+" "+bee+" "+clang;
    }
}



    class menu {
        static List<SManagement> c = new ArrayList<>();
        static Iterator<SManagement> i = c.iterator();
        static Scanner scn1 = new Scanner(System.in);
        static Scanner scn2 = new Scanner(System.in);
        static Scanner scn3 = new Scanner(System.in);
        static Scanner scn4 = new Scanner(System.in);
        static Scanner scn5 = new Scanner(System.in);

        public static void insert() {

            System.out.println("------------------------------");
            System.out.println("\t\tAdd Student Details\t\t");
            System.out.println("------------------------------");
            System.out.println("Enter Student Name: ");
            String sname = scn2.nextLine();
            System.out.println("Enter Enrollment Number: ");
            int enroll = scn1.nextInt();
            System.out.println("Enter Branch: ");
            String branch = scn3.nextLine();
            System.out.println("Enter Year: ");
            int year = scn1.nextInt();
            System.out.println("Enter Category: ");
            String cat = scn4.nextLine();
            System.out.println("Enter Region: ");
            String reg = scn5.nextLine();
            System.out.println("------------------------------");
            System.out.println("\t\tAdd Subject Marks\t\t");
            System.out.println("------------------------------");
            System.out.println("Enter Maths marks: ");
            int maths = scn1.nextInt();
            System.out.println("Enter Physics marks: ");
            int phy = scn1.nextInt();
            System.out.println("Enter Chemistry marks: ");
            int chem = scn1.nextInt();
            System.out.println("Enter Programming in C language marks: ");
            int clang = scn1.nextInt();
            System.out.println("Enter Basic Electrical Engineering marks: ");
            int bee = scn1.nextInt();
// calculate total marks, percentage and grade.
            int sum = maths+phy+chem+bee+clang;
            int per = sum/5;
            if(per>=80){
                System.out.println("GRADE = A");
                System.out.println("RESULT = PASS");
            } else if(per>=60){
                System.out.println("GRADE = B");
                System.out.println("RESULT = PASS");
            } else if(per>= 35){
                System.out.println("GRADE = C");
                System.out.println("RESULT = PASS");
            }
            else{
                System.out.println("GRADE = D");
                System.out.println("RESULT = FAIL");
            }
            c.add(new SManagement(enroll,sname,branch,year,cat,reg,maths,phy,chem,bee,clang,sum,per));
        }
        public static void display() {
           // System.out.println(c);
            System.out.println("------------------------------");
            Iterator<SManagement> i = c.iterator();
            while(i.hasNext()){
                SManagement s = i.next();
                System.out.println(s);
            }
            System.out.println("------------------------------");

        }
        public static void delete() {

            boolean found = false;
            System.out.println("Enter enrollnment number to delete: ");
            Scanner scn = new Scanner(System.in);
            int enroll = scn.nextInt();
            System.out.println("------------------------------");
            i = c.iterator();
            while(i.hasNext()){
                SManagement s = i.next();
                if(s.getEnroll()==enroll){
                    i.remove();
                    found = true;
                }
            }
            if(!found){
                System.out.println("result not found");
            }else{
                System.out.println("record is deleted successfully.");
            }
            System.out.println("------------------------------");

        }
        public static void update(){
            boolean found = false;
            System.out.println("Enter enrollnment number to update: ");
            Scanner scn = new Scanner(System.in);
            int enroll = scn.nextInt();
            System.out.println("------------------------------");
            ListIterator<SManagement>li = c.listIterator();
            while(li.hasNext()){
                SManagement s = li.next();
                if(s.getEnroll()==enroll){
                    System.out.println("Enter new name: ");
                    String sname = scn2.nextLine();
                    System.out.println("Enter new Branch: ");
                    String branch = scn3.nextLine();
                    System.out.println("Enter new Year: ");
                    int year = scn1.nextInt();
                    System.out.println("------------------------------");
                    System.out.println("\t\tUpdate Subject Marks\t\t");
                    System.out.println("------------------------------");
                    System.out.println("Enter new Maths marks: ");
                    int maths = scn1.nextInt();
                    System.out.println("Enter new Physics marks: ");
                    int phy = scn1.nextInt();
                    System.out.println("Enter new Chemistry marks: ");
                    int chem = scn1.nextInt();
                    System.out.println("Enter new Programming in C language marks: ");
                    int clang = scn1.nextInt();
                    System.out.println("Enter new Basic Electrical Engineering marks: ");
                    int bee = scn1.nextInt();
                    found = true;
                }
            }
            if(!found){
                System.out.println("result not found");
            }else{
                System.out.println("record is deleted successfully.");
            }
            System.out.println("------------------------------");*/

        }
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int ch;
            do {
                System.out.println("1. INSERT");
                System.out.println("2. DISPLAY");
                System.out.println("3. DELETE");
                System.out.println("4. UPDATE");
                System.out.print("Enter your choice: ");
                ch = scn.nextInt();

                switch (ch){
                    case 1 :
                        insert();
                        break;
                    case 2 :
                        display();
                        break;
                    case 3 :
                        delete();
                        break;
                    case 4:
                        update();
                        break;
                    default :
                        System.out.println("Invalid Choice. Please choose a valid choice.");
                }

            } while (ch != 0);


        }
    }

