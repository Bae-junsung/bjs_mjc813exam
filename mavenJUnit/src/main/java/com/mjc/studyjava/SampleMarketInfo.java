package com.mjc.studyjava;

public class SampleMarketInfo implements IMarketInfo {

    @Override
    public String getMessageOfMarketInfo() {
        return "맘스 터치입니다. T.02)123-4567"; //상점 소개
    }

    @Override
    public String getMessageOfNotValidData() {
        return "정확한 값을 입력해주세요"; //부정확하면 오류 문구
    }
}