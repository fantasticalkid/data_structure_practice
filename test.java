public class test {

    public static boolean isMatched(String exp){
        String op ="({[";
        String ed="]})";
        Stack<Character> check = new LinkedListStack<>();
        for(char c : exp.toCharArray()){
            if(op.indexOf('c')!=-1 ){
                check.push(c);
            }
            else if(ed.indexOf(c)!=-1){
                if(check.isEmpty()){
                    return false;
                }
                if(ed.indexOf(check.pop())!=-1){
                    return false;
                }
            }
        }  

        return check.isEmpty();
    }
    final static String[] valid = {
        "()(()){([()])}",
        "( ) ( ( ) ) {( [ ( )  ] ) } ",
        "(3) (3 + (4 - 5) ) {( [ ( )  ] ) } ",
        "((()(()){([()])}))",
        "[(5+x)-(y+z)]"
      };
    
      final static String[] invalid = {
        ")(()){([()])}",
        "({[])}",
        "("
      };
    
      public static void main(String[] args) {
    
        for (String s : invalid)
          if (!isMatched(s))
            System.out.println("Error evaluating valid: " + s);
    
        
    
      }
    }


    

