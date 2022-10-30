#include <iostream.h>
using namespace std;
 
int main(void)
{
    int a[] = {10,20,40,30,50,70,60,80,90,100};
    int n=60;
    int t=-1;
    for(int i=0;i<=9;i++)
    {
      if(a[i]==n)
      {
        t=i;
      }
    }
    if(t==-1)
    {
      cout<<"Element not present";
    }
    else
    {
      cout<<"Element present at index "<<t;
    }
    return 0;
}
