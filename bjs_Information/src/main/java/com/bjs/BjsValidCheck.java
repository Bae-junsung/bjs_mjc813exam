package com.bjs;

public class BjsValidCheck {
    public boolean isValidPhoneNumber(String text){ //폰번호
        if(text == null) return false;
        return text.matches("(010)-\\d{4}-\\d{4}");
    }
    public boolean isValidZipNumber(String text){ //우편번호
        if(text == null) return false;
        return text.matches("[1-9]\\d{4}");
    }
    public boolean isValidEmail(String text){ //이메일(참고)
        if(text == null) return false;
        return text.matches("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$");
    }

    public static void main(String[] args){
        BjsValidCheck validCheck = new BjsValidCheck();

        System.out.println(validCheck.isValidPhoneNumber("010-1234-5678"));
        System.out.println(validCheck.isValidZipNumber("10298"));
        System.out.println(validCheck.isValidEmail("adfadf@.netsadf"));
    }
}
