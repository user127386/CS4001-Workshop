public class AdmissionProcessor{
    //formatting name
    public static String formatName(String rawName) {
        String trimmed = rawName.trim(); // removes the spaces on the front and back of the string
        String[] words = trimmed.split("\\s+"); // after each spaces it stores all the strings on the arrray and the + sign means it stores strings which have multiple lines
        StringBuilder sb = new StringBuilder(); // for adding strings without creating bunch more objects
        for (int i = 0; i < words.length; i++) { 
            if (i > 0) sb.append(" ");
            String first = words[i].substring(0, 1).toUpperCase(); // takes the first character of the string from words array i element and turns the lowercase into uppercase
            String rest = words[i].substring(1).toLowerCase(); // takes the remaining character of the string from words array i element and turns the uppercase into lowercase
            sb.append(first).append(rest); // joins them together ig
        }
        return sb.toString(); //turns the whole contents on the stringbuilder into string and returns it
    }
    //email validator
    public static boolean isValidEmail(String email){
        if (email == null ) return false;
        email = email.trim();
        if (email.length() == 0 ) return false;
        
        int atIndex = email.indexOf("@"); // to find the first @
        int lastAt = email.lastIndexOf("@"); // to check if there is another @
        if (atIndex <= 0 || atIndex != lastAt) return false; // if the lastindexof finds another @ then it becomes invalid email
        
        int lastDot = email.lastIndexOf(".");
        if (lastDot <= atIndex + 1) return false; //
        if (lastDot == email.length() - 1 ) return false;
        
        return true;
    }
    //report of individual if he or she might or mightnot have been admitted 
    public static String generateReport(String name, String email){
        StringBuilder sb = new StringBuilder();
        sb.append("=== Admission Report ===\n");
        
        sb.append("Name: ").append(formatName(name)).append("\n");
        sb.append("Email: ").append(email.trim()).append("\n");
        String domain = email.substring(email.indexOf("@") + 1);
        
        String type = domain.equalsIgnoreCase("iic.edu.np") ? "Internal" : "External";
        sb.append("Domain: ").append(domain).append(" (").append(type).append(")\n");
        
        String status = isValidEmail(email) ? "VALID" : "INVALID";
        sb.append("Status: ").append(status).append(" (").append(type).append(")\n");
        return sb.toString();
    }
    // password strength checker
    public static String checkPasswordStrength(String password){
        
       boolean hasUpper = false; 
       for(int i = 0; i < password.length(); i++){
           if(Character.isUpperCase(password.charAt(i))){
               hasUpper = true;
               break;
           }
       }
       
       boolean hasLower = false; 
       for(int i = 0; i < password.length(); i++){
           if(Character.isLowerCase(password.charAt(i))){
               hasLower = true;
               break;
           }
       }
       
       boolean hasDigit= false; 
       for(int i = 0; i < password.length(); i++){
           if(Character.isDigit(password.charAt(i))){
               hasDigit = true;
               break;
           }
       }
       
       boolean hasSpecChar = false; 
       for(int i = 0; i < password.length(); i++){
           if(!Character.isLetterOrDigit(password.charAt(i))){
               hasSpecChar = true;
               break;
           }
       }
       
       if(password.length() > 8 && hasUpper && hasDigit && hasLower && hasSpecChar){
           return "Strong";
       }else if(password.length() >= 6 && hasUpper && hasDigit && hasLower){
           return "Medium";
       }else{
           return "Weak";
       }
    }
    
    public static String processorAdmission(String name, -- isValidEmail, String pasword){
        String Short = name.trim();
        String[] word = Short.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length; i++) { 
            if (i > 0) sb.append(" ");
            String first = word[i].substring(0, 1).toUpperCase();
            String rest = word[i].substring(1).toLowerCase();
            sb.append(first).append(rest);
        } return sb.toString();
        
        if (email == null ) return false;
        email = email.trim();
        if (email.length() == 0 ) return false;
    }
    
    public static void main(String[] x){
        // formatting name
        System.out.println(AdmissionProcessor.formatName("    yOdIN raYA   ")); // printing the output
        // email validator
        System.out.println(isValidEmail("yodinraya12@gmail.com"));
        System.out.println(isValidEmail("yodin@gmail."));
        System.out.println(isValidEmail("@gmail.com"));
        // admission report
        System.out.println(AdmissionProcessor.generateReport(" yodin raya ","yodinraya12@iic.edu.np"));
        System.out.println(AdmissionProcessor.generateReport(" yodin raya ","yodinraya12@gmail.com"));
        // password strength checker
        System.out.println(AdmissionProcessor.checkPasswordStrength("Yodinraya12@#"));
        System.out.println(AdmissionProcessor.checkPasswordStrength("yodinraya"));
        System.out.println(AdmissionProcessor.checkPasswordStrength("Yodinraya12"));
    }
}