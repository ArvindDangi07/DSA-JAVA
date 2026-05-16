package string;

class StringCompression {

    public int compress(char[] chars) {

        String str = new String(chars);

        StringBuilder result =
                new StringBuilder();

        int count = 1;

        for(int i = 1; i < str.length(); i++){

            if(str.charAt(i)
                    ==
                    str.charAt(i-1)){

                count++;
            }
            else{

                result.append(str.charAt(i-1));

                if(count > 1){
                    result.append(count);
                }

                count = 1;
            }
        }

        // last group
        result.append(str.charAt(str.length()-1));

        if(count > 1){
            result.append(count);
        }

        System.out.println(result);

        return result.length();
    }

    public static void main(String[] args) {

        char[] chars =
                {'a','a','b','b','c','c','c'};

        StringCompression sc =
                new StringCompression();

        System.out.println(sc.compress(chars));
    }
}