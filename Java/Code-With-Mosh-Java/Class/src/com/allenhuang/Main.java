package com.allenhuang;

public class Main {

    public static void main(String[] args) {
        // var will get the data type after new
        // 右侧的在heap（堆）里面，variable在stack（栈）里面，variable储存的是对应的object在堆里面堆地址
        // garbage collector remove 没用的object，在main method结束后栈里面的variable就会被删除
        var student1 = new Student();
        student1.setFinal(92);
        System.out.println(student1.getFinal());
        // short cut, option + Enter
        var student2 = new Student("Allen", 12, 1);
        System.out.println(Student.getNumberOfStudents());
        var textBox = new TextBox();
        textBox.disable();
        System.out.println(textBox.isEnabled());
        // Object class in Java
        var obj = new Object();
        // the address of this object -- 471910020
        System.out.println(textBox.hashCode());
        var textBox2 = textBox;
        // The same hash code
        System.out.println(textBox2.hashCode());
        System.out.println(textBox.equals(textBox2));
        // String representation
        // com.allenhuang.TextBox@1c20c684
        // fully qualified name of the class, hash code represented as hexadecimal
        // after that, we override this method
        System.out.println(textBox.toString());
        // In fact, sout will call toString()
        System.out.println(textBox);
        // Look at the output for constructor
        var textBox3 = new TextBox();

        var control = new UIControl(true);
        show(control);
        // because textBox3 is a Control object, upcasting to UIControl
        show(textBox3);

        //
        var point1 = new Point(1,2);
        var point2 = new Point(1,2);
        // compare the object based on the reference
        // we have overide the equals method
        System.out.println(point1==point2);
        System.out.println(point1.equals(point2));

        UIControl[] controls = {new TextBox(),new CheckBox()};
        for (var arrControl : controls) {
            arrControl.render();
        }

    }
    public static void show(UIControl control) {
        // explicitly cast this control object -- down casting
        // because not every Control is a TextBox object, we need a if statement
        if (control instanceof TextBox) {
            var textBox = (TextBox)control;
            textBox.setText("Good Bye");
            System.out.println(control);
        }
    }
}
