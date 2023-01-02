package lk.ijse.di;

public class Boy {

    public void cattingWithGirl(){
        GoodGirl g= new Girl();
        g.chatting();
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.cattingWithGirl();
    }
}
