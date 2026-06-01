package DSA.String;

class StringCompare {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    public String build(String str) {

        char[] arr = new char[str.length()];
        int index = 0;

        for (char ch : str.toCharArray()) {

            if (ch != '#') {
                arr[index++] = ch;
            } 
            else if (index > 0) {
                index--;
            }
        }

        return new String(arr, 0, index);
    }
}