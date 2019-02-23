package hijava.practice; 

import java.util.Random; 

public class blackjackproject 
{ 
    Random ran = new Random(); 

    int num1, num2, num3, num4, num5, num6; 
    int add1, add2, add3; 
    int count; 
    int total1, total2, total3; 

    public void mycard() 
    { 
        num1 = ran.nextInt(10)+1; 
        num2 = ran.nextInt(10)+1; 
        System.out.println("당신의 첫 번째 카드는"+num1); 
        System.out.println("당신의 두 번째 카드는"+num2); 
        int add1 = num1 + num2; 
        System.out.println("당신의 카드의 합은"+add1); 
        while(add1<=15) 
        {     
            System.out.println("당신의 카드 합의 15 이하입니다, 계속 뽑겠습니다"); 
            add1 = add1 + ran.nextInt(10)+1; 
            System.out.println("당신의 카드 합은"+add1+"입니다"); 
        } 
        if(add1>21) 
        { 
            System.out.println("사용자의 카드 합이 21을 초과했습니다"); 
            add1 = 0; 
        } 
        else if(add1<=21) 
        { 
            total1 = add1; 
        } 
        System.out.println("============================"); 
    } 
    public void yourcard() 
    { 
        num3 = ran.nextInt(10)+1; 
        num4 = ran.nextInt(10)+1; 
        System.out.println("상대의 첫 번째 카드는"+num3); 
        System.out.println("상대의 두 번째 카드는"+num4); 
        int add2 = num3 + num4; 
        System.out.println("상대의의 카드의 합은"+add2); 
        while(add2<=15) 
        { 
            System.out.println("상대의 카드 합의 15 이하입니다, 계속 뽑겠습니다"); 
            add2 = add2 + ran.nextInt(10)+1; 
            System.out.println("상대의 카드 합은"+add2+"입니다"); 
        } 
        if(add2>21) 
        { 
            System.out.println("상대의 카드 합이 21을 초과했습니다"); 
            add2 = 0; 
        } 
        else if(add2<=21) 
        { 
            total2 = add2; 
        } 
        System.out.println("============================"); 
    } 
    public void dealercard() 
    { 
        num5 = ran.nextInt(10)+1; 
        num6 = ran.nextInt(10)+1; 
        System.out.println("딜러의 첫 번째 카드는"+num5); 
        int add3 = num5 + num6; 
        while(add3<=14) 
        { 
            add3 = add3 + ran.nextInt(10)+1; 
            count = count + 1; 
        } 
        System.out.println("딜러는"+(count+2)+"장의 카드를 뽑았습니다"); 
        System.out.println("딜러의 카드의 합은"+add3+"입니다"); 
        if(add3>21) 
        { 
            System.out.println("딜러의 카드 합이 21을 초과했습니다"); 
            add3 = 0; 
        } 
        else if(add3<=21) 
        { 
            total3 = add3; 
        } 
        System.out.println("============================"); 
    } 
    public void total() 
    { 
        System.out.println("사용자의 합은"+total1); 
        System.out.println("상대의 합은"+total2); 
        System.out.println("딜러의 합은"+total3); 
        if(total1>=total3) 
        { 
            if(total1>total2) 
            { 
                System.out.println("사용자의 승리입니다"); 
            } 
            else if(total2>total1) 
            { 
                System.out.println("상대방의 승리입니다"); 
            } 
            else if(total1==total2) 
            { 
                System.out.println("공동 승리입니다"); 
            } 
        } 
        else if(total3>total1) 
        { 
            if(total3>total2) 
            { 
                System.out.println("딜러의 승리입니다"); 
            } 
            else if(total2>=total3) 
            { 
                System.out.println("상대의 승리입니다"); 
            } 
        } 
    } 
}


