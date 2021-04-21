
public class GradeRunner {
    public static void main(String args[]){
        GradeBoard b=new GradeBoard();
        b.studentGrades();
        double highpscore=b.highestScore(b.getProgramList());
        double lowpscore=b.lowestScore(b.getProgramList());
        double averagepscore=b.average(b.getProgramList());
        double highascore=b.highestScore(b.getArtList());
        double lowascore=b.lowestScore(b.getArtList());
        double averageascore=b.average(b.getArtList());
        double highsscore=b.highestScore(b.getScienceList());
        double lowsscore=b.lowestScore(b.getScienceList());
        double averagesscore=b.average(b.getScienceList());
        double highhscore=b.highestScore(b.getHistoryList());
        double lowhscore=b.lowestScore(b.getHistoryList());
        double averagehscore=b.average(b.getHistoryList());
        double highmscore=b.highestScore(b.getMathList());
        double lowmscore=b.lowestScore(b.getMathList());
        double averagemscore=b.average(b.getMathList());
        System.out.println("Class: Programming, # Scores Entered: "+b.getCounter()+" Current Average: "+ averagepscore+" \n"+"Highest Score: "+ highpscore+" Lowest Score: "+lowpscore);
        System.out.println("Class: Art, # Scores Entered: "+b.getCounter()+" Current Average: "+ averageascore+" \n"+"Highest Score: "+ highascore+" Lowest Score: "+lowascore);
        System.out.println("Class: Science, # Scores Entered: "+b.getCounter()+" Current Average: "+ averagesscore+" \n"+"Highest Score: "+ highsscore+" Lowest Score: "+lowsscore);
        System.out.println("Class: Math, # Scores Entered: "+b.getCounter()+" Current Average: "+ averagemscore+" \n"+"Highest Score: "+ highmscore+" Lowest Score: "+lowmscore);
        System.out.println("Class: History, # Scores Entered: "+b.getCounter()+" Current Average: "+ averagehscore+" \n"+"Highest Score: "+ highhscore+" Lowest Score: "+lowhscore);


}
}