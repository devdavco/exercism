
class SqueakyClean {
    static String clean(String identifier) {

        //I think this exercise it's a little hard for me... let's try it!

        StringBuilder builder = new StringBuilder();

        char[] chars = identifier.toCharArray();

        for (int i = 0; i < chars.length ; i++) {
            // #1
            if(Character.isWhitespace(chars[i])){
                builder.append('_');
            }else if(chars[i] == '-'){
                builder.append(Character.toUpperCase(chars[i+1]));
            }else if(Character.isDigit(chars[i])){
                // #3
                switch (chars[i]){
                    case '4' -> builder.append('a');
                    case '3' -> builder.append('e');
                    case '0' -> builder.append('o');
                    case '1' -> builder.append('l');
                    case '7' -> builder.append('t');
                }
            }else if(Character.isLetter(chars[i])) {

                builder.append(chars[i]);
            }
        }

        return builder.toString();

    }
}
