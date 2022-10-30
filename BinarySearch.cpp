#include<iostream.h>
using namespace std;

int main() 
{
  int a[] = {10,20,30,40,50,60,70,80,90,100};
  int n;
  cout << "Enter the number to be searched: ";
  cin >> n;
  int l=0,u=9,m;
  int flag=0;
  int t=-1;
  while(l<u)
  {
    m=(l+u)/2;
    if(n==a[m])
    {
      flag=1;
      t=m;
      break;
    }
    else if(n<a[m])
    {
      u=m-1;
    }
    else if(n>a[m])
    {
      l=m+1;
    }
  }
  if(flag==1)
  {
    cout<<"Number is present at "<<t;
  }
  else
  {
    cout<<"Number is not found";
  }
   return 0;
}
