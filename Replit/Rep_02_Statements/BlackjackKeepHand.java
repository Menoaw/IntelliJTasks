package Rep_02_Statements;

import java.util.Scanner;

/*
In blackjack after the player asks to keep the house 4 things may happen.

1. if the card total is bigger then 21 the player busts.

2. if the house score is bigger then the player, the player loses .

3. if the player score is equal to the house then they are a draw.

4. if the player score is bigger then the house the player wins.

player and house scores are represented by  player and house int variables.

check them using ifs to determine the result.

Example:
```
input:
8
21

output: player win
```
```
input:
10
7

output: player loss
```
```
input:
4
4

output: its a tie
```
```
input:
 7
 12

output: player win
```
```
input:
10
25

output: player bust
```
 */
public class BlackjackKeepHand {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int player = scan.nextInt();
        int house = scan.nextInt();

        if(player>21){
            System.out.println("player bust");
        }else if(player>house){
            System.out.println("player wins");
        }else if(player<house){
            System.out.println("player loses");
        }else{
            System.out.println("its a tie");
        }





    }
}
