Class Box
{
double width;
double height;
double get()
{
width = 10.5;
height = 20.5;
depth = 5.5;
}
void volume ()
{
double v = width * height *depth;
System.out.println("Volume of Box = "+v);
}
}
Class BoxTest
{
public static void main (String[] args)
{
Box myBox = new Box();
myBox.get();
myBox.volume();
}
}
