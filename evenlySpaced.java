public boolean evenlySpaced(int a, int b, int c) 
{
 int temp;
  if (a > c) {
temp = a;
a = c;
c = temp;
}

if (a > b) {
temp = a;
a = b;
b = temp;
}

if (b > c) {
temp = b;
b = c;
c = temp;
}
if(a-b==b-c)
{
  return true;
}
return false;
}
