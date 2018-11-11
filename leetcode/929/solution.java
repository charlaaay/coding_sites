import java.util.HashSet;
class Solution {
    public int numUniqueEmails(String[] emails)
    {
        HashSet<String> set = new HashSet<>();
        
        for (int i = 0; i < emails.length; i++) {
            String email = emails[i];
            String normalizedEmail = this.normalizeEmail(email);
            set.add(normalizedEmail);
        }
        return set.size();
    }
    
    private String normalizeEmail(String email)
    {
        String[] pieces = email.split("@");
        String localName = pieces[0];
        String domainName = pieces[1];
        
        String retValue = "";
        for (int i = 0; i < localName.length(); i++) {
            if (localName.charAt(i) == '+') {
                break;
            }
            if (localName.charAt(i) == '.') {
                continue;
            }
            retValue = retValue + localName.charAt(i);
        }
        retValue = retValue + domainName;
        return retValue;
    }
}
