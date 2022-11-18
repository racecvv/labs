//импорт библиотеки для взамодействия с консолью
import java.util.Scanner;

//базовый класс Palindrome
public interface Palindrome {
    public static void main(String[] args){//объявление основного метода
        String s;
        Scanner in = new Scanner(System.in);//объявляем сканер
        System.out.print("Please enter string \n");
        s = in.nextLine();
        System.out.printf("IsPalindrome: %b \n", IsPalindrome(s));
        in.close();//закрыть терминал
    }
    public static String reverseString(String s){//метод реверса строки
        String reverse = "";
        for(int i = 0; i < s.length(); i++){
            reverse = s.charAt(i) + reverse;
        }
        return reverse;
    }
    public static boolean IsPalindrome(String s){//Проверка на палиндром
        String s2 = reverseString(s).toLowerCase();
        return s.toLowerCase().equals(s2);
    }
}