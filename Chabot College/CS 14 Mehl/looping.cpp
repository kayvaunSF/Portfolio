//
// looping.cpp
//
// Kayvaun Khoshkhou
// 2/28/18
// I wrote this program to test my knowledge of looping.
// This program prints a table of the characters for the ASCII codes from ' '
// (space) to '~' (tilde).

#include <iostream>

using namespace std;
int main()
{
    char ascii;
    int i = 0;
    for(ascii = 32; ascii < 127; ascii++)
    //for loop begins here.
    {
        cout << ascii << " ";
        i++;
        if( i % 16 == 0)
        {
            cout << endl;
        }

    }
    return 0;
}
