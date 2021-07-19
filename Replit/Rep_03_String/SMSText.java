package Rep_03_String;
/*
Given a String **message** in the following format:
` Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}`
assign the value of the **sender, phoneNumber, and messageBody** variables and print them.

```
Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving
```
 */
public class SMSText {
    public static void main(String[] args) {


        String message = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
        String sender = ""+message.substring(message.indexOf("<")+1,message.indexOf(">"));
        String phoneNumber = ""+message.substring(message.indexOf("[")+1,message.indexOf("]"));
        String messageBody = ""+message.substring(message.indexOf("{")+1,message.indexOf("}"));
        System.out.println("Sender: "+sender);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Message body: "+messageBody);

    }
}
