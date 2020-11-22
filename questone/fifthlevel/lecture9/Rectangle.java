package questone.fifthlevel.lecture9;

public class Rectangle {
    int top;
    int left;
    int width;
    int height;

    Rectangle(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    Rectangle(int top, int left){
        this.top = top;
        this.left = left;
        width = 0;
        height = 0;

    }
    Rectangle(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        height = width;

    }
    Rectangle(Rectangle rectangle){


    }

    //напишите тут ваш код

    public static void main(String[] args) {

    }
}