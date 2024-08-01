class Solution {
    public int countSeniors(String[] details)
    {
        String str;
        int num = 0, count = 0;
        for (int i = 0; i < details.length; i++)
        {
            str = details[i];
            num = Integer.parseInt(String.valueOf(str.charAt(11))) * 10 + Integer.parseInt(String.valueOf(str.charAt(12)));
            if (num > 60)
                count++;
        }
        return count;
    }
}