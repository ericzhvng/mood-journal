public class TestAnalysis{

    public static void main(String[]args){

    }

    private int analyzeText(String input){
        String temp = "";
        int mood = 0;
        double result = 0.0;
        while(input.length() > 0){
            if(input.indexOf('.') < input.indexOf('!') && input.indexOf('.') < input.indexOf('?')){
                temp = input.substring(0, indexOf('.'));
                input = input.substring(indexOf('.'));
            }
            else if(input.indexOf('?') < input.indexOf('!') && input.indexOf('?') < input.indexOf('.')){
                temp = input.substring(0, indexOf('?'));
                input = input.substring(indexOf('?'));
            }
            else if(input.indexOf('!') < input.indexOf('.') && input.indexOf('!') < input.indexOf('?')){
                temp = input.substring(0, indexOf('!'));
                input = input.substring(indexOf('!'));
            }
            else{
                temp = input;
                input = "";
            }
            //process temp using Microsoft's API, return double to result

        }

        return mood;
    }
}