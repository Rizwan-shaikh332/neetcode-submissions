class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();

        int ans=0;
        for(String str:tokens){
             if (str.equals("+") || str.equals("-") ||
                str.equals("*") || str.equals("/")) {

                int top = stack.pop();
                int stop = stack.pop();
                int temp=0;
                switch(str){
                    case "+":
                        temp=stop+top;
                        break;
                    case"-":
                        temp=stop-top;
                        break;
                    case "*":
                        temp=stop*top;
                        break;
                    case "/":
                        temp=stop/top;
                        break;

                }
                stack.push(temp);
            }else{
                stack.push(Integer.parseInt(str));
            }
        }  
        return stack.pop();  
    }
}
