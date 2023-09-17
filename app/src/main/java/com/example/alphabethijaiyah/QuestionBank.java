package com.example.alphabethijaiyah;

public class QuestionBank {

    private String textQuestions [] = {
            "Berapa Jumlah Huruf Hijaiyah?",
            "Apa Nama Huruf Berikut ي?",
            "Huruf Hijaiyah Adalah",
            "Apa Nama Huruf Berikut ج?",
            "Huruf Hijaiyah Berjumlah 30 Bila?"

    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"26", "27", "28", "29"},
            {"YA", "RO", "ALIF", "TSA"},
            {"Abjad Dalam Bahasa Arab", "Abjad Dalam Bahasa Russia", "Abjad Dalam Bahasa Inggris", "Jawaban Semua Salah"},
            {"TSA", "MIM", "KAF", "JIM"},
            {"ditambah hamzah dan lam ro", "ditambah alif dan jim", "ditambah hamzah dan lam alif", "Jawaban Semua Salah"}
    };

    private String mCorrectAnswers[] = {"28", "YA", "Abjad Dalam Bahasa Arab", "JIM", "ditambah hamzah dan lam alif"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
