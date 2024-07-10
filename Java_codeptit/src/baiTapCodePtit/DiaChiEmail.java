package baiTapCodePtit;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DiaChiEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            String name = sc.nextLine();
            Email email = new Email(name);
            System.out.println(email);
        }
    }
}
class Email{
    private String name;
    private String email;
    private static HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
    
    public Email(String name) {
        name = name.trim().toLowerCase();
        String[] words = name.split("\\s+");
        this.email = words[words.length - 1];
        for(int i = 0; i<words.length-1; i++){
            email += String.valueOf(words[i].charAt(0));
        }
        if(hashMap.containsKey(email)){
            int cnt = hashMap.get(this.email) + 1;
            hashMap.replace(this.email, cnt);
            this.email += Integer.toString(cnt);
        }
        else{
            hashMap.put(this.email, 1);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static HashMap<String, Integer> getHashMap() {
        return hashMap;
    }

    public static void setHashMap(HashMap<String, Integer> hashMap) {
        Email.hashMap = hashMap;
    }

    @Override
    public String toString() {
        return this.email + "@ptit.edu.vn";
    }

    
    
}
