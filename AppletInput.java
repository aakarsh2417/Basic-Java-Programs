import java.awt.*;
import java.applet.*;
public class Input extends Applet
{
TextField txt1, txt2;
public void init()
{
txt1 = new TextField(8);
txt2 = new TextField(8);
add(txt1);
add(txt2);
txt1.setText("0");
txt2.setText("0");
}
public void paint (Graphics g)
{
int x = 0, y = 0, z = 0;
String str1, str2, str;
g.drawString("Input a Number in Each Box", 10, 50);
try
{
str1 = txt1.getText();
x = Integer.parseInt(str1);
str2 = txt2.getText();
y = Integer.parseInt(str2);
}
catch (Exception e)
{
56
}
z = x + y;
str = String.valueOf(z);
g.drawString("Sum is: ", 10, 75);
g.drawString(str, 100, 75);
}
public boolean action (Event e, Object o)
{
repaint();
return true;
}
}
