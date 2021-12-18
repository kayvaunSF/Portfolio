//
// temperature.cpp
//
// Kayvaun Khoshkhou
// 2/4/18
// To convert a temperature value in Celsius to Farenheit
// This program takes a temperature in Celsius and converts it to Farenheit
//
#include <iostream>
using namespace std;
int main()
{
    float dc, df;
    cout << "Enter temperature in Celsius: ";
    cin  >> dc;
    cout << endl;
    df = 9.0 / 5.0 * dc + 32;
    cout << "Temperature in Celsius: " << dc << endl;
    cout << "Temperature in Fahrenheit: " << df << endl;
    return 0;
}
