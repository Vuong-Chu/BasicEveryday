import java.util.Scanner;

public class Button {
    private String title;
    private OnClickListener onClickListener;

    public Button(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

    public void onClick(){
        this.onClickListener.onClick(this.title);
    }

    public interface OnClickListener{
        void onClick(String title);
    }
}

class main{
    private static Scanner in = new Scanner(System.in);
    private static Button button = new Button("Print");
    public static void main(String[] args){
        button.setOnClickListener(title -> System.out.println(title + " is clicked."));
        listen();
    }

    public static void listen(){
        boolean quit = false;
        while(!quit){
            int number = in.nextInt();
            in.nextLine();
            switch (number){
                case 0:
                    quit = true;
                    break;
                case 1:
                    button.onClick();
            }
        }
    }
}
