public class Main {
    public static void main(String[] args) {
        var stack = new Stack<String>();
        stack.push("emir");
        System.out.println(stack.yazdir());
        stack.push("hilal");
        System.out.println(stack.yazdir());
        stack.push("tuğberk");
        System.out.println(stack.yazdir());
        stack.push("samet");
        System.out.println(stack.yazdir());
        System.out.println("Çıkartılan: "+stack.pop());
        System.out.println(stack.yazdir());
        System.out.println("Stack'in en üstündeki eleman: "+stack.peek());
        System.out.println(stack.yazdir());

        var sayiStacki = new Stack<Integer>();
        sayiStacki.push(1);
        sayiStacki.push(2);
        sayiStacki.push(3);
        System.out.println(sayiStacki.yazdir());
    }
}