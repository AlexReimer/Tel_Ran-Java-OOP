package reverse_str;

public class StringReverse {

    public String reversString(String pattern){
        if(pattern==null||pattern.trim().isEmpty()){
            return null;
        }
        return new StringBuilder(pattern).reverse().toString();
    }
}

