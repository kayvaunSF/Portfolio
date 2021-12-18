//
// sizetest.cpp
//
// Kayvaun Khoshkhou Adrian Phan
// 1/23/2018
// To display the size in bytes of all of the scalar atomic C++ data types
// its only purpose is to display the size of data types
//
#include <iostream>
using namespace std;
int main ()
{
    cout << "size of Char = " << sizeof ( char ) << endl;
    cout << "size of Short = " << sizeof ( short ) << endl;
    cout << "size of int = " << sizeof ( int ) << endl;
    cout << "size of long = " << sizeof ( long ) << endl;
    cout << "size of long long = " << sizeof ( long long ) << endl;
    cout << "size of float = " << sizeof ( float ) << endl;
    cout << "size of double = " << sizeof ( double ) << endl;
    cout << "size of long double = " << sizeof ( long double) << endl;
    cout << "size of bool = " << sizeof ( bool ) << endl;
    return 0;
}
