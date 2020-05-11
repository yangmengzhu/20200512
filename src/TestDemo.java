/*
 * @program: 20200511
 * @description
 * @author: mrs.yang
 * @create: 2020 -05 -11 13 :11
 */

import java.util.*;

/*
class Student<T>{
    public String name;
    public String classes;
    public double score;

    public Student(String name, String classes, double score) {
        this.name = name;
        this.classes = classes;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", score=" + score +
                '}';
    }
}
*/

public class TestDemo {
    
    /*public static String func(String str,String regex){
        int pos=str.indexOf(regex);
        int len=regex.length();
    }
    public static void main(String[] args) {
        //实现方法 replace, 能够替换字符串中的某个部分
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String regex=scan.nextLine();
        String ret=func(str,regex);
        System.out.println(ret);
    }*/
    /*public static String[] func(String str,String regex){
        String[] ret=new String[2];
        int a=str.indexOf(regex);
        ret[0]=str.substring(0,a);
        ret[1]=str.substring(a+1);
        return ret;
    }
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       String str=scan.nextLine();
       String regex=scan.nextLine();
       String[] ret=func(str,regex);
        System.out.println(Arrays.toString(ret) );
    }*/
    /*public static List<Character>  func(String str1,String str2){
        List<Character> list=new ArrayList<>();
        for (int i = 0; i <str1.length() ; i++) {
            if(!str2.contains(str1.charAt(i)+"")){
                list.add(str1.charAt(i));
            }
        }
        return list;
    }*/
    /*public static void main9(String[] args) {
        String str1="welcome to bit";
        String str2="come";
        List<Character> ret=func(str1,str2);
        System.out.println(ret);
    }*/
    /*public static void main8(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(8);
        list.add(4);
        list.add(1);
        list.add(8);
        Collections.sort(list);
        System.out.println(list);
    }
    public static void main7(String[] args) {
       Student stu1=new Student("zhangsan","a05",78);
       Student stu2=new Student("lisi","a04",89);
       Student stu3=new Student("wanger","a04",98);
       List<Student> list=new ArrayList();
       list.add(stu1);
       list.add(stu2);
       list.add(stu3);
       System.out.println(list);
    }*/
   /* public static void main(String[] args) {
        String str="abcdef";
        String ret=str.replace("ab","gg");
        System.out.println(ret);
    }*/
    /*public static int compareTo(String str1,String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int lim = Math.min(len1, len2);
        char v1[] =str1.toCharArray();
        char v2[] =str2.toCharArray();
        int k = 0;
        while (k < lim) {
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2) {
                return c1 - c2;
            }
            k++;
        }
        return len1 - len2;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str1=scan.nextLine();
        String str2=scan.nextLine();
        int ret=compareTo(str1,str2);
        System.out.println(ret);
    }*/
    public static void main6(String[] args) {
        //实现方法 split
        /*Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String val=scan.next();*/
        //String ret=func(str,val);
       //System.out.println(ret);
        String str="abcdef";
        String str1="abcdefgh";
        int ret=str.compareTo(str1);
    }

    /*public static boolean func(String str,String val){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==val.charAt(i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //实现方法 contains, 能够判定字符串中是否包含子串
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String val=scan.nextLine();
       boolean ret=func(str,val);
        System.out.println(ret);
    }*/

    public static void main5(String[] args) {
        //截取字符串
        String str="hello";
        String str1=str.substring(1,3);
        System.out.println(str1);
        //去掉前后空格,中间空格去不了
        /*String str2=" abcde fg ";
        String str3=str2.trim();
        System.out.println(str3);*/
    }
    public static void main4(String[] args) {
        String str="ababbcdabde";
        String str1=str.replace("ab","pp");
        System.out.println(str1);
        String str2=str.replaceFirst("ab","pp");
        System.out.println(str2);
    }
    public static void main3(String[] args) {
        String str="abcdef";
        String str1="abcdef";
        System.out.println(str.equalsIgnoreCase(str1));
        //比较大小
        System.out.println(str.compareTo(str1) );
    }
    public static void main2(String[] args) {
        byte[] bytes={97,98,99,100};
        String str=new String(bytes);
        System.out.println(str);
        //字节类型的字符串变成字节数组
        String str1="abcdef";
        byte[] bytes1=str1.getBytes();
        System.out.println(Arrays.toString(bytes1));
    }
    /*public static boolean func(String str){
        char[] ch=str.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            if(ch[i]<'0'||ch[i]>'9'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="123456";
        boolean ret=func(str);
        System.out.println(ret);
    }*/
    public static void main1(String[] args) {
        String str="hello";
        System.out.println(str.substring(1,4));//左闭右开提取字符串
        System.out.println(str.charAt(1));
        char[] val={'a','b','c','d','e'};
        String str1=new String(val,1,2);
        System.out.println(str1);
        System.out.println(str.charAt(2));
       char[] val2=str.toCharArray();
        System.out.println(Arrays.toString(val2));
    }
}
