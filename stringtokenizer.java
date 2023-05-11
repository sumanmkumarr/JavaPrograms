import java.util.*;

public class stringtokenizer {
    public static void main(String args[]) {
        StringTokenizer st = new StringTokenizer("This is a java program");
        System.out.println("the tokens are");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
// indivisual unit of information is data.indivisual data has no meaning.ex - monday,sun,...
// collection of processed data is information.ex- today is monday,sun rises in the east,....
// collection of information is file
// colection of file is dbms