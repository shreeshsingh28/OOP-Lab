#include <iostream>
using namespace std;

int flag;
int prime(int n)
{
    flag = 1;
    for (int i = 2; i < n; i++)
    {
        if (n % i == 0)
        {
            flag = 0;
            break;
        }
    }
    if (flag == 1)
        return 1;
    else
        return 0;
}

int main()
{
    int cnt = 0;
    int m = 2;

    while (cnt != 12)
    {
        if (prime(m++))
        {
            cnt++;
            cout<<m<<"\n";
        }
    }
}