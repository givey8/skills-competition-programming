/*Import Statement*/
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
public class GradeBoard {
    private boolean factor=false;
    int counter=0;
    ArrayList<Double> program1=new ArrayList<Double>();
    ArrayList<Double> art1=new ArrayList<Double>();
    ArrayList<Double> science1=new ArrayList<Double>();
    ArrayList<Double> math1=new ArrayList<Double>();
    ArrayList<Double> history1=new ArrayList<Double>();
    Scanner sc=new Scanner(System.in);
    Scanner sc1=new Scanner(System.in);
    Scanner sc2=new Scanner(System.in);
    Scanner sc3=new Scanner(System.in);
    Scanner sc4=new Scanner(System.in);
    Scanner sc5=new Scanner(System.in);
    public GradeBoard(){

    }

    public void studentGrades(){
        System.out.println("Input Grades for Selected Classes.");
        System.out.println("The average of the classes will be calculated");
        while(!factor){
            System.out.println("Pick an action: Calculate, Clear, or Exit");
            String choice=sc.nextLine();
            if (choice.equals("Calculate")){
                System.out.println("Current Grade for Programming.");
                double pro=sc1.nextDouble();
                pro=Math.round(pro);
                program1.add(pro);
                System.out.println("Current Grade for Art.");
                double art=sc2.nextDouble();
                art=Math.round(art);
                art1.add(art);
                System.out.println("Current Grade for Science.");
                double science=sc3.nextDouble();
                science=Math.round(science);
                science1.add(science);
                System.out.println("Current Grade for Math.");
                double math=sc4.nextDouble();
                math=Math.round(math);
                math1.add(math);
                System.out.println("Current Grade for History.");
                double history=sc5.nextDouble();
                history=Math.round(history);
                history1.add(history);
                counter++;

            }
            if (choice.equals("Clear")){
                program1.remove(program1.size()-1);
                art1.remove(art1.size()-1);
                science1.remove(science1.size()-1);
                history1.remove(history1.size()-1);
                math1.remove(math1.size()-1);
                counter--;
            }
                
            if (choice.equals("Exit")){
                factor=true;
            }
        }
    }

    public double average(ArrayList<Double> list){
        double total=0;
        for (int i=0;i<list.size();i++){
            total+=list.get(i);
        }
        total/=list.size();
        return total;
    }

    public double lowestScore(ArrayList<Double> list){
        double quick=list.get(0);
        for (int i=1;i<list.size()-1;i++){
            double other=list.get(i);
            if (quick>other){
            quick=other;
            }
        }
        return quick;
    }

    public double highestScore(ArrayList<Double> list){
        double quick=list.get(0);
        for (int i=1;i<list.size();i++){
            double other=list.get(i);
            if (quick<other){
            quick=other;
            }
        }
        return quick;
    }

    public ArrayList<Double> getProgramList(){
        return program1;
    }

    public ArrayList<Double> getArtList(){
        return art1;
    }

    public ArrayList<Double> getScienceList(){
        return science1;
    }

    public ArrayList<Double> getMathList(){
        return math1;
    }

    public ArrayList<Double> getHistoryList(){
        return history1;
    }

    public int getCounter(){
        return counter;
    }
}