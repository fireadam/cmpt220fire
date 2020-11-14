import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Project3 {  
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		System.out.print("Enter the gender: ");
        BabyName gender = new BabyName();
		gender.setGender(input.nextLine());
		System.out.print("Enter the name: ");
        BabyName name = new BabyName();
		name.setName(input.nextLine());
        //read files
        java.io.File n2001 = new java.io.File("list2001.txt");
        java.io.File n2002 = new java.io.File("list2002.txt");
        java.io.File n2003 = new java.io.File("list2003.txt");
        java.io.File n2004 = new java.io.File("list2004.txt");
        java.io.File n2005 = new java.io.File("list2005.txt");
        java.io.File n2006 = new java.io.File("list2006.txt");
        java.io.File n2007 = new java.io.File("list2007.txt");
        java.io.File n2008 = new java.io.File("list2008.txt");
        java.io.File n2009 = new java.io.File("list2009.txt");
        java.io.File n2010 = new java.io.File("list2010.txt");
        //selects which year to load from instead of loading from all of them
        if (year == 2001){
            Scanner input2 = new Scanner(n2001);
            loadNames(n2001);
        }
        else if(year == 2002){
            Scanner input2 = new Scanner(n2002);
            loadNames(n2002);
        }
        else if(year == 2003){
            Scanner input2 = new Scanner(n2003);
            loadNames(n2003);
        }
        else if(year == 2004){
            Scanner input2 = new Scanner(n2004);
            loadNames(n2004);
        }
        else if(year == 2005){
            Scanner input2 = new Scanner(n2005);
            loadNames(n2005);
        }
        else if(year == 2006){
            Scanner input2 = new Scanner(n2006);
            loadNames(n2006);
        }
        else if(year == 2007){
            Scanner input2 = new Scanner(n2007);
            loadNames(n2007);
        }
        else if(year == 2008){
            Scanner input2 = new Scanner(n2008);
            loadNames(n2008);
        }
        else if(year == 2009){
            Scanner input2 = new Scanner(n2009);
            loadNames(n2009);
        }
        else if(year == 2010){
            Scanner input2 = new Scanner(n2010);
            loadNames(n2010);
        }
        // it didn't make sense to me to use the following for loop
        //for (int i=2001;i<=2010;i++){
        //}
        //Use name search
        findName(name, year, loadNames(year));
    }
    //load names
    private ArrayList<BabyName> loadNames(String fileName){
        //make array of arrays to represent columns of data
        ArrayList<String>[] names = new ArrayList<String>[5];
        //letters represent columns
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        while (input2.hasNext()){
            String rank =input2.next();
            names.add(i, rank)[0];
            String mName =input2.next();
            names.add(j, mName)[1];
            String mAmount =input2.next();
            names.add(k, mAmount)[2];
            String fName =input2.next();
            names.add(l, fName)[3];
            String fAmount =input2.next();
            names.add(m, fAmount)[4];
            i++;
            j++;
            k++;
            l++;
            m++;
        }
        input2.close();
    }
        //implement the search of names
    private static BabyName findName(String name, int year, ArrayList<BabyName> names){
        if (loadNames(year).get(gender(getGender())).equals(name)) {
            System.out.println(name + " is ranked #" + loadNames(year).getRank(0) + " in year " + year);
        }
    }
    //Returns column for gender
    public static int gender(String gender) {
		if (gender.equals("F"))
			return 3;
		else
			return 1;
	}
}
//BabyName Class
class BabyName {
    private int rank;
    private String name;
    private int amount;
    private String gender;
    BabyName(){
        
    }
    int getRank(){
        return rank;
    }
    String getName(){
        return name;
    }
    int getAmount(){
        return amount;
    }
    String getGender(){
        return gender;
    }
    public void setRank(int rank){
        this.rank = rank;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAmount(int amount){
        this.amount = amount; 
    }
    public void setGender(String gender){
        this.gender = gender;
    }
}
// Sorry it's a bit sloppy and doesn't work, it's the best I can do today