package Task2;
public class Assignment {
    int tasks ;
    String difficulty ;
    boolean submission ; 
    void printDetails(){ // define difficulty level . 
        System.out.println("Number of tasks:" + tasks);
        System.out.println("Difficulty level:" + difficulty);
        System.out.println("Submission required:" + submission);
        

    }
    String makeOptional(){
        if(submission = true){
            submission = false ;
            return "Assignment will not require submission";
        }
        else{
            return "Submission is already not required"; 
        }
                
    
    }
}
