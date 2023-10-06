package com.green.day8.ch5;

public class ArrayEx5 {
    public static void main(String[] args) {
        int[] score = {100, 88, 100, 100 ,90}; //누군가의 점수

        //총점과 평균 점수를 알고픔

        int sum = 0;
        double avg = 0;
        for(int i=0; i< score.length; i++){
            sum += score[i];
            avg = (double)sum / score.length;
            }
        System.out.println("총점: " + sum);
        System.out.println("평균: " + avg);// printf("평점: %f\n", (double)sum /score.length);
        }
    }

