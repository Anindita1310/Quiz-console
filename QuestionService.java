import java.util.Scanner;

public class QuestionService {
    question[] questions=new question[5];
    String selection[]=new String[5];

    public QuestionService(){
        questions[0]=new question(1, "size of int", "2", "4", "8", "6", "4");
        questions[1]=new question(2, "size of float", "4", "8","16","2","4");
        questions[2]=new question(3, "size of double", "18", "16","32","2","8");
        questions[3]=new question(4, "size of long", "8", "16","4","32","4");
        questions[4]=new question(5, "size of short", "2", "4","8","16","2");

    }
    public void playQuiz(){
        int i=0;
        for(question q:questions){
            System.out.println("Question No:"+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOption1());
            System.out.println(q.getOption2());
            System.out.println(q.getOption3()); 
            System.out.println(q.getOption4());
            Scanner in=new Scanner(System.in);
            System.out.println("Enter your answer");

            selection[i]=in.nextLine();
            i++;

        
            
        }
        for(String s:selection){
            System.out.println(s);
        }

    }
    public void printScore(){
        int score=0;
        for(int i=0;i<questions.length;i++){
            question que=questions[i];
            String actualanswer=que.getAnswer();
            String useranswer=selection[i];
            if(actualanswer.equals(useranswer)){
                score++;
            }   

        }
        System.out.println("Your score is:"+score);
    }
    
}
