package lk.ijse.di;

public class Boy {
    //What is DI.?
    // A mechanism of applying dependencies in a meaningful way


    //DI Methods
    //==============
    //Property Injection
    //Constructor Injection
    //Setter method Injection
    //Interface Through Injection


    //we can use this if we know the dependency before we create the Boy Object
    // GoodGirl g= new Girl();//DI property injection method

    GoodGirl g;

//    public Boy(Girl g){//Constructor Injection
//        //we can use this method if we have the satisfied dependency Object while creating the Boy Object
//        this.g=g;
//    }

    public void setInjection(Girl girl){// setter method injection
       //if we set a dependency using a setter method that is known as Setter Method injection
        g=girl;
    }

    public void cattingWithGirl(){
        //Loos Coupling Applied
        g.chatting();
    }





    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.cattingWithGirl();
    }
}
