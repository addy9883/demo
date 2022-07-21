package kr.eddi.demo.controller.basic.first;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

public class RandomDice {

    Random random;
    int diceNum;
    private StringBuilder sb;

    @GetMapping("/Homework")

    public String Index(){
        sb = new StringBuilder();
        sb.append("주사위 번호");
        sb.append(DiceNumber());
        return sb.toString();
    }
    public int DiceNumber(){
        random = new Random();
        diceNum = random.nextInt(1,7);
        return diceNum;
    }
}
