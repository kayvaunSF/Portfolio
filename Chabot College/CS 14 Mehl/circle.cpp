//
// circle.cpp
//
// Kayvaun Khoshkhou
// 1/30/18
// To calculate the diameter, circumference, and area of a circle.
// This program calculates the diameter, circumference, and area of circles.
//
#include <iostream>
using namespace std;
int main()
{
// Using 6 six figs on pi to be extra accurate
// Used an extra space after cin to line up the symbols
    float radius;
    float pi = 3.14159;
    cout <<  "Enter the radius: ";
    cin  >> radius;
    float diameter = 2*radius;
    float area = pi*radius*radius;
    float circumference = 2*pi*radius;
    cout << "The Diameter for the radius is: " << diameter << endl;
    cout << "The Area for the radius is: " << area << endl;
    cout << "The Circumference for the radius is: " << circumference << endl;
    return 0;
}
