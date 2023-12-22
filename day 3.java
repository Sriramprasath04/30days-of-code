import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> cont = new Stack<>();
        
        for(int i=0; i<x.length() ;i++){
            char br = x.charAt(i);
            if(br == '(' || br == '{' || br == '['){
                cont.push(br);
            } else {
                if(cont.isEmpty()){
                    return false;
                }
                
                char peek = cont.peek();
                if(br == ')' && peek == '(' || br == '}' && peek == '{' || br == ']' && peek == '['){
                    cont.pop();
                } else {
                    return false;
                }
            }
        }
        
        if(cont.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}
