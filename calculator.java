
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 * This class is the runner class for the calculator app.
 * @author Chad Munroe
 * @version 0.01
 */
public class calculator{

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
 //TODO: make is so multiple numbers can be used in calculation also multiple operations(more than two + more than one operation). basically implement BEDMASS .
    StringTokenizer st = null;
    double fnum, snum, ans;
    System.out.println("Multiply = '*', Divide = '/', Add = '+', Subtract = '-'");
    System.out.println("Please enter a calculation to perform: ");
    System.out.println("example: to mutiply 5 by 3 enter: '5*3' then press enter.");
    System.out.println("type: 'end' to exit");
    String calcString = scan.nextLine();
    calcString.trim();
    DecimalFormat df = new DecimalFormat("#.#");
    while(!calcString.equalsIgnoreCase("end")){
        if(calcString.contains("/")){
            st = new StringTokenizer(calcString,"/");
            fnum = Double.parseDouble(st.nextToken());
            snum = Double.parseDouble(st.nextToken());
            ans = fnum/snum;
            System.out.println("The answer is : "+df.format(ans));
        }
        if(calcString.contains("+")){
            st = new StringTokenizer(calcString,"+");
            fnum = Double.parseDouble(st.nextToken());
            snum = Double.parseDouble(st.nextToken());
            ans = fnum+snum;
            System.out.println("The answer is : "+df.format(ans));
        }
        if(calcString.contains("-")){
            st = new StringTokenizer(calcString,"-");
            fnum = Double.parseDouble(st.nextToken());
            snum = Double.parseDouble(st.nextToken());
            ans = fnum-snum;
            System.out.println("The answer is : "+df.format(ans));
        }
        if(calcString.contains("*")){
            st = new StringTokenizer(calcString,"*");
            fnum = Double.parseDouble(st.nextToken());
            snum = Double.parseDouble(st.nextToken());
            ans = fnum*snum;
            System.out.println("The answer is : "+df.format(ans));
        }
        System.out.println("Please enter a calculation to perform: ");
        calcString = scan.nextLine();
        calcString.trim();
    }
    scan.close();
}
}