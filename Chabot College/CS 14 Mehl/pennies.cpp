//
// pennies.cpp
//
// Kayvaun Khoshkhou
// 2/28/18
// I wrote this program to further test my knowledge of looping.
// This program takes a penny and pays it to and employee. It continuously,
// and exponentially grows for a certain number of days.

#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    cout << setprecision(2);

    int days, s, dollars;
    float total = 0.00;
    int pennies = 1;
    s = 1;
    cout << "Please enter number of days worked consecutively: ";
    cin  >> days;
    for (int i = 0; i < days; i++)
    {
        cout << "Pay for day " << s++ << ": " << pennies << endl;
        pennies *= 2;
    }
    total = pennies / 100.00;
    int hold = total * 100;
    float truncate = hold / 100.0;
    cout << fixed << showpoint << setprecision(2) << "Total pay is $" <<
    truncate;
    return 0;
}
