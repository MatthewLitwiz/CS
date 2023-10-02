package More.UserInputs;

public class human {

    String move;
    String sit;
    String eat;
    String sleep;
    String work;
    String workout;

    human(String move){
        this.move = move;
    }
    human(String move, String sit){
        this.move = move;
        this.sit = sit;
    }
    human(String move, String sit, String eat){
        this.move = move;
        this.sit = sit;
        this.eat = eat;
    }
    human(String move, String sit, String eat, String sleep){
        this.move = move;
        this.sit = sit;
        this.eat = eat;
        this.sleep = sleep;
    }
    human(String move, String sit, String eat, String sleep, String work){
        this.move = move;
        this.sit = sit;
        this.eat = eat;
        this.sleep = sleep;
        this.work = work;
    }
    human(String move, String sit, String eat, String sleep, String work, String workout){
        this.move = move;
        this.sit = sit;
        this.eat = eat;
        this.sleep = sleep;
        this.work = work;
        this.workout = workout;
    }
    void sit (){
        System.out.println("Your Character is sitting down");
    }
}

